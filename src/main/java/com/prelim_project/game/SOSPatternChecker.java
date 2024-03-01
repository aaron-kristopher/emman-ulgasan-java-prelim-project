package com.prelim_project.game;

import com.prelim_project.model.GameBoard;

public class SOSPatternChecker {
    public static void main(String[] args) {
        GameBoard board = createFullBoard();
        int points = checkHorizontal(board, 0, 2, 'S');
    }

    private static final char[] validPattern = { 'S', 'O', 'S', 'O', 'S' };

    public static GameBoard createFullBoard() {
        /*
         * 5x5 board with the following pattern:
         * 
         * S O S O S
         * S O S O S
         * S O S O S
         * S O S O S
         * S O S O S
         * 
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'S');
        board.setCell(0, 1, 'O');
        board.setCell(0, 2, 'S');
        board.setCell(0, 3, 'O');
        board.setCell(0, 4, 'S');
        board.setCell(1, 0, 'S');
        board.setCell(1, 1, 'O');
        board.setCell(1, 2, 'S');
        board.setCell(1, 3, 'O');
        board.setCell(1, 4, 'S');
        board.setCell(2, 0, 'S');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'S');
        board.setCell(2, 3, 'O');
        board.setCell(2, 4, 'S');
        board.setCell(3, 0, 'S');
        board.setCell(3, 1, 'O');
        board.setCell(3, 2, 'S');
        board.setCell(3, 3, 'O');
        board.setCell(3, 4, 'S');
        board.setCell(4, 0, 'S');
        board.setCell(4, 1, 'O');
        board.setCell(4, 2, 'S');
        board.setCell(4, 3, 'O');
        board.setCell(4, 4, 'S');

        return board;
    }

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
        else if (validPatternCount >= 3)
            points = 1;

        return points;
    }

}
