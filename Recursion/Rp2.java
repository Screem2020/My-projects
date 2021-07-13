package Recursion;

public class Rp2 {
    /**
     * Рекурсивно вывести на консоль треугольник высотой n, где n - количество строк в треугольнике. n не может быть меньше 2.
     * Пример треугольника с n = 5. На каждой строке количество пробелов между знаком # увеличивается на 1.
     * <p>
     * #
     * # #
     * #  #
     * #   #
     * #    #
     */
    public static void main(String[] args) {
        rec('#', 10, 0, " ");
        System.out.println();
        System.out.println(valuePrint('#', 0, 6, "", ""));
        System.out.println();
        System.out.println(value(0, '#', 6, ""));
        System.out.println();
    }

    public static void rec(char sim, int n, int index, String space) {
        if (index < n) {
            if (index == 0) {
                System.out.println(sim);
            } else System.out.println(sim + space + sim);
            space = space + " ";
            rec(sim, n, index + 1, space);
        }
    }

    public static String valuePrint(char sim, int index, int n, String res, String space) {
        if (index >= n) {
            return res;
        }
        if (index == 0) {
            res = res + sim + "\n";
        } else {
            res = res + sim + space + sim + "\n";
        }
        space = space + " ";
        return valuePrint(sim, index + 1, n, res, space);
    }

    public static String value(int index, char sim, int n, String space) {
        if (index > n) {
            return "";
        }
        if (index ==0) {
            return sim + "\n" + value(index + 1, sim, n, space);
        } else {
            return sim + space + " " + sim + "\n" + value(index + 1, sim, n, space + " ");
        }
    }
}

