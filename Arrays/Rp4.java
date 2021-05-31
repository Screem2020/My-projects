package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Rp4 {
    /**
     *  Создать массив случайных чисел, заполнить его случайными числами. Сделать так что бы было несколько минимумов
     *  и максисмумов. Обменять местами первый встерчный максимальный и последний минимальные эелементы.
     */
    public static void main(String[] args) {
//        int[] arr = {2, -4, -4, 5, 6, 78, 78};
        int[] arr = new int[10];
        //        Random rnd = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt();
//        }
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        int count = 0;
        int indexCount = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max)
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                count++;
            if (count == 1) {
                secondMax = arr[i];
                indexCount = i;
            }
        }
        System.out.println(secondMax);
        arr[indexCount] = min;
        arr[minIndex] = max;
        System.out.println(Arrays.toString(arr));
    }
}