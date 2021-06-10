package ArrayList.Rp1r;

public class Main {
    public static void main(String[] args) {

        List1 arr = new List1();

        Rectangle rect = new Rectangle(12,37);
        Rectangle pos = new Rectangle(11,3);
        Rectangle neg2 = new Rectangle(2,14);
        Rectangle neg3 = new Rectangle(2,14);
        Rectangle neg4 = new Rectangle(2,14);
        Rectangle neg5 = new Rectangle(2,14);
        Rectangle neg6 = new Rectangle(2,14);
        Rectangle neg7 = new Rectangle(2,14);
        Rectangle neg8 = new Rectangle(2,14);
        Rectangle neg = new Rectangle(2,14);
        Rectangle neg9 = new Rectangle(2,14);
        Rectangle neg10 = new Rectangle(2,14);
        Rectangle neg11 = new Rectangle(2,14);

        arr.add(new Rectangle(12,37));
        arr.add(pos);
        arr.add(neg);
        arr.add(neg2);
        arr.add(neg3);
        arr.add(neg4);
        arr.add(neg5);
        arr.add(neg6);
        arr.add(neg7);
        arr.add(neg8);
        arr.add(neg9);
        arr.add(neg10);
        arr.add(neg11);

        int size = arr.size();

        boolean remove = arr.remove(rect);
        System.out.println(remove);
        System.out.println(size);
        System.out.println(arr);
    }
}