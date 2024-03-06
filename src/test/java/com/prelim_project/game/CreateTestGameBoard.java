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

    static GameBoard horizontalTwoPointBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * - - - - -
         * - - - - -
         * W O W O W
         * - - - - -
         * - - - - -
         * 
         */

        GameBoard board = new GameBoard(5);
        board.setCell(2, 0, 'W');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'W');
        board.setCell(2, 3, 'O');
        board.setCell(2, 4, 'W');

        return board;
    }

    static GameBoard horizontalOnePointBoardForW() {
        /*
         * 5x5 board with the following pattern:
         *
         * - - - - -
         * - - - - -
         * W O W W O
         * - - - - -
         * - - - - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(2, 0, 'W');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'W');
        board.setCell(2, 3, 'W');
        board.setCell(2, 4, 'O');

        return board;
    }

    static GameBoard horizontalOnePointOffsetBoardForW() {
        /*
         * Character placement cannot be in the middle
         * 5x5 board with the following pattern:
         *
         * - - - - -
         * - - - - -
         * O W O W W
         * - - - - -
         * - - - - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(2, 0, 'O');
        board.setCell(2, 1, 'W');
        board.setCell(2, 2, 'O');
        board.setCell(2, 3, 'W');
        board.setCell(2, 4, 'W');

        return board;
    }

    static GameBoard horizontalOnePointBoardForO() {
        /*
         * 3x3 board with the following pattern:
         *
         * - - -
         * W O W
         * - - -
         */

        GameBoard board = new GameBoard(3);
        board.setCell(2, 0, 'W');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'W');

        return board;
    }

    static GameBoard horizontalZeroPointsBoardForO() {
        /*
         * 3x3 board with the following pattern:
         *
         * - - -
         * W O O
         * - - -
         */

        GameBoard board = new GameBoard(3);
        board.setCell(2, 0, 'W');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'O');

        return board;
    }

    // VERTICAL BOARDS

    static GameBoard verticalTwoPointsBoardForW() {
        /*
         * 5x5 board with the following pattern:
         *
         * - - W - -
         * - - O - -
         * - - W - -
         * - - O - -
         * - - W - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 2, 'W');
        board.setCell(1, 2, 'O');
        board.setCell(2, 2, 'W');
        board.setCell(3, 2, 'O');
        board.setCell(4, 2, 'W');

        return board;
    }

    static GameBoard verticalOnePointBoardForW() {
        /*
         * 5x5 board with the following pattern:
         *
         * - - O - -
         * - - W - -
         * - - W - -
         * - - O - -
         * - - W - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 2, 'O');
        board.setCell(1, 2, 'W');
        board.setCell(2, 2, 'W');
        board.setCell(3, 2, 'O');
        board.setCell(4, 2, 'W');

        return board;
    }

    static GameBoard verticalOnePointOffsetBoardForW() {
        /*
         * Character placement cannot be in the middle
         * 5x5 board with the following pattern:
         *
         * - - O - -
         * - - W - -
         * - - O - -
         * - - W - -
         * - - W - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 2, 'O');
        board.setCell(1, 2, 'W');
        board.setCell(2, 2, 'O');
        board.setCell(3, 2, 'W');
        board.setCell(4, 2, 'W');

        return board;
    }

    static GameBoard verticalOnePointBoardForO() {
        /*
         * 3x3 board with the following pattern:
         *
         * - - W - -
         * - - O - -
         * - - W - -
         */

        GameBoard board = new GameBoard(3);
        board.setCell(0, 1, 'W');
        board.setCell(1, 1, 'O');
        board.setCell(2, 1, 'W');

        return board;
    }

    static GameBoard verticalZeroPointsBoardForO() {
        /*
         * 3x3 board with the following pattern:
         *
         * - W -
         * - O -
         * - O -
         */

        GameBoard board = new GameBoard(3);
        board.setCell(0, 1, 'W');
        board.setCell(1, 1, 'O');
        board.setCell(2, 1, 'O');

        return board;
    }

    static GameBoard verticalZeroPointsBoardForW() {
        /*
         * 5x5 board with the following pattern:
         *
         * - - O - -
         * - - W - -
         * - - O - -
         * - - O - -
         * - - W - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 2, 'O');
        board.setCell(1, 2, 'W');
        board.setCell(2, 2, 'O');
        board.setCell(3, 2, 'O');
        board.setCell(4, 2, 'W');

        return board;
    }

    // DIAGONAL BOARDS

    static GameBoard diagonalFourPointsBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * W - - - W
         * - O - O -
         * - - W - -
         * - O - O -
         * W - - - W
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'W');
        board.setCell(0, 4, 'W');
        board.setCell(1, 1, 'O');
        board.setCell(1, 3, 'O');
        board.setCell(2, 2, 'W');
        board.setCell(3, 1, 'O');
        board.setCell(3, 3, 'O');
        board.setCell(4, 4, 'W');
        board.setCell(4, 0, 'W');

        return board;
    }

    static GameBoard diagonalThreePointsBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * W - - - W
         * - O - O -
         * - - W - -
         * - O - W -
         * W - - - W
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'W');
        board.setCell(0, 4, 'W');
        board.setCell(1, 1, 'O');
        board.setCell(1, 3, 'O');
        board.setCell(2, 2, 'W');
        board.setCell(3, 1, 'O');
        board.setCell(3, 3, 'W');
        board.setCell(4, 4, 'W');
        board.setCell(4, 0, 'W');

        return board;
    }

    static GameBoard diagonalTwoPointsBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * W - - - W
         * - W - W -
         * - - W - -
         * - O - O -
         * W - - - W
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'W');
        board.setCell(0, 4, 'W');
        board.setCell(1, 1, 'W');
        board.setCell(1, 3, 'W');
        board.setCell(2, 2, 'W');
        board.setCell(3, 1, 'O');
        board.setCell(3, 3, 'O');
        board.setCell(4, 4, 'W');
        board.setCell(4, 0, 'W');

        return board;
    }

    static GameBoard diagonalOnePointBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * W - - - W
         * - W - W -
         * - - W - -
         * - O - W -
         * W - - - W
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'W');
        board.setCell(0, 4, 'W');
        board.setCell(1, 1, 'W');
        board.setCell(1, 3, 'W');
        board.setCell(2, 2, 'W');
        board.setCell(3, 1, 'O');
        board.setCell(3, 3, 'W');
        board.setCell(4, 4, 'W');
        board.setCell(4, 0, 'W');

        return board;
    }

    static GameBoard diagonalZeroPointsBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * W - - - W
         * - W - W -
         * - - W - -
         * - W - W -
         * W - - - W
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'W');
        board.setCell(0, 4, 'W');
        board.setCell(1, 1, 'W');
        board.setCell(1, 3, 'W');
        board.setCell(2, 2, 'W');
        board.setCell(3, 1, 'W');
        board.setCell(3, 3, 'W');
        board.setCell(4, 4, 'W');
        board.setCell(4, 0, 'W');

        return board;
    }

    // EDGE BOARDS

    static GameBoard edgeVerticalBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * - - - - -
         * - - - - -
         * - - W - -
         * - - O - -
         * - - W - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(2, 2, 'W');
        board.setCell(3, 2, 'O');
        board.setCell(4, 2, 'W');

        return board;
    }

    static GameBoard edgeHorizontalBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * - - - - -
         * - - - - -
         * O O W O W
         * - - - - -
         * - - - - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(2, 0, 'O');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'W');
        board.setCell(2, 3, 'O');
        board.setCell(2, 4, 'W');

        return board;
    }

    static GameBoard edgeDiagonalBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * W O - - -
         * - O W - W
         * - O W O -
         * O - W - -
         * - - - - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 0, 'W');
        board.setCell(0, 1, 'O');
        board.setCell(1, 2, 'W');
        board.setCell(1, 1, 'O');
        board.setCell(1, 4, 'W');
        board.setCell(2, 3, 'O');
        board.setCell(2, 1, 'O');
        board.setCell(2, 2, 'W');
        board.setCell(3, 2, 'W');
        board.setCell(3, 0, 'O');

        return board;
    }

    static GameBoard closeToEdgeDiagonalBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * - - - - W
         * - - - O -
         * - - W W -
         * - - O - -
         * - - - - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(0, 4, 'W');
        board.setCell(1, 3, 'O');
        board.setCell(2, 3, 'W');
        board.setCell(2, 2, 'W');
        board.setCell(3, 2, 'O');

        return board;
    }

    static GameBoard closeToEdgeTwoPointsDiagonalBoardForW() {
        /*
         * 5x5 board with the following pattern:
         * 
         * - - - - -
         * - - W - -
         * - O - O -
         * w - - - W
         * - - - - -
         */

        GameBoard board = new GameBoard(5);
        board.setCell(1, 2, 'W');
        board.setCell(2, 1, 'O');
        board.setCell(2, 3, 'O');
        board.setCell(3, 0, 'W');
        board.setCell(3, 4, 'W');

        return board;
    }
}
