package Lamda_expressions.ex_7_Predicate_Class;

import java.util.function.Predicate;

public class Main {
    //Выполнить эти же задачи с функциональным интерфейсом Predicate<T> (встроенный в java интерфейс)
    //Создать два анонимных класса на оснвое интерфейса
    //1. метод test проверяет, что число val является четным
    //2. метод test проверяет, что число val находится в диапазоне от 0 до 100 и выводит ok, иначе выводит not ok
    public static void main(String[] args) {
        //anonymous class
        Predicate<Integer> evenVal = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        //lambda class
        Predicate<Double> evenVal1 = val -> val % 2 == 0;

        //anonymous class
        Predicate<Integer> rangeVal = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 0 && integer <= 100;
            }
        };

        //lambda class
        Predicate<Double> rangeVal1 = val -> val >= 0 && val <= 100;

        System.out.println(evenVal.test(3));
        System.out.println(evenVal1.test(4.0));
        System.out.println("------------------------");
        System.out.println(rangeVal.test(101));
        System.out.println(rangeVal1.test(0.0));
    }
}
