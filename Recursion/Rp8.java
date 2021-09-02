package Recursion;

public class Rp8 {
    /**
     * 4. Дано число n, записанное в типе String. Получите число, записанное теми же цифрами, но в противоположном порядке.
     * При решении этой задачи нельзя использовать циклы, списки, массивы, разрешается только рекурсия.
     * Фунция должна возвращать число в типе String, являющееся результатом работы программы.
     */

    public static void main(String[] args) {
        String n = "56353429";
        strRec(n, 0);
//        int[] arr = {2, 4, 6, 6};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
    }
    public static void strRec(String n, int index) {
        if (index < n.length() && index >= 0) {
            if (index == n.length() - 1) {
                char c = n.charAt(index);
                n = Character.toString(c);
                System.out.print(n);
                strRec(n, index - 1);
            }
            strRec(n, index + 1);
        }
        else System.out.println();
    }
}
