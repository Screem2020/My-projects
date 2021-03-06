package Streams.ex_5_Random_value_min;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    // Сгенерировать коллекцию из 10 случайных чисел в диапазоне от 2 до 10. Вывести ее на консоль.
    // Сформировать из чисел, которые меньше 8 новую коллекцию и также вывести ее на консоль.
    public static void main(String[] args) {
        IntStream ints = new Random().ints(10, 2, 12);
        List<Integer> list = ints.boxed().collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println();
//        int[] ints1 = list.stream().filter(a -> a < 8).mapToInt(x->x).toArray();
        Integer[] ints1 = list.stream().filter(a -> a < 8).toArray(x->new Integer[x]);
        Arrays.stream(ints1).forEach(System.out::println);

    }
}
