package com.prelim_project.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.prelim_project.model.GameBoard;

public class SOSPatternCheckerTest {

    // HORIZONTAL TEST

    @Test
    public void horizontalTwoPointsWithS() {
        GameBoard twoPointsBoard = CreateTestGameBoard.horizontalTwoPointBoardForW();
        int points = WOWPatternChecker.checkHorizontal(twoPointsBoard, 2, 2, 'W');
        assertEquals(2, points);
    }

    @Test
    public void horizontalOnePointWithS() {
        GameBoard onePointBoard = CreateTestGameBoard.horizontalOnePointBoardForW();
        GameBoard onePointOffsetBoard = CreateTestGameBoard.horizontalOnePointOffsetBoardForW();
        int points1 = WOWPatternChecker.checkHorizontal(onePointBoard, 2, 2, 'W');
        int points2 = WOWPatternChecker.checkHorizontal(onePointOffsetBoard, 2, 1, 'W');

        assertEquals(1, points1);
        assertEquals(1, points2);
    }

    @Test
    public void horizontalOnePointWithO() {
        GameBoard onePointBoard = CreateTestGameBoard.horizontalOnePointBoardForO();
        int points = WOWPatternChecker.checkHorizontal(onePointBoard, 2, 1, 'O');
        assertEquals(1, points);
    }

    @Test
    public void horizontalZeroPointsWithS() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.emptyBoard();
        int points = WOWPatternChecker.checkHorizontal(zeroPointsBoard, 0, 2, 'W');
        assertEquals(0, points);
    }

    @Test
    public void horizontalZeroPointsWithO() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.horizontalZeroPointsBoardForO();
        int points = WOWPatternChecker.checkHorizontal(zeroPointsBoard, 0, 2, 'O');
        assertEquals(0, points);
    }

    // VERTICAL TESTS

    @Test
    public void verticalTwoPointsWithS() {
        GameBoard twoPointsBoard = CreateTestGameBoard.verticalTwoPointsBoardForW();
        int points = WOWPatternChecker.checkVertical(twoPointsBoard, 2, 2, 'W');
        assertEquals(2, points);
    }

    @Test
    public void verticalOnePointsWithS() {
        GameBoard onePointBoard1 = CreateTestGameBoard.verticalOnePointBoardForW();
        GameBoard onePointBoard2 = CreateTestGameBoard.verticalOnePointOffsetBoardForW();
        int points1 = WOWPatternChecker.checkVertical(onePointBoard1, 2, 2, 'W');
        int points2 = WOWPatternChecker.checkVertical(onePointBoard2, 1, 2, 'W');
        assertEquals(1, points1);
        assertEquals(1, points2);
    }

    @Test
    public void verticalOnePointWithO() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.verticalOnePointBoardForO();
        int points = WOWPatternChecker.checkVertical(zeroPointsBoard, 1, 1, 'W');
        assertEquals(1, points);
    }

    @Test
    public void verticalZeroPointsWithS() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.verticalZeroPointsBoardForW();
        int points = WOWPatternChecker.checkVertical(zeroPointsBoard, 2, 2, 'W');
        assertEquals(0, points);
    }

    @Test
    public void verticalZeroPointsWithO() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.verticalZeroPointsBoardForO();
        int points = WOWPatternChecker.checkVertical(zeroPointsBoard, 1, 1, 'O');
        assertEquals(0, points);
    }

    // DIAGONAL TESTS

    @Test
    public void diagonalFourPointsWithS() {
        GameBoard fourPointsBoard = CreateTestGameBoard.diagonalFourPointsBoardForW();
        int points = WOWPatternChecker.checkDiagonal(fourPointsBoard, 2, 2, 'W');
        assertEquals(4, points);
    }

    @Test
    public void diagonalThreePointsBoardWithS() {
        GameBoard threePointsBoard = CreateTestGameBoard.diagonalThreePointsBoardForW();
        int points = WOWPatternChecker.checkDiagonal(threePointsBoard, 2, 2, 'W');
        assertEquals(3, points);
    }

    @Test
    public void diagonalTwoPointsBoardWithS() {
        GameBoard twoPointsBoard = CreateTestGameBoard.diagonalTwoPointsBoardForW();
        int points = WOWPatternChecker.checkDiagonal(twoPointsBoard, 2, 2, 'W');
        assertEquals(2, points);
    }

    @Test
    public void diagonalOnePointsBoardWithS() {
        GameBoard onePointBoard = CreateTestGameBoard.diagonalOnePointBoardForW();
        int points = WOWPatternChecker.checkDiagonal(onePointBoard, 2, 2, 'W');
        int points2 = WOWPatternChecker.checkDiagonal(onePointBoard, 4, 0, 'W');
        assertEquals(1, points);
        assertEquals(1, points2);
    }

    @Test
    public void diagonalZeroPointsBoardWithS() {
        GameBoard zeroPointBoard = CreateTestGameBoard.diagonalZeroPointsBoardForW();
        int points = WOWPatternChecker.checkDiagonal(zeroPointBoard, 2, 2, 'W');
        assertEquals(0, points);
    }

    // EDGE PATTERN TESTS

    @Test
    public void edgeVerticalBoardWithS() {
        GameBoard edgeVerticalBoard = CreateTestGameBoard.edgeVerticalBoardForW();
        int points = WOWPatternChecker.checkVertical(edgeVerticalBoard, 4, 2, 'W');
        assertEquals(1, points);
    }

    @Test
    public void edgeHorizontalBoardWithS() {
        GameBoard edgeHorizontalBoard = CreateTestGameBoard.edgeHorizontalBoardForW();
        int points = WOWPatternChecker.checkHorizontal(edgeHorizontalBoard, 2, 4, 'W');
        assertEquals(1, points);
    }

    @Test
    public void edgeDiagonalBoardWithS() {
        GameBoard edgeDiagonalBoard = CreateTestGameBoard.edgeDiagonalBoardForW();
        int points = WOWPatternChecker.checkDiagonal(edgeDiagonalBoard, 1, 2, 'W');
        int points2 = WOWPatternChecker.checkDiagonal(edgeDiagonalBoard, 1, 4, 'W');

        assertEquals(0, points);
        assertEquals(1, points2);
    }

    @Test
    public void closeToEdgeDiagonalBoardForW() {
        GameBoard closeToEdgeDiagonalBoard = CreateTestGameBoard.closeToEdgeDiagonalBoardForW();
        int points = WOWPatternChecker.checkDiagonal(closeToEdgeDiagonalBoard, 2, 3, 'W');
        assertEquals(0, points);
    }

    @Test
    public void closeToEdgeTwoPointsDiagonalBoardForW() {
        GameBoard closeToEdgeDiagonalBoard = CreateTestGameBoard.closeToEdgeTwoPointsDiagonalBoardForW();
        int points = WOWPatternChecker.checkDiagonal(closeToEdgeDiagonalBoard, 1, 2, 'W');
        assertEquals(2, points);
    }
}
