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
        System.out.println();
    }

    private static void printHorizontalDivder(int size) {
        System.out.println();
        for (int j = 0; j <= size; j++)
            System.out.print("------");
    }

    public static void printTurnInfo(Player currentPlayer, char currentSymbol) {
        System.out.printf("Current Player: %s\t\tCurrent Symbol: %s", currentPlayer.getName(), currentSymbol);
    }

    public static void printScores(Player[] players) {
        System.out.println("\n\nScores:");
        for (Player player : players)
            System.out.printf("%s: %d\t", player.getName(), player.getScore());
    }

    public static void printWinner(Player player) {
        System.out.printf("\nCongratulations, %s wins!\n", player.getName());
    }

    public static void printTie() {
        System.out.println("It's a tie!\n");
    }

    public static void printTitleScreen() {
        System.out.println("""
                ╔══─┉┈◈◉◈┈┉════─┉┈◈◉◈┈┉═══ ≪ °❈° ≫ ════─┉┈◈◉◈┈┉════─┉┈◈◉◈┈┉══╗

                ░██████╗░█████╗░░██████╗  ░██████╗░░█████╗░███╗░░░███╗███████╗
                ██╔════╝██╔══██╗██╔════╝  ██╔════╝░██╔══██╗████╗░████║██╔════╝
                ╚█████╗░██║░░██║╚█████╗░  ██║░░██╗░███████║██╔████╔██║█████╗░░
                ░╚═══██╗██║░░██║░╚═══██╗  ██║░░╚██╗██╔══██║██║╚██╔╝██║██╔══╝░░
                ██████╔╝╚█████╔╝██████╔╝  ╚██████╔╝██║░░██║██║░╚═╝░██║███████╗
                ╚═════╝░░╚════╝░╚═════╝░  ░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚══════╝

                ╚═══─┉┈◈◉◈┈┉════─┉┈◈◉◈┈┉═══ ≪ °❈° ≫ ════─┉┈◈◉◈┈┉════─┉┈◈◉◈┈┉═╝
                                    """);
    }

    public static void printMenu() {
        System.out.println("""
                1. Start Game
                2. Instructions
                3. Exit
                """);
    }

    public static void printInstructions() {
        System.out.println("""
                Instructions:
                1. The game is played on a grid that's 7 squares by 7 squares.
                2. Players take turns putting their marks in empty squares.
                4. When all 49 squares are full, the game is over. The player with the most points wins.

                """);
    }
}
