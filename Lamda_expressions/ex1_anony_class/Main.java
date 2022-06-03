package Lamda_expressions.ex1_anony_class;

import static java.lang.Math.sqrt;

public class Main {
    //Создать функциональный интерфейс с методом
    //double apply (double val)
    //Создать два анонимных класса на основе этого метода
    //1. Метод apply будет вычислять доход работника за вычетом налогов
    //2. Метод apply будет извлекать квадратный корень из числа val
    public static void main(String[] args) {
        FuncInter calculations = new FuncInter() {
            @Override
            public double apply(double val) {
                return val - (val * (13.0 / 100.0));
            }
        };
        FuncInter calc = a -> a - (a * (13.0 / 100.0));
        FuncInter calculations1 = new FuncInter() {
            @Override
            public double apply(double val) {
                return sqrt(val);
            }
        };
        FuncInter calc1 = Math::sqrt;

        System.out.println(calculations.apply(5000));
        System.out.println(calc.apply(5000));

    }
}
