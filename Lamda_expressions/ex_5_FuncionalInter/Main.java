package Lamda_expressions.ex_5_FuncionalInter;

import Lamda_expressions.ex_4_anonyClass.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {
    //Выполнить эти же задачи с функциональным интерфейсом Function<T,R> (это встроенный в Java интерфейс)
    //1. Метод возвращает отсортированный массив книг по алфавиту
    //2. Метод считывает с консоли нужного автора и возвращает список
    // книг только этого автора
    //Заменить тип параметра на T, а тип вовзращаемого значения на R
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Misha"));
        list.add(new Book("Dima"));
        list.add(new Book("Ivan"));
        list.add(new Book("Igor"));
        System.out.println(list);

        //anonymous class
        Function<List<Book>, List<Book>> bookInter = new Function<>() {
            @Override
            public List<Book> apply(List<Book> books) {
                books.sort(comparing(Book::getAuthor));
                return books;
            }
        };

        // lambda expressions
        Function<List<Book>, List<Book>> bookInter1 = books -> {
            books.sort(comparing(Book::getAuthor));
            return books;
        };
        //anonymous class
        Function<List<Book>, List<Book>> bookListSearch = new Function<>() {
            @Override
            public List<Book> apply(List<Book> books) {
                System.out.println("Enter name");
                String name  = scn.next();
                return books.stream()
                        .filter(a -> a.getAuthor().equalsIgnoreCase(name))
                        .collect(Collectors.toList());
            }
        };
//        String name = scn.next();
//        List<Book> collect = list.stream()
//                  .filter(a -> a.getAuthor().equalsIgnoreCase(name))
//                  .toList();
//        System.out.println(collect);


        // lambda expressions
        Function<List<Book>, List<Book>> bookListSearch1 = bookList -> {
            System.out.println("Enter name");
            String name = scn.next();
            return bookList.stream()
                    .filter(a -> a.getAuthor().equalsIgnoreCase(name))
                    .collect(Collectors.toList());
        };


        List<Book> apply = bookInter.apply(list);
        System.out.println(apply);
        List<Book> apply1 = bookInter1.apply(list);
        System.out.println(apply1);
        System.out.println("-------------------------------");
        List<Book> apply2 = bookListSearch.apply(list);
        System.out.println(apply2);
        List<Book> apply3 = bookListSearch1.apply(list);
        System.out.println(apply3);
    }
}
