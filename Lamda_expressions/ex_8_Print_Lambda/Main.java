package Lamda_expressions.ex_8_Print_Lambda;

public class Main {
    // Написать интерфейс, который будет содержать void метод print(val)
    //Реализовать анонимный класс на основе лямбды, который будет принимать значение и просто выводить на консоль
    //Здесь уже должна быть конечная операция, так как метод void и return делать он не может
    public static void main(String[] args) {
        Print print1 = System.out::println;
    }
}
