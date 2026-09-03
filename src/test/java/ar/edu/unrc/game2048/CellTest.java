package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class CellTest {

    @Test
    void testNegativeCell() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cell(-1);
        });
    }

    @Test
    void testNoPowerCell() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cell(3);
        });
    }

    @Test 
    void testCellValueZero() {
        Cell cell = new Cell(0);

        assertEquals(cell.getValue(), 0);
    }

    @Test
    void testIsEmpty() {
        boolean resultado = Cell.EMPTY.isEmpty();
        assertTrue(resultado);
    }

    @Test
    void testGetValue() {
        Cell cell = new Cell(2);
        int resultado = cell.getValue();
        assertEquals(resultado, 2);
    }

    @Test
    void testCanMergeWith() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);
        Cell cell3 = new Cell(4);

        assertFalse(cell1.canMergeWith(Cell.EMPTY));
        assertFalse(Cell.EMPTY.canMergeWith(Cell.EMPTY));
        assertFalse(Cell.EMPTY.canMergeWith(cell1));
        assertFalse(cell3.canMergeWith(cell2));
        assertTrue(cell1.canMergeWith(cell2));
    }

    @Test
    void testMergeWith() {
        Cell cell = new Cell(2);
        Cell resultado = cell.mergeWith(new Cell(2));
        assertEquals(resultado, new Cell(4));
    }

    @Test
    void testMergeWithException() {
        Cell cell = new Cell(2);
        assertThrows(IllegalArgumentException.class, () -> {
            cell.mergeWith(new Cell(0));
        });
        
    }

    @Test
    void testEquals() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);
        Cell cell3 = new Cell(4);

        assertEquals(cell1, cell1);
        assertEquals(cell1, cell2);

        assertNotEquals(cell1, cell3);
        assertFalse(cell1.equals(null));
        assertFalse(cell1.equals("null"));

        assertNotEquals(null, cell1);
        assertNotEquals("Hola", cell1);
    }

    @Test
    void testHash() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);
        Cell cell3 = new Cell(4);

        assertEquals(cell1.hashCode(), cell2.hashCode());
        assertNotEquals(cell2.hashCode(), cell3.hashCode());
    }

    @Test 
    void testToStringZero() {
        assertEquals(Cell.EMPTY.toString(), ".");
    }

    @Test
    void testToString() {
        Cell cell = new Cell(2);
        assertEquals(cell.toString(), "2");
    }

}
