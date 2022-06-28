package Stream_2.ex_4_Strings;

import java.util.List;

public class Main {
    //Создать список из строк: "29a", "12", "94", "abc", "a9c5".
    //С помощью одного stream подсчитать количество строк, внутри которых сумма чисел будет больше 10.
    //Ответ должен получиться 3.
    //Подсказка.
    //У строк есть методы chars(), который возвращает IntStream поток по символам из строки в типе int.
    //Проверку символа на то, является ли он числом или нет, можно сделать через Character.isDigit.
    // Данный метод принимает символ как в типе char, так и в типе int.
    //Преобразовать символ из типа char в String можно через Character.toString(ваш_символ)

    public static void main(String[] args) {
        //TODO: необходимо разбить полученные числа построчно и суммировать
        List<String> listStr = List.of("29a", "12", "94", "abc", "a9c5");
        long count = listStr.stream()
                .map(b -> b.chars().filter(code -> Character.isDigit(code)).
                        map(code -> Character.digit(code, 10))
                        .sum())
                .filter(sum -> sum > 10)
                .count();
        System.out.println(count);

//                .flatMapToInt(a-> IntStream.of(a.sum()))
//                .filter(b->Character.isDigit(b))// true, false
//                .filter(a -> a > 10)
////                .mapToObj(b -> Character.toString(b))
//                .count();
//        System.out.println(count);
    }
}
