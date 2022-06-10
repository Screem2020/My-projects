package Stream_2.ex_1_Two_array;

import java.util.Arrays;

public class Main {
    //Создать любым способом двумерный массив целых чисел, с помощью stream вывести на консоль все его элементы
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 3, 4},
                {4, 5, 7}
        };
        Arrays.stream(arr).flatMapToInt(Arrays::stream).forEach(System.out::println);
        //Arrays.stream(arr).flatMapToInt(arr -> Arrays.stream(arr)).forEach(System.out::println);


    }
}
