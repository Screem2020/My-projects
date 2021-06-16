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

    public void removeIndex(int index) {
        for (int i = 0; i < size(); i++) {
            if (list[i] == list[index]) {
                list[i] = list[i + 1];
                list[i] = null;
            }
        }
        currentIndex--;
    }

    public void removePage(Page page) {
        for (int i = 0; i < size(); i++) {
            if (list[i].equals(page)) {
                list[i] = list[i + 1];
                list[i] = null;
            }
        }
        currentIndex--;
    }

    public String getPageText(int number) {
        for (int i = 0; i < size(); i++) {
            if (list[i].getNumPage() == number) {
                System.out.println(list[i].getText());
            }
        }
        return "";
    }

    public int getPageCount() {
        return this.currentIndex;
    }

    public int size() {
        return this.currentIndex;
    }

    public int getCurrentIndex(Page page) {
        return this.currentIndex;
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
