package Recursion;

public class Rp7 {
    /**
     * Написать рекурсивный метод, сравнивающий массив строк на равенство (что все строки равны) и возвращающий true или false.
     */
    public static void main(String[] args) {
        String[] arr = {"dima", "misha"};
        String[] arrNew = {"dima", "miha"};
        System.out.println(quality(arr, arrNew, 0, 0));
    }

    public static boolean quality(String[] arr, String[] arrNew, int indexArr, int indexNewArr) {
        if (indexArr < arr.length & indexNewArr < arrNew.length) {
            if (arr[indexArr].equals(arrNew[indexNewArr])) {
                quality(arr, arrNew, indexArr + 1, indexNewArr + 1);
            } else return false;
        }
        return true;
    }
}
