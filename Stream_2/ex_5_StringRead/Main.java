package Stream_2.ex_5_StringRead;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //создать два файла, заполнить их любыми строчками.
    // Считайте файлы и объедините их содержимое через разделитель в виде перехода на новую строку (System.lineSeparator).
    //Удалите из каждого файла дублированные строчки
    @SneakyThrows
    public static void main(String[] args) {
        String way1 = "src/main/java/Stream_2/ex_5_StringRead/text1.txt";
        String way2 = "src/main/java/Stream_2/ex_5_StringRead/text2.txt";
        List<String> strings = Files.readAllLines(Path.of(way1));
        List<String> strings1 = Files.readAllLines(Path.of(way2));

        String collect = strings.stream()
                .map(a -> a.split(" "))
                .flatMap(c -> Arrays.stream(c).distinct())
                .collect(Collectors.joining(System.lineSeparator()));

        String collect1 = strings1.stream()
                .map(a -> a.split(" "))
                .flatMap(c -> Arrays.stream(c).distinct())
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println(collect + collect1);
    }
}
