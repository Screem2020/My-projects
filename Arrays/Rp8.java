package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Rp8 {
    /**
     * Задан одномерный массив. Сформировать другой одномерный массив из отрицателльных чисел, расположенных
     * между первым встречным максимальным и первым встречным минимальным эелементами исходного массива
     */
    public static void main(String[] args) {
//        int[] arr = {-10, -1, -23, -76, -28, -54};
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
        System.out.println(Arrays.toString(arr));
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//        arr[i] = random.nextInt();
//        }
        int min = arr[0];
        int max = arr[0];
        int indexMin = 0;
        int indexMax = 0;
        int index = 0;
        int currentIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] >= min) {
                min = arr[i];
                indexMin = i;
            }
            index++;
        }
        System.out.println(indexMin);
        System.out.println(indexMax);

        int[] newArr = new int[index];

        for (int i = indexMax; i < arr.length; i++) {
            newArr[currentIndex] = arr[i];
            currentIndex++;
        }
        for (int i = 0; i >= indexMin; i++) {
            newArr[currentIndex] = arr[i];
            currentIndex++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
