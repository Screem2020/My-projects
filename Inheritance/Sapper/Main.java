package Inheritance.Sapper;

import java.util.ArrayDeque;
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
        int indexBomb = 0;
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
        search(coordinatesA, coordinatesB,0, field, indexBomb);

    }

    public static void search(int coordinatesA, int coordinatesB, int index, int[][] arr, int indexBomb) {
        ArrayDeque<Integer> cell = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == coordinatesA) {
                coordinatesA = arr[index][i];
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (j == coordinatesB) {
                    coordinatesB = arr[index][j];
                }
                cell.addLast(coordinatesA); //создание очереди
                cell.addLast(coordinatesB);
                while (cell.size() != 0) {
                    search(cell.poll(), cell.poll(), index, arr, indexBomb + 1);
                }
                if (coordinatesA != arr.length - 1) {
                    if (arr[coordinatesA - 1][j] == 0) {

                    }
                }
            }
        }
    }
}
