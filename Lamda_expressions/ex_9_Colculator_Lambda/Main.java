package Lamda_expressions.ex_9_Colculator_Lambda;

public class Main {
    // Создайте функциональный интерфейс с методом
    //interface MyExecutor {
    //    double calc(double a, double b);
    //}
    //
    //Создайте класс Calculator с базовыми действиями: сложение и вычитание двух чисел,
    // а также с третьей функцией, которую пользователь определяет сам через лямбда выражение
    //
    //class Calculator {
    //    public double sum(double a, double b) {
    //        return a + b;
    //    }
    //    public double minus(double a, double b) {
    //        return a + b;
    //    }
    //
    //    public double calc(MyExecutor myExecutor, double a, double b){
    //       //////
    //    }
    //}
    //
    //В мейне создайте лямбда выражения:
    //1. метод calc принимает два числа, возвращает результат их умножения
    //2. метод calc принимает два числа, возвращает результат их деления
    //Создайте объект калькулятора и выполните действия сложения, вычитания, умножения и деления
    //
    //Подсказка, для создания лямбды на основе двух параметров, их обязательно нужно указать в скобках
    //Пример:
    //interface SomeInterface{
    //   double test(int a, double b);
    //}
    //Main:
    //SomeInterface exec = (a,b)-> a+b;
    public static void main(String[] args) {
        double a = 5.0;
        double b = 6.0;
        //TODO: требует статический метод
        Calculator.CalculatorMethod calcMethod = new Calculator.CalculatorMethod();
        //sum
        System.out.println(calcMethod.sum(a, b));
        //minus
        System.out.println(calcMethod.minus(a, b));
        //multiplication
        System.out.println(calcMethod.calc((a1,b1) -> a1 * b1, a, b));
        //division
        System.out.println(calcMethod.calc((a1,b1) -> a1 / b1, a, b));

    }
}
