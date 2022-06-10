package Streams.ex_3_Generate_value;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    //Сгенерировать массив из 10 случайных чисел в диапазоне от 2 до 12. Вывести его на консоль через stream.
    // После этого новым потоком найти сумму всех элементов через stream
    public static void main(String[] args) {
        IntStream ints = new Random().ints(10, 2, 12);
        // после использования forEach поток закрывается
        List<Integer> collect = ints.boxed().toList();
        collect.forEach(System.out::println);
        int sum = collect.stream().mapToInt(a -> a).sum();
        System.out.println(sum);
    }
}
