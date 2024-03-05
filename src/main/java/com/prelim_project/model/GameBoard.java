package com.prelim_project.model;

public class GameBoard {
    private char[][] board;
    private int size;

    public GameBoard(int size) {
        this.size = size;
        board = new char[size][size];
    }

    public boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '\u0000')
                    return false;
            }
        }
        return true;
    }

    public char getCell(int row, int col) {
        return Character.toUpperCase(board[row][col]);
    }

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == '\u0000'; // '\u0000' is the default value for a char
    }

    public void setCell(int row, int col, char value) {
        board[row][col] = value;
    }

    public void clearBoard() {
        board = new char[size][size];
    }

    public int getSize() {
        return size;
    }

    public char[][] getBoard() {
        return board;
    }
}
