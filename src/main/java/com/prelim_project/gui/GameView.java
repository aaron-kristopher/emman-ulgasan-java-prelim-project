package com.prelim_project.gui;

import com.prelim_project.model.GameBoard;
import com.prelim_project.model.Player;

public class GameView {

    public static void printBoard(GameBoard board) {
        int size = board.getSize();
        System.out.print("""
                --------------------------------------------------
                |     |  1  |  2  |  3  |  4  |  5  |  6  |  7  |
                --------------------------------------------------""");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char symbol = switch (board.getCell(i, j)) {
                    case 'S' -> 'S';
                    case 'O' -> 'O';
                    default -> ' ';
                };

                if (j == 0)
                    System.out.printf("\n|  %d  |  %s  |", i + 1, symbol);
                else
                    System.out.printf("  %s  |", symbol);
            }
            System.out.print("\n--------------------------------------------------");
        }
        System.out.println();
    }

    public static void printTurnInfo(Player currentPlayer, char currentSymbol) {
        System.out.printf("Current Player: %s\tCurrent Symbol: %s", currentPlayer.getName(), currentSymbol);
    }

    public static void printScores(Player[] players) {
        System.out.println("\n\nScores:");
        for (Player player : players) {
            System.out.printf("%s: %d\t", player.getName(), player.getScore());
        }
    }
}
