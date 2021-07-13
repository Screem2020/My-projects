package Recursion;


public class Rp1 {
    /**
     * Рекурсивно найти сумму только четных чисел из массива
     */
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 77, 11};
        System.out.println(rec(arr, 0));
    }

    public static int rec(int[] arr, int n) {
        if (n < arr.length) {
            if (arr[n] % 2 == 0) {
                return rec(arr, n + 1) + arr[n];
            } else {
                return rec(arr, n + 1);
            }
        }
        return 0;
    }
}
