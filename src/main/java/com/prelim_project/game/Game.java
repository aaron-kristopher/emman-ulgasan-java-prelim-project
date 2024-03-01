package com.prelim_project.game;

import com.prelim_project.model.GameBoard;
import com.prelim_project.model.Player;
import com.prelim_project.util.PlayerInput;

public class Game {
    static GameBoard board;
    static Player[] players;
    static Player currentPlayer;
    static char currentSymbol = 'S';

    public void initializeGame() {
        GameBoard board = new GameBoard(7);

        String player1Name = PlayerInput.getName(1);
        Player player1 = new Player(player1Name);

        String player2Name = PlayerInput.getName(2);
        Player player2 = new Player(player2Name);

        currentPlayer = player1;
        players = new Player[] { player1, player2 };
    }

    public void startGame() {
        initializeGame();

        while (!board.isBoardFull()) {
            // TODO - print Board

            int[] move = PlayerInput.getMove();
            int row = move[0];
            int col = move[1];

            while (!GameLogic.isValidMove(row, col, board)) {
                System.out.println("Invalid move. Try again.");
                move = PlayerInput.getMove();
                row = move[0];
                col = move[1];
            }

            board.setCell(row, col, currentSymbol);

            int points = GameLogic.checkPoints(board, row, col, currentSymbol);
            if (points != 0) {
                currentPlayer.increaseScore(points);
                // TODO - print Board
            } else
                currentPlayer = GameLogic.switchPlayer(players, currentPlayer);
        }
    }
}
