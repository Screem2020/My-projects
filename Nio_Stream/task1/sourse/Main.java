package Nio_Stream.task1.sourse;

import lombok.SneakyThrows;

import java.util.List;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        String filePatch = "src/main/java/Nio_Stream/task1/sourse/file3.txt";
        //"src/main/java/Nio_Stream/task1/dest/file3.txt"
        List<String> list = List.of("Hi", "Java");

        //############Создание файлов
        //1. Files.writeString(Path.of(filePatch), "Hello world", StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        //2. Files.write(Path.of(filePatch), list, StandardOpenOption.CREATE, StandardOpenOption.WRITE);


//        3. try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(filePatch), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
//            for (String line : list) {
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//      \\\\\\\\\\\\\\\\\\Копирование файлов
//       1. Files.copy(Paths.get("src/main/java/Nio_Stream/task1/sourse/file3.txt"),Paths.get("src/main/java/Nio_Stream/task1/dest/file3.txt"));
//       2. Files.copy(Paths.get("src/main/java/Nio_Stream/task1/sourse/file2.txt"),Paths.get("src/main/java/Nio_Stream/task1/dest/file2.txt"));
//       3. Files.copy(Paths.get("src/main/java/Nio_Stream/task1/sourse/text1.txt"),Paths.get("src/main/java/Nio_Stream/task1/dest/file1.txt"));

        /////////////чтение файлов + сохранение считаннного в файлы
//       1. List<String> strings1 = Files.readAllLines(Path.of("src/main/java/Nio_Stream/task1/dest/file3.txt"));
//       2. List<String> strings2 = Files.readAllLines(Path.of("src/main/java/Nio_Stream/task1/dest/file2.txt"));
//       3. List<String> strings3 = Files.readAllLines(Path.of("src/main/java/Nio_Stream/task1/dest/file1.txt"));
//
//        Files.write(Path.of("src/main/java/Nio_Stream/task1/sourse/text2.txt"), strings1, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
//        Files.write(Path.of("src/main/java/Nio_Stream/task1/sourse/text3.txt"), strings2, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
//        Files.write(Path.of("src/main/java/Nio_Stream/task1/sourse/text4.txt"), strings3, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        ///////////////
    }
}
