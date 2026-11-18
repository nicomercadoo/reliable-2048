package ar.edu.unrc.game2048;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCell() {
        new Cell(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoPowerCell() {
        new Cell(3);
    }

    @Test
    public void testCellValueZero() {
        Cell cell = new Cell(0);
        assertTrue(cell.repOK());
        assertEquals(0, cell.getValue());
    }

    @Test
    public void testIsEmpty() {
        boolean resultado = Cell.EMPTY.isEmpty();
        assertTrue(resultado);
    }

    @Test
    public void testGetValue() {
        Cell cell = new Cell(2);
        int resultado = cell.getValue();
        assertTrue(cell.repOK());
        assertEquals(2, resultado);
    }

    @Test
    public void testCanMergeWith() {
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
    public void testMergeWith() {
        Cell cell = new Cell(2);
        Cell resultado = cell.mergeWith(new Cell(2));
        assertEquals(new Cell(4), resultado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMergeWithException() {
        Cell cell = new Cell(2);
        cell.mergeWith(new Cell(0));
    }

    @Test
    public void testEquals() {
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
    public void testHash() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);
        Cell cell3 = new Cell(4);

        assertEquals(cell1.hashCode(), cell2.hashCode());
        assertNotEquals(cell2.hashCode(), cell3.hashCode());
    }

    @Test
    public void testToStringZero() {
        assertEquals(".", Cell.EMPTY.toString());
    }

    @Test
    public void testToString() {
        Cell cell = new Cell(2);
        assertEquals("2", cell.toString());
    }

    @Test
    public void testRepOK() {
        Cell cell = new Cell(1073741824);
        assertTrue(cell.repOK());
    }
}
