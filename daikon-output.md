# Daikon Invariants Annotation Report

Generated from [`daikon-output.txt`](daikon-output.txt).

## Summary

- **Total Invariants**: 1134
- **Commented**: 1087 (95.9%)
- **Pending**: 47

### Breakdown by Scope Category

- **Object Invariants**: 16 / 17 commented (94.1%)
- **Class Invariants**: 2 / 2 commented (100.0%)
- **Preconditions (ENTER)**: 236 / 240 commented (98.3%)
- **Postconditions (EXIT)**: 833 / 875 commented (95.2%)

## Annotated Invariants by Scope

### [`ar.edu.unrc.game2048.Board:::OBJECT`](daikon-output.txt#L4)
**Kind:** OBJECT INVARIANT

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue >= 1`](daikon-output.txt#L6) | Correct but trivial |
| [`this.winningValue is a power of 2`](daikon-output.txt#L7) | Correct and useful |
| [`this.size >= 0`](daikon-output.txt#L8) | Correct but trivial |
| [`this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class`](daikon-output.txt#L9) | Correct but trivial |
| [`this.grid[] elements != null`](daikon-output.txt#L10) | Correct but trivial |
| [`this.score >= 0`](daikon-output.txt#L11) | Correct and useful |
| [`size(this.grid[]) >= 1`](daikon-output.txt#L12) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.winningValue`](daikon-output.txt#L13) | Incorrect |
| [`this.score % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L14) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.size`](daikon-output.txt#L15) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.score`](daikon-output.txt#L16) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= size(this.grid[])`](daikon-output.txt#L17) | Too strong / likely spurious |
| [`this.winningValue != size(this.grid[])-1`](daikon-output.txt#L18) | Incorrect |
| [`this.grid.getClass().getName() != this.rngStrategy.getClass().getName()`](daikon-output.txt#L19) | Incorrect |

### [`ar.edu.unrc.game2048.Board.Board():::EXIT`](daikon-output.txt#L21)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L22) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L23) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L24) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L25) | Correct but trivial |
| [`this.score == 0`](daikon-output.txt#L26) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L27) | Incorrect |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L28) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(ar.edu.unrc.game2048.Board):::ENTER`](daikon-output.txt#L30)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`other.size == size(other.grid[])`](daikon-output.txt#L31) | Correct but trivial |
| [`other != null`](daikon-output.txt#L32) | Correct but trivial |
| [`other.winningValue >= 1`](daikon-output.txt#L33) | Correct but trivial |
| [`other.winningValue is a power of 2`](daikon-output.txt#L34) | Correct but trivial |
| [`other.grid != null`](daikon-output.txt#L35) | Correct but trivial |
| [`other.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class`](daikon-output.txt#L36) | Correct but trivial |
| [`other.grid[] elements != null`](daikon-output.txt#L37) | Correct but trivial |
| [`other.score >= 0`](daikon-output.txt#L38) | Correct but trivial |
| [`other.rngStrategy != null`](daikon-output.txt#L39) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != other.winningValue`](daikon-output.txt#L40) | Incorrect |
| [`other.score % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L41) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > other.size`](daikon-output.txt#L42) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > other.score`](daikon-output.txt#L43) | Incorrect |
| [`other.winningValue >= other.size`](daikon-output.txt#L44) | Correct but trivial |
| [`other.grid.getClass().getName() != other.rngStrategy.getClass().getName()`](daikon-output.txt#L45) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(ar.edu.unrc.game2048.Board):::EXIT`](daikon-output.txt#L47)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == other.winningValue`](daikon-output.txt#L48) | Correct but trivial |
| [`this.winningValue == orig(other.winningValue)`](daikon-output.txt#L49) | Correct but trivial |
| [`this.size == other.size`](daikon-output.txt#L50) | Correct but trivial |
| [`this.size == orig(other.size)`](daikon-output.txt#L51) | Correct but trivial |
| [`this.size == size(other.grid[])`](daikon-output.txt#L52) | Correct but trivial |
| [`this.size == orig(size(other.grid[]))`](daikon-output.txt#L53) | Correct but trivial |
| [`this.grid.getClass().getName() == other.grid.getClass().getName()`](daikon-output.txt#L54) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(other.grid.getClass().getName())`](daikon-output.txt#L55) | Correct but trivial |
| [`this.score == other.score`](daikon-output.txt#L56) | Correct but trivial |
| [`this.score == orig(other.score)`](daikon-output.txt#L57) | Correct but trivial |
| [`this.rngStrategy == other.rngStrategy`](daikon-output.txt#L58) | Correct but trivial |
| [`this.rngStrategy == orig(other.rngStrategy)`](daikon-output.txt#L59) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == other.rngStrategy.getClass().getName()`](daikon-output.txt#L60) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(other.rngStrategy.getClass().getName())`](daikon-output.txt#L61) | Correct but trivial |
| [`other.grid == orig(other.grid)`](daikon-output.txt#L62) | Correct but trivial |
| [`other.grid[] == orig(other.grid[])`](daikon-output.txt#L63) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L64) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L65) | Correct but trivial |
| [`other.grid != null`](daikon-output.txt#L66) | Correct but trivial |
| [`other.grid[] elements != null`](daikon-output.txt#L67) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L68) | Too strong / likely spurious |
| [`this.winningValue >= this.size`](daikon-output.txt#L69) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(ar.edu.unrc.game2048.RNGStrategy, int, int):::ENTER`](daikon-output.txt#L71)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`rng != null`](daikon-output.txt#L72) | Correct but trivial |
| [`size >= 1`](daikon-output.txt#L73) | Correct but trivial |
| [`winningValue >= 1`](daikon-output.txt#L74) | Correct but trivial |
| [`winningValue is a power of 2`](daikon-output.txt#L75) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(ar.edu.unrc.game2048.RNGStrategy, int, int):::EXIT`](daikon-output.txt#L77)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(winningValue)`](daikon-output.txt#L78) | Correct but trivial |
| [`this.size == orig(size)`](daikon-output.txt#L79) | Correct but trivial |
| [`this.rngStrategy == orig(rng)`](daikon-output.txt#L80) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(rng.getClass().getName())`](daikon-output.txt#L81) | Correct but trivial |
| [`this.size >= 1`](daikon-output.txt#L82) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L83) | Correct but trivial |
| [`this.score == 0`](daikon-output.txt#L84) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L85) | Correct but trivial |
| [`this.winningValue > this.score`](daikon-output.txt#L86) | Incorrect |
| [`this.score <= size(this.grid[])-1`](daikon-output.txt#L87) | Incorrect |

### [`ar.edu.unrc.game2048.Board.Board(int):::EXIT`](daikon-output.txt#L91)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L92) | Correct but trivial |
| [`this.size == orig(size)`](daikon-output.txt#L93) | Incorrect |
| [`this.grid != null`](daikon-output.txt#L94) | Correct but trivial |
| [`this.score == 0`](daikon-output.txt#L95) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L96) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L97) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L98) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L99) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L100) | Incorrect |
| [`this.score < size(this.grid[])-1`](daikon-output.txt#L101) | Incorrect |

### [`ar.edu.unrc.game2048.Board.Board(int, int):::ENTER`](daikon-output.txt#L103)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`size >= 1`](daikon-output.txt#L104) | Correct but trivial |
| [`winningValue >= 1`](daikon-output.txt#L105) | Correct but trivial |
| [`winningValue is a power of 2`](daikon-output.txt#L106) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(int, int):::EXIT`](daikon-output.txt#L108)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(winningValue)`](daikon-output.txt#L109) | Incorrect |
| [`this.size == orig(size)`](daikon-output.txt#L110) | Incorrect |
| [`this.size >= 1`](daikon-output.txt#L111) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L112) | Correct but trivial |
| [`this.score == 0`](daikon-output.txt#L113) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L114) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L115) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L116) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L117) | Correct but trivial |
| [`this.score <= size(this.grid[])-1`](daikon-output.txt#L118) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::ENTER`](daikon-output.txt#L120)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.size >= 1`](daikon-output.txt#L121) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L122) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L123) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L124) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT507`](daikon-output.txt#L126)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.score == size(this.grid[])-1`](daikon-output.txt#L127) | Incorrect |
| [`this.score == orig(size(this.grid[]))-1`](daikon-output.txt#L128) | Incorrect |
| [`this.grid[this.size-1] == this.grid[this.score]`](daikon-output.txt#L129) | Incorrect |
| [`orig(this.grid[post(this.size)-1]) == this.grid[this.score]`](daikon-output.txt#L130) | Incorrect |
| [`this.grid[this.score] == this.grid[orig(this.size)-1]`](daikon-output.txt#L131) | Incorrect |
| [`this.grid[this.score] == orig(this.grid[this.size-1])`](daikon-output.txt#L132) | Incorrect |
| [`this.winningValue one of { 1, 2 }`](daikon-output.txt#L133) | Too strong / likely spurious |
| [`this.size == 1`](daikon-output.txt#L134) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L135) | Correct but trivial |
| [`return == false`](daikon-output.txt#L136) | Incorrect |
| [`this.grid[] elements == this.grid[this.score]`](daikon-output.txt#L137) | Incorrect |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT518`](daikon-output.txt#L141)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == true`](daikon-output.txt#L142) | Incorrect |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT`](daikon-output.txt#L146)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L147) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L148) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L149) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L150) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L151) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L152) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L153) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L154) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L155) | Correct but trivial |
| [`(return == false)  ==>  (this.grid[] elements == orig(this.grid[post(this.score)]))`](daikon-output.txt#L156) | Incorrect |
| [`(return == false)  ==>  (this.grid[] elements == orig(this.grid[this.score]))`](daikon-output.txt#L157) | Incorrect |
| [`(return == false)  ==>  (this.grid[] elements == this.grid[orig(this.score)])`](daikon-output.txt#L158) | Incorrect |
| [`(return == false)  ==>  (this.grid[] elements == this.grid[this.score])`](daikon-output.txt#L159) | Incorrect |
| [`(return == false)  ==>  (this.grid[] elements == this.grid[this.size-1])`](daikon-output.txt#L160) | Incorrect |
| [`(return == false)  ==>  (this.grid[this.size-1] == this.grid[this.score])`](daikon-output.txt#L161) | Incorrect |
| [`(return == false)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L162) | Correct but trivial |
| [`(return == false)  ==>  (this.score == size(this.grid[])-1)`](daikon-output.txt#L163) | Incorrect |
| [`(return == false)  ==>  (this.size == 1)`](daikon-output.txt#L164) | Too strong / likely spurious |
| [`(return == false)  ==>  (this.winningValue one of { 1, 2 })`](daikon-output.txt#L165) | Too strong / likely spurious |
| [`this.size >= 1`](daikon-output.txt#L166) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L167) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L168) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L169) | Incorrect |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT;condition="return == true"`](daikon-output.txt#L171)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == true`](daikon-output.txt#L172) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT;condition="not(return == true)"`](daikon-output.txt#L174)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.score == size(this.grid[])-1`](daikon-output.txt#L175) | Incorrect |
| [`this.score == orig(size(this.grid[]))-1`](daikon-output.txt#L176) | Incorrect |
| [`this.grid[this.size-1] == this.grid[this.score]`](daikon-output.txt#L177) | Incorrect |
| [`orig(this.grid[post(this.size)-1]) == this.grid[this.score]`](daikon-output.txt#L178) | Incorrect |
| [`this.grid[this.score] == this.grid[orig(this.size)-1]`](daikon-output.txt#L179) | Incorrect |
| [`this.grid[this.score] == orig(this.grid[this.size-1])`](daikon-output.txt#L180) | Incorrect |
| [`this.winningValue one of { 1, 2 }`](daikon-output.txt#L181) | Too strong / likely spurious |
| [`this.size == 1`](daikon-output.txt#L182) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L183) | Correct but trivial |
| [`return == false`](daikon-output.txt#L184) | Correct but trivial |
| [`this.grid[] elements == this.grid[this.score]`](daikon-output.txt#L185) | Incorrect |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::ENTER`](daikon-output.txt#L187)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L188) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L189) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L190) | Too strong / likely spurious |
| [`this.winningValue >= this.size`](daikon-output.txt#L191) | Correct but trivial |
| [`this.grid.getClass().getName() != o.getClass().getName()`](daikon-output.txt#L192) | Incorrect |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT533`](daikon-output.txt#L194)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L195) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(this.size)`](daikon-output.txt#L196) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L197) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(size(this.grid[]))`](daikon-output.txt#L198) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L199) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L200) | Too strong / likely spurious |
| [`orig(this) == orig(o)`](daikon-output.txt#L201) | Incorrect |
| [`this.score == 0`](daikon-output.txt#L202) | Incorrect |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L203) | Incorrect |
| [`return == true`](daikon-output.txt#L204) | Incorrect |
| [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Board.class`](daikon-output.txt#L205) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT535`](daikon-output.txt#L209)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L210) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(this.size)`](daikon-output.txt#L211) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L212) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(size(this.grid[]))`](daikon-output.txt#L213) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L214) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L215) | Too strong / likely spurious |
| [`this.score one of { 0, 4, 16 }`](daikon-output.txt#L216) | Too strong / likely spurious |
| [`return == false`](daikon-output.txt#L217) | Incorrect |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L218) | Incorrect |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT537`](daikon-output.txt#L222)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`(return == true)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L223) | Incorrect |
| [`(return == true)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L224) | Correct but trivial |
| [`orig(o) != null`](daikon-output.txt#L225) | Incorrect |
| [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Board.class`](daikon-output.txt#L226) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() != orig(o.getClass().getName())`](daikon-output.txt#L227) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT`](daikon-output.txt#L233)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L234) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L235) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L236) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L237) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L238) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L239) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L240) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L241) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L242) | Correct but trivial |
| [`(return == true)  ==>  (orig(o) != null)`](daikon-output.txt#L243) | Correct but trivial |
| [`(return == true)  ==>  (orig(o.getClass().getName()) == ar.edu.unrc.game2048.Board.class)`](daikon-output.txt#L244) | Correct but trivial |
| [`(return == true)  ==>  (this.rngStrategy.getClass().getName() != orig(o.getClass().getName()))`](daikon-output.txt#L245) | Correct but trivial |
| [`(return == true)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L246) | Incorrect |
| [`(return == true)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L247) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L248) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L249) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L250) | Too strong / likely spurious |
| [`this.winningValue >= this.size`](daikon-output.txt#L251) | Correct but trivial |
| [`this.grid.getClass().getName() != orig(o.getClass().getName())`](daikon-output.txt#L252) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT;condition="return == true"`](daikon-output.txt#L254)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == true`](daikon-output.txt#L255) | Correct but trivial |
| [`orig(o) != null`](daikon-output.txt#L256) | Correct but trivial |
| [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Board.class`](daikon-output.txt#L257) | Correct but trivial |
| [`this.winningValue != this.score`](daikon-output.txt#L258) | Incorrect |
| [`this.rngStrategy.getClass().getName() != orig(o.getClass().getName())`](daikon-output.txt#L259) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT;condition="not(return == true)"`](daikon-output.txt#L261)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == false`](daikon-output.txt#L262) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getCell(int, int):::ENTER`](daikon-output.txt#L264)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L265) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L266) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L267) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L268) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L269) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L270) | Correct but trivial |
| [`row >= 0`](daikon-output.txt#L271) | Correct but trivial |
| [`col >= 0`](daikon-output.txt#L272) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > row`](daikon-output.txt#L273) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > col`](daikon-output.txt#L274) | Correct but trivial |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L275) | Incorrect |
| [`row <= size(this.grid[])-1`](daikon-output.txt#L276) | Correct but trivial |
| [`col <= size(this.grid[])-1`](daikon-output.txt#L277) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getCell(int, int):::EXIT`](daikon-output.txt#L279)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L280) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L281) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L282) | Too strong / likely spurious |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L283) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L284) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L285) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L286) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L287) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L288) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L289) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L290) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L291) | Correct but trivial |
| [`return != null`](daikon-output.txt#L292) | Correct but trivial |
| [`return.value >= 0`](daikon-output.txt#L293) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY != null`](daikon-output.txt#L294) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == 0`](daikon-output.txt#L295) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > return.value`](daikon-output.txt#L296) | Too strong / likely spurious |
| [`this.score >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L297) | Correct but trivial |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L298) | Correct but trivial |
| [`return.value >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L299) | Correct but trivial |
| [`return.value != size(this.grid[])-1`](daikon-output.txt#L300) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value <= orig(row)`](daikon-output.txt#L301) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value <= orig(col)`](daikon-output.txt#L302) | Correct but trivial |
| [`orig(row) <= size(this.grid[])-1`](daikon-output.txt#L303) | Correct but trivial |
| [`orig(col) <= size(this.grid[])-1`](daikon-output.txt#L304) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getEmptyPositions():::ENTER`](daikon-output.txt#L306)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.size >= 1`](daikon-output.txt#L307) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L308) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L309) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getEmptyPositions():::EXIT`](daikon-output.txt#L311)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L312) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L313) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L314) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L315) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L316) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L317) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L318) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L319) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L320) | Correct but trivial |
| [`this.size >= 1`](daikon-output.txt#L321) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L322) | Correct but trivial |
| [`return != null`](daikon-output.txt#L323) | Correct but trivial |
| [`return.getClass().getName() == java.util.HashSet.class`](daikon-output.txt#L324) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L325) | Too strong / likely spurious |
| [`this.grid.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L326) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L327) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getScore():::ENTER`](daikon-output.txt#L329)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L330) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L331) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L332) | Correct but trivial |
| [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L333) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L334) | Correct but trivial |
| [`this.winningValue >= this.size`](daikon-output.txt#L335) | Correct but trivial |
| [`this.winningValue != this.score`](daikon-output.txt#L336) | Correct but trivial |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L337) | Incorrect |

### [`ar.edu.unrc.game2048.Board.getScore():::EXIT`](daikon-output.txt#L339)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L340) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L341) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L342) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L343) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L344) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L345) | Correct but trivial |
| [`this.score == return`](daikon-output.txt#L346) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L347) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L348) | Correct but trivial |
| [`return == orig(this.score)`](daikon-output.txt#L349) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L350) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L351) | Correct but trivial |
| [`return >= 0`](daikon-output.txt#L352) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L353) | Correct but trivial |
| [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L354) | Incorrect |
| [`return % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L355) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L356) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > return`](daikon-output.txt#L357) | Too strong / likely spurious |
| [`this.winningValue >= this.size`](daikon-output.txt#L358) | Correct but trivial |
| [`this.winningValue != return`](daikon-output.txt#L359) | Correct but trivial |
| [`return != size(this.grid[])-1`](daikon-output.txt#L360) | Incorrect |

### [`ar.edu.unrc.game2048.Board.getSize():::ENTER`](daikon-output.txt#L362)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L363) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L364) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L365) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L366) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L367) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L368) | Too strong / likely spurious |
| [`this.winningValue >= this.size`](daikon-output.txt#L369) | Correct but trivial |
| [`this.winningValue > this.score`](daikon-output.txt#L370) | Incorrect |

### [`ar.edu.unrc.game2048.Board.getSize():::EXIT`](daikon-output.txt#L372)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L373) | Correct but trivial |
| [`this.size == return`](daikon-output.txt#L374) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L375) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L376) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L377) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L378) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L379) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L380) | Correct but trivial |
| [`return == orig(this.size)`](daikon-output.txt#L381) | Correct but trivial |
| [`return == size(this.grid[])`](daikon-output.txt#L382) | Correct but trivial |
| [`return == orig(size(this.grid[]))`](daikon-output.txt#L383) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L384) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L385) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L386) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L387) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L388) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > return`](daikon-output.txt#L389) | Too strong / likely spurious |
| [`this.winningValue > this.score`](daikon-output.txt#L390) | Incorrect |
| [`this.winningValue >= return`](daikon-output.txt#L391) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.hasEmptyCells():::ENTER`](daikon-output.txt#L393)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L394) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L395) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L396) | Too strong / likely spurious |
| [`this.winningValue >= this.size`](daikon-output.txt#L397) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.hasEmptyCells():::EXIT`](daikon-output.txt#L399)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L400) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L401) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L402) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L403) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L404) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L405) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L406) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L407) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L408) | Correct but trivial |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score)`](daikon-output.txt#L409) | Incorrect |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size)`](daikon-output.txt#L410) | Incorrect |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE % this.winningValue == 0)`](daikon-output.txt#L411) | Incorrect |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue)`](daikon-output.txt#L412) | Incorrect |
| [`(return == false)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L413) | Incorrect |
| [`(return == false)  ==>  (this.size != this.score)`](daikon-output.txt#L414) | Incorrect |
| [`(return == false)  ==>  (this.size one of { 1, 3, 4 })`](daikon-output.txt#L415) | Too strong / likely spurious |
| [`(return == false)  ==>  (this.winningValue > this.score)`](daikon-output.txt#L416) | Correct but trivial |
| [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L417) | Correct but trivial |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L418) | Too strong / likely spurious |
| [`(return == true)  ==>  (this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0)`](daikon-output.txt#L419) | Incorrect |
| [`this.grid != null`](daikon-output.txt#L420) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L421) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L422) | Too strong / likely spurious |
| [`this.winningValue >= this.size`](daikon-output.txt#L423) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.hasEmptyCells():::EXIT;condition="return == true"`](daikon-output.txt#L425)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == true`](daikon-output.txt#L426) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L427) | Too strong / likely spurious |
| [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L428) | Incorrect |

### [`ar.edu.unrc.game2048.Board.hasEmptyCells():::EXIT;condition="not(return == true)"`](daikon-output.txt#L430)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.size one of { 1, 3, 4 }`](daikon-output.txt#L431) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L432) | Correct but trivial |
| [`return == false`](daikon-output.txt#L433) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L434) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L435) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE % this.winningValue == 0`](daikon-output.txt#L436) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L437) | Too strong / likely spurious |
| [`this.winningValue > this.score`](daikon-output.txt#L438) | Incorrect |
| [`this.size != this.score`](daikon-output.txt#L439) | Incorrect |

### [`ar.edu.unrc.game2048.Board.initializeEmpty():::ENTER`](daikon-output.txt#L441)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.size >= 1`](daikon-output.txt#L442) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L443) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L444) | Too strong / likely spurious |
| [`this.winningValue > this.score`](daikon-output.txt#L445) | Incorrect |

### [`ar.edu.unrc.game2048.Board.initializeEmpty():::EXIT`](daikon-output.txt#L447)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L448) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L449) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L450) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L451) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L452) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L453) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L454) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L455) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L456) | Correct but trivial |
| [`this.size >= 1`](daikon-output.txt#L457) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L458) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L459) | Too strong / likely spurious |
| [`this.winningValue > this.score`](daikon-output.txt#L460) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isEmpty():::ENTER`](daikon-output.txt#L462)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 1, 32, 2048 }`](daikon-output.txt#L463) | Too strong / likely spurious |
| [`this.size one of { 1, 4, 32 }`](daikon-output.txt#L464) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L465) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L466) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L467) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L468) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L469) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L470) | Incorrect |
| [`this.winningValue % this.size == 0`](daikon-output.txt#L471) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L472) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L473) | Incorrect |
| [`this.score % this.size == 0`](daikon-output.txt#L474) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isEmpty():::EXIT666`](daikon-output.txt#L481)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L482) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(this.size)`](daikon-output.txt#L483) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L484) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(size(this.grid[]))`](daikon-output.txt#L485) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L486) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L487) | Incorrect |
| [`this.score one of { 0, 4 }`](daikon-output.txt#L488) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.score`](daikon-output.txt#L490) | Incorrect |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L491) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isEmpty():::EXIT`](daikon-output.txt#L495)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L496) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L497) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L498) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L499) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L500) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L501) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L502) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L503) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L504) | Correct but trivial |
| [`(return == false)  ==>  (this.score one of { 0, 4, 8 })`](daikon-output.txt#L505) | Too strong / likely spurious |
| [`(return == false)  ==>  (this.size one of { 1, 4, 32 })`](daikon-output.txt#L506) | Too strong / likely spurious |
| [`(return == false)  ==>  (this.winningValue one of { 1, 32, 2048 })`](daikon-output.txt#L507) | Too strong / likely spurious |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L508) | Incorrect |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size)`](daikon-output.txt#L509) | Incorrect |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.score)`](daikon-output.txt#L510) | Incorrect |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue)`](daikon-output.txt#L511) | Incorrect |
| [`(return == true)  ==>  (this.score != size(this.grid[])-1)`](daikon-output.txt#L512) | Incorrect |
| [`(return == true)  ==>  (this.score one of { 0, 4 })`](daikon-output.txt#L513) | Too strong / likely spurious |
| [`(return == true)  ==>  (this.size >= this.score)`](daikon-output.txt#L514) | Correct but trivial |
| [`(return == true)  ==>  (this.winningValue > this.size)`](daikon-output.txt#L515) | Incorrect |
| [`this.winningValue one of { 1, 32, 2048 }`](daikon-output.txt#L516) | Too strong / likely spurious |
| [`this.size one of { 1, 4, 32 }`](daikon-output.txt#L517) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L518) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L519) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L520) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L521) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L522) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L523) | Incorrect |
| [`this.winningValue % this.size == 0`](daikon-output.txt#L524) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L525) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L526) | Incorrect |
| [`this.score % this.size == 0`](daikon-output.txt#L527) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isEmpty():::EXIT;condition="return == true"`](daikon-output.txt#L529)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L530) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(this.size)`](daikon-output.txt#L531) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L532) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(size(this.grid[]))`](daikon-output.txt#L533) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L534) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L535) | Incorrect |
| [`this.score one of { 0, 4 }`](daikon-output.txt#L536) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.score`](daikon-output.txt#L538) | Incorrect |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L539) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isFull():::ENTER`](daikon-output.txt#L544)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 1, 32, 2048 }`](daikon-output.txt#L545) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L546) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L547) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L548) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L549) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L550) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L551) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L552) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L553) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isFull():::EXIT`](daikon-output.txt#L555)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L556) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L557) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L558) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L559) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L560) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L561) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L562) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L563) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L564) | Correct but trivial |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L565) | Incorrect |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size)`](daikon-output.txt#L566) | Incorrect |
| [`(return == false)  ==>  (this.score != size(this.grid[])-1)`](daikon-output.txt#L567) | Incorrect |
| [`(return == false)  ==>  (this.score one of { 0, 4, 8 })`](daikon-output.txt#L568) | Too strong / likely spurious |
| [`(return == false)  ==>  (this.size one of { 4, 28, 32 })`](daikon-output.txt#L569) | Too strong / likely spurious |
| [`(return == false)  ==>  (this.winningValue one of { 32, 2048 })`](daikon-output.txt#L570) | Too strong / likely spurious |
| [`(return == true)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L571) | Incorrect |
| [`(return == true)  ==>  (this.score == 0)`](daikon-output.txt#L572) | Incorrect |
| [`(return == true)  ==>  (this.size one of { 1, 4 })`](daikon-output.txt#L573) | Too strong / likely spurious |
| [`(return == true)  ==>  (this.winningValue one of { 1, 2048 })`](daikon-output.txt#L574) | Too strong / likely spurious |
| [`this.winningValue one of { 1, 32, 2048 }`](daikon-output.txt#L575) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L576) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L577) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L578) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L579) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L580) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L581) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L582) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L583) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isFull():::EXIT;condition="return == true"`](daikon-output.txt#L585)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 1, 2048 }`](daikon-output.txt#L586) | Too strong / likely spurious |
| [`this.size one of { 1, 4 }`](daikon-output.txt#L587) | Too strong / likely spurious |
| [`this.score == 0`](daikon-output.txt#L588) | Incorrect |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L589) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isFull():::EXIT;condition="not(return == true)"`](daikon-output.txt#L592)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 32, 2048 }`](daikon-output.txt#L593) | Too strong / likely spurious |
| [`this.size one of { 4, 28, 32 }`](daikon-output.txt#L594) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L596) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L597) | Incorrect |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L598) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::ENTER`](daikon-output.txt#L600)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L601) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L602) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L603) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L604) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT280`](daikon-output.txt#L606)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L608) | Incorrect |
| [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L609) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT289`](daikon-output.txt#L613)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 256, 512, 2048 }`](daikon-output.txt#L614) | Too strong / likely spurious |
| [`this.size one of { 3, 4 }`](daikon-output.txt#L615) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L616) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L618) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L619) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L620) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L621) | Incorrect |
| [`this.winningValue > this.size`](daikon-output.txt#L622) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L623) | Incorrect |
| [`this.size != this.score`](daikon-output.txt#L624) | Incorrect |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L625) | Incorrect |
| [`this.score % size(this.grid[])-1 == 0`](daikon-output.txt#L626) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT293`](daikon-output.txt#L630)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 256, 512, 2048 }`](daikon-output.txt#L631) | Too strong / likely spurious |
| [`this.size one of { 3, 4 }`](daikon-output.txt#L632) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L633) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L635) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L636) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L637) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L638) | Incorrect |
| [`this.winningValue > this.size`](daikon-output.txt#L639) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L640) | Incorrect |
| [`this.size != this.score`](daikon-output.txt#L641) | Incorrect |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L642) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT297`](daikon-output.txt#L646)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.size one of { 1, 3, 4 }`](daikon-output.txt#L647) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L648) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L650) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L651) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L652) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L653) | Incorrect |
| [`this.size != this.score`](daikon-output.txt#L654) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT`](daikon-output.txt#L658)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L659) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L660) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L661) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L662) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L663) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L664) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L665) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L666) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L667) | Correct but trivial |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L668) | Incorrect |
| [`(return == false)  ==>  (this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0)`](daikon-output.txt#L669) | Correct but trivial |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score)`](daikon-output.txt#L670) | Incorrect |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size)`](daikon-output.txt#L671) | Incorrect |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue)`](daikon-output.txt#L672) | Incorrect |
| [`(return == true)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L673) | Correct but trivial |
| [`(return == true)  ==>  (this.size != this.score)`](daikon-output.txt#L674) | Incorrect |
| [`(return == true)  ==>  (this.size one of { 1, 3, 4 })`](daikon-output.txt#L675) | Too strong / likely spurious |
| [`(return == true)  ==>  (this.winningValue > this.score)`](daikon-output.txt#L676) | Incorrect |
| [`(return == true)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L677) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L678) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L679) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L680) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L681) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT;condition="return == true"`](daikon-output.txt#L683)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.size one of { 1, 3, 4 }`](daikon-output.txt#L684) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L685) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L687) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L688) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L689) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L690) | Incorrect |
| [`this.size != this.score`](daikon-output.txt#L691) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT;condition="not(return == true)"`](daikon-output.txt#L693)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L695) | Incorrect |
| [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L696) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.isWinningBoard():::ENTER`](daikon-output.txt#L698)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L699) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L700) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L701) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L702) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L703) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isWinningBoard():::EXIT264`](daikon-output.txt#L705)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 2, 2048 }`](daikon-output.txt#L706) | Too strong / likely spurious |
| [`this.size one of { 2, 4 }`](daikon-output.txt#L707) | Too strong / likely spurious |
| [`this.score one of { 0, 4 }`](daikon-output.txt#L708) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L709) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.isWinningBoard():::EXIT`](daikon-output.txt#L719)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L720) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L721) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L722) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L723) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L724) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L725) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L726) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L727) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L728) | Correct but trivial |
| [`(return == true)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L729) | Correct but trivial |
| [`(return == true)  ==>  (this.score one of { 0, 4 })`](daikon-output.txt#L730) | Too strong / likely spurious |
| [`(return == true)  ==>  (this.size one of { 2, 4 })`](daikon-output.txt#L731) | Too strong / likely spurious |
| [`(return == true)  ==>  (this.winningValue one of { 2, 2048 })`](daikon-output.txt#L732) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L733) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L734) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L735) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L736) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L737) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isWinningBoard():::EXIT;condition="return == true"`](daikon-output.txt#L739)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 2, 2048 }`](daikon-output.txt#L740) | Too strong / likely spurious |
| [`this.size one of { 2, 4 }`](daikon-output.txt#L741) | Too strong / likely spurious |
| [`this.score one of { 0, 4 }`](daikon-output.txt#L742) | Too strong / likely spurious |
| [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L743) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.mergeAdjacentEqualsCells(java.util.List):::ENTER`](daikon-output.txt#L749)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L750) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L751) | Correct but trivial |
| [`nonEmpty != null`](daikon-output.txt#L752) | Correct but trivial |
| [`nonEmpty[] elements != null`](daikon-output.txt#L753) | Correct but trivial |
| [`nonEmpty[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L754) | Correct but trivial |
| [`nonEmpty.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L755) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(nonEmpty[])-1`](daikon-output.txt#L756) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L757) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(nonEmpty[])`](daikon-output.txt#L758) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L759) | Incorrect |
| [`this.winningValue >= size(nonEmpty[])`](daikon-output.txt#L760) | Incorrect |
| [`this.size >= size(nonEmpty[])`](daikon-output.txt#L761) | Correct but trivial |
| [`this.grid.getClass().getName() != nonEmpty.getClass().getName()`](daikon-output.txt#L762) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() != nonEmpty.getClass().getName()`](daikon-output.txt#L763) | Correct but trivial |
| [`size(this.grid[])-1 >= size(nonEmpty[])-1`](daikon-output.txt#L764) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.mergeAdjacentEqualsCells(java.util.List):::EXIT`](daikon-output.txt#L766)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L767) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L768) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L769) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L770) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L771) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L772) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L773) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L774) | Correct but trivial |
| [`nonEmpty[] == orig(nonEmpty[])`](daikon-output.txt#L775) | Correct but trivial |
| [`return.getClass().getName() == orig(nonEmpty.getClass().getName())`](daikon-output.txt#L776) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L777) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L778) | Correct but trivial |
| [`nonEmpty[] elements != null`](daikon-output.txt#L779) | Correct but trivial |
| [`nonEmpty[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L780) | Correct but trivial |
| [`return != null`](daikon-output.txt#L781) | Correct but trivial |
| [`return[] elements != null`](daikon-output.txt#L782) | Correct but trivial |
| [`return[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L783) | Correct but trivial |
| [`return.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L784) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(nonEmpty[])-1`](daikon-output.txt#L785) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(return[])-1`](daikon-output.txt#L786) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L787) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(return[])`](daikon-output.txt#L788) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L789) | Incorrect |
| [`this.winningValue >= size(return[])`](daikon-output.txt#L790) | Incorrect |
| [`this.winningValue >= orig(size(nonEmpty[]))`](daikon-output.txt#L791) | Incorrect |
| [`this.size >= size(return[])`](daikon-output.txt#L792) | Correct but trivial |
| [`this.size >= orig(size(nonEmpty[]))`](daikon-output.txt#L793) | Correct but trivial |
| [`this.grid.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L794) | Correct but trivial |
| [`this.score >= orig(this.score)`](daikon-output.txt#L795) | Correct and useful |
| [`this.rngStrategy.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L796) | Correct but trivial |
| [`size(this.grid[])-1 >= size(nonEmpty[])-1`](daikon-output.txt#L797) | Correct but trivial |
| [`size(this.grid[])-1 >= size(return[])-1`](daikon-output.txt#L798) | Correct but trivial |
| [`size(nonEmpty[])-1 >= size(return[])-1`](daikon-output.txt#L799) | Correct but trivial |
| [`size(return[]) <= orig(size(nonEmpty[]))`](daikon-output.txt#L800) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveDown():::ENTER`](daikon-output.txt#L802)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L803) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L804) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L805) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L806) | Incorrect |
| [`this.winningValue != this.score`](daikon-output.txt#L807) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveDown():::EXIT`](daikon-output.txt#L809)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L810) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L811) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L812) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L813) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L814) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L815) | Incorrect |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L816) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L817) | Correct but trivial |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1)`](daikon-output.txt#L818) | Correct but trivial |
| [`(return == false)  ==>  (this.score == orig(this.score))`](daikon-output.txt#L819) | Correct and useful |
| [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L820) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L821) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L822) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L823) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L824) | Incorrect |
| [`this.winningValue != this.score`](daikon-output.txt#L825) | Incorrect |
| [`this.winningValue != orig(this.score)`](daikon-output.txt#L826) | Incorrect |
| [`this.score >= orig(this.score)`](daikon-output.txt#L827) | Correct and useful |

### [`ar.edu.unrc.game2048.Board.moveDown():::EXIT;condition="not(return == true)"`](daikon-output.txt#L832)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.score == orig(this.score)`](daikon-output.txt#L833) | Correct and useful |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L835) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveLeft():::ENTER`](daikon-output.txt#L837)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L838) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L839) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L840) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L841) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveLeft():::EXIT`](daikon-output.txt#L843)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L844) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L845) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L846) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L847) | Incorrect |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L848) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L849) | Incorrect |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L850) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L851) | Correct but trivial |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1)`](daikon-output.txt#L852) | Incorrect |
| [`(return == false)  ==>  (this.score == orig(this.score))`](daikon-output.txt#L853) | Correct and useful |
| [`(return == false)  ==>  (this.winningValue != orig(this.score))`](daikon-output.txt#L854) | Incorrect |
| [`(return == false)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L855) | Incorrect |
| [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L856) | Correct but trivial |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L857) | Incorrect |
| [`(return == true)  ==>  (this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0)`](daikon-output.txt#L858) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L859) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L860) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L861) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L862) | Incorrect |
| [`this.score >= orig(this.score)`](daikon-output.txt#L863) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveLeft():::EXIT;condition="return == true"`](daikon-output.txt#L865)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L867) | Incorrect |
| [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L868) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveLeft():::EXIT;condition="not(return == true)"`](daikon-output.txt#L870)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.score == orig(this.score)`](daikon-output.txt#L871) | Correct and useful |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L873) | Incorrect |
| [`this.winningValue != this.score`](daikon-output.txt#L874) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveRight():::ENTER`](daikon-output.txt#L876)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L877) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L878) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L879) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L880) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveRight():::EXIT`](daikon-output.txt#L882)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L883) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L884) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L885) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L886) | Incorrect |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L887) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L888) | Incorrect |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L889) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L890) | Correct but trivial |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1)`](daikon-output.txt#L891) | Incorrect |
| [`(return == false)  ==>  (this.score == orig(this.score))`](daikon-output.txt#L892) | Correct and useful |
| [`(return == false)  ==>  (this.winningValue != orig(this.score))`](daikon-output.txt#L893) | Incorrect |
| [`(return == false)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L894) | Incorrect |
| [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L895) | Correct but trivial |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L896) | Incorrect |
| [`(return == true)  ==>  (this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0)`](daikon-output.txt#L897) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L898) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L899) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L900) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L901) | Incorrect |
| [`this.score >= orig(this.score)`](daikon-output.txt#L902) | Correct and useful |

### [`ar.edu.unrc.game2048.Board.moveRight():::EXIT;condition="return == true"`](daikon-output.txt#L904)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L906) | Incorrect |
| [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L907) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.moveRight():::EXIT;condition="not(return == true)"`](daikon-output.txt#L909)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.score == orig(this.score)`](daikon-output.txt#L910) | Correct and useful |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L912) | Incorrect |
| [`this.winningValue != this.score`](daikon-output.txt#L913) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveUp():::ENTER`](daikon-output.txt#L915)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L916) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L917) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L918) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L919) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveUp():::EXIT`](daikon-output.txt#L921)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L922) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L923) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L924) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L925) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L926) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L927) | Incorrect |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L928) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L929) | Correct but trivial |
| [`(return == false)  ==>  (this.score == orig(this.score))`](daikon-output.txt#L930) | Correct and useful |
| [`(return == false)  ==>  (this.winningValue != orig(this.score))`](daikon-output.txt#L931) | Incorrect |
| [`(return == false)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L932) | Incorrect |
| [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L933) | Correct but trivial |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1)`](daikon-output.txt#L934) | Incorrect |
| [`this.grid != null`](daikon-output.txt#L935) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L936) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L937) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L938) | Incorrect |
| [`this.score >= orig(this.score)`](daikon-output.txt#L939) | Correct and useful |

### [`ar.edu.unrc.game2048.Board.moveUp():::EXIT;condition="return == true"`](daikon-output.txt#L941)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L943) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveUp():::EXIT;condition="not(return == true)"`](daikon-output.txt#L945)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.score == orig(this.score)`](daikon-output.txt#L946) | Correct and useful |
| [`this.winningValue != this.score`](daikon-output.txt#L948) | Incorrect |

### [`ar.edu.unrc.game2048.Board.padWithEmptyCells(java.util.List):::ENTER`](daikon-output.txt#L950)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.grid != null`](daikon-output.txt#L951) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L952) | Correct but trivial |
| [`merged != null`](daikon-output.txt#L953) | Correct and useful |
| [`merged[] elements != null`](daikon-output.txt#L954) | Correct but trivial |
| [`merged[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L955) | Correct but trivial |
| [`merged.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L956) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(merged[])-1`](daikon-output.txt#L957) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L958) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(merged[])`](daikon-output.txt#L959) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L960) | Incorrect |
| [`this.winningValue >= size(merged[])`](daikon-output.txt#L961) | Correct but trivial |
| [`this.size >= size(merged[])`](daikon-output.txt#L962) | Correct and useful |
| [`this.grid.getClass().getName() != merged.getClass().getName()`](daikon-output.txt#L963) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() != merged.getClass().getName()`](daikon-output.txt#L964) | Correct but trivial |
| [`size(this.grid[])-1 >= size(merged[])-1`](daikon-output.txt#L965) | Incorrect |

### [`ar.edu.unrc.game2048.Board.padWithEmptyCells(java.util.List):::EXIT`](daikon-output.txt#L967)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L968) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L969) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L970) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L971) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L972) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L973) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L974) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L975) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L976) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L977) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L978) | Correct but trivial |
| [`merged[] elements != null`](daikon-output.txt#L979) | Correct but trivial |
| [`merged[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L980) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L981) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L982) | Incorrect |
| [`this.winningValue >= orig(size(merged[]))`](daikon-output.txt#L983) | Incorrect |
| [`this.size >= orig(size(merged[]))`](daikon-output.txt#L984) | Correct but trivial |
| [`this.grid.getClass().getName() != orig(merged.getClass().getName())`](daikon-output.txt#L985) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() != orig(merged.getClass().getName())`](daikon-output.txt#L986) | Correct but trivial |
| [`size(merged[])-1 >= orig(size(merged[]))-1`](daikon-output.txt#L987) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.removeEmptyCells(java.util.List):::ENTER`](daikon-output.txt#L989)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.size == size(rowList[])`](daikon-output.txt#L990) | Correct and useful |
| [`this.grid != null`](daikon-output.txt#L991) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L992) | Correct but trivial |
| [`rowList != null`](daikon-output.txt#L993) | Correct and useful |
| [`rowList[] elements != null`](daikon-output.txt#L994) | Correct but trivial |
| [`rowList[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L995) | Correct but trivial |
| [`rowList.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L996) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L997) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L998) | Incorrect |
| [`this.grid.getClass().getName() != rowList.getClass().getName()`](daikon-output.txt#L999) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() != rowList.getClass().getName()`](daikon-output.txt#L1000) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.removeEmptyCells(java.util.List):::EXIT`](daikon-output.txt#L1002)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L1003) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L1004) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L1005) | Correct but trivial |
| [`this.size == orig(size(rowList[]))`](daikon-output.txt#L1006) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L1007) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L1008) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L1009) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L1010) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L1011) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L1012) | Correct but trivial |
| [`rowList[] == orig(rowList[])`](daikon-output.txt#L1013) | Correct but trivial |
| [`return.getClass().getName() == orig(rowList.getClass().getName())`](daikon-output.txt#L1014) | Correct but trivial |
| [`this.grid != null`](daikon-output.txt#L1015) | Correct but trivial |
| [`this.rngStrategy != null`](daikon-output.txt#L1016) | Correct but trivial |
| [`rowList[] elements != null`](daikon-output.txt#L1017) | Correct but trivial |
| [`rowList[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1018) | Correct but trivial |
| [`return != null`](daikon-output.txt#L1019) | Correct and useful |
| [`return[] elements != null`](daikon-output.txt#L1020) | Correct but trivial |
| [`return[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1021) | Correct but trivial |
| [`return.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L1022) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(return[])-1`](daikon-output.txt#L1023) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1024) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(return[])`](daikon-output.txt#L1025) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L1026) | Incorrect |
| [`this.winningValue >= size(return[])`](daikon-output.txt#L1027) | Incorrect |
| [`this.size >= size(return[])`](daikon-output.txt#L1028) | Correct and useful |
| [`this.grid.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L1029) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L1030) | Correct but trivial |
| [`size(rowList[])-1 >= size(return[])-1`](daikon-output.txt#L1031) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.setCell(int, int, ar.edu.unrc.game2048.Cell):::ENTER`](daikon-output.txt#L1061)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 1024, 2048 }`](daikon-output.txt#L1062) | Too strong / likely spurious |
| [`this.size one of { 4, 8 }`](daikon-output.txt#L1063) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L1064) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L1065) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L1066) | Correct but trivial |
| [`row >= 0`](daikon-output.txt#L1067) | Correct and useful |
| [`col >= 0`](daikon-output.txt#L1068) | Correct and useful |
| [`cell != null`](daikon-output.txt#L1069) | Correct and useful |
| [`cell.value >= 0`](daikon-output.txt#L1070) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY != null`](daikon-output.txt#L1071) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == 0`](daikon-output.txt#L1072) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L1073) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L1074) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L1075) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L1076) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1077) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > row`](daikon-output.txt#L1078) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > col`](daikon-output.txt#L1079) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= cell.value`](daikon-output.txt#L1080) | Incorrect |
| [`this.winningValue > this.size`](daikon-output.txt#L1081) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L1082) | Incorrect |
| [`this.winningValue > row`](daikon-output.txt#L1083) | Incorrect |
| [`this.winningValue > col`](daikon-output.txt#L1084) | Incorrect |
| [`this.winningValue >= cell.value`](daikon-output.txt#L1085) | Incorrect |
| [`this.winningValue > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1086) | Correct but trivial |
| [`this.score % this.size == 0`](daikon-output.txt#L1087) | Incorrect |
| [`this.score >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1088) | Correct but trivial |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L1089) | Incorrect |
| [`row >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1090) | Correct but trivial |
| [`row <= size(this.grid[])-1`](daikon-output.txt#L1091) | Correct but trivial |
| [`col >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1092) | Correct but trivial |
| [`col <= size(this.grid[])-1`](daikon-output.txt#L1093) | Correct but trivial |
| [`cell.value >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1094) | Correct but trivial |
| [`cell.value != size(this.grid[])-1`](daikon-output.txt#L1095) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value < size(this.grid[])-1`](daikon-output.txt#L1096) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Board.setCell(int, int, ar.edu.unrc.game2048.Cell):::EXIT`](daikon-output.txt#L1098)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L1099) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L1100) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L1101) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L1102) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L1103) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L1104) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L1105) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L1106) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L1107) | Correct but trivial |
| [`cell.value == orig(cell.value)`](daikon-output.txt#L1108) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1109) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1110) | Correct but trivial |
| [`this.winningValue one of { 1024, 2048 }`](daikon-output.txt#L1111) | Too strong / likely spurious |
| [`this.size one of { 4, 8 }`](daikon-output.txt#L1112) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L1113) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L1114) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L1115) | Correct but trivial |
| [`cell.value >= 0`](daikon-output.txt#L1116) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY != null`](daikon-output.txt#L1117) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == 0`](daikon-output.txt#L1118) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L1119) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L1120) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L1121) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L1122) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1123) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= cell.value`](daikon-output.txt#L1124) | Too strong / likely spurious |
| [`this.winningValue > this.size`](daikon-output.txt#L1125) | Too strong / likely spurious |
| [`this.winningValue > this.score`](daikon-output.txt#L1126) | Too strong / likely spurious |
| [`this.winningValue >= cell.value`](daikon-output.txt#L1127) | Too strong / likely spurious |
| [`this.winningValue > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1128) | Correct but trivial |
| [`this.winningValue > orig(row)`](daikon-output.txt#L1129) | Correct but trivial |
| [`this.winningValue > orig(col)`](daikon-output.txt#L1130) | Correct but trivial |
| [`this.score % this.size == 0`](daikon-output.txt#L1131) | Too strong / likely spurious |
| [`this.score >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1132) | Correct but trivial |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L1133) | Too strong / likely spurious |
| [`cell.value >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1134) | Correct but trivial |
| [`cell.value != size(this.grid[])-1`](daikon-output.txt#L1135) | Incorrect |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value <= orig(row)`](daikon-output.txt#L1136) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value <= orig(col)`](daikon-output.txt#L1137) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value < size(this.grid[])-1`](daikon-output.txt#L1138) | Correct but trivial |
| [`orig(row) <= size(this.grid[])-1`](daikon-output.txt#L1139) | Correct but trivial |
| [`orig(col) <= size(this.grid[])-1`](daikon-output.txt#L1140) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.validSize(int):::ENTER`](daikon-output.txt#L1142)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`size == size(this.grid[])`](daikon-output.txt#L1143) | Correct but trivial |
| [`this.grid[this.size-1] == this.grid[size-1]`](daikon-output.txt#L1144) | Correct but trivial |
| [`size >= 1`](daikon-output.txt#L1145) | Correct and useful |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1146) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= size`](daikon-output.txt#L1147) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(this.grid[])`](daikon-output.txt#L1148) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L1149) | Correct but trivial |
| [`this.winningValue >= size(this.grid[])`](daikon-output.txt#L1150) | Correct but trivial |
| [`this.size % size == 0`](daikon-output.txt#L1151) | Correct but trivial |
| [`this.size <= size`](daikon-output.txt#L1152) | Incorrect |

### [`ar.edu.unrc.game2048.Board.validSize(int):::EXIT`](daikon-output.txt#L1154)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L1155) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L1156) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L1157) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L1158) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L1159) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L1160) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L1161) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L1162) | Correct but trivial |
| [`orig(size) == size(this.grid[])`](daikon-output.txt#L1163) | Correct but trivial |
| [`this.grid[this.size-1] == this.grid[orig(size)-1]`](daikon-output.txt#L1164) | Correct but trivial |
| [`this.grid[this.size-1] == orig(this.grid[post(size)-1])`](daikon-output.txt#L1165) | Correct but trivial |
| [`this.grid[this.size-1] == orig(this.grid[size-1])`](daikon-output.txt#L1166) | Correct but trivial |
| [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue)`](daikon-output.txt#L1167) | Incorrect |
| [`(return == false)  ==>  (orig(size) one of { 2, 3 })`](daikon-output.txt#L1168) | Too strong / likely spurious |
| [`(return == false)  ==>  (this.grid == null)`](daikon-output.txt#L1169) | Incorrect |
| [`(return == false)  ==>  (this.rngStrategy == null)`](daikon-output.txt#L1170) | Incorrect |
| [`(return == false)  ==>  (this.score == 0)`](daikon-output.txt#L1171) | Correct but trivial |
| [`(return == false)  ==>  (this.size == 0)`](daikon-output.txt#L1172) | Too strong / likely spurious |
| [`(return == false)  ==>  (this.size == this.score)`](daikon-output.txt#L1173) | Correct but trivial |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(this.grid[]))`](daikon-output.txt#L1174) | Too strong / likely spurious |
| [`(return == true)  ==>  (orig(size) == size(this.grid[]))`](daikon-output.txt#L1175) | Correct but trivial |
| [`(return == true)  ==>  (orig(size) >= 1)`](daikon-output.txt#L1176) | Correct but trivial |
| [`(return == true)  ==>  (this.grid.getClass().getName() != this.rngStrategy.getClass().getName())`](daikon-output.txt#L1177) | Correct but trivial |
| [`(return == true)  ==>  (this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class)`](daikon-output.txt#L1178) | Correct but trivial |
| [`(return == true)  ==>  (this.grid[] elements != null)`](daikon-output.txt#L1179) | Correct but trivial |
| [`(return == true)  ==>  (this.size == size(this.grid[]))`](daikon-output.txt#L1180) | Correct but trivial |
| [`(return == true)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L1181) | Correct and useful |
| [`(return == true)  ==>  (this.winningValue >= size(this.grid[]))`](daikon-output.txt#L1182) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1183) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(this.grid[])`](daikon-output.txt#L1184) | Incorrect |
| [`this.winningValue >= this.size`](daikon-output.txt#L1185) | Incorrect |
| [`this.winningValue >= size(this.grid[])`](daikon-output.txt#L1186) | Incorrect |
| [`this.size % orig(size) == 0`](daikon-output.txt#L1187) | Too strong / likely spurious |
| [`this.size <= orig(size)`](daikon-output.txt#L1188) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.validSize(int):::EXIT;condition="return == true"`](daikon-output.txt#L1190)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == true`](daikon-output.txt#L1191) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.validSize(int):::EXIT;condition="not(return == true)"`](daikon-output.txt#L1193)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L1194) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L1195) | Too strong / likely spurious |
| [`this.size == this.score`](daikon-output.txt#L1196) | Correct but trivial |
| [`this.size == orig(this.score)`](daikon-output.txt#L1197) | Correct but trivial |
| [`this.size == 0`](daikon-output.txt#L1198) | Too strong / likely spurious |
| [`this.grid == null`](daikon-output.txt#L1199) | Correct but trivial |
| [`this.rngStrategy == null`](daikon-output.txt#L1200) | Correct but trivial |
| [`return == false`](daikon-output.txt#L1201) | Correct but trivial |
| [`orig(size) one of { 2, 3 }`](daikon-output.txt#L1202) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Board.validatePosition(int, int):::ENTER`](daikon-output.txt#L1204)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue one of { 1024, 2048 }`](daikon-output.txt#L1205) | Too strong / likely spurious |
| [`this.size one of { 4, 8 }`](daikon-output.txt#L1206) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L1207) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L1208) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L1209) | Correct but trivial |
| [`row >= 0`](daikon-output.txt#L1210) | Correct and useful |
| [`col >= 0`](daikon-output.txt#L1211) | Correct and useful |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L1212) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L1213) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L1214) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L1215) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1216) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > row`](daikon-output.txt#L1217) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > col`](daikon-output.txt#L1218) | Too strong / likely spurious |
| [`this.winningValue > this.size`](daikon-output.txt#L1219) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L1220) | Incorrect |
| [`this.winningValue > row`](daikon-output.txt#L1221) | Incorrect |
| [`this.winningValue > col`](daikon-output.txt#L1222) | Incorrect |
| [`this.score % this.size == 0`](daikon-output.txt#L1223) | Too strong / likely spurious |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L1224) | Too strong / likely spurious |
| [`row <= size(this.grid[])-1`](daikon-output.txt#L1225) | Correct and useful |
| [`col <= size(this.grid[])-1`](daikon-output.txt#L1226) | Correct and useful |

### [`ar.edu.unrc.game2048.Board.validatePosition(int, int):::EXIT`](daikon-output.txt#L1228)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L1229) | Correct but trivial |
| [`this.size == orig(this.size)`](daikon-output.txt#L1230) | Correct but trivial |
| [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L1231) | Correct but trivial |
| [`this.grid == orig(this.grid)`](daikon-output.txt#L1232) | Correct but trivial |
| [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L1233) | Correct but trivial |
| [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L1234) | Correct but trivial |
| [`this.score == orig(this.score)`](daikon-output.txt#L1235) | Correct but trivial |
| [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L1236) | Correct but trivial |
| [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L1237) | Correct but trivial |
| [`this.winningValue one of { 1024, 2048 }`](daikon-output.txt#L1238) | Too strong / likely spurious |
| [`this.size one of { 4, 8 }`](daikon-output.txt#L1239) | Too strong / likely spurious |
| [`this.grid != null`](daikon-output.txt#L1240) | Correct but trivial |
| [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L1241) | Too strong / likely spurious |
| [`this.rngStrategy != null`](daikon-output.txt#L1242) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L1243) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L1244) | Correct but trivial |
| [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L1245) | Too strong / likely spurious |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L1246) | Incorrect |
| [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1247) | Incorrect |
| [`this.winningValue > this.size`](daikon-output.txt#L1248) | Incorrect |
| [`this.winningValue > this.score`](daikon-output.txt#L1249) | Incorrect |
| [`this.winningValue > orig(row)`](daikon-output.txt#L1250) | Incorrect |
| [`this.winningValue > orig(col)`](daikon-output.txt#L1251) | Incorrect |
| [`this.score % this.size == 0`](daikon-output.txt#L1252) | Too strong / likely spurious |
| [`this.score != size(this.grid[])-1`](daikon-output.txt#L1253) | Too strong / likely spurious |
| [`orig(row) <= size(this.grid[])-1`](daikon-output.txt#L1254) | Correct but trivial |
| [`orig(col) <= size(this.grid[])-1`](daikon-output.txt#L1255) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell:::CLASS`](daikon-output.txt#L1257)
**Kind:** CLASS INVARIANT

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`ar.edu.unrc.game2048.Cell.EMPTY != null`](daikon-output.txt#L1258) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == 0`](daikon-output.txt#L1259) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell:::OBJECT`](daikon-output.txt#L1261)
**Kind:** OBJECT INVARIANT

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value >= 0`](daikon-output.txt#L1262) | Correct and useful |
| [`this.value >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1263) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.Cell(int):::ENTER`](daikon-output.txt#L1265)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`value >= 0`](daikon-output.txt#L1266) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.Cell(int):::EXIT`](daikon-output.txt#L1268)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == orig(value)`](daikon-output.txt#L1269) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::ENTER`](daikon-output.txt#L1271)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`other != null`](daikon-output.txt#L1272) | Correct but trivial |
| [`other.value >= 0`](daikon-output.txt#L1273) | Correct and useful |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value <= other.value`](daikon-output.txt#L1274) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT70`](daikon-output.txt#L1276)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1277) | Correct but trivial |
| [`this.value == other.value`](daikon-output.txt#L1278) | Correct and useful |
| [`this.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1279) | Correct but trivial |
| [`this.value == orig(other.value)`](daikon-output.txt#L1280) | Correct but trivial |
| [`this.value == 0`](daikon-output.txt#L1281) | Correct but trivial |
| [`return == false`](daikon-output.txt#L1282) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT72`](daikon-output.txt#L1286)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`(return == false)  <==>  (this.value != other.value)`](daikon-output.txt#L1287) | Correct and useful |
| [`(return == true)  <==>  (this.value == other.value)`](daikon-output.txt#L1288) | Correct and useful |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Cell.EMPTY.value < other.value)`](daikon-output.txt#L1289) | Correct and useful |
| [`(return == true)  ==>  (other.value is a power of 2)`](daikon-output.txt#L1290) | Correct but trivial |
| [`(return == true)  ==>  (this.value > ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1291) | Correct and useful |
| [`(return == true)  ==>  (this.value is a power of 2)`](daikon-output.txt#L1292) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT72;condition="not(return == true)"`](daikon-output.txt#L1296)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value != other.value`](daikon-output.txt#L1297) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT`](daikon-output.txt#L1299)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == orig(this.value)`](daikon-output.txt#L1300) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1301) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1302) | Correct but trivial |
| [`other.value == orig(other.value)`](daikon-output.txt#L1303) | Correct but trivial |
| [`(return == true)  ==>  (ar.edu.unrc.game2048.Cell.EMPTY.value < other.value)`](daikon-output.txt#L1304) | Correct and useful |
| [`(return == true)  ==>  (other.value is a power of 2)`](daikon-output.txt#L1305) | Correct but trivial |
| [`(return == true)  ==>  (this.value == other.value)`](daikon-output.txt#L1306) | Correct and useful |
| [`(return == true)  ==>  (this.value > ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1307) | Correct and useful |
| [`(return == true)  ==>  (this.value is a power of 2)`](daikon-output.txt#L1308) | Correct but trivial |
| [`other.value >= 0`](daikon-output.txt#L1309) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value <= other.value`](daikon-output.txt#L1310) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT;condition="return == true"`](daikon-output.txt#L1312)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == other.value`](daikon-output.txt#L1313) | Correct and useful |
| [`this.value == orig(other.value)`](daikon-output.txt#L1314) | Correct but trivial |
| [`this.value is a power of 2`](daikon-output.txt#L1315) | Correct but trivial |
| [`return == true`](daikon-output.txt#L1316) | Correct but trivial |
| [`this.value > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1317) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT;condition="not(return == true)"`](daikon-output.txt#L1319)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == false`](daikon-output.txt#L1320) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT114`](daikon-output.txt#L1324)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`orig(this) == orig(o)`](daikon-output.txt#L1325) | Correct and useful |
| [`this.value one of { 0, 2, 4 }`](daikon-output.txt#L1326) | Too strong / likely spurious |
| [`return == true`](daikon-output.txt#L1327) | Correct but trivial |
| [`orig(o) != null`](daikon-output.txt#L1328) | Correct and useful |
| [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1329) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT116`](daikon-output.txt#L1333)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value one of { 0, 1, 2 }`](daikon-output.txt#L1334) | Too strong / likely spurious |
| [`return == false`](daikon-output.txt#L1335) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT118`](daikon-output.txt#L1339)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`(return == true)  ==>  (this.value one of { 0, 2, 4 })`](daikon-output.txt#L1340) | Too strong / likely spurious |
| [`orig(o) != null`](daikon-output.txt#L1341) | Correct and useful |
| [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1342) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT`](daikon-output.txt#L1348)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == orig(this.value)`](daikon-output.txt#L1349) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1350) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1351) | Correct but trivial |
| [`(return == true)  ==>  (orig(o) != null)`](daikon-output.txt#L1352) | Correct and useful |
| [`(return == true)  ==>  (orig(o.getClass().getName()) == ar.edu.unrc.game2048.Cell.class)`](daikon-output.txt#L1353) | Correct but trivial |
| [`(return == true)  ==>  (this.value one of { 0, 2, 4 })`](daikon-output.txt#L1354) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT;condition="return == true"`](daikon-output.txt#L1356)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value one of { 0, 2, 4 }`](daikon-output.txt#L1357) | Too strong / likely spurious |
| [`return == true`](daikon-output.txt#L1358) | Too strong / likely spurious |
| [`orig(o) != null`](daikon-output.txt#L1359) | Correct and useful |
| [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1360) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT;condition="not(return == true)"`](daikon-output.txt#L1362)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == false`](daikon-output.txt#L1363) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Cell.getValue():::EXIT`](daikon-output.txt#L1367)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == return`](daikon-output.txt#L1368) | Correct and useful |
| [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1369) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1370) | Correct but trivial |
| [`return == orig(this.value)`](daikon-output.txt#L1371) | Correct but trivial |
| [`return >= 0`](daikon-output.txt#L1372) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value <= return`](daikon-output.txt#L1373) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.isEmpty():::EXIT`](daikon-output.txt#L1377)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == orig(this.value)`](daikon-output.txt#L1378) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1379) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1380) | Correct but trivial |
| [`(this.value == 0)  <==>  (return == true)`](daikon-output.txt#L1381) | Correct and useful |
| [`(this.value == 0)  <==>  (this.value == ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1382) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.isEmpty():::EXIT;condition="return == true"`](daikon-output.txt#L1384)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1385) | Correct and useful |
| [`this.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1386) | Correct but trivial |
| [`this.value == 0`](daikon-output.txt#L1387) | Correct and useful |
| [`return == true`](daikon-output.txt#L1388) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.isEmpty():::EXIT;condition="not(return == true)"`](daikon-output.txt#L1390)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value is a power of 2`](daikon-output.txt#L1391) | Correct and useful |
| [`return == false`](daikon-output.txt#L1392) | Correct but trivial |
| [`this.value > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1393) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.mergeWith(ar.edu.unrc.game2048.Cell):::ENTER`](daikon-output.txt#L1395)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == other.value`](daikon-output.txt#L1396) | Correct and useful |
| [`this.value is a power of 2`](daikon-output.txt#L1397) | Correct but trivial |
| [`other != null`](daikon-output.txt#L1398) | Correct but trivial |
| [`this.value > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1399) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.mergeWith(ar.edu.unrc.game2048.Cell):::EXIT`](daikon-output.txt#L1401)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`this.value == other.value`](daikon-output.txt#L1402) | Correct but trivial |
| [`this.value == orig(this.value)`](daikon-output.txt#L1403) | Correct but trivial |
| [`this.value == orig(other.value)`](daikon-output.txt#L1404) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1405) | Correct but trivial |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1406) | Correct but trivial |
| [`this.value is a power of 2`](daikon-output.txt#L1407) | Correct but trivial |
| [`return != null`](daikon-output.txt#L1408) | Correct but trivial |
| [`return.value is a power of 2`](daikon-output.txt#L1409) | Correct but trivial |
| [`this.value > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1410) | Correct but trivial |
| [`2 * this.value - return.value == 0`](daikon-output.txt#L1411) | Correct and useful |
| [`this.value < return.value`](daikon-output.txt#L1412) | Correct and useful |
| [`ar.edu.unrc.game2048.Cell.EMPTY.value < return.value`](daikon-output.txt#L1413) | Correct but trivial |

### [`ar.edu.unrc.game2048.MathUtils.isPowerOfTwo(int):::ENTER`](daikon-output.txt#L1429)
**Kind:** PRECONDITION (ENTER)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`value >= 2`](daikon-output.txt#L1430) | Correct and useful |
| [`value is a power of 2`](daikon-output.txt#L1431) | Correct and useful |

### [`ar.edu.unrc.game2048.MathUtils.isPowerOfTwo(int):::EXIT`](daikon-output.txt#L1433)
**Kind:** POSTCONDITION (EXIT)

| Invariant Property | Comment / Analysis |
| :--- | :--- |
| [`return == true`](daikon-output.txt#L1434) | Correct but trivial |

