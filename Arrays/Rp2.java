package Arrays;

public class Rp2 {
    /**
     * Создать массив из случайных чисел, заполнить его случайными числами.Сделать так что бы минимальных значений
     * было как минимум 3. Найти последний встречный минимальный элемент.
     */
    public static void main(String[] args) {
        int arr[] = {1,54,223,-45,-45,-45};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
