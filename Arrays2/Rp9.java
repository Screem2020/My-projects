package Arrays2;

import java.util.Arrays;

public class Rp9 {
    /**
     * В одномерном массиве поменять местами соседние элементы, расположенные перед максимальным элементом
     */
    public static void main(String[] args) {
        int[] arr = {4, 23, 33, 11, 67, 1, -2, 22};
        int max =arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        int tmp = 0;
        for (int i = 0; i < indexMax - 1; i++) {
            if (arr[i] < arr[indexMax]) {
                tmp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
