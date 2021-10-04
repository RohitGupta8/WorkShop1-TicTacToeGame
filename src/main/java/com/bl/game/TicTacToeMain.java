package com.bl.game;

import java.util.*;

public class TicTacToeMain {
    /**
     * declare 1d array of char type
     */
    static char[] gameBoard = new char[10];

    public static char ComputerLetter;
    public static char PlayerLetter;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    /**
     * method for creating empty GameBoard
     */
    public void createGameBoard() {
        for (int a = 1; a < gameBoard.length; a++) {
            gameBoard[a] = ' ';
        }
    }

    /**
     * method for choose Letter X or O
     */
    public void selectLetter() {
        int flag = 0;
        while (flag == 0) {
            System.out.print("\nChoose your Letter\nPress 1 -> 'X'\nPress 2 -> 'O'\nEnter your Choice -> ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                PlayerLetter = 'X';
                ComputerLetter = 'O';
                System.out.println("\nPlayer letter -> " + PlayerLetter);
                System.out.println("Computer letter -> " + ComputerLetter);
                flag = 1;
            } else if (choice == 2) {
                PlayerLetter = 'O';
                ComputerLetter = 'X';
                System.out.println("\nPlayer letter -> " + PlayerLetter);
                System.out.println("Computer letter -> " + ComputerLetter);
                flag = 2;
            } else {
                System.out.println("\n>>>>>>> plz enter 1 or 2 <<<<<<<<<");
            }
        }
    }

    /**
     * method for display Board
     */
    public void showBoard() {
        System.out.println("  " + gameBoard[1] + " | "
                + gameBoard[2] + " | " + gameBoard[3]
                + "  ");
        System.out.println("----|---|----");
        System.out.println("  " + gameBoard[4] + " | "
                + gameBoard[5] + " | " + gameBoard[6]
                + "  ");
        System.out.println("----|---|----");
        System.out.println("  " + gameBoard[7] + " | "
                + gameBoard[8] + " | " + gameBoard[9]
                + "  ");

    }

    /**
     * method for user move on desired location
     */
    public void playerPlaying() {
        System.out.println("\n>>>>>>>> Player Turn <<<<<<<<");
        showBoard();
        int kite = 0;
        while (kite == 0) {
            System.out.print("Enter your position [1-9] -> ");
            int playerPosition = scanner.nextInt();
            if (isEmptyCell(playerPosition)) {
                gameBoard[playerPosition] = PlayerLetter;
                showBoard();
                kite = 1;
            } else {
                System.out.println("\nSpace is not Empty.....plz try in another...\n");
            }
        }
        checkWinner(gameBoard, PlayerLetter);
        checkGameBoardFull();
        switchPlayer(1);
    }

    /**
     * method for user move on desired location
     */
    public void computerPlaying() {
        System.out.println("\n>>>>>>>> Computer Turn <<<<<<<<\n");
        int cat = 0;
        while (cat == 0) {
            int computerPosition = random.nextInt(9) + 1;
            if (isEmptyCell(computerPosition)) {
                gameBoard[computerPosition] = ComputerLetter;
                showBoard();
                cat = 1;
            } else {
                System.out.println("\nSpace is not Empty.....plz try in another...\n");
            }
        }
        checkWinner(gameBoard, ComputerLetter);
        checkGameBoardFull();
        switchPlayer(0);
    }

    /**
     * Method for check free space
     */
    public static boolean isEmptyCell(int cellIndex) {
        return gameBoard[cellIndex] == ' ';
    }

    /**
     * method of switch player for playing
     */
    public void switchPlayer(int switchPlayer) {
        if (switchPlayer == 0) {
            playerPlaying();
        } else if (switchPlayer == 1) {
            computerPlaying();
        } else {
            System.out.println("\nGame finished.......");
            System.out.print("\nIf You Want 2 Play Another Game\nPress [1] for new game\nPress [2] for Exit\nEnter your Choice => ");
            int choice =scanner.nextInt();
            newGame(choice);
        }
    }

    /**
     * method of toss for playing who play first
     */
    public void tossToPlay() {
        System.out.println("\nToss .......let's decide who play first......\nCoin flip......\nCoin flip.....\nCoin flip.....\nCoin flip......\n");
        int switchPlayer = random.nextInt(2);
        if (switchPlayer == 0) {
            System.out.println("Player Has Won The Toss ....and Play first");
            switchPlayer(0);
        } else {
            System.out.println("Computer Has Won The Toss ....and Play first");
            switchPlayer(1);
        }
    }

    /**
     * method for who won the match
     */
    public void checkWinner(char[] gameBoard, char Letters) {
        for (int a = 1; a < gameBoard.length - 1; a++) {
            if (gameBoard[1] == gameBoard[2] && gameBoard[2] == gameBoard[3] && gameBoard[3] == Letters) {
                System.out.println("\n>>>>> [ " + Letters + " ] <<<<< is Won the Match.....\n");
                switchPlayer(3);
                break;
            } else if (gameBoard[4] == gameBoard[5] && gameBoard[5] == gameBoard[6] && gameBoard[6] == Letters) {
                System.out.println("\n>>>>> [ " + Letters + " ] <<<<< is Won the Match.....\n");
                switchPlayer(3);
                break;
            } else if (gameBoard[7] == gameBoard[8] && gameBoard[8] == gameBoard[9] && gameBoard[9] == Letters) {
                System.out.println("\n>>>>> [ " + Letters + " ] <<<<< is Won the Match.....\n");
                switchPlayer(3);
                break;
            } else if (gameBoard[1] == gameBoard[4] && gameBoard[4] == gameBoard[7] && gameBoard[7] == Letters) {
                System.out.println("\n>>>>> [ " + Letters + " ] <<<<< is Won the Match.....\n");
                switchPlayer(3);
                break;
            } else if (gameBoard[2] == gameBoard[5] && gameBoard[5] == gameBoard[8] && gameBoard[8] == Letters) {
                System.out.println("\n>>>>> [ " + Letters + " ] <<<<< is Won the Match.....\n");
                switchPlayer(3);
                break;
            } else if (gameBoard[3] == gameBoard[6] && gameBoard[6] == gameBoard[9] && gameBoard[9] == Letters) {
                System.out.println("\n>>>>> [ " + Letters + " ] <<<<< is Won the Match.....\n");
                switchPlayer(3);
                break;
            } else if (gameBoard[1] == gameBoard[5] && gameBoard[5] == gameBoard[9] && gameBoard[9] == Letters) {
                System.out.println("\n>>>>> [ " + Letters + " ] <<<<< is Won the Match.....\n");
                switchPlayer(3);
                break;
            } else if (gameBoard[3] == gameBoard[5] && gameBoard[5] == gameBoard[7] && gameBoard[7] == Letters) {
                System.out.println("\n>>>>> [ " + Letters + " ] <<<<< is Won the Match.....\n");
                switchPlayer(3);
                break;
            }
        }
    }

    /**
     * method of check game board is full
     */
    public boolean checkGameBoardFull() {
        for (int i = 1; i < gameBoard.length; i++) {
            if (gameBoard[i] == ' ') {
                return true;
            }
        }
        System.out.println("\n>>>>>>> { MATCH DRAW } <<<<<<<<");
        switchPlayer(3);
        return false;
    }

    /**
     *  play new game or exit
     * @param choice
     */
    public void newGame(int choice){
        if (choice == 1){
            createGameBoard();
            showBoard();
            selectLetter();
            tossToPlay();
        }else{
            System.out.println("\n Thanks for Playing...........\n\n\n    >>>>>>> Game Over <<<<<<<<");
            System.exit(0);
        }

    }

    /**
     * This is main method where all method are calling
     */
    public static void main(String[] args) {

        TicTacToeMain ticTacToeMain = new TicTacToeMain();

        System.out.println("#####################################\n      Welcome 2 TicTacToe Game\n#####################################\n");

        ticTacToeMain.createGameBoard();
        ticTacToeMain.showBoard();
        ticTacToeMain.selectLetter();
        ticTacToeMain.tossToPlay();
    }
}
