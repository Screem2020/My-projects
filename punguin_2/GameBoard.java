package punguin_2;

import java.util.Scanner;

public class GameBoard {

    private final int[][] gameBoard;
    private int direction;
    private Scanner scn = new Scanner(System.in);

    public GameBoard() {

        System.out.println("Введите размеры поля");
        System.out.print("width = ");
        int width = scn.nextInt();
        System.out.print("height = ");
        int height = scn.nextInt();
        this.gameBoard = new int[width][height];
        for (int i = 0; i < gameBoard.length; i++) { //строка
            for (int j = 0; j < gameBoard.length; j++) { // столбец
                gameBoard[i][j] = (int) ((Math.random() * 11)) - 1;
            }
        }
    }

    public void startGame() {

    }

    public String getBoardSymbol(int value) {
        if (value > 0) {
            return ("|" + value + "|");
        } else if (value == 0) {
            return String.valueOf(Symbol.EMPTY);
        } else if (value == -1) {
            return String.valueOf(Symbol.WATER);
        } else {
            throw new RuntimeException("Invalid value = " + value + ". Board value must from -1 to 9");
        }
    }

    public String getPenguinSymbol(int direction) {
        if (direction == 0) {
            return String.valueOf(SymbolPenguin.PENGUIN_RIGHT);
        } else if (direction == 1) {
            return String.valueOf(SymbolPenguin.PENGUIN_BOTTOM);
        } else if (direction == 2) {
            return String.valueOf(SymbolPenguin.PENGUIN_LEFT);
        } else if (direction == 3) {
            return String.valueOf(SymbolPenguin.PENGUIN_TOP);
        } else {
            throw new RuntimeException("Invalid penguin direction value = " + direction + ". Direction value must be from 0 to 3");
        }
    }

    public void print() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                System.out.print(getBoardSymbol(gameBoard[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    public void stepPenguin() {
        while (true) {
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard.length; j++) {
                    if (this.direction == 1) {

                    }

                }
                System.out.println(getPenguinSymbol(scn.nextInt()));
            }
        }
    }
}
