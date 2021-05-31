package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Rp4 {
    /**
     * Поменять местами максимальный и первый отрецательный элементы массива
     */
    public static void main(String[] args) {
//        int[] arr = {23, 34,-19, 44, 89, -1, 4};
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
        System.out.println(Arrays.toString(arr));
//        Random rnd = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt();
//        }
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < 0) {
                count++;
                if (count == 1) {
                    min = arr[i];
                    minIndex = i;
                }
            }
        }
        arr[maxIndex] = min;
        arr[minIndex] = max;
        System.out.println(min);
        System.out.println(max);
        System.out.println(Arrays.toString(arr));
    }
}
