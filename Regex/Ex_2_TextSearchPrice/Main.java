package Regex.Ex_2_TextSearchPrice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //С помощью регулярного выражения достать из текста все упомянутые в нем денежные суммы в рублях или в долларах.
    // Если после каждой суммы в рублях идет слово "руб." или "Руб.", а в долларах - "$".
    // Перед данными знаками может быть пробел, а может и не быть. Сумма может быть отрицательной.
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor 30 руб. sit amet, consectetur adipiscing elit, sed -5$ do eiusmod tempor " +
                "incididunt ut labore et dolore magna 30 $ aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                "ullamco 10 Руб. laboris nisi 30руб. ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
                "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        Pattern pattern = Pattern.compile("\\W?\\d{0,}(\\s|\\S)(руб|Руб|\\$)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
