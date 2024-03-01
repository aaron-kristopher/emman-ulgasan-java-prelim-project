package com.prelim_project.game;

import com.prelim_project.model.GameBoard;

public class CreateTestGameBoard {

    static GameBoard fullBoard() {
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

    static GameBoard emptyBoard() {
        /*
         * 5x5 board with no pattern
         * 
         * - - - - -
         * - - - - -
         * - - - - -
         * - - - - -
         * - - - - -
         * 
         */

        return new GameBoard(5);
    }

    static GameBoard onePointHorizontalBoardForS() {
        /*
         * 5x5 board with the following pattern:
         *
         * - - - - -
         * - - - - -
         * S O S S O
         * - - - - -
         * - - - - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(2, 0, 'S');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'S');
        board.setCell(2, 3, 'S');
        board.setCell(2, 4, 'O');

        return board;
    }

    static GameBoard onePointHorizontalBoardForO() {
        /*
         * 3x3 board with the following pattern:
         *
         * - - -
         * S O S
         * - - -
         */

        GameBoard board = new GameBoard(3);
        board.setCell(2, 0, 'S');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'S');

        return board;
    }

    static GameBoard zeroPointHorizontalBoardForO() {
        /*
         * 3x3 board with the following pattern:
         *
         * - - -
         * S O O
         * - - -
         */

        GameBoard board = new GameBoard(3);
        board.setCell(2, 0, 'S');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'O');

        return board;
    }
}
