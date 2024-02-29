package com.prelim_project.model;

public class GameBoard {
    char[][] board;
    int size;

    GameBoard(int size) {
        this.size = size;
        board = new char[size][size];
    }

    public boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setCell(int row, int col, char value) {
        board[row][col] = value;
    }

    public void clearBoard() {
        board = new char[size][size];
    }
}
