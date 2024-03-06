package com.prelim_project.game;

import com.prelim_project.model.GameBoard;

public class WOWPatternChecker {
    private static final String WOW_PATTERN = "WOW";
    private static final String WOWOW_PATTERN = "WOWOW";

    public static int calculateTotalPoints(GameBoard board, int row, int col, int symbol) {
        int points = 0;
        points += WOWPatternChecker.checkVertical(board, row, col, symbol);
        points += WOWPatternChecker.checkHorizontal(board, row, col, symbol);
        points += WOWPatternChecker.checkDiagonal(board, row, col, symbol);

        return points;
    }

    public static int checkHorizontal(GameBoard board, int row, int col, int symbol) {
        StringBuffer pattern = new StringBuffer();
        int points = 0;

        int[] boundaries = calculateColumnBoundaries(board.getSize(), row, col, symbol);
        int startCol = boundaries[0];
        int endCol = boundaries[1];

        for (int i = startCol; i <= endCol; i++)
            pattern.append(board.getCell(row, i));

        if (pattern.toString().contains(WOWOW_PATTERN))
            points = 2;
        else if (pattern.toString().contains(WOW_PATTERN))
            points = 1;

        return points;
    }

    private static int[] calculateColumnBoundaries(int size, int row, int col, int symbol) {
        int startCol = (symbol == 'W') ? Math.max(0, col - 2) : Math.max(0, col - 1);
        int endCol = (symbol == 'W') ? Math.min(size - 1, col + 2) : Math.min(size - 1, col + 1);
        return new int[] { startCol, endCol };
    }

    public static int checkVertical(GameBoard board, int row, int col, int symbol) {
        int points = 0;
        StringBuffer pattern = new StringBuffer();

        int[] boundaries = calculateRowBoundaries(board, row, col, symbol);
        int startRow = boundaries[0];
        int endRow = boundaries[1];

        for (int i = startRow; i <= endRow; i++)
            pattern.append(board.getCell(i, col));

        if (pattern.toString().contains(WOWOW_PATTERN))
            points = 2;
        else if (pattern.toString().contains(WOW_PATTERN))
            points = 1;

        return points;
    }

    private static int[] calculateRowBoundaries(GameBoard board, int row, int col, int symbol) {
        int startRow = (symbol == 'W') ? Math.max(0, row - 2) : Math.max(0, row - 1);
        int endRow = (symbol == 'W') ? Math.min(board.getSize() - 1, row + 2) : Math.min(board.getSize() - 1, row + 1);
        return new int[] { startRow, endRow };
    }

    public static int checkDiagonal(GameBoard board, int row, int col, int symbol) {
        int points = 0;
        StringBuffer pattern = new StringBuffer();

        int[] boundaries = calculateDiagonalBoundaries(board.getSize(), row, col, symbol);
        int startCol = boundaries[0];
        int endCol = boundaries[1];
        int startRow = boundaries[2];
        int endRow = boundaries[3];

        int i = startCol;
        int j = startRow;
        while (i <= endCol && j <= endRow) {
            pattern.append(board.getCell(j, i));
            i++;
            j++;
        }

        if (pattern.toString().contains(WOWOW_PATTERN))
            points = 2;
        else if (pattern.toString().contains(WOW_PATTERN))
            points = 1;

        // Returns if the symbol is in the last cell
        if (col == board.getSize() - 1 && row == board.getSize() - 1)
            return points;

        pattern.setLength(0); // resets StringBuffer
        int[] reverseBoundaries = calculateReverseDiagonalBoundaries(board.getSize(), row, col, symbol);
        startCol = reverseBoundaries[0];
        endCol = reverseBoundaries[1];
        startRow = reverseBoundaries[2];

        // For reverse diagonal
        while (endCol >= startCol && startRow <= endRow) {
            pattern.append(board.getCell(startRow, endCol));
            endCol--;
            startRow++;
        }

        if (pattern.toString().contains(WOWOW_PATTERN))
            points += 2;
        else if (pattern.toString().contains(WOW_PATTERN))
            points += 1;

        return points;
    }

    private static int[] calculateDiagonalBoundaries(int size, int row, int col, int symbol) {
        int startCol, endCol, startRow, endRow;

        // Ensures valid boundaries for diagonal checks, considering board edges and
        // starting position:
        int subMatrixSize = (symbol == 'W') ? 3 : 2;

        startCol = (row == 0) ? col : (row == 1) ? Math.max(0, col - 1) : Math.max(0, col - (subMatrixSize - 1));
        endCol = Math.min(size - 1, col + (subMatrixSize - 1));

        // Calculate start and end rows
        startRow = (col == 0) ? row : Math.max(0, row - (subMatrixSize - 1));
        endRow = Math.min(size - 1, row + (subMatrixSize - 1));

        return new int[] { startCol, endCol, startRow, endRow };
    }

    private static int[] calculateReverseDiagonalBoundaries(int size, int row, int col, int symbol) {
        int startCol, endCol, startRow;

        // Ensures valid boundaries for diagonal checks, considering board edges and
        // starting position:
        int subMatrixSize = (symbol == 'W') ? 3 : 2;

        startCol = (row == 0) ? Math.max(0, col - 2) : Math.max(0, col - (subMatrixSize - 1));
        endCol = (row == 0) ? Math.max(0, col)
                : (row == 1)
                        ? Math.min(size - 1, col + 1)
                        : Math.min(size - 1, col + (subMatrixSize - 1));
        startRow = (col >= size - 2) ? row : Math.max(0, row - (subMatrixSize - 1));

        return new int[] { startCol, endCol, startRow };
    }
}
