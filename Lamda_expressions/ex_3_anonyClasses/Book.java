package Lamda_expressions.ex_3_anonyClasses;

import lombok.Getter;

public class Book {
    @Getter
    private String author;

    public Book(String author) {
        this.author = author;
    }
}
