package ar.edu.unrc.sortedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedListTest {

    @Test
    public void testEmptyList() {
        SortedList list = new SortedList();

        assertEquals(SortedList.getSentinel(), list.getElem());
        assertNull(list.getNext());
        assertEquals("[]", list.toString());
    }

    @Test
    public void testInsertSingleElement() {
        SortedList list = new SortedList();
        list.insert(10);

        assertEquals("[10]", list.toString());
        assertEquals(10, list.getElem());
        assertNotNull(list.getNext());
        assertEquals(SortedList.getSentinel(), list.getNext().getElem());
        assertNull(list.getNext().getNext());
    }

    @Test
    public void testInsertAscendingOrder() {
        SortedList list = new SortedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        assertEquals("[10, 20, 30, 40]", list.toString());
    }

    @Test
    public void testInsertDescendingOrder() {
        SortedList list = new SortedList();
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        assertEquals("[10, 20, 30, 40]", list.toString());
    }

    @Test
    public void testInsertUnsortedElements() {
        SortedList list = new SortedList();
        list.insert(25);
        list.insert(5);
        list.insert(15);
        list.insert(30);
        list.insert(10);

        assertEquals("[5, 10, 15, 25, 30]", list.toString());
    }

    @Test
    public void testInsertDuplicates() {
        SortedList list = new SortedList();
        list.insert(15);
        list.insert(10);
        list.insert(15);
        list.insert(10);
        list.insert(20);

        assertEquals("[10, 10, 15, 15, 20]", list.toString());
    }

    @Test
    public void testInsertNegativeAndZeroValues() {
        SortedList list = new SortedList();
        list.insert(0);
        list.insert(-10);
        list.insert(5);
        list.insert(-50);
        list.insert(0);

        assertEquals("[-50, -10, 0, 0, 5]", list.toString());
    }

    @Test
    public void testInsertBoundaryValues() {
        SortedList list = new SortedList();
        list.insert(Integer.MAX_VALUE);
        list.insert(Integer.MIN_VALUE);
        list.insert(0);

        String expected =
            "[" + Integer.MIN_VALUE + ", 0, " + Integer.MAX_VALUE + "]";
        assertEquals(expected, list.toString());
    }

    @Test
    public void testGettersAndSetters() {
        SortedList list = new SortedList();
        SortedList tail = new SortedList();
        list.setElem(42);
        list.setNext(tail);

        assertEquals(42, list.getElem());
        assertSame(tail, list.getNext());
        assertEquals(Integer.MAX_VALUE, SortedList.getSentinel());
        assertEquals("[42]", list.toString());
    }
}
