package ArrayList.Rp1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        MyArrayList arr = new MyArrayList();

        Rectangle arr2 = new Rectangle(12, 32);
        Rectangle arr3 = new Rectangle(123, 1322);

        arr.add(arr2);
        arr.add(arr3);
        System.out.println(arr);
        arr.remove(arr2);
        System.out.println(arr);
    }
}
