package Arrays;

import java.util.Random;

public class Rp1 {
    /**
     * Создать массив из случайных чисел, заполнить его случайными значениями. Обменять местами первый встречный
     * максимальный и преывый встерчиый мнимальный эелементы.
     */
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
        arr[i] = rnd.nextInt();
        }
        System.out.println(java.util.Arrays.toString(arr));
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            min = arr[0];
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
        int temp = max;
        max = min;
        min = temp;
        System.out.println(max);
        System.out.println(min);
    }
}
