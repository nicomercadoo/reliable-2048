#!/usr/bin/env python3
"""
OASIs-LLM CLI: Herramienta interactiva para evaluación y refinamiento de oráculos
utilizando LLMs a través de OpenRouter.
"""

import argparse
import json
import re
import sys
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Tuple

import requests

from api_key import API_KEY

OPENROUTER_URL = "https://openrouter.ai/api/v1/chat/completions"
DEFAULT_MODEL = "nvidia/nemotron-3-ultra-550b-a55b:free"
DEFAULT_OUTPUT_MD = Path("oasis-conversations.md")

# Regex para extraer (invariante, tipo_comentario) junto con el punto de programa
INV_REGEX = re.compile(
    r"^(.+?)\s*#\s*(too strong.*|.*spurious.*|.*incorrect.*|.*weak.*|.*trivial.*)$",
    re.IGNORECASE | re.MULTILINE,
)

SYSTEM_PROMPT = """Eres un asistente experto en Verificación Formal, Testing de Software y la metodología OASIs (Oracle Assessment and Improvement).
Tu objetivo es ayudar al usuario (quien toma la decisión final) a evaluar y refinar aserciones/invariantes sobre un programa Java.

Sigue estrictamente estas dos reglas según el problema de la aserción:
1. FALSO POSITIVO (Aserción demasiado fuerte / espuria):
   - Explica brevemente por qué la aserción restringe estados o entradas válidas del programa.
   - Genera un caso de prueba concreto en JUnit 4 que ejecute comportamiento válido del programa pero VIOLE la aserción (para demostrar que es un falso positivo y eliminarla si fue inferida por Daikon).
   - Sugiere cómo debilitar o corregir la aserción.

2. FALSO NEGATIVO (Aserción demasiado débil / incompleta):
   - Explica qué propiedad del estado o salida no está siendo controlada por la aserción.
   - Genera un MUTANTE concreto del código Java (un cambio sintáctico pequeño que introduce un bug semántico) tal que la aserción actual PASE sin detectar el error (el mutante sobrevive).
   - Sugiere cómo fortalecer la aserción para que mate a ese mutante.

Responde siempre de forma concisa, técnica y en español."""


def extract_tagged_invariants(daikon_file: Path) -> List[Tuple[str, str, str]]:
    """
    Lee el archivo de salida de Daikon y devuelve una lista de tuplas:
    (program_point, invariant, comment)
    """
    if not daikon_file.exists():
        return []

    results: List[Tuple[str, str, str]] = []
    current_ppt = "GLOBAL"

    for line in daikon_file.read_text(encoding="utf-8").splitlines():
        line_stripped = line.strip()
        if ":::" in line_stripped and not line_stripped.startswith("="):
            current_ppt = line_stripped
            continue

        match = INV_REGEX.match(line_stripped)
        if match:
            inv = match.group(1).strip()
            comment = match.group(2).strip()
            results.append((current_ppt, inv, comment))

    return results


def call_llm(messages: List[Dict], model: str = DEFAULT_MODEL) -> Dict:
    """
    Realiza la consulta a OpenRouter preservando reasoning_details.
    """
    headers = {
        "Authorization": f"Bearer {API_KEY}",
        "Content-Type": "application/json",
    }
    payload = {
        "model": model,
        "messages": messages,
        "reasoning": {"enabled": True},
    }

    response = requests.post(
        url=OPENROUTER_URL,
        headers=headers,
        data=json.dumps(payload),
        timeout=120,
    )
    response.raise_for_status()
    data = response.json()

    if "choices" not in data or not data["choices"]:
        raise RuntimeError(f"Respuesta inesperada de la API: {data}")

    return data["choices"][0]["message"]


def build_initial_prompt(
    source_code: str,
    assertion: str,
    mode: str,
    ppt: Optional[str] = None,
) -> str:
    ppt_info = f"\nPunto de programa (Daikon PPT): `{ppt}`" if ppt else ""

    if mode == "fp":
        task = (
            "Esta aserción ha sido identificada como un **FALSO POSITIVO (demasiado fuerte / espuria)**.\n"
            "1. Genera un test en **JUnit 4** que sea válido para la clase pero que **viole esta aserción**.\n"
            "2. Propón una versión refinada de la aserción (o indica si debe descartarse por completo)."
        )
    elif mode == "fn":
        task = (
            "Esta aserción ha sido identificada como un **FALSO NEGATIVO (demasiado débil / incompleta)**.\n"
            "1. Genera un **mutante** del código Java que introduzca un bug pero que **esta aserción NO pueda matar** (la aserción sigue evaluando a true en el mutante).\n"
            "2. Propón cómo refinar/fortalecer la aserción para que logre matar al mutante."
        )
    else:
        task = (
            "Evalúa esta aserción bajo el enfoque OASIs:\n"
            "1. Si es demasiado fuerte (falso positivo), genera un test JUnit 4 que la viole.\n"
            "2. Si es demasiado débil (falso negativo), genera un mutante del programa que la aserción no pueda matar.\n"
            "3. Propón una versión refinada de la aserción para que el usuario tome la decisión final."
        )

    return (
        f"### Código Fuente del Programa:\n```java\n{source_code}\n```\n"
        f"{ppt_info}\n"
        f"### Aserción a evaluar:\n`{assertion}`\n\n"
        f"### Tarea solicitada:\n{task}"
    )


def save_conversation_markdown(
    output_file: Path,
    source_path: Path,
    ppt: Optional[str],
    assertion: str,
    mode: str,
    model: str,
    messages: List[Dict],
    decision: Optional[str],
) -> None:
    """
    Registra una sesión de conversación en formato Markdown dentro de `output_file`.
    """
    output_file.parent.mkdir(parents=True, exist_ok=True)
    is_new_file = not output_file.exists() or output_file.stat().st_size == 0

    timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    mode_labels = {
        "fp": "Falso Positivo (`fp`)",
        "fn": "Falso Negativo (`fn`)",
        "auto": "Automático (`auto`)",
    }
    mode_str = mode_labels.get(mode, f"`{mode}`")

    if decision is None:
        decision_str = "Sin decisión (Saltada)"
    elif decision == "DESCARTADA":
        decision_str = "🗑️ Descartada (`DESCARTADA`)"
    else:
        decision_str = f"✅ Aceptada / Refinada: `{decision}`"

    lines: List[str] = []
    if is_new_file:
        lines.append("# Registro de Conversaciones - OASIs-LLM\n")

    lines.append(f"## 🕒 [{timestamp}] Aserción: `{assertion}`\n")
    lines.append(f"- **Archivo fuente:** `{source_path}`")
    lines.append(f"- **Punto de programa (PPT):** `{ppt or 'N/A'}`")
    lines.append(f"- **Modo de análisis:** {mode_str}")
    lines.append(f"- **Modelo:** `{model}`")
    lines.append(f"- **Decisión final:** {decision_str}\n")

    assistant_turn = 0
    user_followup = 0

    for idx, msg in enumerate(messages):
        role = msg.get("role")
        content = (msg.get("content") or "").strip()

        if role == "system":
            continue
        elif role == "user" and idx == 1:
            lines.append("### 👤 Prompt Inicial")
            lines.append("<details>")
            lines.append(
                "<summary>Ver prompt inicial enviado (incluye código fuente)</summary>\n"
            )
            lines.append(content)
            lines.append("\n</details>\n")
        elif role == "user":
            user_followup += 1
            lines.append(f"### 👤 Usuario (Repregunta {user_followup})\n")
            lines.append(f"{content}\n")
        elif role == "assistant":
            assistant_turn += 1
            lines.append(f"### 🤖 OASIs-LLM (Turno {assistant_turn})\n")
            lines.append(f"{content or '(Sin contenido)'}\n")

    lines.append("---\n")

    with output_file.open("a", encoding="utf-8") as f:
        f.write("\n".join(lines) + "\n")


def interactive_refinement_loop(
    source_code: str,
    assertion: str,
    mode: str,
    ppt: Optional[str],
    model: str,
    output_file: Path = DEFAULT_OUTPUT_MD,
    source_path: Path = Path("SortedList.java"),
) -> Optional[str]:
    """
    Inicia la sesión interactiva con el LLM para una aserción y permite al usuario
    hacer repreguntas o definir la aserción refinada final.
    Al finalizar la sesión, guarda el registro de la conversación en Markdown.
    """
    messages: List[Dict] = [
        {"role": "system", "content": SYSTEM_PROMPT},
        {
            "role": "user",
            "content": build_initial_prompt(source_code, assertion, mode, ppt),
        },
    ]
    decision: Optional[str] = None

    try:
        while True:
            print("\n⏳ Consultando al modelo (con reasoning activado)...")
            try:
                assistant_msg = call_llm(messages, model=model)
            except Exception as e:
                print(f"❌ Error al consultar la API: {e}")
                return None

            # Preservar el mensaje del asistente junto con reasoning_details sin modificar
            preserved_msg = {
                "role": "assistant",
                "content": assistant_msg.get("content"),
            }
            if (
                "reasoning_details" in assistant_msg
                and assistant_msg["reasoning_details"] is not None
            ):
                preserved_msg["reasoning_details"] = assistant_msg.get(
                    "reasoning_details"
                )

            messages.append(preserved_msg)

            print("\n" + "=" * 75)
            print("🤖 FEEDBACK DE OASIs-LLM:")
            print("=" * 75)
            print(assistant_msg.get("content", "(Sin contenido)"))
            print("=" * 75)

            print("\nOpciones de refinamiento (Decisión del usuario):")
            print("  [r] Repreguntar / pedir otro test o mutante al modelo")
            print("  [a] Aceptar / escribir la versión refinada final de la aserción")
            print("  [d] Descartar la aserción (marcar como eliminada)")
            print("  [s] Saltar / volver al menú principal")

            choice = input("\nSeleccione una opción [r/a/d/s]: ").strip().lower()

            if choice == "r":
                follow_up = input("Tu consulta para el LLM: ").strip()
                if follow_up:
                    messages.append({"role": "user", "content": follow_up})
            elif choice == "a":
                refined = input("Ingresá la aserción refinada final: ").strip()
                if refined:
                    print(f"✅ Aserción refinada registrada: {refined}")
                    decision = refined
                    return refined
            elif choice == "d":
                print("🗑️  Aserción descartada por el usuario.")
                decision = "DESCARTADA"
                return "DESCARTADA"
            elif choice == "s":
                return None
            else:
                print("Opción no válida. Volviendo al menú.")
                return None
    finally:
        if any(m.get("role") == "assistant" for m in messages):
            try:
                save_conversation_markdown(
                    output_file=output_file,
                    source_path=source_path,
                    ppt=ppt,
                    assertion=assertion,
                    mode=mode,
                    model=model,
                    messages=messages,
                    decision=decision,
                )
                print(f"📝 Conversación guardada en '{output_file}'.")
            except Exception as exc:
                print(f"⚠️  No se pudo guardar el registro en '{output_file}': {exc}")


def main():
    parser = argparse.ArgumentParser(
        description="CLI de OASIs con LLMs para refinamiento de oráculos (Falsos Positivos y Falsos Negativos)."
    )
    parser.add_argument(
        "-s",
        "--source",
        type=Path,
        default=Path("src/main/java/ar/edu/unrc/sortedList/SortedList.java"),
        help="Ruta al archivo fuente Java (default: SortedList.java)",
    )
    parser.add_argument(
        "-d",
        "--daikon",
        type=Path,
        default=Path("daikon-output-sortedlist.txt"),
        help="Ruta al archivo de invariantes de Daikon (default: daikon-output-sortedlist.txt)",
    )
    parser.add_argument(
        "-a",
        "--assertion",
        type=str,
        default=None,
        help="Evaluar una aserción específica pasada por parámetro en vez de listar las de Daikon",
    )
    parser.add_argument(
        "-m",
        "--mode",
        choices=["fp", "fn", "auto"],
        default="auto",
        help="Tipo de análisis: 'fp' (Falso Positivo -> generar test), 'fn' (Falso Negativo -> generar mutante), 'auto' (ambos/detectar)",
    )
    parser.add_argument(
        "--model",
        type=str,
        default=DEFAULT_MODEL,
        help=f"Modelo de OpenRouter a utilizar (default: {DEFAULT_MODEL})",
    )
    parser.add_argument(
        "-o",
        "--output",
        type=Path,
        default=DEFAULT_OUTPUT_MD,
        help=f"Ruta al archivo Markdown para registrar conversaciones (default: {DEFAULT_OUTPUT_MD})",
    )

    args = parser.parse_args()

    if not args.source.exists():
        print(f"❌ Error: No se encontró el código fuente en '{args.source}'.")
        print("Indicá la ruta correcta con: python3 oasis_llm.py -s ruta/a/Clase.java")
        sys.exit(1)

    source_code = args.source.read_text(encoding="utf-8")
    refined_decisions: List[Tuple[str, str]] = []

    # Modo 1: Aserción única pasada por CLI (-a)
    if args.assertion:
        result = interactive_refinement_loop(
            source_code=source_code,
            assertion=args.assertion,
            mode=args.mode,
            ppt=None,
            model=args.model,
            output_file=args.output,
            source_path=args.source,
        )
        if result:
            refined_decisions.append((args.assertion, result))
        sys.exit(0)

    # Modo 2: Menú interactivo levantando invariantes comentados del archivo Daikon
    tagged_invariants = extract_tagged_invariants(args.daikon)

    while True:
        print("\n" + "#" * 75)
        print(" 🛠️  OASIs-LLM: Refinamiento Interactivo de Oráculos")
        print("#" * 75)
        print(f" Programa cargado : {args.source}")
        print(
            f" Archivo Daikon   : {args.daikon} ({len(tagged_invariants)} invariantes marcados)"
        )
        print(f" Registro MD      : {args.output}")
        print("-" * 75)

        if tagged_invariants:
            print("Invariantes extraídos del archivo Daikon:")
            for idx, (ppt, inv, comment) in enumerate(tagged_invariants, start=1):
                print(f"  [{idx:2d}] {inv}   # ({comment}) -> [{ppt}]")
        else:
            print(
                "  (No se encontraron invariantes marcados con # en el archivo Daikon)"
            )

        print("\nAcciones:")
        print("  [1..N] Seleccionar un invariante de la lista para analizar")
        print(
            "  [c]    Ingresar una aserción manualmente (ej. probar un Falso Negativo / débil)"
        )
        print("  [v]    Ver resumen de decisiones de refinamiento tomadas")
        print("  [q]    Salir")

        sel = input("\nElegí una opción: ").strip().lower()

        if sel == "q":
            break
        elif sel == "v":
            print("\n=== Resumen de Decisiones del Usuario ===")
            if not refined_decisions:
                print("Aún no se registraron refinamientos.")
            for orig, final in refined_decisions:
                print(f" - Original : {orig}\n   Decisión : {final}\n")
        elif sel == "c":
            custom_assertion = input(
                "Ingresá la aserción Java/JML/Daikon a evaluar: "
            ).strip()
            if not custom_assertion:
                continue
            tipo = (
                input(
                    "¿Es Falso Positivo (fuerte) [fp], Falso Negativo (débil) [fn] o Auto [auto]? [fp/fn/auto]: "
                )
                .strip()
                .lower()
            )
            if tipo not in ("fp", "fn", "auto"):
                tipo = "auto"
            res = interactive_refinement_loop(
                source_code=source_code,
                assertion=custom_assertion,
                mode=tipo,
                ppt="CUSTOM",
                model=args.model,
                output_file=args.output,
                source_path=args.source,
            )
            if res:
                refined_decisions.append((custom_assertion, res))
        elif sel.isdigit():
            idx = int(sel) - 1
            if 0 <= idx < len(tagged_invariants):
                ppt, inv, comment = tagged_invariants[idx]
                # Inferir modo por defecto según el comentario en el archivo Daikon
                inferred_mode = "fp"
                if "weak" in comment.lower() or "trivial" in comment.lower():
                    inferred_mode = "fn"

                print(f"\nAnalizando: `{inv}` (Detectado como {comment})")
                override = (
                    input(
                        f"Modo sugerido: {'Falso Positivo (Generar Test)' if inferred_mode == 'fp' else 'Falso Negativo (Generar Mutante)'}. "
                        "Presioná Enter para confirmar o escribí [fp/fn/auto]: "
                    )
                    .strip()
                    .lower()
                )
                chosen_mode = (
                    override if override in ("fp", "fn", "auto") else inferred_mode
                )

                res = interactive_refinement_loop(
                    source_code=source_code,
                    assertion=inv,
                    mode=chosen_mode,
                    ppt=ppt,
                    model=args.model,
                    output_file=args.output,
                    source_path=args.source,
                )
                if res:
                    refined_decisions.append((inv, res))
            else:
                print("❌ Número fuera de rango.")
        else:
            print("❌ Opción no reconocida.")


if __name__ == "__main__":
    main()
