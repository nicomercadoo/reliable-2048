package ar.edu.unrc.game2048;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import java.util.Set;
import org.junit.Test;

public class BoardTest {

    private void makeLoserFullBoard(Board board) {
        for (int row = 0; row < board.getSize(); row++) {
            for (int column = 0; column < board.getSize(); column++) {
                if (
                    (row % 2 == 1 && column % 2 == 0) ||
                    (row % 2 == 0 && column % 2 == 1)
                ) {
                    board.setCell(row, column, new Cell(2));
                } else {
                    board.setCell(row, column, new Cell(4));
                }
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidBoardSize() {
        new Board(3);
    }

    @Test
    public void testInvalidBoardSizeString() {
        try {
            new Board(3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            assertThat(
                exception.getMessage(),
                containsString("Board size must be greater or equals than 4.0")
            );
        }
    }

    @Test
    public void testValidEqualBoardSize() {
        new Board(4, 65536);
    }

    @Test
    public void testInvalidBoardSizeZero() {
        try {
            new Board(0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            assertTrue(
                exception.getMessage().contains("Board size must be positive")
            );
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSize() {
        new Board(-1);
    }

    @Test
    public void testWinningValueZero() {
        try {
            new Board(4, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            assertTrue(
                exception.getMessage().contains("must be positive and not 0")
            );
        }
    }

    @Test
    public void testNegativeWinningValue() {
        try {
            new Board(4, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            assertTrue(
                exception.getMessage().contains("must be positive and not 0")
            );
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoPowerOfTwoWinningValue() {
        new Board(4, 3);
    }

    @Test
    public void testDefaultBoard() {
        Board board = new Board();
        assertEquals(4, board.getSize());
    }

    @Test
    public void testConstructorWithArgument() {
        Board board = new Board(6);
        assertEquals(6, board.getSize());
    }

    @Test
    public void testCopy() {
        Board board = new Board(6);
        assertEquals(6, board.getSize());
        Board board2 = new Board(board);
        assertEquals(board, board2);
    }

    @Test
    public void testGetCell() {
        Board board = new Board();
        Cell cell = board.getCell(0, 0);
        assertNotNull(cell);
    }

    @Test
    public void testNegativeGetCell() {
        Board board = new Board();
        Cell cell = board.getCell(0, 0);
        assertNotNull(cell);
        try {
            board.getCell(-1, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException exception) {
            assertThat(
                exception.getMessage(),
                containsString(
                    "Position (-1, 0) is out of bounds for board size 4"
                )
            );
        }
    }

    @Test
    public void testIsEmpty() {
        Board board = new Board(4);
        board.initializeEmptyTest();
        assertTrue(board.isEmpty());
    }

    @Test
    public void testFalseIsEmpty() {
        Board board = new Board(4);
        assertFalse(board.isEmpty());
    }

    @Test
    public void testSetCell() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(2, 2, cell);
        assertEquals(board.getCell(2, 2), cell);
    }

    @Test
    public void testNegativeSetCell() {
        Board board = new Board();
        board.initializeEmptyTest();

        // 1. Negative row
        try {
            board.setCell(-1, 0, new Cell(2));
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException exception) {
            assertThat(
                exception.getMessage(),
                containsString(
                    "Position (-1, 0) is out of bounds for board size " +
                        board.getSize()
                )
            );
        }

        // 2. Negative column
        try {
            board.setCell(0, -1, new Cell(2));
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException exception) {
            assertThat(
                exception.getMessage(),
                containsString(
                    "Position (0, -1) is out of bounds for board size " +
                        board.getSize()
                )
            );
        }

        // 3. Row out of bounds
        try {
            board.setCell(board.getSize(), 0, new Cell(2));
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException exception) {
            assertThat(
                exception.getMessage(),
                containsString(
                    "Position (" +
                        board.getSize() +
                        ", 0) is out of bounds for board size " +
                        board.getSize()
                )
            );
        }

        // 4. Column out of bounds
        try {
            board.setCell(0, board.getSize(), new Cell(2));
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException exception) {
            assertThat(
                exception.getMessage(),
                containsString(
                    "Position (0, " +
                        board.getSize() +
                        ") is out of bounds for board size " +
                        board.getSize()
                )
            );
        }

        // 5. Both coordinates out of bounds
        try {
            board.setCell(board.getSize(), board.getSize(), new Cell(2));
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException exception) {
            assertThat(
                exception.getMessage(),
                containsString(
                    "Position (" +
                        board.getSize() +
                        ", " +
                        board.getSize() +
                        ") is out of bounds for board size " +
                        board.getSize()
                )
            );
        }

        // 6. Null cell
        try {
            board.setCell(0, 0, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            assertThat(
                exception.getMessage(),
                containsString("Cell cannot be null")
            );
        }
    }

    @Test
    public void testIsFull() {
        Board board = new Board();
        makeLoserFullBoard(board);
        assertTrue(board.isFull());
    }

    @Test
    public void testCorrectCellGeneration() {
        Board board = new Board(new MockRNG(0.9));
        board.initializeEmptyTest();
        board.setCell(0, 0, new Cell(2));
        board.moveDown();
        assertEquals(board.getCell(2, 0), new Cell(4));
    }

    @Test
    public void testGetScoreNewBoard() {
        Board board = new Board();
        assertEquals(0, board.getScore());
    }

    @Test
    public void testGetScoreMergingCells() {
        Board board = new Board();
        board.initializeEmptyTest();
        assertEquals(0, board.getScore());
        board.setCell(3, 0, new Cell(2));
        board.setCell(2, 0, new Cell(2));
        board.moveUp();
        assertEquals(4, board.getScore());
    }

    @Test
    public void testMoveUpSingleCellSlidesToTop() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(3, 0, cell);
        assertTrue(board.moveUp());
        assertEquals(cell, board.getCell(0, 0));
    }

    @Test
    public void testMoveUpWithoutChange() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 0, cell);

        Board before = new Board(board);

        assertFalse(board.moveUp());
        assertEquals(before, board);
    }

    @Test
    public void testMoveUpEqualAdjacentCellsMergesIntoSingleCell() {
        Board board = new Board();
        board.initializeEmptyTest();
        board.setCell(3, 0, new Cell(2));
        board.setCell(2, 0, new Cell(2));
        board.moveUp();
        assertEquals(4, board.getCell(0, 0).getValue());
        assertTrue(board.repOK());
    }

    @Test
    public void testMoveUpEqualCellsWithEmptySpaceBetween() {
        Board board = new Board();
        board.initializeEmptyTest();
        board.setCell(3, 3, new Cell(2));
        board.setCell(0, 3, new Cell(2));
        board.moveUp();
        assertEquals(4, board.getCell(0, 3).getValue());
    }

    @Test
    public void testMoveDownSingleCellSlidesToBottom() {
        Board board = new Board(new MockRNG());
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 0, cell);
        assertTrue(board.moveDown());
        assertEquals(cell, board.getCell(3, 0));
        assertEquals(Cell.EMPTY, board.getCell(0, 0));
    }

    @Test
    public void testMoveDownWithoutChanges() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(3, 0, cell);

        Board before = new Board(board);

        assertFalse(board.moveDown());
        assertEquals(before, board);
        assertTrue(board.repOK());
    }

    @Test
    public void testMoveDownEqualAdjacentCellsMergesIntoSingleCell() {
        Board board = new Board();
        board.initializeEmptyTest();
        board.setCell(1, 0, new Cell(4));
        board.setCell(2, 0, new Cell(4));
        board.moveDown();
        assertEquals(8, board.getCell(3, 0).getValue());
        assertTrue(board.repOK());
    }

    @Test
    public void testMoveDownCellsInDifferentColumnsSlideIndependentlyToBottom() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell1 = new Cell(4);
        Cell cell2 = new Cell(2);
        board.setCell(1, 0, cell1);
        board.setCell(2, 3, cell2);
        board.moveDown();
        assertEquals(cell1, board.getCell(3, 0));
        assertEquals(cell2, board.getCell(3, 3));
    }

    @Test
    public void testMoveRightSingleCellSlidesToRight() {
        Board board = new Board(new MockRNG());
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 0, cell);
        assertTrue(board.moveRight());
        assertEquals(cell, board.getCell(0, 3));
        assertEquals(Cell.EMPTY, board.getCell(0, 0));
    }

    @Test
    public void testMoveRightWithoutChange() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 3, cell);

        Board before = new Board(board);

        assertFalse(board.moveRight());
        assertEquals(before, board);
    }

    @Test
    public void testMoveRight_MixedCells_mergesEqualsAndSlidesDistinct() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(1, 0, cell);
        board.setCell(1, 1, new Cell(4));
        board.setCell(1, 2, new Cell(4));
        board.moveRight();
        assertEquals(8, board.getCell(1, 3).getValue());
        assertEquals(cell, board.getCell(1, 2));
        assertTrue(board.repOK());
    }

    @Test
    public void testMoveRightMultipleRowsHandlesSlidingAndMergingIndependently() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(2, 0, cell);
        board.setCell(3, 1, new Cell(4));
        board.setCell(3, 3, new Cell(4));
        board.moveRight();
        assertEquals(8, board.getCell(3, 3).getValue());
        assertEquals(cell, board.getCell(2, 3));
    }

    @Test
    public void testMoveLeftSingleCellSlidesToLeft() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 3, cell);
        assertTrue(board.moveLeft());
        assertEquals(cell, board.getCell(0, 0));
        assertTrue(board.repOK());
    }

    @Test
    public void testMoveLeftWithoutChanges() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 0, cell);

        Board before = new Board(board);

        assertFalse(board.moveLeft());
        assertEquals(before, board);
    }

    @Test
    public void testMoveLeftDistinctCellsSlidesWithoutMerging() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);
        board.setCell(2, 3, cell1);
        board.setCell(2, 2, cell2);
        board.moveLeft();
        assertEquals(cell2, board.getCell(2, 0));
        assertEquals(cell1, board.getCell(2, 1));
    }

    @Test
    public void testMoveLeftScatteredCellsSlideIndependentlyToLeft() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);
        board.setCell(0, 3, cell1);
        board.setCell(3, 0, cell2);
        board.moveLeft();
        assertEquals(cell2, board.getCell(3, 0));
        assertEquals(cell1, board.getCell(0, 0));
    }

    @Test
    public void testGetEmptyPositions() {
        Board board = new Board();
        board.initializeEmptyTest();

        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);

        board.setCell(0, 0, cell1);
        board.setCell(1, 1, cell2);

        Set<Board.Position> emptyPositions = board.getEmptyPositions();

        assertFalse(emptyPositions.contains(new Board.Position(0, 0)));
        assertFalse(emptyPositions.contains(new Board.Position(1, 1)));
    }

    @Test
    public void testGetEmptyPositionsFull() {
        Board board = new Board();
        makeLoserFullBoard(board);

        Set<Board.Position> emptyPositions = board.getEmptyPositions();

        assertTrue(emptyPositions.isEmpty());
    }

    @Test
    public void testGetEmptyPositionsAllEmpty() {
        Board board = new Board();
        board.initializeEmptyTest();

        Set<Board.Position> emptyPositions = board.getEmptyPositions();

        assertEquals(board.getSize() * board.getSize(), emptyPositions.size());
    }

    @Test
    public void testHasEmptyCellsTrue() {
        Board board = new Board();
        board.initializeEmptyTest();
        assertTrue(board.hasEmptyCells());
    }

    @Test
    public void testHasEmptyCellsFalse() {
        Board board = new Board();
        makeLoserFullBoard(board);
        assertFalse(board.hasEmptyCells());
    }

    @Test
    public void testIsLosingBoardFalse() {
        Board board = new Board();
        assertFalse(board.isLosingBoard());
    }

    @Test
    public void testIsLosingBoardTrue() {
        Board board = new Board();
        makeLoserFullBoard(board);
        assertTrue(board.isLosingBoard());
    }

    @Test
    public void testIsLosingBoardMergeRight() {
        Board board = new Board();
        makeLoserFullBoard(board);

        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));

        assertFalse(board.isLosingBoard());
    }

    @Test
    public void testIsLosingBoardMergeDown() {
        Board board = new Board();
        makeLoserFullBoard(board);

        board.setCell(1, 0, new Cell(4));

        assertFalse(board.isLosingBoard());
    }

    @Test
    public void testIsLosingBoardMergeRightBounds() {
        Board board = new Board();
        makeLoserFullBoard(board);

        board.setCell(0, 3, new Cell(4));

        assertFalse(board.isLosingBoard());
    }

    @Test
    public void testIsWinningBoardReturnsTrue() {
        Board board = new Board();
        Cell winnerCell = new Cell(2048);
        board.setCell(0, 0, winnerCell);
        assertTrue(board.isWinningBoard());
    }

    @Test
    public void testIsNotFullBoard() {
        Board board = new Board();
        assertFalse(board.isFull());
    }

    @Test
    public void testIsWinningBoardReturnsFalse() {
        Board board = new Board();
        makeLoserFullBoard(board);
        assertFalse(board.isWinningBoard());
    }

    @Test
    public void testEqualsShouldBeTrue() {
        Board boardA = new Board(4);
        Board boardB = new Board(4);
        makeLoserFullBoard(boardA);
        makeLoserFullBoard(boardB);

        assertEquals("Board A is equals to Board B", boardA, boardB);
        assertEquals("Board B is equals to Board A", boardB, boardB);
    }

    @Test
    public void testEqualsShouldBeFalse() {
        Board boardA = new Board(4);
        makeLoserFullBoard(boardA);

        Board boardB = new Board(4);
        makeLoserFullBoard(boardB);
        boardB.setCell(0, 0, new Cell(2));

        Board boardC = new Board(8);
        makeLoserFullBoard(boardC);

        Board boardD = new Board(4);
        makeLoserFullBoard(boardD);
        boardD.setCell(0, 0, new Cell(2));
        boardD.moveLeft();
        boardD.setCell(0, 0, new Cell(2));
        boardD.setCell(1, 0, new Cell(2));

        Board boardE = new Board(4, 1024);
        makeLoserFullBoard(boardE);

        assertNotEquals(
            "Board A is different to Board B (it has different Cell's)",
            boardA,
            boardB
        );
        assertNotEquals(
            "Board A is different to Board E (it has different WinningValue)",
            boardA,
            boardE
        );
        assertNotEquals(
            "Board A is different to Board C (it has different size)",
            boardA,
            boardC
        );
        assertNotEquals(
            "Board B is different to Board D (it has different score)",
            boardB,
            boardD
        );
        assertNotEquals("Board A compared with null", boardA, null);
        assertNotEquals(
            "Board A compared with a non Board object",
            boardA,
            "Some other object"
        );
    }

    @Test
    public void testHashCodeShouldBeTrue() {
        Board boardA = new Board(4);
        Board boardB = new Board(4);
        makeLoserFullBoard(boardA);
        makeLoserFullBoard(boardB);

        assertEquals(
            "Board A and Board B should have the same hash code",
            boardA.hashCode(),
            boardB.hashCode()
        );
    }

    @Test
    public void testHashCodeShouldBeFalse() {
        Board boardA = new Board(4);
        Board boardB = new Board(4);
        makeLoserFullBoard(boardA);
        makeLoserFullBoard(boardB);
        boardB.setCell(0, 0, new Cell(8));

        assertNotEquals(
            "Board A and Board B should have different hash codes",
            boardA.hashCode(),
            boardB.hashCode()
        );
    }

    @Test
    public void testPositionEqualsShouldBeTrue() {
        Board.Position pos1 = new Board.Position(0, 0);
        Board.Position pos2 = new Board.Position(0, 0);

        assertEquals("pos1 is equal to pos1", pos1, pos1);
        assertEquals("pos1 is equal to pos2", pos1, pos2);
    }

    @Test
    public void testPositionEqualsShouldNotBeTrue() {
        Board.Position pos1 = new Board.Position(0, 0);
        Board.Position pos2 = new Board.Position(1, 1);
        Board.Position pos3 = new Board.Position(0, 1);
        Board.Position pos4 = new Board.Position(1, 0);

        assertNotEquals("pos1 compared with null", pos1, null);
        assertNotEquals("pos1 compared with a string", pos1, "Hola");
        assertNotEquals("pos1 compared with pos3", pos1, pos3);
        assertNotEquals("pos1 compared with pos4", pos1, pos4);
        assertNotEquals("pos1 compared with pos2", pos1, pos2);
    }

    @Test
    public void testPositionHashCodeEquals() {
        Board.Position pos1 = new Board.Position(0, 0);
        Board.Position pos2 = new Board.Position(0, 0);

        assertEquals(pos1.hashCode(), pos2.hashCode());
    }

    @Test
    public void testPositionHashCodeNotEquals() {
        Board.Position pos1 = new Board.Position(0, 0);
        Board.Position pos2 = new Board.Position(1, 1);

        assertNotEquals(pos1.hashCode(), pos2.hashCode());
    }

    @Test
    public void testToString() {
        Board board = new Board();
        makeLoserFullBoard(board);
        board.setCell(0, 0, Cell.EMPTY);
        assertEquals(
            "Score: 0\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |    2|    4|    2|\n" +
                "+-----+-----+-----+-----+\n" +
                "|    2|    4|    2|    4|\n" +
                "+-----+-----+-----+-----+\n" +
                "|    4|    2|    4|    2|\n" +
                "+-----+-----+-----+-----+\n" +
                "|    2|    4|    2|    4|\n" +
                "+-----+-----+-----+-----+\n",
            board.toString()
        );
    }

    @Test
    public void testPositionToString() {
        Board.Position position = new Board.Position(0, 0);
        assertEquals("(0, 0)", position.toString());
    }

    @Test
    public void testRepOk() {
        Board board = new Board();
        assertTrue(board.repOK());
    }
}
