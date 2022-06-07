package Streams.ex_1_book_streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Создать класс Book с полями: название, цена, количество продаж у книги
    //Создайте метод
    //public boolean isBestSeller() - возвращает true, если кол-во продаж у книги больше 1000.
    //
    //В мейне создайте список книг и заполните его любыми книгами.
    //
    //- выведите на консоль только те книги, чья цена меньше 50
    //- Выведите только книги-бестселлеры (не забудьте, что у вас уже готовый метод для проверки, что книга является бестселлером
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("name1", 100, 99));
        list.add(new Book("name2", 500, 800));
        list.add(new Book("name3", 10, 100));
        list.add(new Book("name4", 30, 1050));
        list.add(new Book("name5", 80, 1231));

        //price < 50
        List<Book> books = list.stream().filter(a -> a.getPrice() < 50).toList();
        System.out.println(books);

        //bestseller
        List<Book> books1 = list.stream().filter(Book::isBestSeller).toList();
        System.out.println(books1);
    }
}
