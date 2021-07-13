package Recursion;

public class Rp3 {
    /**
     * Написать метод, который выводит n первых чисел из последовательности фибоначи
     */
    public static void main(String[] args) {
        System.out.println(value(10, 0));
    }
    public static int value(int n, int index) {
        if (index > n) {
            return n;
        } else {
            return value(n - 1, index) + value(n - 2, index);
        }
    }
}
