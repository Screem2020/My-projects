package Colc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Введите значения");
            int num_1 = scn.nextInt();
            String input = scn.next();
            int num_2 = scn.nextInt();
            Colculator colculator = new Colculator(num_1, num_2);
            switch (input) {
                case "+" -> colculator.sum();
                case "-" -> colculator.minCalc();
                case "/" -> colculator.division();
                case "*" -> colculator.multiplication();
            }
        }
    }

    public enum RomanNumerals {
        I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7),
        VIII(8), IX(9), X(10);

        private int name;

        RomanNumerals(int name) {
            this.name = name;
        }

        public int getName() {
            return name;
        }

//        public int getNum(int num1, int num2) {
//            RomanNumerals[] values = RomanNumerals.values();
//            for (int i = 0; i < values().length; i++) {
//                if (values[i].name == num1) {
//                    return values[i].name;
//                }
//                if (values[i].name == num2) {
//                    return values[i].name;
//                }
//            }
//            return -1;
//        }
    }
}
