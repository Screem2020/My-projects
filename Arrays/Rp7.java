package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Rp7 {
    /**
     * В одномерном массиве найти сумму элементов, расположенных до первого встречного максимального эелмента
     * массива
     */
    public static void main(String[] args) {
        //int[] arr = {3, 5, 99, 10, 99, 1, 67};
//        int[] arr = new int[10];
//        Random rnd = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt();
//        }
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                 max += arr[i];
                 indexMax = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(indexMax);
    }
}
