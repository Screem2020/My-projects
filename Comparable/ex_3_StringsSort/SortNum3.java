package Comparable.ex_3_StringsSort;

import java.util.Comparator;

public class SortNum3 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
