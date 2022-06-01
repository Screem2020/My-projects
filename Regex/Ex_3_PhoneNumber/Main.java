package Regex.Ex_3_PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //Входные данные: два телефонных номера.
    //Например:
    //9991234567
    //+79991234567
    //
    //Необходимо написать программу, определяющую равны ли данные номера, учитывая,
    // что номера могут быть как в типе long, так и в типе String, а также
    //номера могут иметь приставку в виде кода РФ, которая может начинаться с 7, +7, 8.
    //
    //Варианты входных данных:
    //long num1 = 9178881234L;
    //long num2 = 9178881234L;
    //
    //long num1 = 9178881234L;
    //String num2 = "9178881234";
    //
    //long num1 = 9178881234L;
    //String num2 = "+79178881234";
    //
    //String num1 = "89178881234";
    //String num2 = "+79178881234";

    public static void main(String[] args) {
        long num1 = 9178881234L; // необходимо заменять только тип данных и сами данные
        String num2 = "9178881234";

        Matcher matcher = createdMatecher(clazz(num1));
        Matcher matcher1 = createdMatecher(clazz(num2));
        while (matcher.find() && matcher1.find()) {                     // возможно ли тут применить лямду?
            boolean equals = matcher.group().equals(matcher1.group());
            System.out.println(equals);
        }
    }
    public static <T> String clazz(T t) {
        if (t.getClass() == String.class) {
            return (String) t;
        } else return String.valueOf(t);
    }

    public static Matcher createdMatecher(String num) {
        Pattern pattern = Pattern.compile("[+|8]?\\d{10,11}(L?)"); // разница в скопках есть! ([] - не подходят)
        return pattern.matcher(num);
    }
}
