package Arrays2;

import java.util.Arrays;

public class Rp7 {
    /**
     * Если максимальный элемент массива больше суммы элементов массива, заменить его нулем, иначе удвоить
     */
    public static void main(String[] args) {
        int[] arr = {-23, 10, 10, -23, 10, -8};
        int max = arr[0];
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
            if (max > sum) {
                arr[maxIndex] = 0;
            } else arr[maxIndex] *= 2;
        System.out.println(sum);
        System.out.println(max);
        System.out.println(Arrays.toString(arr));
    }
}
