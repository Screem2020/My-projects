package Lamda_expressions.ex_10_Book_class;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Library {

    List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public List<Book> searchBook(IBook book, String key) {
        return bookList.stream().filter(b -> book.search(b, key)).toList();
    }
}
