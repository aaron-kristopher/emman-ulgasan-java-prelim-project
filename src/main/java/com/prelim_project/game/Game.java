package com.prelim_project.game;

import com.prelim_project.gui.GameView;
import com.prelim_project.model.GameBoard;
import com.prelim_project.model.Player;
import com.prelim_project.util.PlayerInput;

public class Game {
    static GameBoard board;
    static Player[] players;
    static Player currentPlayer;
    static char currentSymbol = 'W';

    public static void main(String[] args) {
        Game game = new Game();
        game.mainMenu();
    }

    private void initializeGame() {
        board = new GameBoard(7);
        currentSymbol = 'W';

        Player player1 = new Player(PlayerInput.getName(1));
        Player player2 = new Player(PlayerInput.getName(2));
        players = new Player[] { player1, player2 };
        currentPlayer = player1;
    }

    private void mainMenu() {
        GameView.clearScreen();
        GameView.printTitleScreen();
        GameView.printMenu();

        int option = PlayerInput.getMenuOption();

        switch (option) {
            case 1:
                startGame();
                break;
            case 2:
                GameView.clearScreen();
                GameView.printInstructions();
                PlayerInput.pressContinue();
                mainMenu();
                break;
            case 3:
                GameView.clearScreen();
                GameView.printCloseProgram();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Try again.");
                mainMenu();
        }
    }

    private void startGame() {
        initializeGame();
        GameView.clearScreen();
        GameView.printLoadingScreen();

        while (!board.isBoardFull()) {
            GameView.clearScreen();
            GameView.printGameInProgress();
            GameView.printBoard(board);
            GameView.printTurnInfo(currentPlayer, currentSymbol);
            GameView.printScores(players);

            int[] move = PlayerInput.getMove(board.getSize());
            int row = move[0];
            int col = move[1];

            while (!GameLogic.isValidMove(row, col, board)) {
                System.out.println("Invalid move. Cell is already occupied. Try again.");
                move = PlayerInput.getMove(board.getSize());
                row = move[0];
                col = move[1];
            }

            board.setCell(row, col, currentSymbol);

            int points = GameLogic.checkPoints(board, row, col, currentSymbol);
            if (points != 0) {
                currentPlayer.increaseScore(points);
            } else
                currentPlayer = GameLogic.switchPlayer(players, currentPlayer);

            currentSymbol = GameLogic.switchSymbol(currentSymbol);
        }
        GameView.clearScreen();
        GameView.printBoard(board);

        // Displays game outcome
        if (GameLogic.isATie(players))
            GameView.printTie();
        else
            GameView.printWinner(GameLogic.getWinner(players));

        // Loops if players wants to play agian
        if (PlayerInput.getPlayAgain() == 'y')
            startGame();
        else
            mainMenu();
    }
}
