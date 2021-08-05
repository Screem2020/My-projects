package Inheritance.Sapper;

import java.util.Scanner;

public class Main {
    /**
     * При старте игры должно отрисовываться игровое поле.
     * Программа должна запросить у юзера координаты ячейки. После ввода должен запуститься рекурсивный процесс поиска соседних открытых ячеек.
     * В тупиковых ячейках (окруженных минами) должна проставляться цифры - количество мин вокруг.
     * Если юзер вводит координаты бомбы, программа должна завершаться с текстом GAME OVER
     */
    public static void main(String[] args) {
        int[][] field = new int[3][4];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = (int) (Math.random() * 2);
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter coordinates A");
        int coordinatesA = scn.nextInt();
        System.out.println("Enter coordinates B");
        int coordinatesB = scn.nextInt();
        opened(coordinatesA, coordinatesB, 0, field);
        if (field[coordinatesA][coordinatesB] != 0) {
            System.out.println("game over");
        } else opened(coordinatesA, coordinatesB, +1, field);
    }

    /*public static void search(int coordinatesA, int coordinatesB, int index, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == coordinatesA) {
                coordinatesA = arr[index][i];
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (j == coordinatesB) {
                    coordinatesB = arr[index][j];
                }
            }
        }
    }*/

    public static void opened(int cellA, int cellB, int indexBomb, int[][] arr) {
        if (arr.length >= cellA & arr.length >= cellB & arr[cellA][cellB] >= 0) {
            if (arr[cellA][cellB] != 1) {
                opened(cellA - 1, cellB, indexBomb, arr);
            } else if (arr[cellA - 1][cellB] != 1) {
                opened(cellA, cellB - 1, indexBomb, arr);
            } else if (arr[cellA][cellB - 1] != 1) {
                opened(cellA + 1, cellB, indexBomb, arr);
            } else if (arr[cellA + 1][cellB] != 1) {
                opened(cellA, cellB + 1, indexBomb, arr);
            } else if (arr[cellA][cellB + 1] != 1) {
                System.out.println(indexBomb);
            } else System.out.println("не верные координаты");
        }
    }
}
