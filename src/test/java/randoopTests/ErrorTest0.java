package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = board13.moveLeft();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = board6.moveRight();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = board13.moveDown();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = board6.moveUp();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = board6.moveUp();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.isWinningBoard();
        boolean boolean7 = board5.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG10 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean11 = cell8.equals((java.lang.Object) mockRNG10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(mockRNG10);
        boolean boolean14 = board13.hasEmptyCells();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean16 = board5.equals((java.lang.Object) board15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = board15.moveLeft();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        java.lang.String str17 = board13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = board13.moveRight();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG12 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean13 = cell10.equals((java.lang.Object) mockRNG12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(mockRNG12);
        boolean boolean15 = board14.moveLeft();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board6.equals((java.lang.Object) board17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = board17.moveDown();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        boolean boolean17 = board13.isLosingBoard();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = board13.moveRight();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board6.winningValue;
        boolean boolean8 = board6.isEmpty();
        boolean boolean9 = board6.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = board6.moveDown();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = board7.moveDown();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board6.winningValue;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = board6.moveUp();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board6.getEmptyPositions();
        int int10 = board6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = board6.moveLeft();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        int int8 = board6.getScore();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = board6.moveLeft();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean7 = board4.isEmpty();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = board8.moveRight();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean17 = cell15.equals((java.lang.Object) "");
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.equals((java.lang.Object) "");
        int int22 = cell19.getValue();
        boolean boolean23 = cell15.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board.Position position26 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean27 = cell19.equals((java.lang.Object) position26);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.equals((java.lang.Object) "");
        boolean boolean31 = cell19.canMergeWith(cell28);
        boolean boolean32 = board13.equals((java.lang.Object) boolean31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = board13.moveDown();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        java.lang.String str17 = board13.toString();
        java.lang.String str18 = board13.toString();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = board13.moveDown();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ar.edu.unrc.game2048.MockRNG mockRNG1 = new ar.edu.unrc.game2048.MockRNG(0.0d);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(mockRNG1);
        boolean boolean3 = board2.moveLeft();
        int int4 = board2.winningValue;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG7 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean8 = cell5.equals((java.lang.Object) mockRNG7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG7);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG7);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG13 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean14 = cell11.equals((java.lang.Object) mockRNG13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(mockRNG13);
        boolean boolean16 = board15.moveLeft();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board15);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board10.equals((java.lang.Object) board18);
        boolean boolean20 = board10.moveLeft();
        java.lang.Class<?> wildcardClass21 = board10.getClass();
        boolean boolean22 = board2.equals((java.lang.Object) wildcardClass21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board2);
        int int24 = board23.getScore();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = board23.moveUp();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG12 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean13 = cell10.equals((java.lang.Object) mockRNG12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(mockRNG12);
        boolean boolean15 = board14.moveLeft();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board6.equals((java.lang.Object) board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board17.getEmptyPositions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = board17.moveRight();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG12 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean13 = cell10.equals((java.lang.Object) mockRNG12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(mockRNG12);
        boolean boolean15 = board14.moveLeft();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board6.equals((java.lang.Object) board17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = board6.moveUp();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG9 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean10 = cell7.equals((java.lang.Object) mockRNG9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(mockRNG9);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(mockRNG9);
        boolean boolean14 = board4.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = board15.moveUp();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        java.lang.String str17 = board13.toString();
        java.lang.String str18 = board13.toString();
        boolean boolean19 = board13.hasEmptyCells();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = board13.moveUp();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        boolean boolean6 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = board7.moveRight();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = board15.moveDown();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.equals((java.lang.Object) "");
        java.lang.String str13 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean16 = cell14.equals((java.lang.Object) "");
        int int17 = cell14.getValue();
        boolean boolean18 = cell10.canMergeWith(cell14);
        ar.edu.unrc.game2048.Board.Position position21 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean22 = cell14.equals((java.lang.Object) position21);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.equals((java.lang.Object) "");
        int int30 = cell27.getValue();
        boolean boolean31 = cell23.canMergeWith(cell27);
        boolean boolean32 = cell14.canMergeWith(cell27);
        board7.setCell((int) (byte) 1, 1, cell27);
        boolean boolean34 = board7.isLosingBoard();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean35 = board7.moveLeft();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.isWinningBoard();
        boolean boolean7 = board5.isEmpty();
        boolean boolean8 = board5.isFull();
        boolean boolean9 = board5.moveUp();
        boolean boolean10 = board5.isEmpty();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = board11.moveDown();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        java.lang.String str9 = board6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = board6.moveDown();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean17 = cell15.equals((java.lang.Object) "");
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.equals((java.lang.Object) "");
        int int22 = cell19.getValue();
        boolean boolean23 = cell15.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board.Position position26 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean27 = cell19.equals((java.lang.Object) position26);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.equals((java.lang.Object) "");
        boolean boolean31 = cell19.canMergeWith(cell28);
        boolean boolean32 = board13.equals((java.lang.Object) boolean31);
        int int33 = board13.winningValue;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = board13.moveLeft();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        java.lang.String str17 = board13.toString();
        boolean boolean18 = board13.isEmpty();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = board19.moveDown();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        java.lang.String str17 = board13.toString();
        java.lang.String str18 = board13.toString();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = board19.moveLeft();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board6.winningValue;
        boolean boolean8 = board6.isEmpty();
        int int9 = board6.winningValue;
        boolean boolean10 = board6.hasEmptyCells();
        int int11 = board6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = board6.moveDown();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean17 = cell15.equals((java.lang.Object) "");
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.equals((java.lang.Object) "");
        int int22 = cell19.getValue();
        boolean boolean23 = cell15.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board.Position position26 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean27 = cell19.equals((java.lang.Object) position26);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.equals((java.lang.Object) "");
        boolean boolean31 = cell19.canMergeWith(cell28);
        boolean boolean32 = board13.equals((java.lang.Object) boolean31);
        int int33 = board13.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = board13.moveDown();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board6.winningValue;
        boolean boolean8 = board6.isEmpty();
        int int9 = board6.winningValue;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = board6.moveUp();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board6.getEmptyPositions();
        int int10 = board6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = board6.moveDown();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.isLosingBoard();
        boolean boolean10 = board6.isWinningBoard();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = board6.moveLeft();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = board15.moveLeft();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG9 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean10 = cell7.equals((java.lang.Object) mockRNG9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(mockRNG9);
        boolean boolean12 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board13.hasEmptyCells();
        boolean boolean16 = board5.equals((java.lang.Object) board13);
        boolean boolean17 = board13.isLosingBoard();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = board13.moveDown();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        java.lang.String str17 = board13.toString();
        java.lang.String str18 = board13.toString();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = board13.moveRight();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.moveRight();
        boolean boolean7 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG10 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean11 = cell8.equals((java.lang.Object) mockRNG10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG10);
        boolean boolean13 = board12.moveLeft();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        boolean boolean17 = board5.equals((java.lang.Object) board15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = board15.moveUp();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG9 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean10 = cell7.equals((java.lang.Object) mockRNG9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(mockRNG9);
        boolean boolean12 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board13.hasEmptyCells();
        boolean boolean16 = board5.equals((java.lang.Object) board13);
        boolean boolean17 = board13.hasEmptyCells();
        int int18 = board13.winningValue;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = board13.moveRight();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board6.winningValue;
        boolean boolean8 = board6.isEmpty();
        int int9 = board6.winningValue;
        boolean boolean10 = board6.hasEmptyCells();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = board6.moveLeft();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        java.lang.String str17 = board13.toString();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = board13.moveDown();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ar.edu.unrc.game2048.MockRNG mockRNG1 = new ar.edu.unrc.game2048.MockRNG(0.0d);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(mockRNG1);
        boolean boolean3 = board2.moveLeft();
        int int4 = board2.winningValue;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG7 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean8 = cell5.equals((java.lang.Object) mockRNG7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG7);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG7);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG13 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean14 = cell11.equals((java.lang.Object) mockRNG13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(mockRNG13);
        boolean boolean16 = board15.moveLeft();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board15);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board10.equals((java.lang.Object) board18);
        boolean boolean20 = board10.moveLeft();
        java.lang.Class<?> wildcardClass21 = board10.getClass();
        boolean boolean22 = board2.equals((java.lang.Object) wildcardClass21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = board23.moveDown();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board6.getScore();
        boolean boolean8 = board6.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = board9.moveDown();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = board13.moveLeft();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.moveRight();
        boolean boolean7 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG10 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean11 = cell8.equals((java.lang.Object) mockRNG10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG10);
        boolean boolean13 = board12.moveLeft();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        boolean boolean17 = board5.equals((java.lang.Object) board15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = board15.moveRight();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = board6.moveLeft();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean5 = cell2.equals((java.lang.Object) (-1.0f));
        java.lang.String str6 = cell2.toString();
        boolean boolean7 = cell2.isEmpty();
        boolean boolean8 = cell2.isEmpty();
        boolean boolean9 = cell0.canMergeWith(cell2);
        java.lang.String str10 = cell2.toString();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG13 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean14 = cell11.equals((java.lang.Object) mockRNG13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(mockRNG13);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(mockRNG13);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG19 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean20 = cell17.equals((java.lang.Object) mockRNG19);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(mockRNG19);
        boolean boolean22 = board21.moveLeft();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board21);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = board16.equals((java.lang.Object) board24);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean27 = cell2.equals((java.lang.Object) board24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = board24.moveUp();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = board13.moveRight();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG12 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean13 = cell10.equals((java.lang.Object) mockRNG12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(mockRNG12);
        boolean boolean15 = board14.moveLeft();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board6.equals((java.lang.Object) board17);
        int int19 = board17.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = board17.moveDown();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        boolean boolean9 = board6.isEmpty();
        int int10 = board6.winningValue;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = board6.moveLeft();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG9 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean10 = cell7.equals((java.lang.Object) mockRNG9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(mockRNG9);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(mockRNG9);
        boolean boolean14 = board4.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board4);
        int int16 = board15.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = board15.moveDown();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = board6.moveRight();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board6.winningValue;
        boolean boolean8 = board6.isEmpty();
        boolean boolean9 = board6.isFull();
        int int10 = board6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = board6.moveUp();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.String str8 = board7.toString();
        boolean boolean9 = board7.hasEmptyCells();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = board7.moveLeft();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        java.lang.String str6 = board4.toString();
        int int7 = board4.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = board8.moveDown();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board5.equals((java.lang.Object) board13);
        boolean boolean15 = board13.isLosingBoard();
        int int16 = board13.getScore();
        java.lang.String str17 = board13.toString();
        java.lang.String str18 = board13.toString();
        boolean boolean19 = board13.hasEmptyCells();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = board13.moveRight();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        int int8 = board7.getSize();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell((int) (byte) 0, (int) (byte) 0);
        boolean boolean12 = board7.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = board7.moveLeft();
    }
}

