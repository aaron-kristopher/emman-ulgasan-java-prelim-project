package com.prelim_project.util;

import java.util.Scanner;

public class PlayerInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getMove() {
        int row = getRow() - 1;
        int column = getColumn() - 1;

        return new int[] { row, column };
    }

    private static int getRow() {
        int row = -1;
        while (row < 0) {
            System.out.print("\n\nEnter row: ");
            try {
                row = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        return row;
    }

    private static int getColumn() {
        int column = -1;
        while (column < 0) {
            System.out.print("Enter column: ");
            try {
                column = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
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
}
