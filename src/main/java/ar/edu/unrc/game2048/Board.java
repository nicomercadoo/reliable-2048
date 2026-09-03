package ar.edu.unrc.game2048;

import java.util.*;

/**
 * Represents the 2048 game board.
 * The board is a square grid of Cells, typically 4x4.
 *
 * Representation Invariants:
 * - grid is a non-null square matrix (rows == cols)
 * - all cells in the grid are non-null (they may be EMPTY)
 * - all cell values are valid per Cell invariants
 * - the board is always in a valid game state
 *
 * Thread-safety: This class is not thread-safe.
 */
public class Board {

    /**
     * Board default number of rows/columns (4 x 4)
     */
    public static final int DEFAULT_SIZE = 4;

    /**
     * Default winning value: when board contains this value, the player wins (2048)
     */
    public static final int WINNING_VALUE = 2048;

    /**
     * Board size (i.e., number of rows and columns). Must be > 0.
     */
    private final int size;

    /**
     * Contents of the board: a 2D array of Cells. grid[row][col] represents the
     * cell at (row, col).
     */
    private final Cell[][] grid;

    /**
     * Game accumulated score.
     */
    private int score;

    /**
     * Creates a new board of the default size (4x4) with two random tiles.
     */
    public Board() {
        this(DEFAULT_SIZE);
    }

    /**
     * Creates a new board of the specified size with two random tiles.
     *
     * @param size the board size (must be > 0)
     * @throws IllegalArgumentException if size <= 0
     */
    public Board(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Board size must be positive: " + size);
        }
        if (!validSize(size)) {
            throw new IllegalArgumentException("Board size must be greater or equals than "
                + Math.ceil(Math.sqrt(Math.log(WINNING_VALUE) / Math.log(2))));
        }
        this.size = size;
        this.grid = new Cell[size][size];
        this.score = 0;
        initializeEmpty();
        addRandomTile();
        addRandomTile();
    }

    /**
     * Copy constructor - creates a deep copy of another board.
     *
     * @param other the board to copy
     */
    public Board(Board other) {
        this.size = other.size;
        this.grid = new Cell[size][size];
        this.score = other.score;
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                this.grid[r][c] = other.grid[r][c];
            }
        }
    }

    /**
    * Checks if a value is a valid board size (i.e., a power of two and large enough to reach WINNING_VALUE).
    *
    * @param value the value to check
    * @return true if value is a valid board size, false otherwise
 */
    private boolean validSize(int size) {
        if (size == 0) {
            return true;
        }

        return Math.pow(2, size) >= Math.log(WINNING_VALUE) / Math.log(2);
    }

    /**
     * Initializes the board with all EMPTY cells.
     */
    private void initializeEmpty() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                grid[r][c] = Cell.EMPTY;
            }
        }
    }

    /**
     * Initializes the board with all EMPTY cells.
     */
    public void initializeEmptyTest() {
        initializeEmpty();
    }

    /**
     * Gets the board size (number of rows/columns).
     *
     * @return the board size
     */
    public int getSize() {
        return size;
    }

    /**
     * Gets the current score.
     *
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * Gets the cell at the specified position.
     *
     * @param row the row index (0-based)
     * @param col the column index (0-based)
     * @return the cell at the specified position
     * @throws IndexOutOfBoundsException if row or col is out of bounds
     */
    public Cell getCell(int row, int col) {
        validatePosition(row, col);
        return grid[row][col];
    }

    /**
     * Sets a cell at the specified position.
     *
     * @param row  the row index (0-based)
     * @param col  the column index (0-based)
     * @param cell the cell to set (must not be null)
     * @throws IndexOutOfBoundsException if row or col is out of bounds
     * @throws IllegalArgumentException  if cell is null
     */
    public void setCell(int row, int col, Cell cell) {
        validatePosition(row, col);
        if (cell == null) {
            throw new IllegalArgumentException("Cell cannot be null");
        }
        grid[row][col] = cell;
    }

    /**
     * Validates that a position is within bounds.
     *
     * @param row the row index
     * @param col the column index
     * @throws IndexOutOfBoundsException if the position is out of bounds
     */
    private void validatePosition(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("Position (%d, %d) is out of bounds for board size %d",
                            row, col, size));
        }
    }

    /**
     * Gets all empty cells on the board.
     *
     * @return a set of positions of all empty cells
     */
    public Set<Position> getEmptyPositions() {
        Set<Position> empty = new HashSet<>();
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (grid[r][c].isEmpty()) {
                    empty.add(new Position(r, c));
                }
            }
        }
        return empty;
    }

    /**
     * Checks if the board has any empty cells.
     *
     * @return true if there is at least one empty cell
     */
    public boolean hasEmptyCells() {
        return !getEmptyPositions().isEmpty();
    }

    /**
     * Checks if the board is in a winning state.
     * A board is winning if it contains a cell with the WINNING_VALUE (2048).
     *
     * @return true if the board contains 2048
     */
    public boolean isWinningBoard() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (grid[r][c].getValue() == WINNING_VALUE) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the board is in a losing state (game over).
     * A board is losing if there are no empty cells AND no adjacent cells
     * (horizontal or vertical) can be merged.
     *
     * @return true if the game is over and the player has lost
     */
    public boolean isLosingBoard() {
        if (hasEmptyCells()) {
            return false;
        }

        // Check for possible merges
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                Cell current = grid[r][c];
                // Check right neighbor
                if (c + 1 < size && current.canMergeWith(grid[r][c + 1])) {
                    return false;
                }
                // Check down neighbor
                if (r + 1 < size && current.canMergeWith(grid[r + 1][c])) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the board is full (no empty cells).
     *
     * @return true if there are no empty cells
     */
    public boolean isFull() {
        return !hasEmptyCells();
    }

    // ==================== MOVE OPERATIONS (WITH DESIGN PROBLEMS) ====================

    /**
     * Moves all tiles upward.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveUp() {
        return move(Direction.UP);
    }

    public boolean move(Direction direction){
        Board previous = new Board(this);

        int slowColumnDisplacement = 0;
        int fastColumnDisplacement = 0;
        int slowRowDisplacement = 0;
        int fastRowDisplacement = 0;
        int rowInit = 0, columnInit = 0;
        int rowEnd = 0, columnEnd = 0;


        int recSlowColumnDisplacement = 0;
        int recFastColumnDisplacement = 0;
        int recSlowRowDisplacement = 0;
        int recFastRowDisplacement = 0;
        int recRowInit = 0, recColumnInit = 0;
        int recRowEnd = 0, recColumnEnd = 0;
        int initGet=0, getDisp=0;

        switch (direction) {
            
            case UP:
                slowColumnDisplacement=1;
                fastColumnDisplacement=0;
                columnInit=0;
                columnEnd=size;

                rowInit=0;
                rowEnd=size;
                fastRowDisplacement=1;
                slowRowDisplacement=0;

                //reconstruccion
                recSlowColumnDisplacement=1;
                recFastColumnDisplacement=0;
                recColumnInit=0;
                recColumnEnd=size;

                recRowInit=0;
                recRowEnd=size;
                recFastRowDisplacement=1;
                recSlowRowDisplacement=0;

                initGet=0;
                getDisp=1;
                break;
            case DOWN:
                slowColumnDisplacement=1;
                fastColumnDisplacement=0;
                columnInit=0;
                columnEnd=size;

                rowInit=size-1;
                rowEnd=-1;
                fastRowDisplacement=-1;
                slowRowDisplacement=0;

                //reconstruccion
                recSlowColumnDisplacement=1;
                recFastColumnDisplacement=0;
                recColumnInit=0;
                recColumnEnd=size;

                recRowInit=0;
                recRowEnd=size;
                recFastRowDisplacement=1;
                recSlowRowDisplacement=0;

                initGet=size-1;
                getDisp=-1;
                break;

            case LEFT:
                slowColumnDisplacement=0;
                fastColumnDisplacement=1;
                columnInit=0;
                columnEnd=size;

                rowInit=0;
                rowEnd=size;
                fastRowDisplacement=0;
                slowRowDisplacement=1;

                //reconstruccion
                recSlowColumnDisplacement=0;
                recFastColumnDisplacement=1;
                recColumnInit=0;
                recColumnEnd=size;

                recRowInit=0;
                recRowEnd=size;
                recFastRowDisplacement=0;
                recSlowRowDisplacement=1;

                initGet=0;
                getDisp=1;
                break;
            case RIGHT:
                slowColumnDisplacement=0;
                fastColumnDisplacement=-1;
                columnInit=size-1;
                columnEnd=-1;

                rowInit=0;
                rowEnd=size;
                fastRowDisplacement=0;
                slowRowDisplacement=1;

                //reconstruccion
                recSlowColumnDisplacement = 0;
                recFastColumnDisplacement = 1;  
                recColumnInit = 0;              
                recColumnEnd = size;            

                recRowInit = 0;
                recRowEnd = size;
                recFastRowDisplacement = 0;   
                recSlowRowDisplacement = 1; 

                initGet=size-1;
                getDisp=-1;
                break;
        }
        int i=0,j;
        int column=columnInit, row=rowInit;
        int getter=initGet;
        int columnRec=recColumnInit, rowRec=recRowInit;
        while (i<size) {
            List<Cell> cells = new ArrayList<>();
            j=0;
            while (j<size) {
                cells.add(grid[row][column]);
                column+=fastColumnDisplacement;
                row+=fastRowDisplacement;
                j++;
            }
            List<Cell> nonEmpty = removeEmptyCells(cells);
            List<Cell> merged = mergeAdjacentEqualsCells(nonEmpty);
            padWithEmptyCells(merged);
            if(column==columnEnd){
                column=columnInit;
            }
            if(row==rowEnd){
                row=rowInit;
            }
            j=0;
            getter=initGet;
            while (j<size) {
                grid[rowRec][columnRec] = merged.get(getter);
                getter+=getDisp;
                columnRec+=recFastColumnDisplacement;
                rowRec+=recFastRowDisplacement;
                j++;
            }
            if(columnRec==recColumnEnd){
                columnRec=recColumnInit;
            }
            if(rowRec==recRowEnd){
                rowRec=recRowInit;
            }

            columnRec+=recSlowColumnDisplacement;
            rowRec+=recSlowRowDisplacement;

            column+=slowColumnDisplacement;
            row+=slowRowDisplacement;
            i++;
        }
        boolean moved = !this.equals(previous);
        if (moved) {
            addRandomTile(); // Add new random tile after successful move
        }
        return moved;
    }
    /**
     * Moves all tiles downward.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveDown() {
        return move(Direction.DOWN);
    }

    /**
     * Moves all tiles left.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveLeft() {
        return move(Direction.LEFT);
    }

    /**
     * Moves all tiles right.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveRight() {
        return move(Direction.RIGHT);
    }

    /**
    * Merge adjacent cells in the list that have equal values.
    * @param nonEmpty a list of non-empty cells
    * @return a new list of cells after merging
    */
	private List<Cell> mergeAdjacentEqualsCells(List<Cell> nonEmpty) {
		List<Cell> merged = new ArrayList<>();
		int i = 0;
		while (i < nonEmpty.size()) {
		    if (i + 1 < nonEmpty.size() &&
		            nonEmpty.get(i).canMergeWith(nonEmpty.get(i + 1))) {
		        Cell mergedCell = nonEmpty.get(i).mergeWith(nonEmpty.get(i + 1));
		        merged.add(mergedCell);
		        score += mergedCell.getValue();
		        i += 2;
		    } else {
		        merged.add(nonEmpty.get(i));
		        i++;
		    }
		}
		return merged;
	}

	/**
	* Removes all EMPTY cells from the given list of cells.
    * @param rowList a list of cells
    * @return a new list containing only non-empty cells
    */
	private List<Cell> removeEmptyCells(List<Cell> rowList) {
		List<Cell> nonEmpty = new ArrayList<>();
		for (Cell cell : rowList) {
		    if (!cell.isEmpty()) {
		        nonEmpty.add(cell);
		    }
		}
		return nonEmpty;
	}

	/**
	* Pads the list of merged cells with EMPTY cells until it reaches the board size.
    * @param merged a list of merged cells
    */
	private void padWithEmptyCells(List<Cell> merged) {
		while (merged.size() < size) {
		    merged.add(Cell.EMPTY);
		}
	}

    // ==================== RANDOM TILE ADDITION (PRIVATE) ====================

    /**
     * Adds a random tile (2 or 4) to a random empty cell.
     * This method is private to maintain encapsulation - tiles are only added
     * during initialization or after successful moves.
     *
     * @return true if a tile was added, false if the board was full
     */
    private boolean addRandomTile() {
        Set<Position> empty = getEmptyPositions();
        if (empty.isEmpty()) {
            return false;
        }

        // Choose random position
        int randomIndex = (int) (Math.random() * empty.size());
        Position pos = empty.stream().skip(randomIndex).findFirst().get();

        // 90% chance of 2, 10% chance of 4 (standard 2048 rules)
        int value = Math.random() < 0.9 ? 2 : 4;
        grid[pos.row][pos.col] = new Cell(value);

        return true;
    }

    // ==================== UTILITY METHODS ====================

    /**
     * Checks if this board is structurally identical to another.
     * Uses deep equality including score.
     *
     * @param o the object to compare
     * @return true if the boards are identical
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Board board = (Board) o;
        return size == board.size &&
                score == board.score &&
                Arrays.deepEquals(grid, board.grid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, Arrays.deepHashCode(grid), score);
    }

    /**
     * Returns a string representation of the board.
     * The board is displayed in a grid format with the current score.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Score: ").append(score).append("\n");
        for (int r = 0; r < size; r++) {
            sb.append("+");
            for (int c = 0; c < size; c++) {
                sb.append("-----+");
            }
            sb.append("\n|");
            for (int c = 0; c < size; c++) {
                String val = grid[r][c].isEmpty() ? "     " : String.format("%5d", grid[r][c].getValue());
                sb.append(val).append("|");
            }
            sb.append("\n");
        }
        sb.append("+");
        for (int c = 0; c < size; c++) {
            sb.append("-----+");
        }
        sb.append("\n");
        return sb.toString();
    }

    // ==================== INNER CLASSES ====================

    /**
     * Represents a direction on the board.
     */
    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    /**
     * Represents a position on the board.
     */
    public static class Position {
        public final int row;
        public final int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Position position = (Position) o;
            return row == position.row && col == position.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }

        @Override
        public String toString() {
            return "(" + row + ", " + col + ")";
        }
    }

    public boolean isEmpty() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!grid[i][j].equals(Cell.EMPTY))
                    return false;
            }
        }
        return true;
    }
}
