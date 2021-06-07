package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Rp12 {
    /**
     * В массиве, заполненном на половину, продублировать все элементы с сохранением  порядка следования
     */
    public static void main(String[] args) {
        int[] arr = new int[20];
//        Random rnd = new Random();
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
//            arr[i] = rnd.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int index = 0;
        int firstIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
