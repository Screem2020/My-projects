package Strings.ex3_Sum;

import java.util.Scanner;

public class Main {
    //Задача 3. Разработайте класс Sum, который при запуске будет складывать переданные в качестве аргументов
    // (это то, что мы делали через редактирование конфигурации запуска в выпадающем списке) целые числа и выводить их сумму на консоль.
    //Если с конфигурацией запуска возникнут проблемы, сделайте просто ввод с консоли.
    //
    //Примеры входных строк для программы:
    //Sum 1 2 3
    //Результат: 6
    //Sum 1 2 -3
    //Результат: 0
    //Sum "1 2 3"
    //Результат: 6
    //Sum "1 2" " 3"
    //Результат: 6
    //Sum " "
    //Результат: 0
    //Аргументы могут содержать:
    //цифры;
    //знаки + и -;
    //произвольныое количество пробелов
    //При выполнении задания можно считать, что для представления входных данных и промежуточных результатов достаточен тип int

    public static void main(String[] args) {
        Sum sum = new Sum();
        Scanner scn = new Scanner(System.in);
        while (true) {
            if (scn.hasNextInt()) {
                int a = scn.nextInt();
                int b = scn.nextInt();
                sum.sum_args(a, b);
                scn = new Scanner(System.in);
            }
            else {
                System.err.println("entered integer");
                scn = new Scanner(System.in);
            }
        }
    }
}
