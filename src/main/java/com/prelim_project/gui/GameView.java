package com.prelim_project.gui;

import com.prelim_project.model.GameBoard;
import com.prelim_project.model.Player;

public class GameView {

    public static void printBoard(GameBoard board) {
        int size = board.getSize();

        printHorizontalDivder(size);

        for (int i = 1; i <= size; i++) {
            if (i == 1)
                System.out.printf("\n|     |  %d  |", i);
            else
                System.out.printf("  %d  |", i);
        }
        printHorizontalDivder(size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char symbol = (board.getCell(i, j) == '\u0000') ? ' ' : board.getCell(i, j);

                if (j == 0)
                    System.out.printf("\n|  %d  |  %s  |", i + 1, symbol);
                else
                    System.out.printf("  %s  |", symbol);
            }
            printHorizontalDivder(size);
        }
        System.out.println();
    }

    private static void printHorizontalDivder(int size) {
        System.out.println();
        for (int j = 0; j <= size; j++)
            System.out.print("------");
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

    public static void printWinner(Player player) {
        System.out.printf("\n\n%s wins!", player.getName());
    }
}
