package Thread.ex_2_Rome_numerals;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //оздайте программу конвертации римских чисел в арабские.
    //
    //К примеру
    //XXX - 30
    //XXXI - 31
    //IXXX - 29
    //Таблица римских чисел: https://math-prosto.ru/images/polesno/rome_numbers.jpg
    //
    //Используя программу для конвертации римских чисел, сделайте так, чтобы юзер мог вводить через пробел за один раз
    // много римских чисел и каждое из них конвертировалось в арабское число в отдельном потоке.
    //Например:
    //Введите числа: XXX XXXI IXXX
    //Результат:
    //XXX - 30
    //XXXI - 31
    //IXXX - 29
    public static void main(String[] args) throws InterruptedException {
        Thread run1 = new Thread(new nummerlasRome("run1"));
        run1.start();
        run1.join();
        Thread run2 = new Thread(new nummerlasRome("run2"));
        run2.start();
        run2.join();
        Thread run3 = new Thread(new nummerlasRome("run3"));
        run3.start();
        run3.join();
//        new Thread(() -> {}).start();
    }

    @AllArgsConstructor
    @Data
    static class nummerlasRome implements Runnable {
        private String nameThread;

        @Override
        public void run() {
            Scanner scn = new Scanner(System.in);
            String num = scn.next();
            String[] split = num.split("");
            List<Integer> integers = new ArrayList<>();
            for (String s : split) {
                int numerlasParse = Numerlas.romeNumerlasParse(s);
                integers.add(numerlasParse);
            }
            //алгоритм двоичного поиска
            //сортировка по 2 спискам, в одном X,V,L,C... в другом I
            int sum = integers.stream()
                    .mapToInt(a -> a)
                    .sum();
            if ((split[0].startsWith("I"))) {
                int startNum = integers.stream().findFirst().get();
                sum -= startNum + 1; // кастыль
                System.out.println("-" + " " + sum + " ");
            } else System.out.println("-" + " " + sum + " ");
        }
    }
}
