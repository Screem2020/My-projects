package ArrayList.Rp3;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String nameBook;
    private Page[] list = new Page[10];
    private int currentIndex;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public void addPage(Page page) {
        this.list[currentIndex] = page;
        currentIndex++;
    }

    public void removePage(int index) {
        for (int i = index; i < list.length; i++) {
            list[i] = list[i + 1];
            //list[i + 1] = null;
        }
        currentIndex--;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", list=" + Arrays.toString(list) +
                '}';
    }
}
