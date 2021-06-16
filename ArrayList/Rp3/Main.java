package ArrayList.Rp3;

public class Main {
    public static void main(String[] args) {

        Book list = new Book("Google");

        Page ar = new Page(12, "Google");
        list.addPage(ar); // 0 , 1 , 2
        list.addPage(new Page(15, "Gogle"));
        list.addPage(new Page(1, "Gogle"));
//        Page arr = new Page(2,"goo");
//        list.addPage(arr);
        list.getPageText(1);
//        int currentIndex = list.getCurrentIndex(ar);
////        list.removeIndex(0);
////        list.removePage(ar);
//        System.out.println(currentIndex);
//        System.out.println(list);
        int pageCount = list.getPageCount();
        System.out.println(pageCount);
    }
}
