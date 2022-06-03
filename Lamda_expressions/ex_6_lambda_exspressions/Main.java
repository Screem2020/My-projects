package Lamda_expressions.ex_6_lambda_exspressions;

public class Main {
    //Создать интерфейс с функцией
    //boolean test(double val)
    //Создать два анонимных класса на оснвое интерфейса
    //1. метод test проверяет, что число val является четным
    //2. метод test проверяет, что число val находится в диапазоне от 0 до 100 и выводит ok, иначе выводит not ok
    public static void main(String[] args) {
        //anonymous class
        Test test = new Test() {
            @Override
            public boolean test(double val) {
                return val % 2 == 0;
            }
        };

        //lambda expressions
        Test test2 = a -> a % 2 == 0;

        //anonymous class
        Test test1 = new Test() {
            @Override
            public boolean test(double val) {
                if (val <= 100 && val >= 0) {
                    System.out.println("ok");
                    return true;
                } else {
                    System.out.println("not ok");
                }
                return false;
            }
        };
        //lambda expressions
        Test test3 = a -> {
            if (a <= 100 && a >= 0) {
                System.out.println("ok");
                return true;
            } else System.out.println("not ok");
            return false;
        };


        System.out.println(test.test(6));
        System.out.println(test2.test(6));
        System.out.println("-----------------------");
        System.out.println(test1.test(100));
        System.out.println(test3.test(99));
    }
}
