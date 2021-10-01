package com.bl.game;

import java.util.*;

public class TicTacToeMain {
    /**
     * declare 1d array of char type
     */
    static char[] gameBoard = new char[10];

    public static char Computerletter;
    public static char Playerletter;
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
                Playerletter = 'X';
                Computerletter = 'O';
                System.out.println("\nPlayer letter -> " + Playerletter);
                System.out.println("Computer letter -> " + Computerletter);
                flag = 1;
            } else if (choice == 2) {
                Playerletter = 'O';
                Computerletter = 'X';
                System.out.println("\nPlayer letter -> " + Playerletter);
                System.out.println("Computer letter -> " + Computerletter);
                flag = 2;
            } else {
                System.out.println("\n>>>>>>> plz enter 1 or 2 <<<<<<<<<");
            }
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        TicTacToeMain ticTacToeMain = new TicTacToeMain();

        System.out.println("#####################################\n      Welcome 2 TicTacToe Game\n#####################################\n");

        ticTacToeMain.createGameBoard();
        ticTacToeMain.selectLetter();
    }
}
