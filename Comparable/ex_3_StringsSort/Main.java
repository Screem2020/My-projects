package Comparable.ex_3_StringsSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
//    Создайте текстовый файл с содержимым:
//    apple orange cherry
//    samsung acer macbook
//    java ruby python
//    netflix appletv amedia
//
//    В программе считайте этот файл построчно и сохраните эти строки и в список.
//    Выполните с этим списком три разных сортировки, результат каждой сортировки запишите в отдельный файл
//    (output1.txt, output2.txt, output3.txt)
//      1. отсортируйте строки в алфавитном порядке
//      2. отсортируйте строки в алфавитном порядке по одному слову, индекс которого юзер вводит с консоли
//      (например, если юзер ввел индекс 1, то строки будут сортироваться по словам: orange, acer, ruby, appletv)
//      3. отсортируйте эти строки по длине (по возрастанию)
//
//    Результат первой сортировки должен получиться таким:
//    apple orange cherry
//    java ruby python
//    netflix appletv amedia
//    samsung acer macbook
//
//    Результат второй сортировки должен получиться таким:
//    samsung acer macbook
//    netflix appletv amedia
//    apple orange cherry
//    java ruby python

    public static void main(String[] args) {

//        List<String> strings = loadSortList(); // сортировка по возрастанию длины строк
//        strings.sort(new SortNum3());
//        for (String s : strings) {
//            System.out.println(s);
//        }
//        saveSortList(strings);
//    }

//        List<String> strings = loadSortList(); // сортировка по алфавиту
//        strings.sort(new SortNum1());
//        for (String s : strings) {
//            System.out.println(s);
//        }
//        saveSortList(strings);
//    }

        Scanner sc = new Scanner(System.in);    //сортировка по индексу, сохраняется только один столбец
        List<String> strings = loadSortList();      //////////////////////////////////////////////////
        System.out.println("Entered string index");
        int index = sc.nextInt();

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(index);
            String replace = s.replace(",", " ");

            System.out.println(s);
//            String[] split = s.split(" ");
//            List<String> strings1 = new ArrayList<>();
//            strings1.add(split[0]);
//            strings1.add(split[1]);
//            strings1.add(split[2]);
//            System.out.println(strings1);
//            strings1.sort(new SortNum2());
        }

        for (String s1 : strings) {
            System.out.println(s1);
        }
        saveSortList(strings);
    }

    public static void saveSortList(List<String> list) {
        String way = "src\\Comparable\\ex_3_StringsSort\\output2.txt";
        try {
            PrintWriter printWriter = new PrintWriter(way);
            for (String s : list) {
                printWriter.println(s);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static List<String> loadSortList() {
        ArrayList<String> sortList = new ArrayList<>();
        String way = "src\\Comparable\\ex_3_StringsSort\\Strings";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split("\n");
                String string = split[0];
//                String string1 = split[1];
//                String string2 = split[2];
                sortList.add(string);
//                sortList.add(string1);
//                sortList.add(string2);
            }
            scn.close();
        } catch (FileNotFoundException e) {
        }
        return sortList;
    }
}
