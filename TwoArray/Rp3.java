package TwoArray;

import java.util.Scanner;

public class Rp3 {
    /**
     * 3. Создать двумерный массив 2 на 3. Проинициализировать его случайными числами от 1 до 10. Вывести двумерный
     * массив на консоль в виде таблицы. При выводе нужно использовать динамическое условие в цикле.
     * Пользователь вводит с коносли индекс строки n, нужно вывести ее на консоль с помощью цикла по одномерному массива.
     * (двумерный массив является набором одномерных массивов)
     * - найти максимальный элемент в этой строке и вывести его на консоль
     * - найти сумму элементов в этой строке и вывести ее на консоль
     * - найти минимальный элемент в этой строке и вывести его на консоль
     * - обменять местами максимальный элемент и минимальный в этой строке и вывести заново строку на консоль
     */
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int indexMax = 0;
        int indexMin = 0;
        int max = arr[0][0];
        int min = arr[0][0];
        System.out.println("Введите индекс строки");
        int index = scn.nextInt();
        for (int i = 0; i < arr[index].length; i++) {
            System.out.print(arr[index][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr[index].length; i++) {
            if (arr[index][i] > max) {
                max = arr[index][i];
                indexMax = i;
            }
            if (arr[index][i] < min) {
                min = arr[index][min];
                indexMin = i;
            }
        }
        System.out.println();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println();
        arr[index][indexMax] = min;
        arr[index][indexMin] = max;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}