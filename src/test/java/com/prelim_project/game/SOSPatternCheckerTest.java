package com.prelim_project.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.prelim_project.model.GameBoard;

public class SOSPatternCheckerTest {

    // HORIZONTAL TEST

    @Test
    public void horizontalTwoPointsWithS() {
        GameBoard twoPointsBoard = CreateTestGameBoard.horizontalTwoPointBoardForS();
        int points = SOSPatternChecker.checkHorizontal(twoPointsBoard, 2, 2, 'S');
        assertEquals(2, points);
    }

    @Test
    public void horizontalOnePointWithS() {
        GameBoard onePointBoard = CreateTestGameBoard.horizontalOnePointBoardForS();
        GameBoard onePointOffsetBoard = CreateTestGameBoard.horizontalOnePointOffsetBoardForS();
        int points1 = SOSPatternChecker.checkHorizontal(onePointBoard, 2, 2, 'S');
        int points2 = SOSPatternChecker.checkHorizontal(onePointOffsetBoard, 2, 1, 'S');

        assertEquals(1, points1);
        assertEquals(1, points2);
    }

    @Test
    public void horizontalOnePointWithO() {
        GameBoard onePointBoard = CreateTestGameBoard.horizontalOnePointBoardForO();
        int points = SOSPatternChecker.checkHorizontal(onePointBoard, 2, 1, 'O');
        assertEquals(1, points);
    }

    @Test
    public void horizontalZeroPointsWithS() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.emptyBoard();
        int points = SOSPatternChecker.checkHorizontal(zeroPointsBoard, 0, 2, 'S');
        assertEquals(0, points);
    }

    @Test
    public void horizontalZeroPointsWithO() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.horizontalZeroPointsBoardForO();
        int points = SOSPatternChecker.checkHorizontal(zeroPointsBoard, 0, 2, 'O');
        assertEquals(0, points);
    }

    // VERTICAL TESTS

    @Test
    public void verticalTwoPointsWithS() {
        GameBoard twoPointsBoard = CreateTestGameBoard.verticalTwoPointsBoardForS();
        int points = SOSPatternChecker.checkVertical(twoPointsBoard, 2, 2, 'S');
        assertEquals(2, points);
    }

    @Test
    public void verticalOnePointsWithS() {
        GameBoard onePointBoard1 = CreateTestGameBoard.verticalOnePointBoardForS();
        GameBoard onePointBoard2 = CreateTestGameBoard.verticalOnePointOffsetBoardForS();
        int points1 = SOSPatternChecker.checkVertical(onePointBoard1, 2, 2, 'S');
        int points2 = SOSPatternChecker.checkVertical(onePointBoard2, 1, 2, 'S');
        assertEquals(1, points1);
        assertEquals(1, points2);
    }

    @Test
    public void verticalOnePointWithO() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.verticalOnePointBoardForO();
        int points = SOSPatternChecker.checkVertical(zeroPointsBoard, 1, 1, 'S');
        assertEquals(1, points);
    }

    @Test
    public void verticalZeroPointsWithS() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.verticalZeroPointsBoardForS();
        int points = SOSPatternChecker.checkVertical(zeroPointsBoard, 2, 2, 'S');
        assertEquals(0, points);
    }

    @Test
    public void verticalZeroPointsWithO() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.verticalZeroPointsBoardForO();
        int points = SOSPatternChecker.checkVertical(zeroPointsBoard, 1, 1, 'O');
        assertEquals(0, points);
    }
}
