package Arrays;

import java.util.Arrays;

public class Rp5 {
    /**
     * Скопировать в новый массив только отрецательные числа из текущего одномерного массива
     */
    public static void main(String[] args) {
        int[] arr = {3, 5, -10, 3, 2, -4, -3};
        int neg = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                neg = arr[i];
                index++;
            }
        }
        System.out.println(neg);
        int currentIndex = 0;
        int[] newArr = new int [index];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArr[currentIndex] = arr[i];
                currentIndex++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
