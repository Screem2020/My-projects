package Comparable.ex_3_StringsSort;

import java.util.Comparator;

public class SortNum2 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
