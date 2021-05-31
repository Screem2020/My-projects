package Arrays;

import java.util.Random;

public class Rp3 {
    /**
     * Создать массив из случайных чисел, заполнить его случайными значениями. Сделать так что бы минимальных значений
     * было как минимум 3. Найти второй по счету минимальный эелемнет.
     */
    public static void main(String[] args) {
        int arr[] = {12, 44, -12, -22, -22, 11 ,-22};
        /*int arr[] = new int [10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }*/
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        int minSecondIndex = 0;
        int minSecond = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                count++;
            }
            if (count == 2) {
                minSecond = arr[i];
                minSecondIndex = i;
            }
        }
        System.out.println(minSecondIndex);// результат выводит 11
        System.out.println(minSecond);
    }
}