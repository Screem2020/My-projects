package ArrayList.Rp3;

public class Main {
    public static void main(String[] args) {

        Book list = new Book("Google");

        list.addPage(new Page(12, "Google"));
        list.addPage(new Page(15, "Gogle"));
        list.addPage(new Page(1, "Gogle"));
        list.removePage(1);
        System.out.println(list);
    }
}
