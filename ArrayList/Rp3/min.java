package ArrayList.Rp3;

public class min {
    public static void main(String[] args) {
        Book book = new Book("root");
        Page page = new Page(11, "test");
        Page page2 = new Page(14, "test2");
        Page page3 = new Page(15, "test2");

        book.addPage(page);
        book.addPage(page2);
        book.addPage(page3);

        book.removeIndex(15);

        System.out.println(book);
    }
}
