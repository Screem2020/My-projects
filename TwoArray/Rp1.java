package TwoArray;

import java.util.Scanner;

public class Rp1 {

    /**
     * Создать двумерный массив чисел размером 5 строк на 3 столбца.
     * Заполнить массив случайными числами от 0 до 9 включительно и вывести на консоль в виде таблицы
     * - считать с консоли индесы двух строк. Заполнить строки двумерного массива под считанными индексами новым
     * набором случайных чисел в диапазоне от 10 до 20 и вывести весь массив на консоль, проверить, что эти две строки отличаются от прежних.
     * - найти сумму элементов во всем двумерном массиве и вывести ее на консоль.
     * - найти максимальный элемент во всем двумерном массиве и вывести его на консоль
     * - найти минимальный элемент во всем двумерном массиве и вывести его на консоль
     * - обменять местами максимальный элемент и минимальный, найденные ранее, и вывести заново массив на консоль для проверки
     */

    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("////////////////////////////////////////");
//        System.out.println("enter number to line");
//        int indexOne = scn.nextInt();
//        System.out.println("enter two number to line");
//        int indexTwo = scn.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[indexOne].length; j++) {
//                arr[indexOne][j] = (int)(Math.random() * 10) + 10;
//                for (int k = 0; k < arr[indexTwo].length; k++) {
//                    arr[indexTwo][j] = (int)(Math.random() * 10) + 10;
//                }
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);

        int index = 0;
        int max = 0;
        int maxIndex = arr[index][0];
        int minIndex = arr[index][0];
        int min = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxIndex = i;
                }
            }
        }
        int k;
        for (k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr[k][j]; j++) {
                if (arr[k][j] < min) {
                    min = arr[k][j];
                    minIndex = j;
                }
            }
        }
        System.out.println();
        arr[i][maxIndex] = min;
        arr[i][minIndex] = max;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        for (int f = 0; f < arr.length; f++) {
            for (int j = 0; j < arr[f].length; j++) {
                System.out.print(arr[f][j] + " ");
            }
            System.out.println();
        }
    }
}
