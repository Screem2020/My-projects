package Nio_Stream.SortedPhotografy;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        List<File> listPhoto = new ArrayList<>();
        File root = new File("D:\\oboi");
        target(root, listPhoto);
        BasicFileAttributes atributs; ///как получить дату файла в классе Data
        FileTime fileTime = null;
        Stack<Path> stack = new Stack<>();
        String line = "";
        for (File file : listPhoto) {
            Path path = file.toPath();
            atributs = Files.readAttributes(path, BasicFileAttributes.class);
            fileTime = atributs.creationTime();
            Instant instant = fileTime.toInstant();
            LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
            line = localDate.format(DateTimeFormatter.ofPattern("dd"));
            String way = "D:\\new\\" + line;
            Path path1 = Paths.get(way);
            stack.forEach(s -> stack.add(path1));
        }
        //Files.createDirectories(Path.of(way));
        Files.move(Path.of(String.valueOf(root)), stack.pop(), StandardCopyOption.REPLACE_EXISTING);
        //TODO: не получается вывести фотографии по 1 штуке для сортировке по папкам
    }

    ////рекурсивный обход деректорий
    public static void target(File root, List<File> fileList) {
        if (root.isDirectory()) {
            File[] listFiles = root.listFiles();
            if (listFiles != null) {
                for (File listFile : listFiles) {
                    if (listFile.isDirectory()) {
                        target(listFile, fileList);
                    } else if (listFile.getName().endsWith(".png")) {
                        fileList.add(listFile);
                    }
                }
            }
        }
    }

    public static void copy(File root) {
        if (root.isDirectory()) {
            File[] listFiles = root.listFiles();
            if (listFiles != null) {
                for (File listFile : listFiles) {
                    if (listFile.isDirectory()) {
                        copy(listFile);
                    } else if (listFile.getName().endsWith(".jpg")) {

                    }
                }
            }
        }
    }
}
