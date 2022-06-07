package Streams.ex_12_BookClass;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Создать класс Book с полями название книги и цена.
    //В мейне создать массив или список книг и заполнить его значениями.
    //С помощью одного stream найти самую дорогую книгу с помощью метода max и сохранить ее в переменную.
    // После нахождения вывести информацию о ней на консоль из переменной.
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("name", 100));
        list.add(new Book("name1", 500));
        list.add(new Book("name2", 1000));
        list.add(new Book("name3", 50));
        Book book = list.stream().max((o1, o2) -> {
            if (o1.price > o2.price) {
                return o1.price;
            }
            return 0;
        }).get();
        System.out.println(book);
    }

    @AllArgsConstructor
    @ToString
    static
    class Book {
        private String name;
        private int price;
    }
}
