package com.prelim_project.game;

import com.prelim_project.model.GameBoard;

public class CreateTestGameBoard {

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

    // HORIZONTAL BOARDS

    static GameBoard horizontalTwoPointBoardForS() {
        /*
         * 5x5 board with the following pattern:
         * 
         * - - - - -
         * - - - - -
         * S O S O S
         * - - - - -
         * - - - - -
         * 
         */

        GameBoard board = new GameBoard(5);
        board.setCell(2, 0, 'S');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'S');
        board.setCell(2, 3, 'O');
        board.setCell(2, 4, 'S');

        return board;
    }

    static GameBoard horizontalOnePointBoardForS() {
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

    static GameBoard horizontalOnePointOffsetBoardForS() {
        /*
         * Character placement cannot be in the middle
         * 5x5 board with the following pattern:
         *
         * - - - - -
         * - - - - -
         * O S O S S
         * - - - - -
         * - - - - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(2, 0, 'O');
        board.setCell(2, 1, 'S');
        board.setCell(2, 2, 'O');
        board.setCell(2, 3, 'S');
        board.setCell(2, 4, 'S');

        return board;
    }

    static GameBoard horizontalOnePointBoardForO() {
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

    static GameBoard horizontalZeroPointsBoardForO() {
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

    // VERTICAL BOARDS

    static GameBoard verticalTwoPointsBoardForS() {
        /*
         * 5x5 board with the following pattern:
         *
         * - - S - -
         * - - O - -
         * - - S - -
         * - - O - -
         * - - S - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 2, 'S');
        board.setCell(1, 2, 'O');
        board.setCell(2, 2, 'S');
        board.setCell(3, 2, 'O');
        board.setCell(4, 2, 'S');

        return board;
    }

    static GameBoard verticalOnePointBoardForS() {
        /*
         * 5x5 board with the following pattern:
         *
         * - - O - -
         * - - S - -
         * - - S - -
         * - - O - -
         * - - S - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 2, 'O');
        board.setCell(1, 2, 'S');
        board.setCell(2, 2, 'S');
        board.setCell(3, 2, 'O');
        board.setCell(4, 2, 'S');

        return board;
    }

    static GameBoard verticalOnePointOffsetBoardForS() {
        /*
         * Character placement cannot be in the middle
         * 5x5 board with the following pattern:
         *
         * - - O - -
         * - - S - -
         * - - O - -
         * - - S - -
         * - - S - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 2, 'O');
        board.setCell(1, 2, 'S');
        board.setCell(2, 2, 'O');
        board.setCell(3, 2, 'S');
        board.setCell(4, 2, 'S');

        return board;
    }

    static GameBoard verticalOnePointBoardForO() {
        /*
         * 3x3 board with the following pattern:
         *
         * - - S - -
         * - - O - -
         * - - S - -
         */

        GameBoard board = new GameBoard(3);
        board.setCell(0, 1, 'S');
        board.setCell(1, 1, 'O');
        board.setCell(2, 1, 'S');

        return board;
    }

    static GameBoard verticalZeroPointsBoardForO() {
        /*
         * 3x3 board with the following pattern:
         *
         * - S -
         * - O -
         * - O -
         */

        GameBoard board = new GameBoard(3);
        board.setCell(0, 1, 'S');
        board.setCell(1, 1, 'O');
        board.setCell(2, 1, 'O');

        return board;
    }

    static GameBoard verticalZeroPointsBoardForS() {
        /*
         * 5x5 board with the following pattern:
         *
         * - - O - -
         * - - S - -
         * - - O - -
         * - - O - -
         * - - S - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 2, 'O');
        board.setCell(1, 2, 'S');
        board.setCell(2, 2, 'O');
        board.setCell(3, 2, 'O');
        board.setCell(4, 2, 'S');

        return board;
    }

    // DIAGONAL BOARDS

    static GameBoard diagonalFourPointsBoardForS() {
        /*
         * 5x5 board with the following pattern:
         * 
         * S - - - S
         * - O - O -
         * - - S - -
         * - O - O -
         * S - - - S
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'S');
        board.setCell(0, 4, 'S');
        board.setCell(1, 1, 'O');
        board.setCell(1, 3, 'O');
        board.setCell(2, 2, 'S');
        board.setCell(3, 1, 'O');
        board.setCell(3, 3, 'O');
        board.setCell(4, 4, 'S');
        board.setCell(4, 0, 'S');

        return board;
    }

    static GameBoard diagonalThreePointsBoardForS() {
        /*
         * 5x5 board with the following pattern:
         * 
         * S - - - S
         * - O - O -
         * - - S - -
         * - O - S -
         * S - - - S
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'S');
        board.setCell(0, 4, 'S');
        board.setCell(1, 1, 'O');
        board.setCell(1, 3, 'O');
        board.setCell(2, 2, 'S');
        board.setCell(3, 1, 'O');
        board.setCell(3, 3, 'S');
        board.setCell(4, 4, 'S');
        board.setCell(4, 0, 'S');

        return board;
    }

    static GameBoard diagonalTwoPointsBoardForS() {
        /*
         * 5x5 board with the following pattern:
         * 
         * S - - - S
         * - S - S -
         * - - S - -
         * - O - O -
         * S - - - S
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'S');
        board.setCell(0, 4, 'S');
        board.setCell(1, 1, 'S');
        board.setCell(1, 3, 'S');
        board.setCell(2, 2, 'S');
        board.setCell(3, 1, 'O');
        board.setCell(3, 3, 'O');
        board.setCell(4, 4, 'S');
        board.setCell(4, 0, 'S');

        return board;
    }

    static GameBoard diagonalOnePointBoardForS() {
        /*
         * 5x5 board with the following pattern:
         * 
         * S - - - S
         * - S - S -
         * - - S - -
         * - O - S -
         * S - - - S
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'S');
        board.setCell(0, 4, 'S');
        board.setCell(1, 1, 'S');
        board.setCell(1, 3, 'S');
        board.setCell(2, 2, 'S');
        board.setCell(3, 1, 'O');
        board.setCell(3, 3, 'S');
        board.setCell(4, 4, 'S');
        board.setCell(4, 0, 'S');

        return board;
    }

    static GameBoard diagonalZeroPointsBoardForS() {
        /*
         * 5x5 board with the following pattern:
         * 
         * S - - - S
         * - S - S -
         * - - S - -
         * - S - S -
         * S - - - S
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'S');
        board.setCell(0, 4, 'S');
        board.setCell(1, 1, 'S');
        board.setCell(1, 3, 'S');
        board.setCell(2, 2, 'S');
        board.setCell(3, 1, 'S');
        board.setCell(3, 3, 'S');
        board.setCell(4, 4, 'S');
        board.setCell(4, 0, 'S');

        return board;
    }
}
