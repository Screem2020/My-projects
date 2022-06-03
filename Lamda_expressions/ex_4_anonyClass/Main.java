package Lamda_expressions.ex_4_anonyClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {
    //T apply(Book[] arr)
    //1. Метод возвращает отсортированный массив книг по алфавиту
    //2. Метод считывает с консоли нужного автора и возвращает список
    // книг только этого автора
    //Заменить тип параметра на T, а тип вовзращаемого значения на R
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Book> list = new ArrayList<>();
        list.add(new Book("Misha")); //TODO: как можно автоматизировать процесс создания обьектов
        list.add(new Book("Dima"));
        list.add(new Book("Ivan"));
        list.add(new Book("Misha"));
        System.out.println(list);
        // анонимный класс
        BoolIntr<List<Book>, List<Book>> boolIntr = new BoolIntr<>() {
            @Override
            public List<Book> apply(List<Book> books) {
                books.sort(comparing(Book::getAuthor));
                return books;
            }
        };
        //lambda expressions
        BoolIntr<List<Book>, List<Book>> boolIntr1 = bookList -> {
            bookList.sort(comparing(Book::getAuthor));
            return bookList;
        };
        //анонимный класс
        BoolIntr<List<Book>, List<Book>> bookList = new BoolIntr<>() {
            //не могу вывести на экран
            final String name = scn.next();
            @Override
            public List<Book> apply(List<Book> list) {
                return list.stream().filter(a -> a.getAuthor().equalsIgnoreCase(name)).collect(Collectors.toList());
            }
        };
        //lambda expressions
        BoolIntr<List<Book>, List<Book>> booksInter = b -> {
            System.out.println("Enter name");
            String name = scn.next();
            return list.stream().filter(a -> a.getAuthor().equalsIgnoreCase(name)).collect(Collectors.toList());
        };

        List<Book> apply1 = boolIntr1.apply(list);
        System.out.println(apply1);
        List<Book> apply = boolIntr.apply(list);
        System.out.println(apply);
        System.out.println("------------------------------");
        List<Book> apply2 = booksInter.apply(list);
        System.out.println(apply2);
        List<Book> apply3 = bookList.apply(list);
        System.out.println(apply3);

    }
}
