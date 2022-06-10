package Streams.ex_4_GenerateValueSort;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    //Сгенерировать массив из 10 случайных чисел в диапазоне от 2 до 12. Вывести его на консоль через stream.
    // После этого новым потоком найти сумму всех элементов, которые больше 5
    public static void main(String[] args) {
        IntStream ints = new Random().ints(10, 2, 12);
        List<Integer> collect = ints.boxed().collect(Collectors.toList());
        System.out.println(collect);
        int sum = collect.stream().filter(a -> a > 5).mapToInt(d -> d).sum();
        System.out.println(sum);
    }
}
