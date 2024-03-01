package com.prelim_project.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.prelim_project.model.GameBoard;

public class SOSPatternCheckerTest {

    @Test
    public void horizontalOnePointWithS() {
        GameBoard onePointBoard = CreateTestGameBoard.onePointHorizontalBoardForS();
        int points = SOSPatternChecker.checkHorizontal(onePointBoard, 0, 2, 'S');
        assertEquals(points, points);
    }

    @Test
    public void horizontalOnePointWithO() {
        GameBoard onePointBoard = CreateTestGameBoard.onePointHorizontalBoardForO();
        int points = SOSPatternChecker.checkHorizontal(onePointBoard, 2, 1, 'O');
        assertEquals(1, points);
    }

    @Test
    public void horizontalTwoPointsWithS() {
        GameBoard twoPointsBoard = CreateTestGameBoard.fullBoard();
        int points = SOSPatternChecker.checkHorizontal(twoPointsBoard, 0, 2, 'S');
        assertEquals(2, points);
    }

    @Test
    public void horizontalZeroPointsWithS() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.emptyBoard();
        int points = SOSPatternChecker.checkHorizontal(zeroPointsBoard, 0, 2, 'S');
        assertEquals(0, points);
    }

    @Test
    public void horizontalZeroPointsWithO() {
        GameBoard zeroPointsBoard = CreateTestGameBoard.zeroPointHorizontalBoardForO();
        int points = SOSPatternChecker.checkHorizontal(zeroPointsBoard, 0, 2, 'O');
        assertEquals(0, points);
    }
}
