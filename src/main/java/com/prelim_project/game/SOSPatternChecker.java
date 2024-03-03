package com.prelim_project.game;

import com.prelim_project.model.GameBoard;

public class SOSPatternChecker {
    private static final String SOS_PATTERN = "SOS";
    private static final String SOSOS_PATTERN = "SOSOS";

    public static int calculateTotalPoints(GameBoard board, int row, int col, int symbol) {
        int points = 0;
        points += SOSPatternChecker.checkVertical(board, row, col, symbol);
        points += SOSPatternChecker.checkHorizontal(board, row, col, symbol);
        points += SOSPatternChecker.checkDiagonal(board, row, col, symbol);

        return points;
    }

    public static int checkHorizontal(GameBoard board, int row, int col, int symbol) {
        StringBuffer pattern = new StringBuffer();
        int points = 0;

        int[] boundaries = calculateColumnBoundaries(board, row, col, symbol);
        int startCol = boundaries[0];
        int endCol = boundaries[1];

        for (int i = startCol; i <= endCol; i++)
            pattern.append(board.getCell(row, i));

        if (pattern.toString().contains(SOSOS_PATTERN))
            points = 2;
        else if (pattern.toString().contains(SOS_PATTERN))
            points = 1;

        return points;
    }

    private static int[] calculateColumnBoundaries(GameBoard board, int row, int col, int symbol) {
        int startCol = (symbol == 'S') ? Math.max(0, col - 2) : Math.max(0, col - 1);
        int endCol = (symbol == 'S') ? Math.min(board.getSize() - 1, col + 2) : Math.min(board.getSize() - 1, col + 1);
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

        if (pattern.toString().contains(SOSOS_PATTERN))
            points = 2;
        else if (pattern.toString().contains(SOS_PATTERN))
            points = 1;

        return points;
    }

    private static int[] calculateRowBoundaries(GameBoard board, int row, int col, int symbol) {
        int startRow = (symbol == 'S') ? Math.max(0, col - 2) : Math.max(0, col - 1);
        int endRow = (symbol == 'S') ? Math.min(board.getSize() - 1, col + 2) : Math.min(board.getSize() - 1, col + 1);
        return new int[] { startRow, endRow };
    }

    public static int checkDiagonal(GameBoard board, int row, int col, int symbol) {
        int points = 0;
        StringBuffer pattern = new StringBuffer();

        int[] boundaries = calculateDiagonalBoundaries(board, row, col, symbol);
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

        System.out.println(pattern.toString());
        if (pattern.toString().contains(SOSOS_PATTERN))
            points = 2;
        else if (pattern.toString().contains(SOS_PATTERN))
            points = 1;

        // Returns if the column is the last cell
        if (col == board.getSize() - 1)
            return points;

        pattern.setLength(0); // resets StringBuffer
        i = endCol;
        j = startRow;
        while (i >= startCol && j <= endRow) {
            pattern.append(board.getCell(j, i));
            i--;
            j++;
        }

        System.out.println(pattern.toString());
        if (pattern.toString().contains(SOSOS_PATTERN))
            points += 2;
        else if (pattern.toString().contains(SOS_PATTERN))
            points += 1;

        return points;
    }

    private static int[] calculateDiagonalBoundaries(GameBoard board, int row, int col, int symbol) {
        int startCol, endCol, startRow, endRow;

        // Ensures valid boundaries for diagonal checks, considering board edges and
        // starting position:
        if (symbol == 'S') {
            startCol = (row >= 2) ? Math.max(0, col - 2) : col - row;
            startRow = (col >= 2) ? row - 2 : Math.max(0, row - 2);
        } else {
            startCol = (row >= 1) ? Math.max(0, col - 1) : col;
            startRow = (col >= 1) ? row - 1 : Math.max(0, row - 1);
        }

        endCol = (symbol == 'S') ? Math.min(board.getSize() - 1, col + 2) : Math.min(board.getSize() - 1, col + 1);
        endRow = (symbol == 'S') ? Math.min(board.getSize() - 1, row + 2) : Math.min(board.getSize() - 1, row + 1);

        return new int[] { startCol, endCol, startRow, endRow };
    }
}
