package Arrays2;

import java.util.Arrays;
import java.util.Random;

public class Rp5 {
    /**
     * Определить индексы элементов массива, меньших среднего. Результат получить в виде массива
     */
    public static void main(String[] args) {
//        int[] arr = {-1,-23, 4, 12, 33, -5};
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
        System.out.println(Arrays.toString(arr));
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt();
//        }
        int count = 0;
        int sum = 0;
        int ave;
        ave = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum += i;
            ave = sum / count;
        }
        int index = 0;
        int[] arr2 = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ave) {
                arr2[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(ave);
    }
}
