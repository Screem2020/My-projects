package Recursion;

public class Rp9 {
    /**
     *  Написать рекурсивный метод, который будет принимать массив в качестве параметра (вы можете добавлять дополнительные параметры методу)
     *  и выводить рекурсивно все его элементы на консоль. В методе нельзя использовать циклы.
     *  Можно сделать задачу более сложным путем: сделать так, чтобы данный метод выводил все элементы массива в одну строку
     *  и ставил перенос строки (ентер) в конце.
     */

    public static void main(String[] args) {
        int[] arr =  {3, 4, 6, 12};
        retMethod(arr, 0);
    }

    public static void retMethod(int[] arr, int index) {
        if (index < arr.length) {
        if (index >= 0) {
            if (index == arr.length - 1) {
                    System.out.print(arr[index] + " ");
                } else  System.out.print(arr[index] + ", ");
                retMethod(arr, index + 1);
            }
        }
        else System.out.println();
    }
}
