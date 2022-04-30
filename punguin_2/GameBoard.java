package punguin_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс описывает игровое поле
 */
public class GameBoard {

    private int[][] gameBoard;
    private Scanner scn = new Scanner(System.in);
    private int pinguinI = 0;
    private int pinguinJ = 0;
    private int direction = 0;
    private int backpack = 0;
    /**
     * отрисовка поля и заполенение
     */
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
        //gameBoard[0][0] = SymbolPenguin.PENGUIN_RIGHT.getName();
    }

    public int getPinguinI() {
        return pinguinI;
    }

    public int getPinguinJ() {
        return pinguinJ;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void startGame() {

    }


    /**
     * Метод создает дополнительные знаки отрисовки поля
     *
     * @param value числовое значение которому будет соответсвовать заданный знак
     * @return созданный знак под его номером
     */
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

    /**
     * Метод для распозвоания положения пингвина
     *
     * @return положение пингвина заданное игроком
     */
    public String getPenguinSymbol() {
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

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void print() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(" " + getPenguinSymbol() + "\t");
                }
//                else if (i > 0 && j > 0) {
//                    System.out.print(" " + getBoardSymbol(0) + "\t");
                //System.out.printf(getPenguinSymbol("%2d", direction));
                else {
                    System.out.print(getBoardSymbol(gameBoard[i][j]) + "\t");
                    //System.out.printf(getBoardSymbol("%2d", gameBoard[i][j]));
                }
            }
            System.out.println();
        }
    }

    /**
     * Делает шаг пингвином
     */
    public void stepPenguin() {
        // необходимо разпарсить число в чар и внести в массив
        // необходимо сохранять текущие координаты пингвина для дальнейшего продвижению по полю
        if (direction == 0) {
            gameBoard[pinguinI][pinguinJ + 1] = SymbolPenguin.PENGUIN_RIGHT.parseChar(9654);

        } else if (direction == 1) {

        }
        try {
            if (gameBoard[pinguinI][pinguinJ] < 0) {
                throw new Exception("Выход за пределы поля, измените направление движения");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void take() {
        if (backpack <= 10) {
            int i = gameBoard[pinguinI][pinguinJ];
            i -= 1;
            gameBoard[pinguinI][pinguinJ] = i;
            backpack += 1;
        } else throw new RuntimeException("Backpack is full");
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "gameBoard=" + Arrays.toString(gameBoard) +
                ", pinguinI=" + pinguinI +
                ", pinguinJ=" + pinguinJ +
                ", direction=" + direction +
                ", backpack=" + backpack +
                '}';
    }

    //        for (int i = 0; i < gameBoard.length; i++) {
//                for (int j = 0; j < gameBoard.length; j++) {
//
//                    if (direction == 0) {
//                        gameBoard[pinguinI][pinguinJ + 1] = SymbolPenguin.PENGUIN_RIGHT.getName();
//                        int i1 = gameBoard[pinguinI][pinguinJ + 1];
//
//                        return;
//
//                    } else if (direction == 1) {
//                        gameBoard[pinguinI + 1][pinguinJ] = SymbolPenguin.PENGUIN_BOTTOM.getName();
//                        return;
//                    } else if (direction == 2) {
//                        gameBoard[pinguinI - 1][pinguinJ] = SymbolPenguin.PENGUIN_LEFT.getName();
//                        return;
//                    } else if (direction == 3) {
//                        gameBoard[pinguinI][pinguinJ - 1] = SymbolPenguin.PENGUIN_TOP.getName();
//                        return;
//                    }
//                    gameBoard[0][0] = 0;
//                    if (gameBoard[i][j] < 0) {
//                        try {
//                            throw new Exception("Выход за пределы поля, измените направление движения");
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            //System.out.println(getPenguinSymbol());
//        }

}
