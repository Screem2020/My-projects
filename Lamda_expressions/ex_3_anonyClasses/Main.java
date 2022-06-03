package Lamda_expressions.ex_3_anonyClasses;

import ArrayList.Rp3.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    //Создать функциональный интерфейс с методом
    //T apply(Book[] arr)
    //Создать два анонимных класса:
    //1. Метод возвращает отсортированный массив книг по алфавиту
    //2. Метод считывает с консоли нужного автора и возвращает список книг только этого автора
    @FunctionalInterface
    interface MyInterface<T> {
        T apply(Book[] arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] stirngs = {new Book("Dima"), new Book("Misha"),
                new Book("Misha"), new Book("Dima"), new Book("Misha")};
        MyInterface<Book[]> stringMyInterface = new MyInterface<>() {
            @Override
            public Book[] apply(Book[] arr) {
                Arrays.sort(arr, new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        if (o1.getNameBook().compareTo(o2.getNameBook()) > 0) {
                            return 1;
                        } else return -1;
                    }
                });
                return arr;
            }
        };
        MyInterface<Book[]> stringArr = arr -> {
            Arrays.sort(arr, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    if (o1.getNameBook().compareTo(o2.getNameBook()) > 0) {
                        return 1;
                    } else return -1;
                }
            });
            return arr;
        };

        MyInterface<Book[]> stringMyInterface1 = new MyInterface<>() {
            @Override
            public Book[] apply(Book[] arr) {
                String name = scanner.next();
                Book[] books = new Book[10];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < i; j++) {
                        if (arr[i].getNameBook().equalsIgnoreCase(name)) {
                            books[j] = arr[i];
                        }
                    }
                }
                return books;
            }
        };

        MyInterface<Book[]> booksList = arr -> {
            String name = scanner.next();
            Book[] booklist = new Book[10];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[i].getNameBook().equalsIgnoreCase(name)) {
                        booklist[j] = arr[i];
                    }
                }
            }
            return booklist;
        };


        Book[] apply1 = stringArr.apply(stirngs);
        System.out.println(Arrays.toString(apply1));
        System.out.println(Arrays.toString(stringMyInterface.apply(stirngs)));
        Book[] apply = stringMyInterface1.apply(stirngs);
        System.out.println(Arrays.toString(apply));

    }
}
