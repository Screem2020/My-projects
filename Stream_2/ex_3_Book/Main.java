package Stream_2.ex_3_Book;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    // Создать класс Book с полями цена, название, автор.
    //Создать класс Library со списком книг.
    //Заполнить список значениями.
    //
    //В мейне создать консольное меню:
    //1. Вывести все книги из библиотеки (выводится полная информация)
    //2. Вывести все книги одного автора (пользователь вводит автора с консоли)
    //3. Найти самую дорогую книгу и вывести информацию о ней на консоль
    //4. Вывести книги, чья цена не дороже 100
    //5. Выход
    //
    //Все пункты меню должны выполняться с использованием stream.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Library library = new Library();
        List<Book> listBook = library.getListBook();
        listBook.add(new Book(50, "name", "misha"));
        listBook.add(new Book(300, "name1", "misha"));
        listBook.add(new Book(400, "name2", "dima"));
        listBook.add(new Book(500, "name3", "dima"));
        int input = 0;
        while (input != 5) {
            System.out.println("""
                    1. Вывести все книги из библиотеки (выводится полная информация)
                    2. Вывести все книги одного автора (пользователь вводит автора с консоли)
                    3. Найти самую дорогую книгу и вывести информацию о ней на консоль
                    4. Вывести книги, чья цена не дороже 100
                    5. Выход
                    """);
            input = scn.nextInt();
            if (input == 1) {
                listBook.forEach(System.out::println);
            }
            if (input == 2) {
                String name = scn.next();
                List<Book> books = listBook.stream()
                        .filter(a -> a.getAuthor().equalsIgnoreCase(name)).toList();
                books.forEach(System.out::println);
            }
            if (input == 3) {
                Optional<Book> max = listBook.stream().max(Comparator.comparingInt(Book::getPrice));
                max.ifPresent(System.out::println);
            }
            if (input == 4) {
                List<Book> books = listBook.stream()
                        .filter(a -> a.getPrice() < 100).toList();
                books.forEach(System.out::println);
            }
        }
    }
}
