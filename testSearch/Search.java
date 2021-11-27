package testSearch;

import java.util.Arrays;

public class Search {

    private final int[] a;
    private int lowerBound; //меньше середины
    private int upperBound; //больше середины
    private int curin; //середина массива
    private int size;


    public Search(int[] a) {
        this.a = a;
    }

    public int find(int searchKey) {
        lowerBound = 0;
        upperBound = a.length - 1;
        while (lowerBound <= upperBound) {
            curin = (lowerBound + upperBound) / 2;
            if (a[curin] == searchKey) {
                return curin;
            }
            if (a[curin] < searchKey) {
                upperBound = curin - 1;
            } else {
                lowerBound = curin + 1;
            }
        }
        return -1;
    }

    public void addElm(int value) {
        int[] arr = new int[size];
        find(value);
        for (int i = 0; i < arr.length; i++) {

        }

    }

//    public void addElm(int value) {
//        int i;
//        for (i = 0; i < size; i++) {
//            if (a[i] > value) {
//                break;
//            }
//        }
//        for (int j = size; j > i; j--) {
//            a[j] = a[j - 1];
//        }
//        a[i] = value;
//        size++;
//    }

    public void Size() {
        System.out.println(size);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public boolean delete(int value) {
        upperBound = size - 1;
        lowerBound = 0;
        while (lowerBound < upperBound) {
            curin = (upperBound + lowerBound) / 2;
            if (a[curin] == value) {
                break;
            } else if (a[curin] > value) {
                upperBound = curin;
            } else
                lowerBound = curin;
        }
        for (int j = curin; j < size; j++) {
            a[j] = a[j + 1];
        }
        size--;
        return true;
    }

//    public boolean delete(int value) {
//        int i = find(value);
//        if (i == size) {
//            return false;
//        } else {
//            for (int j = i; j < size; j++) {
//                a[j] = a[j + 1];
//            }
//        }
//        size--;
//        return true;
//    }

    public int getMax() {
        int max = 0;
        if (a.length == 0) {
            return -1;
        }
        for (int j : a) {
            if (j > max) {
                max = j;
                delete(max);
            }
        }
        return max;
    }

    public void merge() {

    }

    @Override
    public String toString() {
        return "Search{" +
                "a=" + Arrays.toString(a) +
                ", lowerBound=" + lowerBound +
                ", upperBound=" + upperBound +
                ", curin=" + curin +
                ", size=" + size +
                '}';
    }
}
