package Recursion.Regex.Ex_4_CountText;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    ////Разработайте класс WordStat, который будет подсчитывать статистику встречаемости слов во входном файле.
    ////Словом называется непрерывная последовательность букв, тире и нижнего подчеркивания.
    // Для подсчета статистики, слова приводятся к нижнему регистру.
    ////Выходной файл должен содержать все различные слова, встречающиеся во входном файле, в порядке их появления.
    // Для каждого слова должна быть выведена одна строка, содержащая слово и число его вхождений во входной файл.
    ////Имена входного и выходного файла задаются в качестве аргументов командной строки. Кодировка файлов: UTF-8.
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter way input");
        String input = "src/main/java/Regex/Ex_4_CountText/text.txt";
        args[0] = input;
        System.out.println("Enter way output");
        String output =  "src/main/java/Regex/Ex_4_CountText/output.txt";
        args[1] = output;
        String line = Files.readString(Path.of(args[0]));
        WordStat wordStat = new WordStat();
        HashMap<String, Integer> stringIntegerHashMap = wordStat.counterText(line);
        //TODO: как передать мап в поток
        //Files.write(Path.of(args[1]), str, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
}
