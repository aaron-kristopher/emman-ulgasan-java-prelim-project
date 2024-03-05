package com.prelim_project.game;

import com.prelim_project.gui.GameView;
import com.prelim_project.model.GameBoard;
import com.prelim_project.model.Player;
import com.prelim_project.util.PlayerInput;

public class Game {
    static GameBoard board;
    static Player[] players;
    static Player currentPlayer;
    static char currentSymbol = 'S';

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }

    private void initializeGame() {
        board = new GameBoard(7);

        Player player1 = new Player(PlayerInput.getName(1));
        Player player2 = new Player(PlayerInput.getName(2));

        currentPlayer = player1;
        players = new Player[] { player1, player2 };
    }

    public void startGame() {
        initializeGame();

        while (!board.isBoardFull()) {
            GameView.printBoard(board);
            GameView.printTurnInfo(currentPlayer, currentSymbol);
            GameView.printScores(players);

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
            } else
                currentPlayer = GameLogic.switchPlayer(players, currentPlayer);

            currentSymbol = GameLogic.switchSymbol(currentSymbol);
        }

        GameView.printBoard(board);
        GameView.printScores(players);
        GameView.printWinner(GameLogic.getWinner(players));
    }
}
