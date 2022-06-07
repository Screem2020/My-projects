package Streams.ex_7_Book;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Создать класс Book с полями имя автора и название книги. В мейне создать список или массив книг.
    // Пользователь вводит с консоли имя автора, программа должна с помощью stream получить список его книг.
    // После получения списка вывести его на консоль.
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("name1", "misha"));
        list.add(new Book("name2", "misha"));
        list.add(new Book("name3", "misha"));
        list.add(new Book("name4", "dima"));
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        List<Book> collect = list.stream()
                .filter(a -> a.author.equalsIgnoreCase(name))
                .toList();
        collect.forEach(System.out::println);
    }
    @ToString
    @AllArgsConstructor
    static
    class Book {
        private String name;
        private String author;
    }
}
