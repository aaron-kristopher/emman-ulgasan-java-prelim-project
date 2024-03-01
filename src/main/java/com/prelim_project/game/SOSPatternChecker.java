package com.prelim_project.game;

import com.prelim_project.model.GameBoard;

public class SOSPatternChecker {
    private static final char[] validPattern = { 'S', 'O', 'S', 'O', 'S' };

    public static int checkHorizontal(GameBoard board, int row, int col, int value) {
        int points = 0;
        int validPatternCount = 0;
        int startCol = (value == 'S') ? Math.max(0, col - 2) : Math.max(0, col - 1);
        int endCol = (value == 'S') ? Math.min(board.getSize() - 1, col + 2) : Math.min(board.getSize() - 1, col + 1);

        for (int i = startCol; i <= endCol; i++) {
            if (board.getCell(row, i) == validPattern[validPatternCount])
                validPatternCount++;
            else if (validPatternCount <= 2)
                validPatternCount = 0;
        }

        if (validPatternCount == 5)
            points = 2;
        else if (validPatternCount >= 2)
            points = 1;

        return points;
    }

    public static int checkVertical(GameBoard board, int row, int col, int value) {
        int points = 0;
        int validPatternCount = 0;
        int startRow = (value == 'S') ? Math.max(0, row - 2) : Math.max(0, row - 1);
        int endRow = (value == 'S') ? Math.min(board.getSize() - 1, row + 2) : Math.min(board.getSize() - 1, row + 1);

        for (int i = startRow; i <= endRow; i++) {
            if (board.getCell(i, col) == validPattern[validPatternCount])
                validPatternCount++;
            else if (validPatternCount <= 2)
                validPatternCount = 0;
        }

        if (validPatternCount == 5)
            points = 2;
        else if (validPatternCount >= 2)
            points = 1;

        return points;
    }
}
