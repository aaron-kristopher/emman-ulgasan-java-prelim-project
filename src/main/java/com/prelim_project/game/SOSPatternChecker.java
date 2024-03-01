package com.prelim_project.game;

import com.prelim_project.model.GameBoard;

public class SOSPatternChecker {
    private static final String onePointPattern = "SOS";
    private static final String twoPointPattern = "SOSOS";

    public static int checkPoints(GameBoard board, int row, int col, int value) {
        int points = 0;
        points += SOSPatternChecker.checkVertical(board, row, col, value);
        points += SOSPatternChecker.checkHorizontal(board, row, col, value);
        points += SOSPatternChecker.checkDiagonal(board, row, col, value);

        return points;
    }

    public static int checkHorizontal(GameBoard board, int row, int col, int value) {
        StringBuffer pattern = new StringBuffer();
        int points = 0;

        int startCol = (value == 'S') ? Math.max(0, col - 2) : Math.max(0, col - 1);
        int endCol = (value == 'S') ? Math.min(board.getSize() - 1, col + 2) : Math.min(board.getSize() - 1, col + 1);

        for (int i = startCol; i <= endCol; i++) {
            pattern.append(board.getCell(row, i));
        }

        if (pattern.toString().contains(twoPointPattern))
            points = 2;
        else if (pattern.toString().contains(onePointPattern))
            points = 1;

        return points;
    }

    public static int checkVertical(GameBoard board, int row, int col, int value) {
        int points = 0;
        StringBuffer pattern = new StringBuffer();

        int startRow = (value == 'S') ? Math.max(0, row - 2) : Math.max(0, row - 1);
        int endRow = (value == 'S') ? Math.min(board.getSize() - 1, row + 2) : Math.min(board.getSize() - 1, row + 1);

        for (int i = startRow; i <= endRow; i++) {
            pattern.append(board.getCell(i, col));
        }

        if (pattern.toString().contains(twoPointPattern))
            points = 2;
        else if (pattern.toString().contains(onePointPattern))
            points = 1;

        return points;
    }

    public static int checkDiagonal(GameBoard board, int row, int col, int value) {
        int points = 0;
        StringBuffer pattern = new StringBuffer();

        int startCol = (value == 'S') ? Math.max(0, col - 2) : Math.max(0, col - 1);
        int endCol = (value == 'S') ? Math.min(board.getSize() - 1, col + 2) : Math.min(board.getSize() - 1, col + 1);
        int startRow = (value == 'S') ? Math.max(0, row - 2) : Math.max(0, row - 1);
        int endRow = (value == 'S') ? Math.min(board.getSize() - 1, row + 2) : Math.min(board.getSize() - 1, row + 1);

        int i = startCol;
        int j = startRow;
        while (i <= endCol && j <= endRow) {
            pattern.append(board.getCell(j, i));
            i++;
            j++;
        }

        if (pattern.toString().contains(twoPointPattern))
            points = 2;
        else if (pattern.toString().contains(onePointPattern))
            points = 1;

        StringBuffer pattern2 = new StringBuffer();
        i = endCol;
        j = startRow;
        while (i >= startCol && j <= endRow) {
            pattern2.append(board.getCell(j, i));
            i--;
            j++;
        }

        if (pattern2.toString().contains(twoPointPattern))
            points += 2;
        else if (pattern2.toString().contains(onePointPattern))
            points += 1;

        return points;
    }
}
