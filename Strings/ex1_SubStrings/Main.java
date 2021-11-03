package Strings.ex1_SubStrings;

public class Main {
    //Известно, что пользователь вводит с консоли выражение всегда в формате x * (y + z), где x, y и z - всегда трехзначное число
    //Пример: 1005 * (2100 + 1500)
    //105 * (201 + 150)
    //С помощью subscting извлеките значения x, y, z с помоощью substring и найдите результат выражения.

    public static void main(String[] args) {
        String x = "123 + (183 * 999)";
        var substring1 = x.substring(0, 3);
        var substring2 = x.substring(7, 10);
        var substring3 = x.substring(13, 16);
        var sub1 = Integer.parseInt(substring1.trim());
        var sub2 = Integer.parseInt(substring2.trim());
        var sub3 = Integer.parseInt(substring3.trim());
        System.out.println((sub2 * sub3) + sub1);

    }
}
