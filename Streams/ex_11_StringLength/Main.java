package Streams.ex_11_StringLength;

import java.util.ArrayList;

public class Main {
    // В списке строк найти самую длинную строку
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Name");
        list.add("surname");
        list.add("phone");
        list.add("card");

        System.out.println(list.stream()
                .map(String::length)
                .max(Integer::compareTo)
                .get());
    }
}
