package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Rp6 {
    /**
     * Создать массив из случайных чисел, заполнить его случайными значениями. Обменять местами последний встречный
     * максимум и последний минимум.
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) -10;
        }
        System.out.println(Arrays.toString(arr));
//        Scanner scan  = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }
//        int[] arr = {3, 4, 34, -2, -12, 34};
        int min = arr[0];
        int max = arr[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min){
                min = arr[i];
                indexMin = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= max){
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
        arr[indexMax] = min;
        arr[indexMin] = max;
        System.out.println(Arrays.toString(arr));
    }
}
