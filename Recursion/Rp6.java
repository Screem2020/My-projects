package Recursion;

public class Rp6 {
    /**
     * Написать рекурсивный метод, сравнивающий две строки на равенство посимвольно (попробовать с возвратом результата и просто с печатью на консоль)
     */
    public static void main(String[] args) {
        //compare("Дима", "Дима", 0);
        System.out.println(compareT("Dima", "Dima", 0, 0));
    }

    public static void compare(String text1, String text2, int index) {
        if (index <= text1.length()) {
            System.out.println(text1.compareTo(text2));
        } else {
            compare(text1, text2, index + 1);
        }
    }

    public static int compareT(String text1, String text2, int index, int n) {
        if (index > text1.length() || index > text2.length()) {
            return -1;
        }
        if(index < text1.length() || n < text1.length()) {
            char c = text1.charAt(n);
            char c1 = text2.charAt(n);
            if (c == c1){
                compareT(text1, text2, index + 1, n + 1);
                return 0;
            }
        }
        return -1;
    }
}
