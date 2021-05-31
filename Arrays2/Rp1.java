package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Rp1 {
    /**
     * Увелчить в 2 раза элемент, расположенный непосредсвенно после первого встречного максимального элемента
     * массива.
     */
    public static void main(String[] args) {
//        int[] arr = {1, 28, -12, 99, 20};
        int[] arr = new int[10];
        Random rnd = new Random(10);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[indexMax + 1]) {
                arr[indexMax + 1] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
