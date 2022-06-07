package Streams.ex_10_RandomValue;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    // Сгенерировать через stream список из 10 случайных чисел в диапазоне от 2 до 12. Вывести его на консоль в одну строку.
    //После вывести на консоль из массива только числа, которые больше 5
    public static void main(String[] args) {
        IntStream ints = new Random().ints(10, 2, 12);
        //ints.forEach(System.out::println);
        ints.filter(a -> a > 5).forEach(System.out::println);
    }
}
