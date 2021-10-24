package Colc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Введите значения");
            int num_1 = scn.nextInt();  // вероятнее всего необходимо использовать String для
                                        // того что бы распарсить в число, а затем использовать для Enum или в методах клсса Calculator
                                        // либо через метод конвертирования getNum
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
        I("1"), II("2"), III("3"), IV("4"), V("5"), VI("6"), VII("7"),
        VIII("8"), IX("9"), X("10");

        private String name;

        RomanNumerals(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

//        /**
//         * @param num
//         * @return
//         */
//        public int getNum(String num) {
//            RomanNumerals[] values = RomanNumerals.values();
//            for (RomanNumerals i : values) {
//                if (i.name.equals(num)) {
//                    return Integer.parseInt(i.name.trim());
//                }
//            }
//            return -1;
//        }
    }
}
