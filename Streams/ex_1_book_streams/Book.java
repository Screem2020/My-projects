package Streams.ex_1_book_streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@ToString
public class Book {
    private String name;
    private int price;
    private int count;

    public boolean isBestSeller() {
        return Book.this.count > 1000;
    }
}
