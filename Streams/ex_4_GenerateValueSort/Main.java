package Streams.ex_4_GenerateValueSort;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    //Сгенерировать массив из 10 случайных чисел в диапазоне от 2 до 12. Вывести его на консоль через stream.
    // После этого новым потоком найти сумму всех элементов, которые больше 5
    public static void main(String[] args) {
        IntStream ints = new Random().ints(10, 2, 12);
        //Arrays.stream(ints.toArray()).forEach(System.out::println);
        System.out.println(ints.filter(a -> a > 5).sum());
    }
}
