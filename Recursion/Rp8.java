package Recursion;

public class Rp8 {
    /**
     * 4. Дано число n, записанное в типе String. Получите число, записанное теми же цифрами, но в противоположном порядке.
     * При решении этой задачи нельзя использовать циклы, списки, массивы, разрешается только рекурсия.
     * Фунция должна возвращать число в типе String, являющееся результатом работы программы.
     */

    public static void main(String[] args) {
        String f = "123wefwefwe";
        express(0, f, 0);
    }

    public static void express(int index, String a, int charIndex) {
        char c = ' ';
        if (index >= 0 & a.length() > index) {
            if (charIndex < a.length()) {
                c = a.charAt(charIndex);
                express(index, a, charIndex + 1);
            }
            express(index - 1, a, charIndex - 1);
            System.out.print(c);
        }
    }
}
