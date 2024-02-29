package com.prelim_project.game;

import com.prelim_project.model.GameBoard;

public class GameLogic {
    public boolean isValidMove(int row, int col, GameBoard board) {
        if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()) {
            return false;
        }

        if (!board.isCellEmpty(row, col)) {
            return false;
        }

        return true;
    }

    public boolean checkWin(GameBoard board, char value) {
        return true;
    }

    public boolean isGameOver(GameBoard board) {
        if (board.isBoardFull()) {
            return true;
        }
        return false;
    }

}
