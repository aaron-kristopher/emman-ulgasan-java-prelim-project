package com.prelim_project.game;

import com.prelim_project.model.GameBoard;
import com.prelim_project.model.Player;

public class GameLogic {
    public static boolean isValidMove(int row, int col, GameBoard board) {
        if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize())
            return false;

        if (!board.isCellEmpty(row, col))
            return false;

        return true;
    }

    public static int checkPoints(GameBoard board, int row, int col, char value) {
        return WOWPatternChecker.calculateTotalPoints(board, row, col, value);
    }

    public static char switchSymbol(char symbol) {
        return symbol == 'W' ? 'O' : 'W';
    }

    public static Player switchPlayer(Player[] players, Player currentPlayer) {
        return currentPlayer == players[0] ? players[1] : players[0];
    }

    public static Player getWinner(Player[] players) {
        return players[0].getScore() > players[1].getScore() ? players[0] : players[1];
    }

    public static boolean isATie(Player[] players) {
        return players[0].getScore() == players[1].getScore();
    }
}
