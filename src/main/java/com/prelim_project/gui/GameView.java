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
        System.out.println();
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
                1. WOW is a two player game with 7x7 table (7 rows and 7 columns).
                2. The user will have the option whether he/she will choose to be player 1 or player 2.
                3. Both players can input W and O.
                4. Each turn playes one player.
                5. A sequence O-W-O is not valid on the game and the player will not earn points.
                6. A player that makes WOW will earn a point and can play another turn.
                4. When all 49 squares are full, the game is over. The player with the most points wins.

                """);
    }

    public static void printGameInProgress() {
        System.out.println("A Game of Wits, WOW...");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printCloseProgram() {
        System.out.println("Thank you for playing WOW. Goodbye!");
    }
}
