package Stream_2.ex_3_Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@ToString
@Getter
@AllArgsConstructor
public class Book {
    private int price;
    private String name;
    private String author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price || Objects.equals(name, book.name) || Objects.equals(author, book.author);
    }
}
