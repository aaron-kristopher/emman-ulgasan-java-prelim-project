package com.prelim_project.util;

import java.util.Scanner;

import com.prelim_project.gui.GameView;

public class PlayerInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getMove(int boardSize) {
        int row = getRow(boardSize) - 1;
        int column = getColumn(boardSize) - 1;

        return new int[] { row, column };
    }

    private static int getRow(int maxRow) {
        int row = -1;
        while (row < 0 || row > maxRow) {
            System.out.print("\nEnter row: ");
            try {
                row = scanner.nextInt();
                if (row < 0 || row > maxRow)
                    System.out.println("\nInvalid input. Please enter a number within the range.");
            } catch (Exception e) {
                System.out.println("\nInvalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        return row;
    }

    private static int getColumn(int maxCol) {
        int column = -1;
        while (column < 0 || column > maxCol) {
            System.out.print("Enter column: ");
            try {
                column = scanner.nextInt();
                if (column < 0 || column > maxCol)
                    System.out.println("\nInvalid input. Please enter a number within the range.\n");
            } catch (Exception e) {
                System.out.println("\nInvalid input. Please enter a number.\n");
                scanner.nextLine();
            }
        }
        System.out.println();
        return column;
    }

    public static String getName(int playerNumber) {
        System.out.printf("\nEnter name for player #%d: ", playerNumber);
        return scanner.nextLine();
    }

    public static int getMenuOption() {
        int option = -1;
        while (option < 0) {
            System.out.print("\nEnter option: ");
            try {
                option = scanner.nextInt();
                if (option < 0)
                    System.out.println("\nInvalid input. Please enter a number within the range.");
            } catch (Exception e) {
                System.out.println("\nInvalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return option;
    }

    public static void pressContinue() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }

    public static char getPlayAgain() {
        char playAgain = '\u0000';
        while (playAgain != 'y' && playAgain != 'n') {
            System.out.print("\nPlay again? (y/n): ");
            playAgain = scanner.next().charAt(0);
            GameView.clearScreen();
        }
        scanner.nextLine();
        return playAgain;
    }
}
