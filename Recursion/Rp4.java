package Recursion;

public class Rp4 {
    /**
     * Написать метод, который рекурсивно ищет максимальное число в массиве. Метод принимает массив и возвращает
     * максимальное число из массива.
     */
    public static void main(String[] args) {
        int[] arr = {3, 4, 23, 11, -2};
        System.out.println(max(arr, 0, 0));
    }

    public static int max(int arr[], int index, int max) {
        if (index >= arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return max(arr, index + 1, max);
    }
}