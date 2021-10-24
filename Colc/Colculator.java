package Colc;

public class Colculator {
    private int number_1;
    private int number_2;

    public Colculator(int number_1, int number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
        if ((number_1 < 0 || number_1 > 11) && (number_2 < 0 || number_2 > 11)) {
            try {
                throw new InappropriateValueException("Введите число от 0 до 10");
            } catch (InappropriateValueException inappropriateValueException) {
                inappropriateValueException.printStackTrace();
            }
//            Main.RomanNumerals[] values = Main.RomanNumerals.values();
//            for (Main.RomanNumerals value : values) {
//                if (!(number_1 == value.getName() & number_2 == value.getName())) {
//                    try {
//                        throw new DifferentNumberSystemsException("Используются одновременно разные системы счисления");
//                    } catch (DifferentNumberSystemsException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
        }
    }

    /**
     * Метод сложения
     */
    public void sum() {
        number_1 += number_2;
        System.out.println(number_1);
    }

    /**
     * Метод вычитания
     */
    public void minCalc() {
        number_1 -= number_2;
        System.out.println(number_1);
    }
    /**
     * Метод деления
     */
    public void division() {
        number_1 /= number_2;
        System.out.println(number_1);
    }
    /**
     * Метод умножения
     */
    public void multiplication() {
        number_1 *= number_2;
        System.out.println(number_1);
    }
}
