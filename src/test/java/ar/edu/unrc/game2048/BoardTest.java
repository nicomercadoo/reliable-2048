package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class BoardTest {

    private void makeLoserFullBoard(Board board) {
        for (int row = 0; row < board.getSize(); row++) {
            for (int column = 0; column < board.getSize(); column++) {
                if ((row % 2 == 1 && column % 2 == 0) || (row % 2 == 0 && column % 2 == 1)) {
                    board.setCell(row, column, new Cell(2));
                } else {
                    board.setCell(row, column, new Cell(4));
                }
            }
        }
    }

    @Test
    void testInvalidBoardSize() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Board(3);
        });
    }

    @Test
    void testNegativeSize() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Board(-1);
        });
    }

    @Test
    void testNegativeWinningValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Board(4, -1);
        });
    }

    @Test
    void testNoPowerOfTwoWinningValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Board(4, 3);
        });
    }

    @Test
    void testDefaultBoard() {
        Board board = new Board();
        assertEquals(4, board.getSize());
    }

    @Test
    void testConstructorWithArgument() {
        Board board = new Board(6);
        assertEquals(6, board.getSize());
    }

    @Test
    void testCopy() {
        Board board = new Board(6);
        assertEquals(6, board.getSize());
        Board board2 = new Board(board);
        assertEquals(board, board2);
    }

    @Test
    void testGetCell() {
        Board board = new Board();
        Cell cell = board.getCell(0, 0);
        assertNotNull(cell);
    }

    @Test
    void testIsEmpty() {
        Board board = new Board(4);
        board.initializeEmptyTest();
        assertTrue(board.isEmpty());
    }

    @Test
    void testSetCell() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(2, 2, cell);
        assertEquals(board.getCell(2, 2), cell);
    }

    @Test
    void testNegativeSetCell() {
        Board board = new Board();
        board.initializeEmptyTest();

        assertAll("Board.setCell() should throw an exception",
                () -> assertThrows(IndexOutOfBoundsException.class, () -> {
                    board.setCell(-1, 0, new Cell(2));
                }, "Setting a cell with negative row index should throw an exception"),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> {
                    board.setCell(0, -1, new Cell(2));
                }, "Setting a cell with negative column index should throw an exception"),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> {
                    board.setCell(board.getSize(), 0, new Cell(2));
                }, "Setting a cell with row index equal to size should throw an exception"),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> {
                    board.setCell(0, board.getSize(), new Cell(2));
                }, "Setting a cell with column index equal to size should throw an exception"),
                () -> assertThrows(IllegalArgumentException.class, () -> {
                    board.setCell(0, 0, null);
                }, "Setting a cell with null value should throw an exception"));
    }

    @Test
    void testIsFull() {
        Board board = new Board();
        makeLoserFullBoard(board);
        assertTrue(board.isFull());
    }

    @Test
    void testGetScoreNewBoard() {
        Board board = new Board();
        assertEquals(0, board.getScore());
    }

    @Test
    void testGetScoreMergingCells() {
        Board board = new Board();
        board.initializeEmptyTest();
        assertEquals(0, board.getScore());
        board.setCell(3, 0, new Cell(2));
        board.setCell(2, 0, new Cell(2));
        board.moveUp();
        assertEquals(4, board.getScore());
    }

    @Test
    void testMoveUpSingleCellSlidesToTop() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(3, 0, cell);
        board.moveUp();
        assertEquals(cell, board.getCell(0, 0));
    }

    @Test
    void testMoveUpEqualAdjacentCellsMergesIntoSingleCell() {
        Board board = new Board();
        board.initializeEmptyTest();
        board.setCell(3, 0, new Cell(2));
        board.setCell(2, 0, new Cell(2));
        board.moveUp();
        assertEquals(4, board.getCell(0, 0).getValue());
    }

    @Test
    void testMoveUpEqualCellsWithEmptySpaceBetween() {
        Board board = new Board();
        board.initializeEmptyTest();
        board.setCell(3, 3, new Cell(2));
        board.setCell(0, 3, new Cell(2));
        board.moveUp();
        assertEquals(4, board.getCell(0, 3).getValue());
    }

    @Test
    void testMoveDownSingleCellSlidesToBottom() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 0, cell);
        board.moveDown();
        assertEquals(cell, board.getCell(3, 0));
    }

    @Test
    void testMoveDownEqualAdjacentCellsMergesIntoSingleCell() {
        Board board = new Board();
        board.initializeEmptyTest();
        board.setCell(1, 0, new Cell(4));
        board.setCell(2, 0, new Cell(4));
        board.moveDown();
        assertEquals(8, board.getCell(3, 0).getValue());
    }

    @Test
    void testMoveDownCellsInDifferentColumnsSlideIndependentlyToBottom() {
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
    void testMoveRightSingleCellSlidesToRight() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 0, cell);
        board.moveRight();
        assertEquals(cell, board.getCell(0, 3));
    }

    @Test
    void testMoveRight_MixedCells_mergesEqualsAndSlidesDistinct() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(1, 0, cell);
        board.setCell(1, 1, new Cell(4));
        board.setCell(1, 2, new Cell(4));
        board.moveRight();
        assertEquals(8, board.getCell(1, 3).getValue());
        assertEquals(cell, board.getCell(1, 2));
    }

    @Test
    void testMoveRightMultipleRowsHandlesSlidingAndMergingIndependently() {
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
    void testMoveLeftSingleCellSlidesToLeft() {
        Board board = new Board();
        board.initializeEmptyTest();
        Cell cell = new Cell(2);
        board.setCell(0, 3, cell);
        board.moveLeft();
        assertEquals(cell, board.getCell(0, 0));
    }

    @Test
    void testMoveLeftDistinctCellsSlidesWithoutMerging() {
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
    void testMoveLeftScatteredCellsSlideIndependentlyToLeft() {
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
    void testGetEmptyPositions() {
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
    void testGetEmptyPositionsFull() {
        Board board = new Board();
        makeLoserFullBoard(board);

        Set<Board.Position> emptyPositions = board.getEmptyPositions();

        assertTrue(emptyPositions.isEmpty());
    }

    @Test
    void testGetEmptyPositionsAllEmpty() {
        Board board = new Board();
        board.initializeEmptyTest();

        Set<Board.Position> emptyPositions = board.getEmptyPositions();

        assertEquals(board.getSize() * board.getSize(), emptyPositions.size());
    }

    @Test
    void testHasEmptyCellsTrue() {
        Board board = new Board();

        board.initializeEmptyTest();

        assertTrue(board.hasEmptyCells());
    }

    @Test
    void testHasEmptyCellsFalse() {
        Board board = new Board();
        makeLoserFullBoard(board);

        assertFalse(board.hasEmptyCells());
    }

    @Test
    void testIsLosingBoardFalse() {
        Board board = new Board();

        assertFalse(board.isLosingBoard());
    }

    @Test
    void testIsLosingBoardTrue() {
        Board board = new Board();
        makeLoserFullBoard(board);

        assertTrue(board.isLosingBoard());
    }

    @Test
    void testIsLosingBoardMergeRight() {
        Board board = new Board();
        makeLoserFullBoard(board);

        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));

        assertFalse(board.isLosingBoard());
    }

    @Test
    void testIsLosingBoardMergeDown() {
        Board board = new Board();
        makeLoserFullBoard(board);

        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(2));

        assertFalse(board.isLosingBoard());
    }

    @Test
    void testIsLosingBoardMergeRightBounds() {
        Board board = new Board();
        makeLoserFullBoard(board);

        // Value in (1,3) is 4, so a down merge is possible
        board.setCell(0, 3, new Cell(4));

        assertFalse(board.isLosingBoard());
    }

    @Test
    void testIsWinningBoardReturnsTrue() {
        Board board = new Board();
        Cell winnerCell = new Cell(2048);
        board.setCell(0, 0, winnerCell);
        assertTrue(board.isWinningBoard());
    }

    @Test
    void testIsWinningBoardReturnsFalse() {
        Board board = new Board();
        makeLoserFullBoard(board);

        assertFalse(board.isWinningBoard());
    }

    @Test
    void testEqualsShouldBeTrue() {
        Board boardA = new Board(4);
        Board boardB = new Board(4);
        makeLoserFullBoard(boardA);
        makeLoserFullBoard(boardB);

        assertAll("Board.equals() should return true",
                () -> assertEquals(boardA, boardB, "Board A is equals to Board B"),
                () -> assertEquals(boardB, boardB, "Board B is equals to Board A"));
    }

    @Test
    void testEqualsShouldBeFalse() {
        Board boardA = new Board(4);
        makeLoserFullBoard(boardA);

        Board boardB = new Board(4);
        makeLoserFullBoard(boardB);
        boardB.setCell(0, 0, new Cell(8));

        Board boardC = new Board(8);
        makeLoserFullBoard(boardC);

        assertAll("Board.equals() should return false",
                () -> assertNotEquals(boardA, boardB, "Board A is different to Board B (it has different Cell's)"),
                () -> assertNotEquals(boardA, boardC, "Board A is different to Board C (it has different size)"),
                () -> assertNotEquals(boardA, null, "Board A compared with null"),
                () -> assertNotEquals(boardA, "Some other object", "Board A compared with a non Board object"));
    }

    @Test
    void testHashCodeShouldBeTrue() {
        Board boardA = new Board(4);
        Board boardB = new Board(4);
        makeLoserFullBoard(boardA);
        makeLoserFullBoard(boardB);

        assertEquals(boardA.hashCode(), boardB.hashCode(), "Board A and Board B should have the same hash code");
    }

    @Test
    void testHashCodeShouldBeFalse() {
        Board boardA = new Board(4);
        Board boardB = new Board(4);
        makeLoserFullBoard(boardA);
        makeLoserFullBoard(boardB);
        boardB.setCell(0, 0, new Cell(8));

        assertNotEquals(boardA.hashCode(), boardB.hashCode(), "Board A and Board B should have different hash codes");
    }

    @Test
    void testPositionEqualsShouldBeTrue() {
        Board.Position pos1 = new Board.Position(0, 0);
        Board.Position pos2 = new Board.Position(0, 0);

        assertAll("Board.Position.equals() should be true",
                () -> assertEquals(pos1, pos1, "pos1 is equal to pos1"),
                () -> assertEquals(pos1, pos2, "pos1 is equal to pos2"));
    }

    @Test
    void testPositionEqualsShouldNotBeTrue() {
        Board.Position pos1 = new Board.Position(0, 0);
        Board.Position pos2 = new Board.Position(1, 1);

        assertAll("Board.Position.equals() should be false",
                () -> assertNotEquals(pos1, null, "pos1 compared with pos2"),
                () -> assertNotEquals(pos1, "Hola", "pos1 compared with a string"),
                () -> assertNotEquals(pos1, pos2, "pos1 compared with pos2"));
    }

    @Test
    void testPositionHashCodeEquals() {
        Board.Position pos1 = new Board.Position(0, 0);
        Board.Position pos2 = new Board.Position(0, 0);

        assertEquals(pos1.hashCode(), pos2.hashCode());
    }

    @Test
    void testPositionHashCodeNotEquals() {
        Board.Position pos1 = new Board.Position(0, 0);
        Board.Position pos2 = new Board.Position(1, 1);

        assertNotEquals(pos1.hashCode(), pos2.hashCode());
    }
}
