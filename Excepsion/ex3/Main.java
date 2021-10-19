package Excepsion.ex3;


//Напишите метод, который принимает String и возвращает true,
// если первый и последний символ строки совпадают.
//Пример
//привет -> false, так как п и т разные буквы
//азбука -> true, так как первая и последняя буква совпадают.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println("Введите текст");
        System.out.println(self(text));
    }

    public static boolean self(String text) {
        char c = text.charAt(0);
        char c1 = text.charAt(text.length() - 1);
        if (c == c1) {
            return true;
        }
        return false;
    }
}
