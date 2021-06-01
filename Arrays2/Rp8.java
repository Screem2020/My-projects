package Arrays2;

import java.util.Arrays;

public class Rp8 {
    /**
     * в одном массиве увеличить максимальные элементы на их порядковые номера
     */
    public static void main(String[] args) {
        int[] arr = {2, 12, 99, 1, 99, 54, 99};
        int max = arr[0];
        int indexMax = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                index = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                indexMax++;
                max += indexMax;
                arr[i] = max;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}