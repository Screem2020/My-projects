package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Rp2 {
    /**
     * В одномерном массиве все элементы, расположенные после максимального, заменить средним значением элементов массива.
     */
    public static void main(String[] args) {
//        int[] arr = {12, 100, 3, 44, 76};
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
//        Random rnd = new Random(10);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt();
//        }
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        int average = 0;
        int indexAve = 0;
        for (int i = indexMax; i < arr.length; i++) {
            indexAve++;
            average += arr[i] / indexAve;
        }
        for (int i = indexMax + 1; i < arr.length; i++) {
            arr[i] = average;
        }
        System.out.println(average);
        System.out.println(Arrays.toString(arr));
    }
}
