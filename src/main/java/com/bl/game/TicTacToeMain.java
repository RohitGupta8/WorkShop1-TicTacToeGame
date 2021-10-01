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
     *
     * @param args
     */
    public static void main(String[] args) {

        TicTacToeMain ticTacToeMain = new TicTacToeMain();

        System.out.println("#####################################\n      Welcome 2 TicTacToe Game\n#####################################\n");

        ticTacToeMain.createGameBoard();
        ticTacToeMain.showBoard();
        ticTacToeMain.selectLetter();

    }
}
