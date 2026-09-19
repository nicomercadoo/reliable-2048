package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean4 = cell2.equals((java.lang.Object) "");
        java.lang.String str5 = cell2.toString();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.equals((java.lang.Object) "");
        int int9 = cell6.getValue();
        boolean boolean10 = cell2.canMergeWith(cell6);
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean14 = cell6.equals((java.lang.Object) position13);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean17 = cell15.equals((java.lang.Object) "");
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.equals((java.lang.Object) "");
        int int22 = cell19.getValue();
        boolean boolean23 = cell15.canMergeWith(cell19);
        boolean boolean24 = cell6.canMergeWith(cell19);
        java.lang.String str25 = cell19.toString();
        boolean boolean26 = cell0.equals((java.lang.Object) cell19);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.equals((java.lang.Object) "");
        java.lang.String str31 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean34 = cell32.equals((java.lang.Object) "");
        int int35 = cell32.getValue();
        boolean boolean36 = cell28.canMergeWith(cell32);
        ar.edu.unrc.game2048.Board.Position position39 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean40 = cell32.equals((java.lang.Object) position39);
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean43 = cell41.equals((java.lang.Object) "");
        java.lang.String str44 = cell41.toString();
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean47 = cell45.equals((java.lang.Object) "");
        int int48 = cell45.getValue();
        boolean boolean49 = cell41.canMergeWith(cell45);
        boolean boolean50 = cell32.canMergeWith(cell45);
        ar.edu.unrc.game2048.Cell cell51 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean53 = cell51.equals((java.lang.Object) "");
        java.lang.String str54 = cell51.toString();
        ar.edu.unrc.game2048.Cell cell55 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean57 = cell55.equals((java.lang.Object) "");
        int int58 = cell55.getValue();
        boolean boolean59 = cell51.canMergeWith(cell55);
        ar.edu.unrc.game2048.Board.Position position62 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean63 = cell55.equals((java.lang.Object) position62);
        boolean boolean64 = cell32.canMergeWith(cell55);
        boolean boolean65 = cell27.equals((java.lang.Object) cell55);
        boolean boolean66 = cell55.isEmpty();
        java.lang.Class<?> wildcardClass67 = cell55.getClass();
        boolean boolean68 = cell0.equals((java.lang.Object) cell55);
        boolean boolean69 = cell55.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        ar.edu.unrc.game2048.MockRNG mockRNG1 = new ar.edu.unrc.game2048.MockRNG((double) 0L);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(mockRNG1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(mockRNG1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG1);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        boolean boolean10 = board6.isEmpty();
        boolean boolean11 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.String str13 = board6.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2048 + "'", int7 == 2048);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        boolean boolean16 = board13.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.equals((java.lang.Object) "");
        java.lang.String str22 = cell19.toString();
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        int int26 = cell23.getValue();
        boolean boolean27 = cell19.canMergeWith(cell23);
        java.lang.String str28 = cell23.toString();
        boolean boolean29 = cell23.isEmpty();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str31 = cell30.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG32 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean33 = cell30.equals((java.lang.Object) mockRNG32);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(mockRNG32);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(mockRNG32);
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str37 = cell36.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG38 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean39 = cell36.equals((java.lang.Object) mockRNG38);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(mockRNG38);
        boolean boolean41 = board40.moveLeft();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board40);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean44 = board35.equals((java.lang.Object) board43);
        boolean boolean45 = board35.moveLeft();
        boolean boolean46 = board35.isEmpty();
        boolean boolean47 = board35.isEmpty();
        boolean boolean48 = cell23.equals((java.lang.Object) board35);
        // The following exception was thrown during execution in test generation
        try {
            board13.setCell((int) ' ', 4, cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell26 = board2.getCell((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2048 + "'", int4 == 2048);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.isWinningBoard();
        boolean boolean7 = board5.isEmpty();
        boolean boolean8 = board5.isFull();
        boolean boolean9 = board5.moveLeft();
        boolean boolean10 = board5.moveDown();
        boolean boolean11 = board5.hasEmptyCells();
        boolean boolean12 = board5.moveUp();
        boolean boolean13 = board5.isEmpty();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board5.getEmptyPositions();
        boolean boolean15 = board5.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (byte) 10);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 10)" + "'", str3, "(-1, 10)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        java.lang.Class<?> wildcardClass16 = board5.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isLosingBoard();
        boolean boolean6 = board4.isWinningBoard();
        java.lang.String str7 = board4.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.row;
        java.lang.String str6 = position2.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = position2.equals(obj7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.equals((java.lang.Object) "");
        java.lang.String str12 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        int int16 = cell13.getValue();
        boolean boolean17 = cell9.canMergeWith(cell13);
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean21 = cell13.equals((java.lang.Object) position20);
        boolean boolean22 = position2.equals((java.lang.Object) position20);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.equals((java.lang.Object) "");
        int int30 = cell27.getValue();
        boolean boolean31 = cell23.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board.Position position34 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean35 = cell27.equals((java.lang.Object) position34);
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean38 = cell36.equals((java.lang.Object) "");
        java.lang.String str39 = cell36.toString();
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean42 = cell40.equals((java.lang.Object) "");
        int int43 = cell40.getValue();
        boolean boolean44 = cell36.canMergeWith(cell40);
        boolean boolean45 = cell27.canMergeWith(cell40);
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean48 = cell46.equals((java.lang.Object) "");
        java.lang.String str49 = cell46.toString();
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean52 = cell50.equals((java.lang.Object) "");
        int int53 = cell50.getValue();
        boolean boolean54 = cell46.canMergeWith(cell50);
        ar.edu.unrc.game2048.Board.Position position57 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean58 = cell50.equals((java.lang.Object) position57);
        boolean boolean59 = cell27.canMergeWith(cell50);
        boolean boolean60 = cell50.isEmpty();
        int int61 = cell50.getValue();
        java.lang.String str62 = cell50.toString();
        ar.edu.unrc.game2048.Cell cell63 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str64 = cell63.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG65 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean66 = cell63.equals((java.lang.Object) mockRNG65);
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board(mockRNG65);
        boolean boolean68 = board67.isLosingBoard();
        boolean boolean69 = board67.hasEmptyCells();
        boolean boolean70 = board67.isFull();
        int int71 = board67.getScore();
        int int72 = board67.getScore();
        board67.initializeEmptyTest();
        boolean boolean74 = cell50.equals((java.lang.Object) board67);
        boolean boolean75 = cell50.isEmpty();
        boolean boolean76 = position2.equals((java.lang.Object) boolean75);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 0)" + "'", str6, "(0, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "." + "'", str62, ".");
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "." + "'", str64, ".");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isWinningBoard();
        boolean boolean6 = board4.isFull();
        boolean boolean7 = board4.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board4.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG11 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean12 = cell9.equals((java.lang.Object) mockRNG11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(mockRNG11);
        boolean boolean14 = board13.moveRight();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        int int17 = board15.getSize();
        boolean boolean18 = board15.isEmpty();
        int int19 = board15.winningValue;
        boolean boolean20 = board4.equals((java.lang.Object) int19);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2048 + "'", int19 == 2048);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        boolean boolean3 = cell0.equals((java.lang.Object) (-1.0f));
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str5 = cell4.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell4.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        boolean boolean11 = cell0.equals((java.lang.Object) positionSet10);
        int int12 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG15 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean16 = cell13.equals((java.lang.Object) mockRNG15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(mockRNG15);
        int int18 = board17.getSize();
        board17.initializeEmptyTest();
        boolean boolean20 = board17.isEmpty();
        boolean boolean21 = board17.isEmpty();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean23 = board22.moveDown();
        boolean boolean24 = board22.moveLeft();
        boolean boolean25 = cell0.equals((java.lang.Object) boolean24);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.equals((java.lang.Object) "");
        java.lang.String str29 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean32 = cell30.equals((java.lang.Object) "");
        int int33 = cell30.getValue();
        boolean boolean34 = cell26.canMergeWith(cell30);
        ar.edu.unrc.game2048.Board.Position position37 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean38 = cell30.equals((java.lang.Object) position37);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean41 = cell39.equals((java.lang.Object) "");
        java.lang.String str42 = cell39.toString();
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean45 = cell43.equals((java.lang.Object) "");
        int int46 = cell43.getValue();
        boolean boolean47 = cell39.canMergeWith(cell43);
        boolean boolean48 = cell30.canMergeWith(cell43);
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean51 = cell49.equals((java.lang.Object) "");
        java.lang.String str52 = cell49.toString();
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean55 = cell53.equals((java.lang.Object) "");
        int int56 = cell53.getValue();
        boolean boolean57 = cell49.canMergeWith(cell53);
        ar.edu.unrc.game2048.Board.Position position60 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean61 = cell53.equals((java.lang.Object) position60);
        boolean boolean62 = cell30.canMergeWith(cell53);
        boolean boolean63 = cell0.canMergeWith(cell53);
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str65 = cell64.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG66 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean67 = cell64.equals((java.lang.Object) mockRNG66);
        ar.edu.unrc.game2048.Board board68 = new ar.edu.unrc.game2048.Board(mockRNG66);
        boolean boolean69 = board68.isLosingBoard();
        boolean boolean70 = board68.hasEmptyCells();
        boolean boolean71 = board68.isFull();
        int int72 = board68.getScore();
        boolean boolean73 = board68.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet74 = board68.getEmptyPositions();
        boolean boolean75 = cell0.equals((java.lang.Object) board68);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet76 = board68.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "." + "'", str65, ".");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(positionSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(positionSet76);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) (byte) 0);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean9 = board8.moveUp();
        int int10 = board8.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, (int) (byte) 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isFull();
        java.lang.String str6 = board4.toString();
        board4.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean11 = board4.equals((java.lang.Object) 4);
        boolean boolean12 = board4.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean16 = cell13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = board4.equals((java.lang.Object) cell13);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean20 = board19.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.isWinningBoard();
        boolean boolean7 = board5.isEmpty();
        boolean boolean9 = board5.equals((java.lang.Object) 0.0d);
        boolean boolean10 = board5.moveLeft();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.winningValue;
        boolean boolean6 = board4.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board4.getEmptyPositions();
        boolean boolean8 = board4.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board4.getCell((int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2048 + "'", int5 == 2048);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG10 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean11 = cell8.equals((java.lang.Object) mockRNG10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG10);
        boolean boolean13 = board12.moveRight();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str16 = cell15.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG17 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean18 = cell15.equals((java.lang.Object) mockRNG17);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(mockRNG17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(mockRNG17);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(mockRNG17);
        boolean boolean22 = board12.equals((java.lang.Object) board21);
        int int23 = board12.getSize();
        int int24 = board12.winningValue;
        boolean boolean25 = board12.isFull();
        boolean boolean26 = position2.equals((java.lang.Object) board12);
        boolean boolean27 = board12.moveRight();
        boolean boolean28 = board12.hasEmptyCells();
        boolean boolean29 = board12.moveRight();
        boolean boolean30 = board12.moveUp();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, 0)" + "'", str5, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, 0)" + "'", str7, "(0, 0)");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2048 + "'", int24 == 2048);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.winningValue;
        boolean boolean6 = board4.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board4.getEmptyPositions();
        boolean boolean8 = board4.hasEmptyCells();
        boolean boolean9 = board4.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2048 + "'", int5 == 2048);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isFull();
        java.lang.String str6 = board4.toString();
        board4.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean11 = board4.equals((java.lang.Object) 4);
        boolean boolean12 = board4.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG15 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean16 = cell13.equals((java.lang.Object) mockRNG15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(mockRNG15);
        boolean boolean18 = board17.moveLeft();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = board4.equals((java.lang.Object) board20);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        boolean boolean3 = cell0.equals((java.lang.Object) (-1.0f));
        java.lang.String str4 = cell0.toString();
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell6.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        ar.edu.unrc.game2048.Cell cell13 = board10.getCell(1, (int) (short) 0);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str15 = cell14.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG16 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean17 = cell14.equals((java.lang.Object) mockRNG16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(mockRNG16);
        boolean boolean19 = board18.moveRight();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board18);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        int int22 = board20.getSize();
        boolean boolean23 = board20.isEmpty();
        int int24 = board20.winningValue;
        boolean boolean25 = cell13.equals((java.lang.Object) board20);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str27 = cell26.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG28 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean29 = cell26.equals((java.lang.Object) mockRNG28);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(mockRNG28);
        boolean boolean31 = board30.moveLeft();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board30);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean34 = board32.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board32.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str37 = cell36.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG38 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean39 = cell36.equals((java.lang.Object) mockRNG38);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(mockRNG38);
        boolean boolean41 = board40.moveLeft();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board40);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean44 = board32.equals((java.lang.Object) board43);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet45 = board43.getEmptyPositions();
        boolean boolean46 = cell13.equals((java.lang.Object) positionSet45);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell47 = cell0.mergeWith(cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2048 + "'", int24 == 2048);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(positionSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        java.lang.String str7 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell8.equals((java.lang.Object) "");
        int int11 = cell8.getValue();
        boolean boolean12 = cell4.canMergeWith(cell8);
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean16 = cell8.equals((java.lang.Object) position15);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        boolean boolean20 = cell8.canMergeWith(cell17);
        boolean boolean21 = cell0.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        boolean boolean24 = cell0.canMergeWith(cell22);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.equals((java.lang.Object) "");
        java.lang.String str28 = cell25.toString();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean31 = cell29.equals((java.lang.Object) "");
        int int32 = cell29.getValue();
        boolean boolean33 = cell25.canMergeWith(cell29);
        ar.edu.unrc.game2048.Board.Position position36 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean37 = cell29.equals((java.lang.Object) position36);
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean40 = cell38.equals((java.lang.Object) "");
        java.lang.String str41 = cell38.toString();
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean44 = cell42.equals((java.lang.Object) "");
        int int45 = cell42.getValue();
        boolean boolean46 = cell38.canMergeWith(cell42);
        boolean boolean47 = cell29.canMergeWith(cell42);
        int int48 = cell42.getValue();
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean51 = cell49.equals((java.lang.Object) "");
        java.lang.String str52 = cell49.toString();
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean55 = cell53.equals((java.lang.Object) "");
        int int56 = cell53.getValue();
        boolean boolean57 = cell49.canMergeWith(cell53);
        java.lang.String str58 = cell53.toString();
        ar.edu.unrc.game2048.Cell cell59 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str60 = cell59.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG61 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean62 = cell59.equals((java.lang.Object) mockRNG61);
        boolean boolean63 = cell53.equals((java.lang.Object) boolean62);
        boolean boolean64 = cell42.canMergeWith(cell53);
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str66 = cell65.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG67 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean68 = cell65.equals((java.lang.Object) mockRNG67);
        ar.edu.unrc.game2048.Board board69 = new ar.edu.unrc.game2048.Board(mockRNG67);
        int int70 = board69.getSize();
        board69.initializeEmptyTest();
        boolean boolean72 = board69.moveLeft();
        int int73 = board69.getScore();
        boolean boolean74 = cell53.equals((java.lang.Object) board69);
        ar.edu.unrc.game2048.Cell cell75 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str76 = cell75.toString();
        boolean boolean78 = cell75.equals((java.lang.Object) (-1.0f));
        java.lang.String str79 = cell75.toString();
        java.lang.String str80 = cell75.toString();
        boolean boolean81 = cell53.canMergeWith(cell75);
        boolean boolean82 = cell53.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell83 = cell0.mergeWith(cell53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "." + "'", str58, ".");
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "." + "'", str60, ".");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "." + "'", str66, ".");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(cell75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "." + "'", str76, ".");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "." + "'", str79, ".");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "." + "'", str80, ".");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.equals((java.lang.Object) "");
        int int30 = cell27.getValue();
        boolean boolean31 = cell23.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board.Position position34 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean35 = cell27.equals((java.lang.Object) position34);
        boolean boolean36 = cell4.canMergeWith(cell27);
        java.lang.String str37 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean40 = cell38.equals((java.lang.Object) "");
        java.lang.String str41 = cell38.toString();
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean44 = cell42.equals((java.lang.Object) "");
        int int45 = cell42.getValue();
        boolean boolean46 = cell38.canMergeWith(cell42);
        ar.edu.unrc.game2048.Board.Position position49 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean50 = cell42.equals((java.lang.Object) position49);
        ar.edu.unrc.game2048.Cell cell51 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean53 = cell51.equals((java.lang.Object) "");
        java.lang.String str54 = cell51.toString();
        ar.edu.unrc.game2048.Cell cell55 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean57 = cell55.equals((java.lang.Object) "");
        int int58 = cell55.getValue();
        boolean boolean59 = cell51.canMergeWith(cell55);
        boolean boolean60 = cell42.canMergeWith(cell55);
        ar.edu.unrc.game2048.Cell cell61 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean63 = cell61.equals((java.lang.Object) "");
        java.lang.String str64 = cell61.toString();
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean67 = cell65.equals((java.lang.Object) "");
        int int68 = cell65.getValue();
        boolean boolean69 = cell61.canMergeWith(cell65);
        ar.edu.unrc.game2048.Board.Position position72 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean73 = cell65.equals((java.lang.Object) position72);
        boolean boolean74 = cell42.canMergeWith(cell65);
        int int75 = cell42.getValue();
        java.lang.Object obj76 = null;
        boolean boolean77 = cell42.equals(obj76);
        boolean boolean78 = cell4.equals(obj76);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "." + "'", str64, ".");
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.winningValue;
        boolean boolean6 = board4.hasEmptyCells();
        boolean boolean7 = board4.moveRight();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG10 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean11 = cell8.equals((java.lang.Object) mockRNG10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG10);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean16 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.equals((java.lang.Object) "");
        java.lang.String str22 = cell19.toString();
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        int int26 = cell23.getValue();
        boolean boolean27 = cell19.canMergeWith(cell23);
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean31 = cell23.equals((java.lang.Object) position30);
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean34 = cell32.equals((java.lang.Object) "");
        java.lang.String str35 = cell32.toString();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean38 = cell36.equals((java.lang.Object) "");
        int int39 = cell36.getValue();
        boolean boolean40 = cell32.canMergeWith(cell36);
        boolean boolean41 = cell23.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean44 = cell42.equals((java.lang.Object) "");
        java.lang.String str45 = cell42.toString();
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean48 = cell46.equals((java.lang.Object) "");
        int int49 = cell46.getValue();
        boolean boolean50 = cell42.canMergeWith(cell46);
        ar.edu.unrc.game2048.Board.Position position53 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean54 = cell46.equals((java.lang.Object) position53);
        boolean boolean55 = cell23.canMergeWith(cell46);
        boolean boolean56 = cell46.isEmpty();
        int int57 = cell46.getValue();
        board12.setCell((int) (byte) 0, (int) (short) 1, cell46);
        boolean boolean59 = board4.equals((java.lang.Object) board12);
        boolean boolean60 = board4.moveUp();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2048 + "'", int5 == 2048);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        board6.initializeEmptyTest();
        java.lang.String str8 = board6.toString();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board6.getEmptyPositions();
        boolean boolean11 = board6.isLosingBoard();
        boolean boolean12 = board6.isWinningBoard();
        boolean boolean13 = board6.moveLeft();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 10);
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.col;
        java.lang.String str7 = position2.toString();
        int int8 = position2.col;
        int int9 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 0)" + "'", str3, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, 0)" + "'", str5, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, 0)" + "'", str7, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str4 = position3.toString();
        int int5 = position3.col;
        boolean boolean6 = cell0.equals((java.lang.Object) int5);
        boolean boolean8 = cell0.equals((java.lang.Object) 10.0d);
        boolean boolean9 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position(100, (int) (byte) 1);
        boolean boolean15 = cell11.equals((java.lang.Object) position14);
        boolean boolean16 = cell0.equals((java.lang.Object) position14);
        boolean boolean17 = cell0.isEmpty();
        boolean boolean18 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 0)" + "'", str4, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        boolean boolean3 = cell0.equals((java.lang.Object) (-1.0f));
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str5 = cell4.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell4.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        boolean boolean11 = cell0.equals((java.lang.Object) positionSet10);
        int int12 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG15 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean16 = cell13.equals((java.lang.Object) mockRNG15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(mockRNG15);
        int int18 = board17.getSize();
        board17.initializeEmptyTest();
        boolean boolean20 = board17.isEmpty();
        boolean boolean21 = board17.isEmpty();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean23 = board22.moveDown();
        boolean boolean24 = board22.moveLeft();
        boolean boolean25 = cell0.equals((java.lang.Object) boolean24);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str27 = cell26.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG28 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean29 = cell26.equals((java.lang.Object) mockRNG28);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(mockRNG28);
        boolean boolean31 = board30.moveLeft();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board30);
        int int33 = board30.getScore();
        boolean boolean34 = board30.isEmpty();
        int int35 = board30.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board30.getEmptyPositions();
        boolean boolean37 = board30.moveUp();
        boolean boolean38 = cell0.equals((java.lang.Object) boolean37);
        int int39 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str4 = position3.toString();
        int int5 = position3.col;
        boolean boolean6 = cell0.equals((java.lang.Object) int5);
        boolean boolean8 = cell0.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG11 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean12 = cell9.equals((java.lang.Object) mockRNG11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        ar.edu.unrc.game2048.Board.Position position24 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean25 = cell17.equals((java.lang.Object) position24);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.equals((java.lang.Object) "");
        boolean boolean29 = cell17.canMergeWith(cell26);
        boolean boolean30 = cell9.canMergeWith(cell26);
        int int31 = cell26.getValue();
        boolean boolean32 = cell0.canMergeWith(cell26);
        java.lang.String str33 = cell26.toString();
        boolean boolean34 = cell26.isEmpty();
        java.lang.String str35 = cell26.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 0)" + "'", str4, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) 'a');
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board4.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position(2048, (int) (short) 10);
        boolean boolean11 = position9.equals((java.lang.Object) (byte) 1);
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        boolean boolean16 = position14.equals((java.lang.Object) 1);
        int int17 = position14.row;
        java.lang.String str18 = position14.toString();
        java.lang.Object obj19 = null;
        boolean boolean20 = position14.equals(obj19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str22 = cell21.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG23 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean24 = cell21.equals((java.lang.Object) mockRNG23);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(mockRNG23);
        boolean boolean26 = board25.moveRight();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board25);
        board27.initializeEmptyTest();
        board27.initializeEmptyTest();
        boolean boolean30 = position14.equals((java.lang.Object) board27);
        boolean boolean31 = position9.equals((java.lang.Object) position14);
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str33 = cell32.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG34 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean35 = cell32.equals((java.lang.Object) mockRNG34);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(mockRNG34);
        int int37 = board36.getSize();
        java.lang.String str38 = board36.toString();
        boolean boolean39 = board36.isFull();
        boolean boolean40 = board36.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet41 = board36.getEmptyPositions();
        boolean boolean42 = position9.equals((java.lang.Object) positionSet41);
        boolean boolean43 = board4.equals((java.lang.Object) position9);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell47 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean49 = cell47.equals((java.lang.Object) "");
        int int50 = cell47.getValue();
        int int51 = cell47.getValue();
        int int52 = cell47.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board44.setCell(1, 2048, cell47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0, 0)" + "'", str18, "(0, 0)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str38, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(positionSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        int int23 = cell17.getValue();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean26 = cell24.equals((java.lang.Object) "");
        java.lang.String str27 = cell24.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.equals((java.lang.Object) "");
        int int31 = cell28.getValue();
        boolean boolean32 = cell24.canMergeWith(cell28);
        java.lang.String str33 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str35 = cell34.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG36 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean37 = cell34.equals((java.lang.Object) mockRNG36);
        boolean boolean38 = cell28.equals((java.lang.Object) boolean37);
        boolean boolean39 = cell17.canMergeWith(cell28);
        boolean boolean40 = cell28.isEmpty();
        java.lang.String str41 = cell28.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 1);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean4 = cell2.equals((java.lang.Object) "");
        int int5 = cell2.getValue();
        int int6 = cell2.getValue();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG9 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean10 = cell7.equals((java.lang.Object) mockRNG9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(mockRNG9);
        boolean boolean12 = board11.moveRight();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str15 = cell14.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG16 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean17 = cell14.equals((java.lang.Object) mockRNG16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(mockRNG16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(mockRNG16);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(mockRNG16);
        boolean boolean21 = board11.equals((java.lang.Object) board20);
        int int22 = board11.getSize();
        java.lang.String str23 = board11.toString();
        boolean boolean24 = cell2.equals((java.lang.Object) str23);
        boolean boolean25 = cell1.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.equals((java.lang.Object) "");
        java.lang.String str29 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str31 = cell30.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG32 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean33 = cell30.equals((java.lang.Object) mockRNG32);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(mockRNG32);
        int int35 = board34.getSize();
        boolean boolean36 = board34.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet37 = board34.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Position position40 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        boolean boolean42 = position40.equals((java.lang.Object) 1);
        int int43 = position40.row;
        java.lang.String str44 = position40.toString();
        int int45 = position40.row;
        int int46 = position40.row;
        boolean boolean47 = board34.equals((java.lang.Object) position40);
        boolean boolean48 = cell26.equals((java.lang.Object) boolean47);
        java.lang.String str49 = cell26.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell50 = cell1.mergeWith(cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 1 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str23, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(positionSet37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(0, 0)" + "'", str44, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(35, 10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        boolean boolean10 = board6.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str4 = position3.toString();
        int int5 = position3.col;
        boolean boolean6 = cell0.equals((java.lang.Object) int5);
        boolean boolean8 = cell0.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG11 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean12 = cell9.equals((java.lang.Object) mockRNG11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        ar.edu.unrc.game2048.Board.Position position24 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean25 = cell17.equals((java.lang.Object) position24);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.equals((java.lang.Object) "");
        boolean boolean29 = cell17.canMergeWith(cell26);
        boolean boolean30 = cell9.canMergeWith(cell26);
        int int31 = cell26.getValue();
        boolean boolean32 = cell0.canMergeWith(cell26);
        boolean boolean34 = cell0.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean37 = cell35.equals((java.lang.Object) "");
        int int38 = cell35.getValue();
        boolean boolean39 = cell0.canMergeWith(cell35);
        int int40 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 0)" + "'", str4, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        boolean boolean15 = board5.moveLeft();
        boolean boolean16 = board5.isEmpty();
        boolean boolean17 = board5.isEmpty();
        int int18 = board5.winningValue;
        int int19 = board5.getSize();
        boolean boolean20 = board5.isLosingBoard();
        board5.initializeEmptyTest();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2048 + "'", int18 == 2048);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        boolean boolean6 = board4.moveRight();
        boolean boolean7 = board4.isLosingBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str4 = position3.toString();
        int int5 = position3.col;
        boolean boolean6 = cell0.equals((java.lang.Object) int5);
        int int7 = cell0.getValue();
        java.lang.String str8 = cell0.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 0)" + "'", str4, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        board4.initializeEmptyTest();
        boolean boolean7 = board4.isEmpty();
        board4.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board4.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board4);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isLosingBoard();
        boolean boolean6 = board4.hasEmptyCells();
        board4.initializeEmptyTest();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG10 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean11 = cell8.equals((java.lang.Object) mockRNG10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG10);
        boolean boolean13 = board12.isFull();
        java.lang.String str14 = board12.toString();
        board12.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean17 = board4.equals((java.lang.Object) board12);
        boolean boolean18 = board4.isEmpty();
        boolean boolean19 = board4.moveUp();
        int int20 = board4.getSize();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        ar.edu.unrc.game2048.MockRNG mockRNG21 = new ar.edu.unrc.game2048.MockRNG((double) (short) 0);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(mockRNG21);
        boolean boolean23 = board13.equals((java.lang.Object) mockRNG21);
        boolean boolean24 = board13.isFull();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board13);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isFull();
        java.lang.String str6 = board4.toString();
        board4.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board8.hasEmptyCells();
        boolean boolean10 = board8.moveDown();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        boolean boolean10 = cell7.equals((java.lang.Object) (-1.0f));
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG13 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean14 = cell11.equals((java.lang.Object) mockRNG13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(mockRNG13);
        int int16 = board15.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board15.getEmptyPositions();
        boolean boolean18 = cell7.equals((java.lang.Object) positionSet17);
        int int19 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str21 = cell20.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG22 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean23 = cell20.equals((java.lang.Object) mockRNG22);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(mockRNG22);
        int int25 = board24.getSize();
        board24.initializeEmptyTest();
        boolean boolean27 = board24.isEmpty();
        boolean boolean28 = board24.isEmpty();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean30 = board29.moveDown();
        boolean boolean31 = board29.moveLeft();
        boolean boolean32 = cell7.equals((java.lang.Object) boolean31);
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean35 = cell33.equals((java.lang.Object) "");
        java.lang.String str36 = cell33.toString();
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean39 = cell37.equals((java.lang.Object) "");
        int int40 = cell37.getValue();
        boolean boolean41 = cell33.canMergeWith(cell37);
        ar.edu.unrc.game2048.Board.Position position44 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean45 = cell37.equals((java.lang.Object) position44);
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean48 = cell46.equals((java.lang.Object) "");
        java.lang.String str49 = cell46.toString();
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean52 = cell50.equals((java.lang.Object) "");
        int int53 = cell50.getValue();
        boolean boolean54 = cell46.canMergeWith(cell50);
        boolean boolean55 = cell37.canMergeWith(cell50);
        ar.edu.unrc.game2048.Cell cell56 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean58 = cell56.equals((java.lang.Object) "");
        java.lang.String str59 = cell56.toString();
        ar.edu.unrc.game2048.Cell cell60 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean62 = cell60.equals((java.lang.Object) "");
        int int63 = cell60.getValue();
        boolean boolean64 = cell56.canMergeWith(cell60);
        ar.edu.unrc.game2048.Board.Position position67 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean68 = cell60.equals((java.lang.Object) position67);
        boolean boolean69 = cell37.canMergeWith(cell60);
        boolean boolean70 = cell7.canMergeWith(cell60);
        ar.edu.unrc.game2048.Cell cell71 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str72 = cell71.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG73 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean74 = cell71.equals((java.lang.Object) mockRNG73);
        ar.edu.unrc.game2048.Board board75 = new ar.edu.unrc.game2048.Board(mockRNG73);
        boolean boolean76 = board75.isLosingBoard();
        boolean boolean77 = board75.hasEmptyCells();
        boolean boolean78 = board75.isFull();
        int int79 = board75.getScore();
        boolean boolean80 = board75.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet81 = board75.getEmptyPositions();
        boolean boolean82 = cell7.equals((java.lang.Object) board75);
        board4.setCell(0, (int) (byte) 0, cell7);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "." + "'", str59, ".");
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(cell71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "." + "'", str72, ".");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(positionSet81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.equals((java.lang.Object) "");
        int int30 = cell27.getValue();
        boolean boolean31 = cell23.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board.Position position34 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean35 = cell27.equals((java.lang.Object) position34);
        boolean boolean36 = cell4.canMergeWith(cell27);
        java.lang.String str37 = cell4.toString();
        java.lang.String str38 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str40 = cell39.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG41 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean42 = cell39.equals((java.lang.Object) mockRNG41);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(mockRNG41);
        int int44 = board43.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet45 = board43.getEmptyPositions();
        int int46 = board43.getSize();
        boolean boolean47 = board43.isLosingBoard();
        boolean boolean48 = board43.moveUp();
        java.lang.Object obj49 = null;
        boolean boolean50 = board43.equals(obj49);
        boolean boolean51 = cell4.equals((java.lang.Object) board43);
        boolean boolean52 = board43.hasEmptyCells();
        board43.initializeEmptyTest();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(positionSet45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.winningValue;
        boolean boolean6 = board4.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board4.getEmptyPositions();
        int int8 = board4.winningValue;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board4.getCell(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2048 + "'", int5 == 2048);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2048 + "'", int8 == 2048);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 10);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG5 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean6 = cell3.equals((java.lang.Object) mockRNG5);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(mockRNG5);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG5);
        boolean boolean9 = board8.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean11 = board10.hasEmptyCells();
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        ar.edu.unrc.game2048.MockRNG mockRNG1 = new ar.edu.unrc.game2048.MockRNG((double) (short) 0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(mockRNG1);
        boolean boolean3 = board2.isEmpty();
        boolean boolean4 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        boolean boolean10 = board6.isEmpty();
        boolean boolean11 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean13 = board6.isWinningBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2048 + "'", int7 == 2048);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.isWinningBoard();
        boolean boolean7 = board5.isEmpty();
        boolean boolean8 = board5.isFull();
        boolean boolean9 = board5.moveLeft();
        boolean boolean10 = board5.moveDown();
        board5.initializeEmptyTest();
        int int12 = board5.winningValue;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board5.getCell((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG7 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean8 = cell5.equals((java.lang.Object) mockRNG7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG7);
        int int10 = board9.getSize();
        java.lang.String str11 = board9.toString();
        boolean boolean12 = board9.isWinningBoard();
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        int int14 = position2.col;
        java.lang.String str15 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, 0)" + "'", str15, "(0, 0)");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        int int6 = position2.row;
        int int7 = position2.row;
        java.lang.String str8 = position2.toString();
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 0)" + "'", str4, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0, 0)" + "'", str8, "(0, 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, 0)" + "'", str9, "(0, 0)");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board5.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet17);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str4 = position3.toString();
        int int5 = position3.col;
        boolean boolean6 = cell0.equals((java.lang.Object) int5);
        boolean boolean8 = cell0.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG11 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean12 = cell9.equals((java.lang.Object) mockRNG11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        ar.edu.unrc.game2048.Board.Position position24 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean25 = cell17.equals((java.lang.Object) position24);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.equals((java.lang.Object) "");
        boolean boolean29 = cell17.canMergeWith(cell26);
        boolean boolean30 = cell9.canMergeWith(cell26);
        int int31 = cell26.getValue();
        boolean boolean32 = cell0.canMergeWith(cell26);
        boolean boolean34 = cell0.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position38 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str39 = position38.toString();
        int int40 = position38.col;
        boolean boolean41 = cell35.equals((java.lang.Object) int40);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell42 = cell0.mergeWith(cell35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 0)" + "'", str4, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(0, 0)" + "'", str39, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.row;
        java.lang.String str6 = position2.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = position2.equals(obj7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG11 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean12 = cell9.equals((java.lang.Object) mockRNG11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(mockRNG11);
        boolean boolean14 = board13.moveRight();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board13);
        board15.initializeEmptyTest();
        board15.initializeEmptyTest();
        boolean boolean18 = position2.equals((java.lang.Object) board15);
        boolean boolean19 = board15.isEmpty();
        boolean boolean20 = board15.isFull();
        boolean boolean21 = board15.isLosingBoard();
        boolean boolean22 = board15.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 0)" + "'", str6, "(0, 0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        java.lang.String str6 = board4.toString();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.moveRight();
        board4.initializeEmptyTest();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board4.getEmptyPositions();
        boolean boolean11 = board4.moveLeft();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        java.lang.String str6 = board4.toString();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.moveRight();
        board4.initializeEmptyTest();
        boolean boolean10 = board4.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board4.getEmptyPositions();
        boolean boolean12 = board4.isEmpty();
        boolean boolean13 = board4.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board4.getCell(97, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.equals((java.lang.Object) "");
        int int30 = cell27.getValue();
        boolean boolean31 = cell23.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board.Position position34 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean35 = cell27.equals((java.lang.Object) position34);
        boolean boolean36 = cell4.canMergeWith(cell27);
        boolean boolean38 = cell4.equals((java.lang.Object) true);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean41 = cell39.equals((java.lang.Object) "");
        boolean boolean42 = cell4.equals((java.lang.Object) "");
        boolean boolean43 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell44 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean45 = cell44.isEmpty();
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str47 = cell46.toString();
        boolean boolean49 = cell46.equals((java.lang.Object) (-1.0f));
        java.lang.String str50 = cell46.toString();
        boolean boolean51 = cell46.isEmpty();
        boolean boolean52 = cell46.isEmpty();
        boolean boolean53 = cell44.canMergeWith(cell46);
        java.lang.String str54 = cell46.toString();
        boolean boolean55 = cell4.canMergeWith(cell46);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "." + "'", str50, ".");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        java.lang.String str6 = board4.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board4.getEmptyPositions();
        boolean boolean8 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean10 = board4.moveDown();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', 4);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        boolean boolean6 = board4.isFull();
        boolean boolean7 = board4.moveRight();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board6.winningValue;
        boolean boolean8 = board6.isFull();
        int int9 = board6.getSize();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2048 + "'", int7 == 2048);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        ar.edu.unrc.game2048.MockRNG mockRNG1 = new ar.edu.unrc.game2048.MockRNG((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(mockRNG1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 4);
        int int3 = position2.row;
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean5 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        boolean boolean9 = cell6.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = cell6.toString();
        boolean boolean11 = cell6.isEmpty();
        boolean boolean12 = cell6.isEmpty();
        boolean boolean13 = cell4.canMergeWith(cell6);
        java.lang.String str14 = cell6.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean17 = cell15.equals((java.lang.Object) "");
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.equals((java.lang.Object) "");
        int int22 = cell19.getValue();
        boolean boolean23 = cell15.canMergeWith(cell19);
        java.lang.String str24 = cell19.toString();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str26 = cell25.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG27 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean28 = cell25.equals((java.lang.Object) mockRNG27);
        boolean boolean29 = cell19.equals((java.lang.Object) boolean28);
        boolean boolean30 = cell19.isEmpty();
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str32 = cell31.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG33 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean34 = cell31.equals((java.lang.Object) mockRNG33);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(mockRNG33);
        boolean boolean36 = board35.moveRight();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board35);
        board37.initializeEmptyTest();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell(1, (int) (byte) 0);
        java.lang.String str42 = cell41.toString();
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str44 = cell43.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG45 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean46 = cell43.equals((java.lang.Object) mockRNG45);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(mockRNG45);
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(mockRNG45);
        boolean boolean49 = cell41.equals((java.lang.Object) board48);
        boolean boolean50 = cell41.isEmpty();
        boolean boolean51 = cell19.canMergeWith(cell41);
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str53 = cell52.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG54 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean55 = cell52.equals((java.lang.Object) mockRNG54);
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(mockRNG54);
        boolean boolean57 = board56.moveLeft();
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board(board56);
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board58);
        ar.edu.unrc.game2048.Cell cell62 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean64 = cell62.equals((java.lang.Object) "");
        java.lang.String str65 = cell62.toString();
        ar.edu.unrc.game2048.Cell cell66 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean68 = cell66.equals((java.lang.Object) "");
        int int69 = cell66.getValue();
        boolean boolean70 = cell62.canMergeWith(cell66);
        ar.edu.unrc.game2048.Board.Position position73 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean74 = cell66.equals((java.lang.Object) position73);
        ar.edu.unrc.game2048.Cell cell75 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean77 = cell75.equals((java.lang.Object) "");
        java.lang.String str78 = cell75.toString();
        ar.edu.unrc.game2048.Cell cell79 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean81 = cell79.equals((java.lang.Object) "");
        int int82 = cell79.getValue();
        boolean boolean83 = cell75.canMergeWith(cell79);
        boolean boolean84 = cell66.canMergeWith(cell79);
        board59.setCell((int) (byte) 1, 1, cell79);
        board59.initializeEmptyTest();
        boolean boolean87 = board59.moveLeft();
        int int88 = board59.winningValue;
        boolean boolean89 = cell41.equals((java.lang.Object) int88);
        boolean boolean90 = cell6.canMergeWith(cell41);
        boolean boolean91 = position2.equals((java.lang.Object) cell41);
        java.lang.String str92 = cell41.toString();
        java.lang.String str93 = cell41.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(cell62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "." + "'", str65, ".");
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(cell75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "." + "'", str78, ".");
        org.junit.Assert.assertNotNull(cell79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2048 + "'", int88 == 2048);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "." + "'", str92, ".");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "." + "'", str93, ".");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.isWinningBoard();
        boolean boolean7 = board5.isEmpty();
        boolean boolean8 = board5.isFull();
        boolean boolean9 = board5.moveLeft();
        boolean boolean10 = board5.moveDown();
        boolean boolean11 = board5.hasEmptyCells();
        boolean boolean12 = board5.moveLeft();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        java.lang.Class<?> wildcardClass15 = board13.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        board4.initializeEmptyTest();
        boolean boolean7 = board4.isEmpty();
        boolean boolean8 = board4.isEmpty();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG12 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean13 = cell10.equals((java.lang.Object) mockRNG12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(mockRNG12);
        boolean boolean15 = board14.moveRight();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board14);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        boolean boolean18 = board9.equals((java.lang.Object) positionSet17);
        boolean boolean19 = board9.moveDown();
        boolean boolean20 = board9.moveRight();
        boolean boolean21 = board9.moveRight();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board9);
        int int23 = board9.getScore();
        boolean boolean24 = board9.isFull();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean8 = board6.equals((java.lang.Object) 1);
        int int9 = board6.winningValue;
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board6);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2048 + "'", int9 == 2048);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        board4.initializeEmptyTest();
        boolean boolean7 = board4.isEmpty();
        boolean boolean8 = board4.isEmpty();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean10 = board9.moveDown();
        boolean boolean11 = board9.moveLeft();
        boolean boolean12 = board9.moveLeft();
        int int13 = board9.winningValue;
        boolean boolean14 = board9.moveLeft();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2048 + "'", int13 == 2048);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        java.lang.String str6 = board4.toString();
        boolean boolean7 = board4.hasEmptyCells();
        int int8 = board4.winningValue;
        int int9 = board4.getScore();
        int int10 = board4.winningValue;
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2048 + "'", int8 == 2048);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2048 + "'", int10 == 2048);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.equals((java.lang.Object) "");
        int int30 = cell27.getValue();
        boolean boolean31 = cell23.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board.Position position34 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean35 = cell27.equals((java.lang.Object) position34);
        boolean boolean36 = cell4.canMergeWith(cell27);
        java.lang.String str37 = cell4.toString();
        boolean boolean38 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str40 = cell39.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG41 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean42 = cell39.equals((java.lang.Object) mockRNG41);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(mockRNG41);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board43.getEmptyPositions();
        boolean boolean45 = cell4.equals((java.lang.Object) board43);
        java.lang.String str46 = cell4.toString();
        java.lang.String str47 = cell4.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        int int7 = board4.getScore();
        java.lang.String str8 = board4.toString();
        boolean boolean9 = board4.hasEmptyCells();
        boolean boolean10 = board4.moveUp();
        boolean boolean11 = board4.moveRight();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 10);
        int int14 = position13.col;
        boolean boolean15 = board5.equals((java.lang.Object) position13);
        int int16 = position13.col;
        int int17 = position13.col;
        java.lang.String str18 = position13.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0, 10)" + "'", str18, "(0, 10)");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        int int23 = cell17.getValue();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean26 = cell24.equals((java.lang.Object) "");
        java.lang.String str27 = cell24.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.equals((java.lang.Object) "");
        int int31 = cell28.getValue();
        boolean boolean32 = cell24.canMergeWith(cell28);
        java.lang.String str33 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str35 = cell34.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG36 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean37 = cell34.equals((java.lang.Object) mockRNG36);
        boolean boolean38 = cell28.equals((java.lang.Object) boolean37);
        boolean boolean39 = cell17.canMergeWith(cell28);
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str41 = cell40.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG42 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean43 = cell40.equals((java.lang.Object) mockRNG42);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(mockRNG42);
        int int45 = board44.getSize();
        board44.initializeEmptyTest();
        boolean boolean47 = board44.moveLeft();
        int int48 = board44.getScore();
        boolean boolean49 = cell28.equals((java.lang.Object) board44);
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str51 = cell50.toString();
        boolean boolean53 = cell50.equals((java.lang.Object) (-1.0f));
        java.lang.String str54 = cell50.toString();
        java.lang.String str55 = cell50.toString();
        boolean boolean56 = cell28.canMergeWith(cell50);
        ar.edu.unrc.game2048.Cell cell57 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str58 = cell57.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG59 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean60 = cell57.equals((java.lang.Object) mockRNG59);
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board(mockRNG59);
        boolean boolean62 = board61.moveRight();
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board(board61);
        boolean boolean65 = board63.equals((java.lang.Object) 1);
        int int66 = board63.winningValue;
        int int67 = board63.getScore();
        boolean boolean68 = cell50.equals((java.lang.Object) board63);
        boolean boolean69 = board63.isFull();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "." + "'", str51, ".");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "." + "'", str55, ".");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "." + "'", str58, ".");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2048 + "'", int66 == 2048);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, (int) (short) 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        boolean boolean16 = cell4.canMergeWith(cell13);
        java.lang.String str17 = cell13.toString();
        int int18 = cell13.getValue();
        boolean boolean19 = cell13.isEmpty();
        boolean boolean20 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str22 = cell21.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG23 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean24 = cell21.equals((java.lang.Object) mockRNG23);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(mockRNG23);
        boolean boolean26 = board25.moveRight();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board25);
        board27.initializeEmptyTest();
        ar.edu.unrc.game2048.Cell cell31 = board27.getCell(1, (int) (byte) 0);
        java.lang.String str32 = cell31.toString();
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str34 = cell33.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG35 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean36 = cell33.equals((java.lang.Object) mockRNG35);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(mockRNG35);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(mockRNG35);
        boolean boolean39 = cell31.equals((java.lang.Object) board38);
        int int40 = cell31.getValue();
        boolean boolean41 = cell13.canMergeWith(cell31);
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str43 = cell42.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG44 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean45 = cell42.equals((java.lang.Object) mockRNG44);
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(mockRNG44);
        boolean boolean47 = board46.moveRight();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(board46);
        board48.initializeEmptyTest();
        ar.edu.unrc.game2048.Cell cell52 = board48.getCell(1, (int) (byte) 0);
        java.lang.String str53 = cell52.toString();
        java.lang.String str54 = cell52.toString();
        int int55 = cell52.getValue();
        ar.edu.unrc.game2048.Cell cell56 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str57 = cell56.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG58 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean59 = cell56.equals((java.lang.Object) mockRNG58);
        ar.edu.unrc.game2048.Cell cell60 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean62 = cell60.equals((java.lang.Object) "");
        java.lang.String str63 = cell60.toString();
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean66 = cell64.equals((java.lang.Object) "");
        int int67 = cell64.getValue();
        boolean boolean68 = cell60.canMergeWith(cell64);
        ar.edu.unrc.game2048.Board.Position position71 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean72 = cell64.equals((java.lang.Object) position71);
        ar.edu.unrc.game2048.Cell cell73 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean75 = cell73.equals((java.lang.Object) "");
        boolean boolean76 = cell64.canMergeWith(cell73);
        boolean boolean77 = cell56.canMergeWith(cell73);
        ar.edu.unrc.game2048.Cell cell78 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str79 = cell78.toString();
        boolean boolean80 = cell56.canMergeWith(cell78);
        boolean boolean81 = cell52.equals((java.lang.Object) cell56);
        boolean boolean82 = cell31.canMergeWith(cell56);
        boolean boolean83 = cell31.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "." + "'", str57, ".");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "." + "'", str63, ".");
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(cell73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(cell78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "." + "'", str79, ".");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        java.lang.String str15 = board13.toString();
        int int16 = board13.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        java.lang.String str9 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG12 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean13 = cell10.equals((java.lang.Object) mockRNG12);
        boolean boolean14 = cell4.equals((java.lang.Object) boolean13);
        boolean boolean15 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean18 = cell16.equals((java.lang.Object) "");
        int int19 = cell16.getValue();
        int int20 = cell16.getValue();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean23 = cell21.equals((java.lang.Object) "");
        java.lang.String str24 = cell21.toString();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.equals((java.lang.Object) "");
        int int28 = cell25.getValue();
        boolean boolean29 = cell21.canMergeWith(cell25);
        ar.edu.unrc.game2048.Board.Position position32 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean33 = cell25.equals((java.lang.Object) position32);
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean36 = cell34.equals((java.lang.Object) "");
        boolean boolean37 = cell25.canMergeWith(cell34);
        boolean boolean38 = cell16.canMergeWith(cell34);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str40 = cell39.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG41 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean42 = cell39.equals((java.lang.Object) mockRNG41);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(mockRNG41);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(mockRNG41);
        boolean boolean45 = board44.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str47 = cell46.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG48 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean49 = cell46.equals((java.lang.Object) mockRNG48);
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(mockRNG48);
        boolean boolean51 = board50.moveLeft();
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board50);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board(board52);
        boolean boolean54 = board52.hasEmptyCells();
        boolean boolean55 = board44.equals((java.lang.Object) board52);
        boolean boolean56 = cell34.equals((java.lang.Object) boolean55);
        boolean boolean57 = cell34.isEmpty();
        java.lang.String str58 = cell34.toString();
        ar.edu.unrc.game2048.Cell cell59 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str60 = cell59.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG61 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean62 = cell59.equals((java.lang.Object) mockRNG61);
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board(mockRNG61);
        int int64 = board63.getSize();
        java.lang.String str65 = board63.toString();
        int int66 = board63.getScore();
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board(board63);
        ar.edu.unrc.game2048.Board board68 = new ar.edu.unrc.game2048.Board(board67);
        boolean boolean69 = cell34.equals((java.lang.Object) board68);
        boolean boolean70 = cell4.canMergeWith(cell34);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "." + "'", str58, ".");
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "." + "'", str60, ".");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str65, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 100);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isLosingBoard();
        boolean boolean6 = board4.hasEmptyCells();
        board4.initializeEmptyTest();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG10 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean11 = cell8.equals((java.lang.Object) mockRNG10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG10);
        boolean boolean13 = board12.isFull();
        java.lang.String str14 = board12.toString();
        board12.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean17 = board4.equals((java.lang.Object) board12);
        ar.edu.unrc.game2048.MockRNG mockRNG18 = new ar.edu.unrc.game2048.MockRNG();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(mockRNG18);
        boolean boolean20 = board4.equals((java.lang.Object) mockRNG18);
        board4.initializeEmptyTest();
        boolean boolean22 = board4.moveDown();
        boolean boolean23 = board4.isLosingBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.equals((java.lang.Object) "");
        int int30 = cell27.getValue();
        boolean boolean31 = cell23.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board.Position position34 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean35 = cell27.equals((java.lang.Object) position34);
        boolean boolean36 = cell4.canMergeWith(cell27);
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position40 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str41 = position40.toString();
        int int42 = position40.col;
        boolean boolean43 = cell37.equals((java.lang.Object) int42);
        ar.edu.unrc.game2048.MockRNG mockRNG45 = new ar.edu.unrc.game2048.MockRNG(0.0d);
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(mockRNG45);
        boolean boolean47 = board46.moveLeft();
        boolean boolean48 = board46.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet49 = board46.getEmptyPositions();
        boolean boolean50 = cell37.equals((java.lang.Object) board46);
        boolean boolean51 = cell4.equals((java.lang.Object) cell37);
        ar.edu.unrc.game2048.Cell cell53 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean56 = cell54.equals((java.lang.Object) "");
        java.lang.String str57 = cell54.toString();
        ar.edu.unrc.game2048.Cell cell58 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean60 = cell58.equals((java.lang.Object) "");
        int int61 = cell58.getValue();
        boolean boolean62 = cell54.canMergeWith(cell58);
        ar.edu.unrc.game2048.Board.Position position65 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean66 = cell58.equals((java.lang.Object) position65);
        ar.edu.unrc.game2048.Cell cell67 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean69 = cell67.equals((java.lang.Object) "");
        java.lang.String str70 = cell67.toString();
        ar.edu.unrc.game2048.Cell cell71 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean73 = cell71.equals((java.lang.Object) "");
        int int74 = cell71.getValue();
        boolean boolean75 = cell67.canMergeWith(cell71);
        boolean boolean76 = cell58.canMergeWith(cell71);
        ar.edu.unrc.game2048.Cell cell77 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean79 = cell77.equals((java.lang.Object) "");
        java.lang.String str80 = cell77.toString();
        ar.edu.unrc.game2048.Cell cell81 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean83 = cell81.equals((java.lang.Object) "");
        int int84 = cell81.getValue();
        boolean boolean85 = cell77.canMergeWith(cell81);
        ar.edu.unrc.game2048.Board.Position position88 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean89 = cell81.equals((java.lang.Object) position88);
        boolean boolean90 = cell58.canMergeWith(cell81);
        boolean boolean91 = cell81.isEmpty();
        boolean boolean92 = cell53.canMergeWith(cell81);
        ar.edu.unrc.game2048.Cell cell93 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str94 = cell93.toString();
        boolean boolean96 = cell93.equals((java.lang.Object) (-1.0f));
        java.lang.String str97 = cell93.toString();
        boolean boolean98 = cell53.canMergeWith(cell93);
        boolean boolean99 = cell4.canMergeWith(cell53);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(0, 0)" + "'", str41, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(positionSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "." + "'", str57, ".");
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(cell67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "." + "'", str70, ".");
        org.junit.Assert.assertNotNull(cell71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(cell77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "." + "'", str80, ".");
        org.junit.Assert.assertNotNull(cell81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(cell93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "." + "'", str94, ".");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "." + "'", str97, ".");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        boolean boolean15 = board5.moveLeft();
        boolean boolean16 = board5.isEmpty();
        boolean boolean17 = board5.isEmpty();
        int int18 = board5.winningValue;
        int int19 = board5.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2048 + "'", int18 == 2048);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean8 = board6.equals((java.lang.Object) 1);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 100);
        boolean boolean12 = board6.equals((java.lang.Object) position11);
        boolean boolean13 = board6.isFull();
        boolean boolean14 = board6.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.equals((java.lang.Object) "");
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.equals((java.lang.Object) "");
        int int30 = cell27.getValue();
        boolean boolean31 = cell23.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board.Position position34 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean35 = cell27.equals((java.lang.Object) position34);
        boolean boolean36 = cell4.canMergeWith(cell27);
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position40 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str41 = position40.toString();
        int int42 = position40.col;
        boolean boolean43 = cell37.equals((java.lang.Object) int42);
        ar.edu.unrc.game2048.MockRNG mockRNG45 = new ar.edu.unrc.game2048.MockRNG(0.0d);
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(mockRNG45);
        boolean boolean47 = board46.moveLeft();
        boolean boolean48 = board46.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet49 = board46.getEmptyPositions();
        boolean boolean50 = cell37.equals((java.lang.Object) board46);
        boolean boolean51 = cell4.equals((java.lang.Object) cell37);
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean54 = cell52.equals((java.lang.Object) "");
        java.lang.String str55 = cell52.toString();
        ar.edu.unrc.game2048.Cell cell56 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean58 = cell56.equals((java.lang.Object) "");
        int int59 = cell56.getValue();
        boolean boolean60 = cell52.canMergeWith(cell56);
        int int61 = cell56.getValue();
        java.lang.String str62 = cell56.toString();
        ar.edu.unrc.game2048.Cell cell63 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position66 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str67 = position66.toString();
        int int68 = position66.col;
        boolean boolean69 = cell63.equals((java.lang.Object) int68);
        int int70 = cell63.getValue();
        boolean boolean71 = cell56.equals((java.lang.Object) cell63);
        ar.edu.unrc.game2048.Cell cell72 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean74 = cell72.equals((java.lang.Object) "");
        java.lang.String str75 = cell72.toString();
        ar.edu.unrc.game2048.Cell cell76 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean78 = cell76.equals((java.lang.Object) "");
        int int79 = cell76.getValue();
        boolean boolean80 = cell72.canMergeWith(cell76);
        int int81 = cell76.getValue();
        java.lang.String str82 = cell76.toString();
        ar.edu.unrc.game2048.Cell cell83 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position86 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str87 = position86.toString();
        int int88 = position86.col;
        boolean boolean89 = cell83.equals((java.lang.Object) int88);
        int int90 = cell83.getValue();
        boolean boolean91 = cell76.equals((java.lang.Object) cell83);
        boolean boolean92 = cell63.equals((java.lang.Object) cell83);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell93 = cell37.mergeWith(cell83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(0, 0)" + "'", str41, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(positionSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "." + "'", str55, ".");
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "." + "'", str62, ".");
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(0, 0)" + "'", str67, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(cell72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "." + "'", str75, ".");
        org.junit.Assert.assertNotNull(cell76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "." + "'", str82, ".");
        org.junit.Assert.assertNotNull(cell83);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "(0, 0)" + "'", str87, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 35);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveRight();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean7 = board4.isEmpty();
        java.lang.String str8 = board4.toString();
        boolean boolean9 = board4.moveLeft();
        boolean boolean10 = board4.isLosingBoard();
        boolean boolean11 = board4.isLosingBoard();
        int int12 = board4.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG12 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean13 = cell10.equals((java.lang.Object) mockRNG12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(mockRNG12);
        int int15 = board14.getSize();
        java.lang.String str16 = board14.toString();
        boolean boolean17 = board14.isWinningBoard();
        java.lang.String str18 = board14.toString();
        boolean boolean19 = board14.isLosingBoard();
        boolean boolean20 = board9.equals((java.lang.Object) board14);
        boolean boolean21 = board14.moveDown();
        int int22 = board14.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isFull();
        java.lang.String str6 = board4.toString();
        board4.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean11 = board4.equals((java.lang.Object) 4);
        boolean boolean12 = board4.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean16 = cell13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = board4.equals((java.lang.Object) cell13);
        int int18 = board4.winningValue;
        boolean boolean19 = board4.isFull();
        java.lang.Class<?> wildcardClass20 = board4.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2048 + "'", int18 == 2048);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.equals((java.lang.Object) "");
        int int7 = cell4.getValue();
        boolean boolean8 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean12 = cell4.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) "");
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.equals((java.lang.Object) "");
        int int20 = cell17.getValue();
        boolean boolean21 = cell13.canMergeWith(cell17);
        boolean boolean22 = cell4.canMergeWith(cell17);
        int int23 = cell17.getValue();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean26 = cell24.equals((java.lang.Object) "");
        java.lang.String str27 = cell24.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.equals((java.lang.Object) "");
        int int31 = cell28.getValue();
        boolean boolean32 = cell24.canMergeWith(cell28);
        java.lang.String str33 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str35 = cell34.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG36 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean37 = cell34.equals((java.lang.Object) mockRNG36);
        boolean boolean38 = cell28.equals((java.lang.Object) boolean37);
        boolean boolean39 = cell17.canMergeWith(cell28);
        int int40 = cell28.getValue();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str42 = cell41.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG43 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean44 = cell41.equals((java.lang.Object) mockRNG43);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(mockRNG43);
        int int46 = board45.getSize();
        board45.initializeEmptyTest();
        boolean boolean48 = board45.isEmpty();
        boolean boolean49 = board45.isEmpty();
        int int50 = board45.getScore();
        boolean boolean51 = cell28.equals((java.lang.Object) board45);
        boolean boolean52 = board45.moveUp();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isLosingBoard();
        boolean boolean6 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean8 = board4.isEmpty();
        java.lang.String str9 = board4.toString();
        java.lang.String str10 = board4.toString();
        board4.initializeEmptyTest();
        boolean boolean12 = board4.isFull();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) (short) 10);
        java.lang.String str9 = position8.toString();
        boolean boolean10 = position2.equals((java.lang.Object) str9);
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 0)" + "'", str4, "(0, 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, 0)" + "'", str5, "(0, 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, 10)" + "'", str9, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.winningValue;
        boolean boolean6 = board4.isFull();
        boolean boolean7 = board4.isFull();
        java.lang.String str8 = board4.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2048 + "'", int5 == 2048);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        boolean boolean10 = board6.isEmpty();
        board6.initializeEmptyTest();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2048 + "'", int7 == 2048);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isLosingBoard();
        boolean boolean6 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean8 = board4.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        boolean boolean14 = cell11.equals((java.lang.Object) (-1.0f));
        java.lang.String str15 = cell11.toString();
        java.lang.String str16 = cell11.toString();
        // The following exception was thrown during execution in test generation
        try {
            board4.setCell(4, 1, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        boolean boolean3 = cell0.equals((java.lang.Object) (-1.0f));
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str5 = cell4.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell4.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        boolean boolean11 = cell0.equals((java.lang.Object) positionSet10);
        int int12 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean16 = cell13.equals((java.lang.Object) (-1.0f));
        java.lang.String str17 = cell13.toString();
        boolean boolean18 = cell13.isEmpty();
        ar.edu.unrc.game2048.Board.Position position21 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 10);
        java.lang.String str22 = position21.toString();
        boolean boolean23 = cell13.equals((java.lang.Object) position21);
        boolean boolean24 = cell0.canMergeWith(cell13);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(0, 10)" + "'", str22, "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        boolean boolean3 = cell0.equals((java.lang.Object) (-1.0f));
        java.lang.String str4 = cell0.toString();
        java.lang.String str5 = cell0.toString();
        int int6 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG9 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean10 = cell7.equals((java.lang.Object) mockRNG9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(mockRNG9);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        boolean boolean14 = board11.moveUp();
        boolean boolean15 = board11.moveRight();
        board11.initializeEmptyTest();
        boolean boolean17 = board11.isFull();
        boolean boolean18 = cell0.equals((java.lang.Object) board11);
        boolean boolean19 = board11.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean6 = board5.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        int int8 = board5.winningValue;
        boolean boolean9 = board5.isFull();
        boolean boolean10 = board5.isWinningBoard();
        boolean boolean11 = board5.moveRight();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2048 + "'", int8 == 2048);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        boolean boolean20 = board13.isWinningBoard();
        boolean boolean21 = board13.isWinningBoard();
        int int22 = board13.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str18, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        int int3 = cell0.getValue();
        int int4 = cell0.getValue();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG((double) (short) 0);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean8 = cell0.equals((java.lang.Object) mockRNG6);
        int int9 = cell0.getValue();
        boolean boolean10 = cell0.isEmpty();
        int int11 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        int int5 = board4.getSize();
        java.lang.String str6 = board4.toString();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.moveRight();
        board4.initializeEmptyTest();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board4.getEmptyPositions();
        boolean boolean11 = board4.isFull();
        board4.initializeEmptyTest();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        boolean boolean18 = board15.isEmpty();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board15);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.moveLeft();
        boolean boolean6 = board4.moveRight();
        boolean boolean7 = board4.moveUp();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean2 = cell0.equals((java.lang.Object) "");
        int int3 = cell0.getValue();
        int int4 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.equals((java.lang.Object) "");
        java.lang.String str8 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.equals((java.lang.Object) "");
        int int12 = cell9.getValue();
        boolean boolean13 = cell5.canMergeWith(cell9);
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean17 = cell9.equals((java.lang.Object) position16);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean20 = cell18.equals((java.lang.Object) "");
        boolean boolean21 = cell9.canMergeWith(cell18);
        boolean boolean22 = cell0.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board.Position position26 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 0);
        java.lang.String str27 = position26.toString();
        int int28 = position26.col;
        boolean boolean29 = cell23.equals((java.lang.Object) int28);
        boolean boolean31 = cell23.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str33 = cell32.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG34 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean35 = cell32.equals((java.lang.Object) mockRNG34);
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean38 = cell36.equals((java.lang.Object) "");
        java.lang.String str39 = cell36.toString();
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean42 = cell40.equals((java.lang.Object) "");
        int int43 = cell40.getValue();
        boolean boolean44 = cell36.canMergeWith(cell40);
        ar.edu.unrc.game2048.Board.Position position47 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 10);
        boolean boolean48 = cell40.equals((java.lang.Object) position47);
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean51 = cell49.equals((java.lang.Object) "");
        boolean boolean52 = cell40.canMergeWith(cell49);
        boolean boolean53 = cell32.canMergeWith(cell49);
        int int54 = cell49.getValue();
        boolean boolean55 = cell23.canMergeWith(cell49);
        boolean boolean56 = cell18.canMergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell57 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean59 = cell57.equals((java.lang.Object) "");
        java.lang.String str60 = cell57.toString();
        ar.edu.unrc.game2048.Cell cell61 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean63 = cell61.equals((java.lang.Object) "");
        int int64 = cell61.getValue();
        boolean boolean65 = cell57.canMergeWith(cell61);
        boolean boolean66 = cell61.isEmpty();
        java.lang.String str67 = cell61.toString();
        boolean boolean68 = cell23.canMergeWith(cell61);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0, 0)" + "'", str27, "(0, 0)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "." + "'", str60, ".");
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "." + "'", str67, ".");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 100);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG2 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean3 = cell0.equals((java.lang.Object) mockRNG2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(mockRNG2);
        boolean boolean5 = board4.isLosingBoard();
        boolean boolean6 = board4.hasEmptyCells();
        board4.initializeEmptyTest();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG10 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean11 = cell8.equals((java.lang.Object) mockRNG10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(mockRNG10);
        boolean boolean13 = board12.isFull();
        java.lang.String str14 = board12.toString();
        board12.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean17 = board4.equals((java.lang.Object) board12);
        java.lang.Class<?> wildcardClass18 = board12.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        boolean boolean15 = board5.moveLeft();
        boolean boolean16 = board5.isEmpty();
        boolean boolean17 = board5.hasEmptyCells();
        int int18 = board5.getScore();
        boolean boolean19 = board5.moveRight();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}

