package Excepsion.ex4;

public class Main {
    //5. Напишите метод, который принимает четыре String и возвращает true, если строка из первого параметра
    // начинается на второй параметр заканчивается на третий, а также содержит четвертый
    //Пример:
    //myMethod("Search in Google - Java", "Search", "Java", "-") - вернет true, так как первая строчка начинается
    // на Search (Второй параметр), кончается на Java (третий параметр) и содержит знак - (четвертый параметр)
    //myMethod("I want to be a developer", "I", "want", "be") - вернет false, так как первая строка кончается
    // на developer, а не на want.
    public static void main(String[] args) {

        System.out.println(method("I love world", "I", "world", "love"));

    }
    public static boolean method(String text1, String text2, String text3, String text4) {
        return text1.startsWith(text2) && text1.endsWith(text3) && text1.contains(text4);
    }

//    public static boolean method(String text1, String text2, String text3, String text4) {
//        int c  = charAtingStart(text2); // справение первых
//        int c1 = charAtingStart(text1); // букв первого параметра
//
//        int lastSymbolText3 = charAtingEnd(text3); // справение последних
//        int lastSymbolText1 = charAtingEnd(text1); // букв второго параметра
//
//        if ((c == c1) && (lastSymbolText3 == lastSymbolText1)) {
//            String[] split = text1.split(" ");
//            for (int i = 0; i < split.length; i++) {
//                if (split[i].equals(text4)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static int charAtingStart(String text) {
        return text.charAt(0);
    }

    public static int charAtingEnd(String text) {
         return text.charAt(text.length() - 1);
    }
}
