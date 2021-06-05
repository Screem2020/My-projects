package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Rp10 {
    /**
     * Задан массив В. Максимальный элемент заменить суммой элементов массива, расположенных до него
     */
    public static void main(String[] args) {
//        int[] arr = {2, 23, 19, 22, 4, 7, 88, 11};
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
//        Random rnd = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt();
//        }
        int max = arr[0];
        int indexMax = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < indexMax - 1; i++) {
            if (arr[i] < arr[indexMax]) {
                sum += arr[i];
            }
        }
        arr[indexMax] = sum;
        System.out.println(Arrays.toString(arr));
        System.out.println(indexMax);
        System.out.println(max);
        System.out.println(sum);
    }
}
