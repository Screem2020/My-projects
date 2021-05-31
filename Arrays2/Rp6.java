package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Rp6 {
    /**
     * Создать массив из случаных чисел, заполнить его случайными значениями. Обмнять местами последний встречный
     * максимум и последний минимум
     */
    public static void main(String[] args) {
//       int[] arr = {1, 23, -22, 4, 90, 90, 2, -22, 66};
       int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
//        Random rnd = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt();
//        }
        int max = arr[0];
       int min = arr[0];
       int minIndex = 0;
       int maxIndex = 0;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] >= max) {
               max = arr[i];
               maxIndex = i;
           }
           if (arr[i] <= min) {
               min = arr[i];
               minIndex = i;
           }
        }
        System.out.println(minIndex);
        System.out.println(maxIndex);
        arr[minIndex] = max;
        arr[maxIndex] = min;
        System.out.println(Arrays.toString(arr));
    }
}
