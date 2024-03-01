package com.prelim_project.util;

import java.util.Scanner;

public class PlayerInput {
    private static Scanner scanner = new Scanner(System.in);

    public int[] getMove() {
        int row = getRow();
        int column = getColumn();

        return new int[] { row, column };
    }

    private int getRow() {
        int row = -1;
        while (row < 0) {
            System.out.println("Enter column: ");
            row = scanner.nextInt();
        }
        return row;
    }

    private int getColumn() {
        int column = -1;
        while (column < 0) {
            System.out.println("Enter column: ");
            column = scanner.nextInt();
        }
        return column;
    }

    public String getName() {
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }
}
