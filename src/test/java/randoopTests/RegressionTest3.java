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
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) (byte) 0);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        int int6 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, 0)" + "'", str3, "(32, 0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(32, 0)" + "'", str4, "(32, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        int int5 = cell0.getValue();
        java.lang.String str6 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        boolean boolean11 = cell7.canMergeWith(cell9);
        int int12 = cell7.getValue();
        java.lang.String str13 = cell7.toString();
        boolean boolean14 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str16 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        boolean boolean19 = cell15.canMergeWith(cell17);
        java.lang.String str20 = cell15.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG21 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean22 = cell15.equals((java.lang.Object) mockRNG21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(mockRNG21);
        boolean boolean24 = board23.hasEmptyCells();
        int int25 = board23.winningValue;
        boolean boolean26 = board23.hasEmptyCells();
        boolean boolean27 = cell7.equals((java.lang.Object) boolean26);
        java.lang.String str28 = cell7.toString();
        int int29 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str31 = cell30.toString();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str33 = cell32.toString();
        boolean boolean34 = cell30.canMergeWith(cell32);
        boolean boolean35 = cell32.isEmpty();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str37 = cell36.toString();
        ar.edu.unrc.game2048.Board.Position position40 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int41 = position40.col;
        boolean boolean43 = position40.equals((java.lang.Object) (byte) 1);
        int int44 = position40.col;
        boolean boolean45 = cell36.equals((java.lang.Object) int44);
        boolean boolean46 = cell32.canMergeWith(cell36);
        ar.edu.unrc.game2048.Board.Position position49 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int50 = position49.col;
        java.lang.String str51 = position49.toString();
        boolean boolean52 = cell36.equals((java.lang.Object) position49);
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str54 = cell53.toString();
        boolean boolean55 = cell36.canMergeWith(cell53);
        boolean boolean56 = cell36.isEmpty();
        boolean boolean57 = cell7.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell58 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str59 = cell58.toString();
        ar.edu.unrc.game2048.Cell cell60 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str61 = cell60.toString();
        boolean boolean62 = cell58.canMergeWith(cell60);
        java.lang.String str63 = cell58.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG64 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean65 = cell58.equals((java.lang.Object) mockRNG64);
        ar.edu.unrc.game2048.Board board66 = new ar.edu.unrc.game2048.Board(mockRNG64);
        boolean boolean67 = board66.hasEmptyCells();
        java.lang.String str68 = board66.toString();
        ar.edu.unrc.game2048.Cell cell69 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str70 = cell69.toString();
        ar.edu.unrc.game2048.Cell cell71 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str72 = cell71.toString();
        boolean boolean73 = cell69.canMergeWith(cell71);
        java.lang.String str74 = cell69.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG75 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean76 = cell69.equals((java.lang.Object) mockRNG75);
        ar.edu.unrc.game2048.Board board77 = new ar.edu.unrc.game2048.Board(mockRNG75);
        ar.edu.unrc.game2048.Board board78 = new ar.edu.unrc.game2048.Board(mockRNG75);
        ar.edu.unrc.game2048.Board board79 = new ar.edu.unrc.game2048.Board(board78);
        boolean boolean80 = board79.moveLeft();
        int int81 = board79.getSize();
        boolean boolean82 = board66.equals((java.lang.Object) board79);
        ar.edu.unrc.game2048.Cell cell83 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str84 = cell83.toString();
        ar.edu.unrc.game2048.Cell cell85 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str86 = cell85.toString();
        boolean boolean87 = cell83.canMergeWith(cell85);
        java.lang.String str88 = cell83.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG89 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean90 = cell83.equals((java.lang.Object) mockRNG89);
        ar.edu.unrc.game2048.Board board91 = new ar.edu.unrc.game2048.Board(mockRNG89);
        ar.edu.unrc.game2048.Board board92 = new ar.edu.unrc.game2048.Board(mockRNG89);
        ar.edu.unrc.game2048.Board board93 = new ar.edu.unrc.game2048.Board(board92);
        ar.edu.unrc.game2048.Board board94 = new ar.edu.unrc.game2048.Board(board92);
        boolean boolean95 = board79.equals((java.lang.Object) board94);
        java.lang.String str96 = board94.toString();
        int int97 = board94.getScore();
        boolean boolean98 = cell7.equals((java.lang.Object) int97);
        boolean boolean99 = cell7.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2048 + "'", int25 == 2048);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(0, 32)" + "'", str51, "(0, 32)");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "." + "'", str59, ".");
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "." + "'", str61, ".");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "." + "'", str63, ".");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str68, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "." + "'", str70, ".");
        org.junit.Assert.assertNotNull(cell71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "." + "'", str72, ".");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "." + "'", str74, ".");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 4 + "'", int81 == 4);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(cell83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "." + "'", str84, ".");
        org.junit.Assert.assertNotNull(cell85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "." + "'", str86, ".");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "." + "'", str88, ".");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str96, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        boolean boolean7 = cell3.canMergeWith(cell5);
        int int8 = cell3.getValue();
        java.lang.String str9 = cell3.toString();
        boolean boolean10 = position2.equals((java.lang.Object) cell3);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean15 = cell11.canMergeWith(cell13);
        boolean boolean16 = cell3.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str20 = cell19.toString();
        boolean boolean21 = cell17.canMergeWith(cell19);
        boolean boolean22 = cell11.canMergeWith(cell17);
        int int23 = cell11.getValue();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str25 = cell24.toString();
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str27 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str29 = cell28.toString();
        boolean boolean30 = cell26.canMergeWith(cell28);
        java.lang.String str31 = cell26.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG32 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean33 = cell26.equals((java.lang.Object) mockRNG32);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(mockRNG32);
        boolean boolean35 = cell24.equals((java.lang.Object) board34);
        boolean boolean36 = cell11.canMergeWith(cell24);
        int int37 = cell24.getValue();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean12 = board11.moveUp();
        int int13 = board11.winningValue;
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str16 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        boolean boolean19 = cell15.canMergeWith(cell17);
        java.lang.String str20 = cell15.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG21 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean22 = cell15.equals((java.lang.Object) mockRNG21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(mockRNG21);
        boolean boolean24 = board23.hasEmptyCells();
        int int25 = board23.winningValue;
        boolean boolean26 = board11.equals((java.lang.Object) int25);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2048 + "'", int13 == 2048);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2048 + "'", int25 == 2048);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str5 = cell4.toString();
        boolean boolean6 = cell2.canMergeWith(cell4);
        java.lang.String str7 = cell2.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG8 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean9 = cell2.equals((java.lang.Object) mockRNG8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(mockRNG8);
        int int11 = board10.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board10.getEmptyPositions();
        boolean boolean13 = board10.moveLeft();
        java.lang.String str14 = board10.toString();
        java.lang.String str15 = board10.toString();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str17 = cell16.toString();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell16.canMergeWith(cell18);
        boolean boolean21 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        ar.edu.unrc.game2048.Board.Position position26 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int27 = position26.col;
        boolean boolean29 = position26.equals((java.lang.Object) (byte) 1);
        int int30 = position26.col;
        boolean boolean31 = cell22.equals((java.lang.Object) int30);
        boolean boolean32 = cell18.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board.Position position35 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int36 = position35.col;
        java.lang.String str37 = position35.toString();
        boolean boolean38 = cell22.equals((java.lang.Object) position35);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str40 = cell39.toString();
        boolean boolean41 = cell22.canMergeWith(cell39);
        boolean boolean42 = board10.equals((java.lang.Object) cell39);
        boolean boolean43 = cell1.canMergeWith(cell39);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(0, 32)" + "'", str37, "(0, 32)");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        boolean boolean7 = cell3.canMergeWith(cell5);
        int int8 = cell3.getValue();
        java.lang.String str9 = cell3.toString();
        boolean boolean10 = position2.equals((java.lang.Object) cell3);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean15 = cell11.canMergeWith(cell13);
        boolean boolean16 = cell3.canMergeWith(cell11);
        boolean boolean17 = cell11.isEmpty();
        int int18 = cell11.getValue();
        java.lang.String str19 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(0);
        int int22 = cell21.getValue();
        boolean boolean23 = cell21.isEmpty();
        boolean boolean24 = cell11.canMergeWith(cell21);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) ' ');
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(97, 32)" + "'", str4, "(97, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(97, 32)" + "'", str5, "(97, 32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(97, 32)" + "'", str6, "(97, 32)");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
        boolean boolean2 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean4 = cell3.isEmpty();
        boolean boolean5 = cell3.isEmpty();
        int int6 = cell3.getValue();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell7.isEmpty();
        boolean boolean9 = cell3.canMergeWith(cell7);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = cell1.mergeWith(cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 1 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        boolean boolean5 = cell2.isEmpty();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int11 = position10.col;
        boolean boolean13 = position10.equals((java.lang.Object) (byte) 1);
        int int14 = position10.col;
        boolean boolean15 = cell6.equals((java.lang.Object) int14);
        boolean boolean16 = cell2.canMergeWith(cell6);
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int20 = position19.col;
        java.lang.String str21 = position19.toString();
        boolean boolean22 = cell6.equals((java.lang.Object) position19);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str24 = cell23.toString();
        boolean boolean25 = cell6.canMergeWith(cell23);
        int int26 = cell23.getValue();
        boolean boolean27 = cell23.isEmpty();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str29 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str31 = cell30.toString();
        boolean boolean32 = cell28.canMergeWith(cell30);
        int int33 = cell28.getValue();
        java.lang.String str34 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str36 = cell35.toString();
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str38 = cell37.toString();
        boolean boolean39 = cell35.canMergeWith(cell37);
        int int40 = cell35.getValue();
        java.lang.String str41 = cell35.toString();
        boolean boolean42 = cell28.canMergeWith(cell35);
        boolean boolean43 = cell35.isEmpty();
        boolean boolean45 = cell35.equals((java.lang.Object) 0.0f);
        int int46 = cell35.getValue();
        ar.edu.unrc.game2048.Cell cell47 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str48 = cell47.toString();
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str50 = cell49.toString();
        boolean boolean51 = cell47.canMergeWith(cell49);
        java.lang.String str52 = cell47.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG53 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean54 = cell47.equals((java.lang.Object) mockRNG53);
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(mockRNG53);
        board55.initializeEmptyTest();
        boolean boolean57 = board55.moveLeft();
        boolean boolean58 = board55.isLosingBoard();
        boolean boolean59 = cell35.equals((java.lang.Object) board55);
        boolean boolean60 = cell23.equals((java.lang.Object) cell35);
        ar.edu.unrc.game2048.Cell cell61 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str62 = cell61.toString();
        ar.edu.unrc.game2048.Cell cell63 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str64 = cell63.toString();
        boolean boolean65 = cell61.canMergeWith(cell63);
        int int66 = cell61.getValue();
        java.lang.String str67 = cell61.toString();
        ar.edu.unrc.game2048.Cell cell68 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str69 = cell68.toString();
        ar.edu.unrc.game2048.Cell cell70 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str71 = cell70.toString();
        boolean boolean72 = cell68.canMergeWith(cell70);
        int int73 = cell68.getValue();
        java.lang.String str74 = cell68.toString();
        boolean boolean75 = cell61.canMergeWith(cell68);
        ar.edu.unrc.game2048.Cell cell76 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str77 = cell76.toString();
        ar.edu.unrc.game2048.Cell cell78 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str79 = cell78.toString();
        boolean boolean80 = cell76.canMergeWith(cell78);
        java.lang.String str81 = cell76.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG82 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean83 = cell76.equals((java.lang.Object) mockRNG82);
        ar.edu.unrc.game2048.Board board84 = new ar.edu.unrc.game2048.Board(mockRNG82);
        boolean boolean85 = board84.hasEmptyCells();
        int int86 = board84.winningValue;
        boolean boolean87 = board84.hasEmptyCells();
        boolean boolean88 = cell68.equals((java.lang.Object) boolean87);
        boolean boolean89 = cell68.isEmpty();
        boolean boolean90 = cell68.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell91 = cell23.mergeWith(cell68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0, 32)" + "'", str21, "(0, 32)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "." + "'", str48, ".");
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "." + "'", str50, ".");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "." + "'", str62, ".");
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "." + "'", str64, ".");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "." + "'", str67, ".");
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "." + "'", str69, ".");
        org.junit.Assert.assertNotNull(cell70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "." + "'", str71, ".");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "." + "'", str74, ".");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(cell76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "." + "'", str77, ".");
        org.junit.Assert.assertNotNull(cell78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "." + "'", str79, ".");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "." + "'", str81, ".");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2048 + "'", int86 == 2048);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board13.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        int int5 = cell0.getValue();
        java.lang.String str6 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        boolean boolean11 = cell7.canMergeWith(cell9);
        int int12 = cell7.getValue();
        java.lang.String str13 = cell7.toString();
        boolean boolean14 = cell0.canMergeWith(cell7);
        boolean boolean15 = cell7.isEmpty();
        boolean boolean17 = cell7.equals((java.lang.Object) 0.0f);
        boolean boolean19 = cell7.equals((java.lang.Object) 100);
        boolean boolean20 = cell7.isEmpty();
        boolean boolean21 = cell7.isEmpty();
        int int22 = cell7.getValue();
        int int23 = cell7.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int5 = position4.col;
        boolean boolean7 = position4.equals((java.lang.Object) (byte) 1);
        int int8 = position4.col;
        boolean boolean9 = cell0.equals((java.lang.Object) int8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell10.canMergeWith(cell12);
        java.lang.String str15 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG16 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean17 = cell10.equals((java.lang.Object) mockRNG16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(mockRNG16);
        int int19 = board18.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board18.getEmptyPositions();
        int int21 = board18.winningValue;
        boolean boolean22 = board18.moveLeft();
        boolean boolean23 = board18.isWinningBoard();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean26 = cell0.equals((java.lang.Object) board18);
        int int27 = cell0.getValue();
        int int28 = cell0.getValue();
        java.lang.String str29 = cell0.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2048 + "'", int21 == 2048);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean12 = board8.hasEmptyCells();
        int int13 = board8.getScore();
        int int14 = board8.getScore();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board8);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean12 = board8.isLosingBoard();
        boolean boolean13 = board8.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board8.getEmptyPositions();
        int int15 = board8.getScore();
        int int16 = board8.getSize();
        boolean boolean17 = board8.moveDown();
        int int18 = board8.getSize();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        boolean boolean9 = cell5.canMergeWith(cell7);
        java.lang.String str10 = cell5.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG11 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean12 = cell5.equals((java.lang.Object) mockRNG11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(mockRNG11);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.winningValue;
        boolean boolean16 = board13.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int20 = position19.col;
        java.lang.String str21 = position19.toString();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str25 = cell24.toString();
        boolean boolean26 = cell22.canMergeWith(cell24);
        java.lang.String str27 = cell22.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG28 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean29 = cell22.equals((java.lang.Object) mockRNG28);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(mockRNG28);
        int int31 = board30.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board30.getEmptyPositions();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean34 = board33.hasEmptyCells();
        boolean boolean35 = position19.equals((java.lang.Object) board33);
        int int36 = position19.row;
        boolean boolean37 = board13.equals((java.lang.Object) int36);
        boolean boolean38 = cell0.equals((java.lang.Object) board13);
        boolean boolean39 = board13.isFull();
        boolean boolean40 = board13.isWinningBoard();
        int int41 = board13.getScore();
        java.lang.String str42 = board13.toString();
        boolean boolean43 = board13.isEmpty();
        int int44 = board13.winningValue;
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(board13);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2048 + "'", int15 == 2048);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0, 32)" + "'", str21, "(0, 32)");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str42, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2048 + "'", int44 == 2048);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        board8.initializeEmptyTest();
        boolean boolean10 = board8.moveDown();
        int int11 = board8.getScore();
        java.lang.String str12 = board8.toString();
        java.lang.String str13 = board8.toString();
        boolean boolean14 = board8.moveDown();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        board8.initializeEmptyTest();
        boolean boolean10 = board8.moveDown();
        int int11 = board8.winningValue;
        java.lang.String str12 = board8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG14 = new ar.edu.unrc.game2048.MockRNG((double) (short) 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(mockRNG14);
        boolean boolean16 = board8.equals((java.lang.Object) mockRNG14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(mockRNG14);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(mockRNG14);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(mockRNG14);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(mockRNG14);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(mockRNG14);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2048 + "'", int11 == 2048);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.moveLeft();
        java.lang.String str10 = board8.toString();
        boolean boolean11 = board8.moveDown();
        boolean boolean12 = board8.hasEmptyCells();
        boolean boolean13 = board8.isLosingBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        boolean boolean9 = cell5.canMergeWith(cell7);
        int int10 = cell5.getValue();
        java.lang.String str11 = cell5.toString();
        boolean boolean12 = position4.equals((java.lang.Object) cell5);
        boolean boolean13 = cell0.canMergeWith(cell5);
        int int14 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str16 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        boolean boolean19 = cell15.canMergeWith(cell17);
        java.lang.String str20 = cell15.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG21 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean22 = cell15.equals((java.lang.Object) mockRNG21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(mockRNG21);
        int int24 = board23.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board23.getEmptyPositions();
        boolean boolean26 = board23.moveLeft();
        java.lang.String str27 = board23.toString();
        java.lang.String str28 = board23.toString();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str30 = cell29.toString();
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str32 = cell31.toString();
        boolean boolean33 = cell29.canMergeWith(cell31);
        boolean boolean34 = cell31.isEmpty();
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str36 = cell35.toString();
        ar.edu.unrc.game2048.Board.Position position39 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int40 = position39.col;
        boolean boolean42 = position39.equals((java.lang.Object) (byte) 1);
        int int43 = position39.col;
        boolean boolean44 = cell35.equals((java.lang.Object) int43);
        boolean boolean45 = cell31.canMergeWith(cell35);
        ar.edu.unrc.game2048.Board.Position position48 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int49 = position48.col;
        java.lang.String str50 = position48.toString();
        boolean boolean51 = cell35.equals((java.lang.Object) position48);
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str53 = cell52.toString();
        boolean boolean54 = cell35.canMergeWith(cell52);
        boolean boolean55 = board23.equals((java.lang.Object) cell52);
        boolean boolean56 = cell0.canMergeWith(cell52);
        boolean boolean57 = cell0.isEmpty();
        java.lang.Class<?> wildcardClass58 = cell0.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str27, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str28, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(0, 32)" + "'", str50, "(0, 32)");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean12 = board8.isLosingBoard();
        boolean boolean13 = board8.isFull();
        boolean boolean14 = board8.hasEmptyCells();
        board8.initializeEmptyTest();
        boolean boolean16 = board8.isWinningBoard();
        boolean boolean17 = board8.isWinningBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.MockRNG mockRNG1 = new ar.edu.unrc.game2048.MockRNG((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value must be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        board8.initializeEmptyTest();
        boolean boolean10 = board8.moveRight();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str13 = cell12.toString();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str15 = cell14.toString();
        boolean boolean16 = cell12.canMergeWith(cell14);
        java.lang.String str17 = cell12.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG18 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean19 = cell12.equals((java.lang.Object) mockRNG18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(mockRNG18);
        board20.initializeEmptyTest();
        boolean boolean22 = board20.moveRight();
        boolean boolean23 = board8.equals((java.lang.Object) boolean22);
        int int24 = board8.winningValue;
        java.lang.String str25 = board8.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2048 + "'", int24 == 2048);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveLeft();
        boolean boolean12 = board10.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board10.getCell((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (short) 100);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        boolean boolean7 = cell3.canMergeWith(cell5);
        java.lang.String str8 = cell3.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG9 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean10 = cell3.equals((java.lang.Object) mockRNG9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(mockRNG9);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.isLosingBoard();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str17 = cell16.toString();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell16.canMergeWith(cell18);
        java.lang.String str21 = cell16.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG22 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean23 = cell16.equals((java.lang.Object) mockRNG22);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(mockRNG22);
        int int25 = board24.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board24.getEmptyPositions();
        int int27 = board24.winningValue;
        boolean boolean28 = board24.moveLeft();
        boolean boolean29 = board24.isWinningBoard();
        boolean boolean30 = board11.equals((java.lang.Object) boolean29);
        boolean boolean31 = board11.isEmpty();
        board11.initializeEmptyTest();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board11.getEmptyPositions();
        boolean boolean34 = position2.equals((java.lang.Object) board11);
        java.lang.String str35 = position2.toString();
        int int36 = position2.col;
        ar.edu.unrc.game2048.Board.Position position39 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) (byte) 1);
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str41 = cell40.toString();
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str43 = cell42.toString();
        boolean boolean44 = cell40.canMergeWith(cell42);
        java.lang.String str45 = cell40.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG46 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean47 = cell40.equals((java.lang.Object) mockRNG46);
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(mockRNG46);
        int int49 = board48.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet50 = board48.getEmptyPositions();
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(board48);
        boolean boolean52 = board48.isLosingBoard();
        boolean boolean53 = board48.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet54 = board48.getEmptyPositions();
        boolean boolean55 = position39.equals((java.lang.Object) positionSet54);
        int int56 = position39.col;
        boolean boolean57 = position2.equals((java.lang.Object) int56);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2048 + "'", int27 == 2048);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0, 100)" + "'", str35, "(0, 100)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertNotNull(positionSet50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(positionSet54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 0);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 0)" + "'", str3, "(100, 0)");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        int int11 = board8.winningValue;
        boolean boolean12 = board8.isWinningBoard();
        boolean boolean13 = board8.isLosingBoard();
        boolean boolean14 = board8.isLosingBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2048 + "'", int11 == 2048);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board10.moveUp();
        boolean boolean12 = board10.moveDown();
        boolean boolean13 = board10.hasEmptyCells();
        int int14 = board10.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board10.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) (byte) 0);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        int int7 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, 0)" + "'", str3, "(32, 0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(32, 0)" + "'", str4, "(32, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, 0)" + "'", str6, "(32, 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        ar.edu.unrc.game2048.MockRNG mockRNG1 = new ar.edu.unrc.game2048.MockRNG((double) (short) 0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(mockRNG1);
        ar.edu.unrc.game2048.Cell cell5 = board2.getCell((int) (byte) 1, 0);
        boolean boolean6 = board2.isFull();
        boolean boolean7 = board2.isEmpty();
        int int8 = board2.winningValue;
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2048 + "'", int8 == 2048);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.moveRight();
        boolean boolean10 = board8.moveLeft();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        board8.initializeEmptyTest();
        boolean boolean10 = board8.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board8.getEmptyPositions();
        boolean boolean12 = board8.moveDown();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean14 = board8.moveLeft();
        board8.initializeEmptyTest();
        boolean boolean16 = board8.moveDown();
        boolean boolean17 = board8.moveLeft();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        board8.initializeEmptyTest();
        boolean boolean10 = board8.moveLeft();
        boolean boolean11 = board8.isLosingBoard();
        boolean boolean12 = board8.moveRight();
        boolean boolean13 = board8.isFull();
        boolean boolean14 = board8.hasEmptyCells();
        boolean boolean15 = board8.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int5 = position4.col;
        boolean boolean7 = position4.equals((java.lang.Object) (byte) 1);
        int int8 = position4.col;
        boolean boolean9 = cell0.equals((java.lang.Object) int8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell10.canMergeWith(cell12);
        java.lang.String str15 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG16 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean17 = cell10.equals((java.lang.Object) mockRNG16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(mockRNG16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(mockRNG16);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = cell0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.moveDown();
        board20.initializeEmptyTest();
        boolean boolean24 = board20.isLosingBoard();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board20);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell28 = board20.getCell((int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        int int5 = cell0.getValue();
        java.lang.String str6 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        boolean boolean11 = cell7.canMergeWith(cell9);
        int int12 = cell7.getValue();
        java.lang.String str13 = cell7.toString();
        boolean boolean14 = cell0.canMergeWith(cell7);
        boolean boolean15 = cell7.isEmpty();
        boolean boolean17 = cell7.equals((java.lang.Object) 0.0f);
        boolean boolean19 = cell7.equals((java.lang.Object) 100);
        int int20 = cell7.getValue();
        ar.edu.unrc.game2048.MockRNG mockRNG21 = new ar.edu.unrc.game2048.MockRNG();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(mockRNG21);
        boolean boolean23 = cell7.equals((java.lang.Object) board22);
        int int24 = cell7.getValue();
        boolean boolean25 = cell7.isEmpty();
        int int26 = cell7.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        boolean boolean10 = board8.hasEmptyCells();
        boolean boolean11 = board8.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board8.getEmptyPositions();
        java.lang.String str13 = board8.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board13.moveDown();
        boolean boolean15 = board13.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str17 = cell16.toString();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell16.canMergeWith(cell18);
        java.lang.String str21 = cell16.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG22 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean23 = cell16.equals((java.lang.Object) mockRNG22);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(mockRNG22);
        int int25 = board24.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean28 = board24.isLosingBoard();
        boolean boolean29 = board24.isFull();
        int int30 = board24.getSize();
        boolean boolean31 = board13.equals((java.lang.Object) int30);
        java.lang.Object obj32 = null;
        boolean boolean33 = board13.equals(obj32);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (byte) 0);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 0)" + "'", str4, "(1, 0)");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) ' ');
        int int3 = position2.row;
        ar.edu.unrc.game2048.MockRNG mockRNG4 = new ar.edu.unrc.game2048.MockRNG();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(mockRNG4);
        boolean boolean7 = position2.equals((java.lang.Object) mockRNG4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int5 = position4.col;
        boolean boolean7 = position4.equals((java.lang.Object) (byte) 1);
        int int8 = position4.col;
        boolean boolean9 = cell0.equals((java.lang.Object) int8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell10.canMergeWith(cell12);
        java.lang.String str15 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG16 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean17 = cell10.equals((java.lang.Object) mockRNG16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(mockRNG16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(mockRNG16);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = cell0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.moveDown();
        board20.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board20);
        int int25 = board24.winningValue;
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean27 = board24.isWinningBoard();
        boolean boolean28 = board24.moveLeft();
        boolean boolean29 = board24.isFull();
        board24.initializeEmptyTest();
        int int31 = board24.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2048 + "'", int25 == 2048);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        int int11 = board8.winningValue;
        boolean boolean12 = board8.moveLeft();
        boolean boolean13 = board8.hasEmptyCells();
        boolean boolean14 = board8.moveDown();
        boolean boolean15 = board8.isLosingBoard();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board8);
        int int17 = board8.winningValue;
        boolean boolean18 = board8.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = board8.getCell((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2048 + "'", int11 == 2048);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2048 + "'", int17 == 2048);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        boolean boolean7 = cell3.canMergeWith(cell5);
        int int8 = cell3.getValue();
        java.lang.String str9 = cell3.toString();
        boolean boolean10 = position2.equals((java.lang.Object) cell3);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean15 = cell11.canMergeWith(cell13);
        boolean boolean16 = cell3.canMergeWith(cell11);
        int int17 = cell3.getValue();
        java.lang.String str18 = cell3.toString();
        boolean boolean19 = cell3.isEmpty();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str21 = cell20.toString();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        boolean boolean24 = cell20.canMergeWith(cell22);
        int int25 = cell20.getValue();
        java.lang.String str26 = cell20.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str28 = cell27.toString();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str30 = cell29.toString();
        boolean boolean31 = cell27.canMergeWith(cell29);
        int int32 = cell27.getValue();
        java.lang.String str33 = cell27.toString();
        boolean boolean34 = cell20.canMergeWith(cell27);
        ar.edu.unrc.game2048.Board.Position position37 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str39 = cell38.toString();
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str41 = cell40.toString();
        boolean boolean42 = cell38.canMergeWith(cell40);
        int int43 = cell38.getValue();
        java.lang.String str44 = cell38.toString();
        boolean boolean45 = position37.equals((java.lang.Object) cell38);
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str47 = cell46.toString();
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str49 = cell48.toString();
        boolean boolean50 = cell46.canMergeWith(cell48);
        boolean boolean51 = cell38.canMergeWith(cell46);
        boolean boolean52 = cell27.canMergeWith(cell38);
        boolean boolean53 = cell3.canMergeWith(cell27);
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str55 = cell54.toString();
        ar.edu.unrc.game2048.Board.Position position58 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int59 = position58.col;
        boolean boolean61 = position58.equals((java.lang.Object) (byte) 1);
        int int62 = position58.col;
        boolean boolean63 = cell54.equals((java.lang.Object) int62);
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str65 = cell64.toString();
        ar.edu.unrc.game2048.Cell cell66 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str67 = cell66.toString();
        boolean boolean68 = cell64.canMergeWith(cell66);
        java.lang.String str69 = cell64.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG70 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean71 = cell64.equals((java.lang.Object) mockRNG70);
        ar.edu.unrc.game2048.Board board72 = new ar.edu.unrc.game2048.Board(mockRNG70);
        ar.edu.unrc.game2048.Board board73 = new ar.edu.unrc.game2048.Board(mockRNG70);
        ar.edu.unrc.game2048.Board board74 = new ar.edu.unrc.game2048.Board(board73);
        boolean boolean75 = cell54.equals((java.lang.Object) board74);
        boolean boolean76 = board74.moveDown();
        board74.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board78 = new ar.edu.unrc.game2048.Board(board74);
        int int79 = board78.winningValue;
        ar.edu.unrc.game2048.Board board80 = new ar.edu.unrc.game2048.Board(board78);
        boolean boolean81 = board78.isWinningBoard();
        ar.edu.unrc.game2048.Board board82 = new ar.edu.unrc.game2048.Board(board78);
        boolean boolean83 = cell27.equals((java.lang.Object) board82);
        boolean boolean84 = board82.isEmpty();
        boolean boolean85 = board82.moveLeft();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "." + "'", str55, ".");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 32 + "'", int59 == 32);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "." + "'", str65, ".");
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "." + "'", str67, ".");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "." + "'", str69, ".");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2048 + "'", int79 == 2048);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        int int5 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        boolean boolean10 = cell6.canMergeWith(cell8);
        java.lang.String str11 = cell6.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG12 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean13 = cell6.equals((java.lang.Object) mockRNG12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(mockRNG12);
        int int15 = board14.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board14.getEmptyPositions();
        boolean boolean17 = cell0.equals((java.lang.Object) positionSet16);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str19 = cell18.toString();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str21 = cell20.toString();
        boolean boolean22 = cell18.canMergeWith(cell20);
        java.lang.String str23 = cell18.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG24 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean25 = cell18.equals((java.lang.Object) mockRNG24);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(mockRNG24);
        boolean boolean27 = board26.moveLeft();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str29 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str31 = cell30.toString();
        boolean boolean32 = cell28.canMergeWith(cell30);
        int int33 = cell28.getValue();
        java.lang.String str34 = cell28.toString();
        boolean boolean35 = board26.equals((java.lang.Object) cell28);
        boolean boolean36 = cell0.equals((java.lang.Object) board26);
        board26.initializeEmptyTest();
        int int38 = board26.winningValue;
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2048 + "'", int38 == 2048);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
        boolean boolean2 = cell1.isEmpty();
        java.lang.String str3 = cell1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, -1)" + "'", str3, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, 2);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        boolean boolean7 = cell3.canMergeWith(cell5);
        int int8 = cell3.getValue();
        java.lang.String str9 = cell3.toString();
        boolean boolean10 = position2.equals((java.lang.Object) cell3);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean15 = cell11.canMergeWith(cell13);
        boolean boolean16 = cell3.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str20 = cell19.toString();
        boolean boolean21 = cell17.canMergeWith(cell19);
        boolean boolean22 = cell11.canMergeWith(cell17);
        int int23 = cell11.getValue();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str25 = cell24.toString();
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str27 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str29 = cell28.toString();
        boolean boolean30 = cell26.canMergeWith(cell28);
        java.lang.String str31 = cell26.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG32 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean33 = cell26.equals((java.lang.Object) mockRNG32);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(mockRNG32);
        boolean boolean35 = cell24.equals((java.lang.Object) board34);
        boolean boolean36 = cell11.canMergeWith(cell24);
        ar.edu.unrc.game2048.Board.Position position39 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str41 = cell40.toString();
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str43 = cell42.toString();
        boolean boolean44 = cell40.canMergeWith(cell42);
        int int45 = cell40.getValue();
        java.lang.String str46 = cell40.toString();
        boolean boolean47 = position39.equals((java.lang.Object) cell40);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str49 = cell48.toString();
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str51 = cell50.toString();
        boolean boolean52 = cell48.canMergeWith(cell50);
        boolean boolean53 = cell40.canMergeWith(cell48);
        boolean boolean54 = cell11.canMergeWith(cell40);
        ar.edu.unrc.game2048.Board.Position position57 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell58 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str59 = cell58.toString();
        ar.edu.unrc.game2048.Cell cell60 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str61 = cell60.toString();
        boolean boolean62 = cell58.canMergeWith(cell60);
        int int63 = cell58.getValue();
        java.lang.String str64 = cell58.toString();
        boolean boolean65 = position57.equals((java.lang.Object) cell58);
        ar.edu.unrc.game2048.Cell cell66 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str67 = cell66.toString();
        ar.edu.unrc.game2048.Cell cell68 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str69 = cell68.toString();
        boolean boolean70 = cell66.canMergeWith(cell68);
        boolean boolean71 = cell58.canMergeWith(cell66);
        ar.edu.unrc.game2048.Cell cell72 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str73 = cell72.toString();
        ar.edu.unrc.game2048.Cell cell74 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str75 = cell74.toString();
        boolean boolean76 = cell72.canMergeWith(cell74);
        boolean boolean77 = cell66.canMergeWith(cell72);
        int int78 = cell66.getValue();
        ar.edu.unrc.game2048.Cell cell79 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str80 = cell79.toString();
        ar.edu.unrc.game2048.Cell cell81 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str82 = cell81.toString();
        ar.edu.unrc.game2048.Cell cell83 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str84 = cell83.toString();
        boolean boolean85 = cell81.canMergeWith(cell83);
        java.lang.String str86 = cell81.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG87 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean88 = cell81.equals((java.lang.Object) mockRNG87);
        ar.edu.unrc.game2048.Board board89 = new ar.edu.unrc.game2048.Board(mockRNG87);
        boolean boolean90 = cell79.equals((java.lang.Object) board89);
        boolean boolean91 = cell66.canMergeWith(cell79);
        boolean boolean92 = cell40.canMergeWith(cell79);
        boolean boolean93 = cell40.isEmpty();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "." + "'", str51, ".");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "." + "'", str59, ".");
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "." + "'", str61, ".");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "." + "'", str64, ".");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "." + "'", str67, ".");
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "." + "'", str69, ".");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(cell72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "." + "'", str73, ".");
        org.junit.Assert.assertNotNull(cell74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "." + "'", str75, ".");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(cell79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "." + "'", str80, ".");
        org.junit.Assert.assertNotNull(cell81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "." + "'", str82, ".");
        org.junit.Assert.assertNotNull(cell83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "." + "'", str84, ".");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "." + "'", str86, ".");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        boolean boolean10 = board8.isLosingBoard();
        int int11 = board8.getSize();
        int int12 = board8.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getScore();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str13 = cell12.toString();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str15 = cell14.toString();
        boolean boolean16 = cell12.canMergeWith(cell14);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str20 = cell19.toString();
        boolean boolean21 = cell17.canMergeWith(cell19);
        java.lang.String str22 = cell17.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG23 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean24 = cell17.equals((java.lang.Object) mockRNG23);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(mockRNG23);
        boolean boolean26 = board25.hasEmptyCells();
        int int27 = board25.winningValue;
        boolean boolean28 = board25.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position31 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int32 = position31.col;
        java.lang.String str33 = position31.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str35 = cell34.toString();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str37 = cell36.toString();
        boolean boolean38 = cell34.canMergeWith(cell36);
        java.lang.String str39 = cell34.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG40 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean41 = cell34.equals((java.lang.Object) mockRNG40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(mockRNG40);
        int int43 = board42.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean46 = board45.hasEmptyCells();
        boolean boolean47 = position31.equals((java.lang.Object) board45);
        int int48 = position31.row;
        boolean boolean49 = board25.equals((java.lang.Object) int48);
        boolean boolean50 = cell12.equals((java.lang.Object) board25);
        int int51 = cell12.getValue();
        ar.edu.unrc.game2048.MockRNG mockRNG52 = new ar.edu.unrc.game2048.MockRNG();
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board(mockRNG52);
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(mockRNG52);
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(mockRNG52);
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(mockRNG52);
        boolean boolean57 = cell12.equals((java.lang.Object) board56);
        board8.setCell(1, (int) (byte) 0, cell12);
        java.lang.String str59 = cell12.toString();
        ar.edu.unrc.game2048.Cell cell60 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str61 = cell60.toString();
        ar.edu.unrc.game2048.Cell cell62 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str63 = cell62.toString();
        boolean boolean64 = cell60.canMergeWith(cell62);
        int int65 = cell60.getValue();
        java.lang.String str66 = cell60.toString();
        ar.edu.unrc.game2048.Cell cell67 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str68 = cell67.toString();
        ar.edu.unrc.game2048.Cell cell69 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str70 = cell69.toString();
        boolean boolean71 = cell67.canMergeWith(cell69);
        int int72 = cell67.getValue();
        java.lang.String str73 = cell67.toString();
        boolean boolean74 = cell60.canMergeWith(cell67);
        boolean boolean75 = cell67.isEmpty();
        boolean boolean77 = cell67.equals((java.lang.Object) 0.0f);
        boolean boolean79 = cell67.equals((java.lang.Object) 100);
        int int80 = cell67.getValue();
        ar.edu.unrc.game2048.Board.Position position83 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell84 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str85 = cell84.toString();
        ar.edu.unrc.game2048.Cell cell86 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str87 = cell86.toString();
        boolean boolean88 = cell84.canMergeWith(cell86);
        int int89 = cell84.getValue();
        java.lang.String str90 = cell84.toString();
        boolean boolean91 = position83.equals((java.lang.Object) cell84);
        java.lang.String str92 = cell84.toString();
        boolean boolean93 = cell67.canMergeWith(cell84);
        java.lang.String str94 = cell84.toString();
        boolean boolean95 = cell12.canMergeWith(cell84);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2048 + "'", int27 == 2048);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(0, 32)" + "'", str33, "(0, 32)");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "." + "'", str59, ".");
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "." + "'", str61, ".");
        org.junit.Assert.assertNotNull(cell62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "." + "'", str63, ".");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "." + "'", str66, ".");
        org.junit.Assert.assertNotNull(cell67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "." + "'", str68, ".");
        org.junit.Assert.assertNotNull(cell69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "." + "'", str70, ".");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "." + "'", str73, ".");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(cell84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "." + "'", str85, ".");
        org.junit.Assert.assertNotNull(cell86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "." + "'", str87, ".");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "." + "'", str90, ".");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "." + "'", str92, ".");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "." + "'", str94, ".");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        boolean boolean7 = cell3.canMergeWith(cell5);
        int int8 = cell3.getValue();
        java.lang.String str9 = cell3.toString();
        boolean boolean10 = position2.equals((java.lang.Object) cell3);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean15 = cell11.canMergeWith(cell13);
        boolean boolean16 = cell3.canMergeWith(cell11);
        int int17 = cell3.getValue();
        java.lang.String str18 = cell3.toString();
        boolean boolean19 = cell3.isEmpty();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str21 = cell20.toString();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        boolean boolean24 = cell20.canMergeWith(cell22);
        int int25 = cell20.getValue();
        java.lang.String str26 = cell20.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell27 = cell3.mergeWith(cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        boolean boolean5 = cell2.isEmpty();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int11 = position10.col;
        boolean boolean13 = position10.equals((java.lang.Object) (byte) 1);
        int int14 = position10.col;
        boolean boolean15 = cell6.equals((java.lang.Object) int14);
        boolean boolean16 = cell2.canMergeWith(cell6);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str20 = cell19.toString();
        boolean boolean21 = cell17.canMergeWith(cell19);
        int int22 = cell17.getValue();
        boolean boolean23 = cell2.canMergeWith(cell17);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        boolean boolean10 = board8.isLosingBoard();
        boolean boolean11 = board8.moveDown();
        boolean boolean12 = board8.isFull();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str15 = cell14.toString();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str17 = cell16.toString();
        boolean boolean18 = cell14.canMergeWith(cell16);
        java.lang.String str19 = cell14.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG20 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean21 = cell14.equals((java.lang.Object) mockRNG20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(mockRNG20);
        boolean boolean23 = board22.moveLeft();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str25 = cell24.toString();
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str27 = cell26.toString();
        boolean boolean28 = cell24.canMergeWith(cell26);
        int int29 = cell24.getValue();
        java.lang.String str30 = cell24.toString();
        boolean boolean31 = board22.equals((java.lang.Object) cell24);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean33 = board8.equals((java.lang.Object) board32);
        boolean boolean34 = board8.moveRight();
        boolean boolean35 = board8.isLosingBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        int int5 = cell0.getValue();
        java.lang.String str6 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        boolean boolean11 = cell7.canMergeWith(cell9);
        int int12 = cell7.getValue();
        java.lang.String str13 = cell7.toString();
        boolean boolean14 = cell0.canMergeWith(cell7);
        int int15 = cell7.getValue();
        boolean boolean16 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean18 = cell17.isEmpty();
        ar.edu.unrc.game2048.Board.Position position21 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str25 = cell24.toString();
        boolean boolean26 = cell22.canMergeWith(cell24);
        int int27 = cell22.getValue();
        java.lang.String str28 = cell22.toString();
        boolean boolean29 = position21.equals((java.lang.Object) cell22);
        boolean boolean30 = cell17.canMergeWith(cell22);
        int int31 = cell17.getValue();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str33 = cell32.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str35 = cell34.toString();
        boolean boolean36 = cell32.canMergeWith(cell34);
        java.lang.String str37 = cell32.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG38 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean39 = cell32.equals((java.lang.Object) mockRNG38);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(mockRNG38);
        int int41 = board40.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board40.getEmptyPositions();
        boolean boolean43 = board40.moveLeft();
        java.lang.String str44 = board40.toString();
        java.lang.String str45 = board40.toString();
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str47 = cell46.toString();
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str49 = cell48.toString();
        boolean boolean50 = cell46.canMergeWith(cell48);
        boolean boolean51 = cell48.isEmpty();
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str53 = cell52.toString();
        ar.edu.unrc.game2048.Board.Position position56 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int57 = position56.col;
        boolean boolean59 = position56.equals((java.lang.Object) (byte) 1);
        int int60 = position56.col;
        boolean boolean61 = cell52.equals((java.lang.Object) int60);
        boolean boolean62 = cell48.canMergeWith(cell52);
        ar.edu.unrc.game2048.Board.Position position65 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int66 = position65.col;
        java.lang.String str67 = position65.toString();
        boolean boolean68 = cell52.equals((java.lang.Object) position65);
        ar.edu.unrc.game2048.Cell cell69 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str70 = cell69.toString();
        boolean boolean71 = cell52.canMergeWith(cell69);
        boolean boolean72 = board40.equals((java.lang.Object) cell69);
        boolean boolean73 = cell17.canMergeWith(cell69);
        boolean boolean74 = cell17.isEmpty();
        boolean boolean75 = cell7.canMergeWith(cell17);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str44, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str45, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 32 + "'", int57 == 32);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 32 + "'", int60 == 32);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 32 + "'", int66 == 32);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(0, 32)" + "'", str67, "(0, 32)");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(cell69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "." + "'", str70, ".");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        boolean boolean10 = board8.isLosingBoard();
        boolean boolean11 = board8.moveDown();
        boolean boolean12 = board8.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str15 = cell14.toString();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str17 = cell16.toString();
        boolean boolean18 = cell14.canMergeWith(cell16);
        java.lang.String str19 = cell14.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG20 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean21 = cell14.equals((java.lang.Object) mockRNG20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(mockRNG20);
        boolean boolean23 = board8.equals((java.lang.Object) board22);
        board8.initializeEmptyTest();
        board8.initializeEmptyTest();
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str27 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str29 = cell28.toString();
        boolean boolean30 = cell26.canMergeWith(cell28);
        java.lang.String str31 = cell26.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG32 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean33 = cell26.equals((java.lang.Object) mockRNG32);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(mockRNG32);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(mockRNG32);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(mockRNG32);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(mockRNG32);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(mockRNG32);
        boolean boolean39 = board8.equals((java.lang.Object) mockRNG32);
        boolean boolean40 = board8.isLosingBoard();
        int int41 = board8.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean12 = board8.hasEmptyCells();
        int int13 = board8.getScore();
        java.lang.String str14 = board8.toString();
        boolean boolean15 = board8.moveRight();
        boolean boolean16 = board8.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) ' ');
        int int3 = position2.row;
        ar.edu.unrc.game2048.MockRNG mockRNG4 = new ar.edu.unrc.game2048.MockRNG();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(mockRNG4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(mockRNG4);
        boolean boolean7 = position2.equals((java.lang.Object) mockRNG4);
        int int8 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int8 = position7.row;
        java.lang.String str9 = position7.toString();
        int int10 = position7.row;
        boolean boolean11 = position2.equals((java.lang.Object) position7);
        java.lang.String str12 = position7.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 0)" + "'", str3, "(35, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, 32)" + "'", str9, "(0, 32)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0, 32)" + "'", str12, "(0, 32)");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, 0);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position(35, (int) (short) 100);
        boolean boolean6 = position2.equals((java.lang.Object) position5);
        java.lang.String str7 = position5.toString();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        boolean boolean12 = cell8.canMergeWith(cell10);
        java.lang.String str13 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG14 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean15 = cell8.equals((java.lang.Object) mockRNG14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(mockRNG14);
        int int17 = board16.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board16.getEmptyPositions();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board16);
        board19.initializeEmptyTest();
        java.lang.String str21 = board19.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = board19.getEmptyPositions();
        boolean boolean23 = position5.equals((java.lang.Object) board19);
        boolean boolean24 = board19.moveRight();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board19);
        board19.initializeEmptyTest();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(35, 100)" + "'", str7, "(35, 100)");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str21, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        boolean boolean10 = board8.hasEmptyCells();
        boolean boolean11 = board8.moveLeft();
        boolean boolean12 = board8.moveLeft();
        boolean boolean13 = board8.moveUp();
        boolean boolean14 = board8.isLosingBoard();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        board11.initializeEmptyTest();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.isFull();
        boolean boolean15 = board11.isWinningBoard();
        boolean boolean16 = board11.moveDown();
        boolean boolean17 = board11.moveLeft();
        boolean boolean18 = board11.moveLeft();
        java.lang.Class<?> wildcardClass19 = board11.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        board8.initializeEmptyTest();
        boolean boolean10 = board8.moveLeft();
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        boolean boolean15 = position13.equals((java.lang.Object) 0);
        java.lang.String str16 = position13.toString();
        java.lang.String str17 = position13.toString();
        boolean boolean18 = board8.equals((java.lang.Object) str17);
        boolean boolean19 = board8.moveDown();
        int int20 = board8.winningValue;
        boolean boolean21 = board8.moveUp();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0, 32)" + "'", str16, "(0, 32)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, 32)" + "'", str17, "(0, 32)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2048 + "'", int20 == 2048);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getScore();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board8);
        board8.initializeEmptyTest();
        boolean boolean12 = board8.isEmpty();
        boolean boolean13 = board8.isEmpty();
        boolean boolean14 = board8.hasEmptyCells();
        boolean boolean15 = board8.isFull();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        ar.edu.unrc.game2048.MockRNG mockRNG0 = new ar.edu.unrc.game2048.MockRNG();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(mockRNG0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.lang.String str3 = board1.toString();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        java.lang.String str10 = board8.toString();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean15 = cell11.canMergeWith(cell13);
        java.lang.String str16 = cell11.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG17 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean18 = cell11.equals((java.lang.Object) mockRNG17);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(mockRNG17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(mockRNG17);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board21.moveLeft();
        int int23 = board21.getSize();
        boolean boolean24 = board8.equals((java.lang.Object) board21);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str26 = cell25.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str28 = cell27.toString();
        boolean boolean29 = cell25.canMergeWith(cell27);
        java.lang.String str30 = cell25.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG31 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean32 = cell25.equals((java.lang.Object) mockRNG31);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(mockRNG31);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(mockRNG31);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board34);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean37 = board21.equals((java.lang.Object) board36);
        java.lang.String str38 = board36.toString();
        int int39 = board36.getScore();
        boolean boolean40 = board36.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str44 = cell43.toString();
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str46 = cell45.toString();
        boolean boolean47 = cell43.canMergeWith(cell45);
        java.lang.String str48 = cell43.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG49 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean50 = cell43.equals((java.lang.Object) mockRNG49);
        // The following exception was thrown during execution in test generation
        try {
            board36.setCell((-1), (int) (short) 100, cell43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str38, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "." + "'", str48, ".");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        boolean boolean5 = cell2.isEmpty();
        boolean boolean6 = cell2.isEmpty();
        boolean boolean7 = cell2.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        boolean boolean12 = cell8.canMergeWith(cell10);
        java.lang.String str13 = cell8.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG14 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean15 = cell8.equals((java.lang.Object) mockRNG14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(mockRNG14);
        boolean boolean17 = board16.hasEmptyCells();
        boolean boolean18 = board16.isLosingBoard();
        boolean boolean19 = board16.moveUp();
        int int20 = board16.getScore();
        boolean boolean21 = cell2.equals((java.lang.Object) board16);
        java.lang.String str22 = cell2.toString();
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str24 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str26 = cell25.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str28 = cell27.toString();
        boolean boolean29 = cell25.canMergeWith(cell27);
        java.lang.String str30 = cell25.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG31 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean32 = cell25.equals((java.lang.Object) mockRNG31);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(mockRNG31);
        boolean boolean34 = cell23.equals((java.lang.Object) board33);
        int int35 = cell23.getValue();
        boolean boolean36 = cell2.canMergeWith(cell23);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean12 = board8.hasEmptyCells();
        boolean boolean13 = board8.isEmpty();
        boolean boolean14 = board8.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        boolean boolean10 = board8.isLosingBoard();
        boolean boolean11 = board8.moveDown();
        boolean boolean12 = board8.isFull();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str16 = cell15.toString();
        boolean boolean17 = cell13.canMergeWith(cell15);
        java.lang.String str18 = cell13.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG19 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean20 = cell13.equals((java.lang.Object) mockRNG19);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(mockRNG19);
        int int22 = board21.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board21.getEmptyPositions();
        int int24 = board21.winningValue;
        boolean boolean25 = board21.moveLeft();
        boolean boolean26 = board21.isWinningBoard();
        boolean boolean27 = board8.equals((java.lang.Object) boolean26);
        boolean boolean28 = board8.isEmpty();
        board8.initializeEmptyTest();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board8);
        board8.initializeEmptyTest();
        java.lang.String str33 = board8.toString();
        boolean boolean34 = board8.moveLeft();
        boolean boolean35 = board8.moveRight();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2048 + "'", int24 == 2048);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str33, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board8);
        int int11 = board10.winningValue;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board10);
        int int13 = board12.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2048 + "'", int11 == 2048);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        int int11 = board8.winningValue;
        boolean boolean12 = board8.moveLeft();
        boolean boolean13 = board8.isWinningBoard();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean16 = board15.moveDown();
        boolean boolean17 = board15.isWinningBoard();
        boolean boolean18 = board15.moveDown();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2048 + "'", int11 == 2048);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        boolean boolean9 = cell5.canMergeWith(cell7);
        java.lang.String str10 = cell5.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG11 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean12 = cell5.equals((java.lang.Object) mockRNG11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(mockRNG11);
        int int14 = board13.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean17 = board16.hasEmptyCells();
        boolean boolean18 = position2.equals((java.lang.Object) board16);
        int int19 = position2.row;
        ar.edu.unrc.game2048.Board.Position position22 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 97);
        int int23 = position22.row;
        boolean boolean24 = position2.equals((java.lang.Object) int23);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str26 = cell25.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str28 = cell27.toString();
        boolean boolean29 = cell25.canMergeWith(cell27);
        java.lang.String str30 = cell25.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG31 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean32 = cell25.equals((java.lang.Object) mockRNG31);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(mockRNG31);
        boolean boolean34 = board33.hasEmptyCells();
        boolean boolean35 = board33.isLosingBoard();
        board33.initializeEmptyTest();
        boolean boolean37 = board33.isWinningBoard();
        boolean boolean38 = position2.equals((java.lang.Object) board33);
        boolean boolean39 = board33.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell42 = board33.getCell(100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 32)" + "'", str4, "(0, 32)");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int5 = position4.col;
        boolean boolean7 = position4.equals((java.lang.Object) (byte) 1);
        int int8 = position4.col;
        boolean boolean9 = cell0.equals((java.lang.Object) int8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell10.canMergeWith(cell12);
        java.lang.String str15 = cell10.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG16 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean17 = cell10.equals((java.lang.Object) mockRNG16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(mockRNG16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(mockRNG16);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = cell0.equals((java.lang.Object) board20);
        boolean boolean22 = board20.moveDown();
        board20.initializeEmptyTest();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board20);
        int int25 = board24.winningValue;
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean27 = board24.isWinningBoard();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board24);
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str30 = cell29.toString();
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str32 = cell31.toString();
        boolean boolean33 = cell29.canMergeWith(cell31);
        java.lang.String str34 = cell29.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG35 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean36 = cell29.equals((java.lang.Object) mockRNG35);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(mockRNG35);
        int int38 = board37.getScore();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board37);
        board37.initializeEmptyTest();
        boolean boolean41 = board24.equals((java.lang.Object) board37);
        ar.edu.unrc.game2048.Cell cell44 = board37.getCell(1, (int) (short) 0);
        int int45 = cell44.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2048 + "'", int25 == 2048);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        int int11 = board8.winningValue;
        boolean boolean12 = board8.moveLeft();
        boolean boolean13 = board8.hasEmptyCells();
        boolean boolean14 = board8.isEmpty();
        boolean boolean15 = board8.hasEmptyCells();
        int int16 = board8.getSize();
        board8.initializeEmptyTest();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2048 + "'", int11 == 2048);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board13.isFull();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board13);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        boolean boolean9 = board8.hasEmptyCells();
        int int10 = board8.winningValue;
        boolean boolean11 = board8.moveLeft();
        int int12 = board8.getScore();
        ar.edu.unrc.game2048.MockRNG mockRNG14 = new ar.edu.unrc.game2048.MockRNG(0.0d);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(mockRNG14);
        boolean boolean16 = board8.equals((java.lang.Object) mockRNG14);
        boolean boolean17 = board8.moveUp();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2048 + "'", int10 == 2048);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getScore();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str13 = cell12.toString();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str15 = cell14.toString();
        boolean boolean16 = cell12.canMergeWith(cell14);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str20 = cell19.toString();
        boolean boolean21 = cell17.canMergeWith(cell19);
        java.lang.String str22 = cell17.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG23 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean24 = cell17.equals((java.lang.Object) mockRNG23);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(mockRNG23);
        boolean boolean26 = board25.hasEmptyCells();
        int int27 = board25.winningValue;
        boolean boolean28 = board25.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position31 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int32 = position31.col;
        java.lang.String str33 = position31.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str35 = cell34.toString();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str37 = cell36.toString();
        boolean boolean38 = cell34.canMergeWith(cell36);
        java.lang.String str39 = cell34.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG40 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean41 = cell34.equals((java.lang.Object) mockRNG40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(mockRNG40);
        int int43 = board42.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean46 = board45.hasEmptyCells();
        boolean boolean47 = position31.equals((java.lang.Object) board45);
        int int48 = position31.row;
        boolean boolean49 = board25.equals((java.lang.Object) int48);
        boolean boolean50 = cell12.equals((java.lang.Object) board25);
        int int51 = cell12.getValue();
        ar.edu.unrc.game2048.MockRNG mockRNG52 = new ar.edu.unrc.game2048.MockRNG();
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board(mockRNG52);
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(mockRNG52);
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(mockRNG52);
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(mockRNG52);
        boolean boolean57 = cell12.equals((java.lang.Object) board56);
        board8.setCell(1, (int) (byte) 0, cell12);
        java.lang.String str59 = board8.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2048 + "'", int27 == 2048);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(0, 32)" + "'", str33, "(0, 32)");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str59, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        boolean boolean4 = position2.equals((java.lang.Object) 0);
        int int5 = position2.col;
        int int6 = position2.col;
        int int7 = position2.col;
        java.lang.String str8 = position2.toString();
        int int9 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0, 32)" + "'", str8, "(0, 32)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        int int9 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean12 = board8.hasEmptyCells();
        int int13 = board8.getScore();
        java.lang.String str14 = board8.toString();
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str21 = cell20.toString();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        boolean boolean24 = cell20.canMergeWith(cell22);
        int int25 = cell20.getValue();
        java.lang.String str26 = cell20.toString();
        boolean boolean27 = position19.equals((java.lang.Object) cell20);
        java.lang.String str28 = position19.toString();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str30 = cell29.toString();
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str32 = cell31.toString();
        boolean boolean33 = cell29.canMergeWith(cell31);
        int int34 = cell29.getValue();
        java.lang.String str35 = cell29.toString();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str37 = cell36.toString();
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str39 = cell38.toString();
        boolean boolean40 = cell36.canMergeWith(cell38);
        int int41 = cell36.getValue();
        java.lang.String str42 = cell36.toString();
        boolean boolean43 = cell29.canMergeWith(cell36);
        boolean boolean44 = cell36.isEmpty();
        boolean boolean46 = cell36.equals((java.lang.Object) 0.0f);
        int int47 = cell36.getValue();
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str49 = cell48.toString();
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str51 = cell50.toString();
        boolean boolean52 = cell48.canMergeWith(cell50);
        int int53 = cell48.getValue();
        java.lang.String str54 = cell48.toString();
        ar.edu.unrc.game2048.Cell cell55 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str56 = cell55.toString();
        ar.edu.unrc.game2048.Cell cell57 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str58 = cell57.toString();
        boolean boolean59 = cell55.canMergeWith(cell57);
        int int60 = cell55.getValue();
        java.lang.String str61 = cell55.toString();
        boolean boolean62 = cell48.canMergeWith(cell55);
        ar.edu.unrc.game2048.Cell cell63 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str64 = cell63.toString();
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str66 = cell65.toString();
        boolean boolean67 = cell63.canMergeWith(cell65);
        java.lang.String str68 = cell63.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG69 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean70 = cell63.equals((java.lang.Object) mockRNG69);
        ar.edu.unrc.game2048.Board board71 = new ar.edu.unrc.game2048.Board(mockRNG69);
        boolean boolean72 = board71.hasEmptyCells();
        int int73 = board71.winningValue;
        boolean boolean74 = board71.hasEmptyCells();
        boolean boolean75 = cell55.equals((java.lang.Object) boolean74);
        boolean boolean76 = cell36.canMergeWith(cell55);
        boolean boolean77 = cell55.isEmpty();
        boolean boolean78 = position19.equals((java.lang.Object) cell55);
        board8.setCell((int) (short) 1, (int) (byte) 0, cell55);
        boolean boolean80 = board8.moveRight();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(1, 35)" + "'", str28, "(1, 35)");
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "." + "'", str51, ".");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "." + "'", str58, ".");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "." + "'", str61, ".");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "." + "'", str64, ".");
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "." + "'", str66, ".");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "." + "'", str68, ".");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2048 + "'", int73 == 2048);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) ' ');
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        boolean boolean9 = cell5.canMergeWith(cell7);
        java.lang.String str10 = cell5.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG11 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean12 = cell5.equals((java.lang.Object) mockRNG11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(mockRNG11);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.winningValue;
        boolean boolean16 = board13.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int20 = position19.col;
        java.lang.String str21 = position19.toString();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str25 = cell24.toString();
        boolean boolean26 = cell22.canMergeWith(cell24);
        java.lang.String str27 = cell22.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG28 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean29 = cell22.equals((java.lang.Object) mockRNG28);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(mockRNG28);
        int int31 = board30.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board30.getEmptyPositions();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean34 = board33.hasEmptyCells();
        boolean boolean35 = position19.equals((java.lang.Object) board33);
        int int36 = position19.row;
        boolean boolean37 = board13.equals((java.lang.Object) int36);
        boolean boolean38 = cell0.equals((java.lang.Object) board13);
        boolean boolean39 = board13.isFull();
        boolean boolean40 = board13.moveLeft();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board13);
        board13.initializeEmptyTest();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2048 + "'", int15 == 2048);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0, 32)" + "'", str21, "(0, 32)");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean12 = board10.equals((java.lang.Object) (short) 10);
        boolean boolean13 = board10.isFull();
        boolean boolean14 = board10.moveRight();
        boolean boolean15 = board10.isFull();
        boolean boolean16 = board10.isLosingBoard();
        int int17 = board10.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str5 = cell4.toString();
        boolean boolean6 = cell2.canMergeWith(cell4);
        int int7 = cell2.getValue();
        java.lang.String str8 = cell2.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        boolean boolean13 = cell9.canMergeWith(cell11);
        int int14 = cell9.getValue();
        java.lang.String str15 = cell9.toString();
        boolean boolean16 = cell2.canMergeWith(cell9);
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str21 = cell20.toString();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str23 = cell22.toString();
        boolean boolean24 = cell20.canMergeWith(cell22);
        int int25 = cell20.getValue();
        java.lang.String str26 = cell20.toString();
        boolean boolean27 = position19.equals((java.lang.Object) cell20);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str29 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str31 = cell30.toString();
        boolean boolean32 = cell28.canMergeWith(cell30);
        boolean boolean33 = cell20.canMergeWith(cell28);
        boolean boolean34 = cell9.canMergeWith(cell20);
        java.lang.Object obj35 = null;
        boolean boolean36 = cell9.equals(obj35);
        java.lang.String str37 = cell9.toString();
        java.lang.String str38 = cell9.toString();
        boolean boolean39 = cell1.canMergeWith(cell9);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        ar.edu.unrc.game2048.MockRNG mockRNG1 = new ar.edu.unrc.game2048.MockRNG((double) (short) 0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(mockRNG1);
        int int3 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str6 = cell5.toString();
        boolean boolean7 = cell3.canMergeWith(cell5);
        int int8 = cell3.getValue();
        java.lang.String str9 = cell3.toString();
        boolean boolean10 = position2.equals((java.lang.Object) cell3);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str14 = cell13.toString();
        boolean boolean15 = cell11.canMergeWith(cell13);
        boolean boolean16 = cell3.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str18 = cell17.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str20 = cell19.toString();
        boolean boolean21 = cell17.canMergeWith(cell19);
        boolean boolean22 = cell11.canMergeWith(cell17);
        int int23 = cell17.getValue();
        ar.edu.unrc.game2048.MockRNG mockRNG25 = new ar.edu.unrc.game2048.MockRNG((double) (short) 0);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(mockRNG25);
        ar.edu.unrc.game2048.Cell cell29 = board26.getCell((int) (byte) 1, 0);
        boolean boolean30 = cell17.canMergeWith(cell29);
        java.lang.String str31 = cell29.toString();
        boolean boolean32 = cell29.isEmpty();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2" + "'", str31, "2");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG6 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean7 = cell0.equals((java.lang.Object) mockRNG6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(mockRNG6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.moveLeft();
        boolean boolean14 = board9.equals((java.lang.Object) 100.0f);
        boolean boolean15 = board9.moveRight();
        int int16 = board9.winningValue;
        java.lang.String str17 = board9.toString();
        int int18 = board9.getSize();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2048 + "'", int16 == 2048);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str1 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str3 = cell2.toString();
        boolean boolean4 = cell0.canMergeWith(cell2);
        int int5 = cell0.getValue();
        java.lang.String str6 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str8 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str10 = cell9.toString();
        boolean boolean11 = cell7.canMergeWith(cell9);
        int int12 = cell7.getValue();
        java.lang.String str13 = cell7.toString();
        boolean boolean14 = cell0.canMergeWith(cell7);
        boolean boolean15 = cell7.isEmpty();
        boolean boolean17 = cell7.equals((java.lang.Object) 0.0f);
        int int18 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str20 = cell19.toString();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str22 = cell21.toString();
        boolean boolean23 = cell19.canMergeWith(cell21);
        java.lang.String str24 = cell19.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG25 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean26 = cell19.equals((java.lang.Object) mockRNG25);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(mockRNG25);
        board27.initializeEmptyTest();
        boolean boolean29 = board27.moveLeft();
        boolean boolean30 = board27.isLosingBoard();
        boolean boolean31 = cell7.equals((java.lang.Object) board27);
        int int32 = cell7.getValue();
        java.lang.String str33 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str35 = cell34.toString();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str37 = cell36.toString();
        boolean boolean38 = cell34.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str40 = cell39.toString();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str42 = cell41.toString();
        boolean boolean43 = cell39.canMergeWith(cell41);
        java.lang.String str44 = cell39.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG45 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean46 = cell39.equals((java.lang.Object) mockRNG45);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(mockRNG45);
        boolean boolean48 = board47.hasEmptyCells();
        int int49 = board47.winningValue;
        boolean boolean50 = board47.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position53 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int54 = position53.col;
        java.lang.String str55 = position53.toString();
        ar.edu.unrc.game2048.Cell cell56 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str57 = cell56.toString();
        ar.edu.unrc.game2048.Cell cell58 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str59 = cell58.toString();
        boolean boolean60 = cell56.canMergeWith(cell58);
        java.lang.String str61 = cell56.toString();
        ar.edu.unrc.game2048.MockRNG mockRNG62 = new ar.edu.unrc.game2048.MockRNG();
        boolean boolean63 = cell56.equals((java.lang.Object) mockRNG62);
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(mockRNG62);
        int int65 = board64.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet66 = board64.getEmptyPositions();
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board(board64);
        boolean boolean68 = board67.hasEmptyCells();
        boolean boolean69 = position53.equals((java.lang.Object) board67);
        int int70 = position53.row;
        boolean boolean71 = board47.equals((java.lang.Object) int70);
        boolean boolean72 = cell34.equals((java.lang.Object) board47);
        int int73 = cell34.getValue();
        java.lang.String str74 = cell34.toString();
        boolean boolean75 = cell7.canMergeWith(cell34);
        java.lang.String str76 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell77 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str78 = cell77.toString();
        ar.edu.unrc.game2048.Cell cell79 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str80 = cell79.toString();
        boolean boolean81 = cell77.canMergeWith(cell79);
        int int82 = cell77.getValue();
        java.lang.String str83 = cell77.toString();
        ar.edu.unrc.game2048.Cell cell84 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str85 = cell84.toString();
        ar.edu.unrc.game2048.Cell cell86 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.String str87 = cell86.toString();
        boolean boolean88 = cell84.canMergeWith(cell86);
        int int89 = cell84.getValue();
        java.lang.String str90 = cell84.toString();
        boolean boolean91 = cell77.canMergeWith(cell84);
        boolean boolean92 = cell84.isEmpty();
        boolean boolean94 = cell84.equals((java.lang.Object) 0.0f);
        boolean boolean96 = cell84.equals((java.lang.Object) 100);
        int int97 = cell84.getValue();
        boolean boolean98 = cell7.equals((java.lang.Object) cell84);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2048 + "'", int49 == 2048);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(0, 32)" + "'", str55, "(0, 32)");
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "." + "'", str57, ".");
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "." + "'", str59, ".");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "." + "'", str61, ".");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertNotNull(positionSet66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "." + "'", str74, ".");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "." + "'", str76, ".");
        org.junit.Assert.assertNotNull(cell77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "." + "'", str78, ".");
        org.junit.Assert.assertNotNull(cell79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "." + "'", str80, ".");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "." + "'", str83, ".");
        org.junit.Assert.assertNotNull(cell84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "." + "'", str85, ".");
        org.junit.Assert.assertNotNull(cell86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "." + "'", str87, ".");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "." + "'", str90, ".");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }
}

