package Arrays2;

import java.util.Arrays;

public class Rp3 {
    /**
     * Первый отрецательный элемент массива замаенить суммой эллементов, расположенных после максимального
     */
    public static void main(String[] args) {
        int[] arr = {1, -3 ,33, 78, 12, 32, 11};
        int max = arr[0];
        int min = arr[0];
        int indexMax = 0;
        int indexMin = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[indexMax]) {
                sum += arr[i];
            }
//            if (arr[i] == arr[indexMin]) {
//                arr[i] = sum;
//            }
        }
        for (int i = indexMin; i < arr.length; i++) {
            arr[i] = sum;
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }
}
