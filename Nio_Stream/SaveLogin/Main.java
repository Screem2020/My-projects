package Nio_Stream.SaveLogin;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

//*Задача 4* Создайте консольное меню:
//1. Записать в файл логин
//2. Создать файл принудительно
//3. Выход
//
//Пункт 1:
//Каждый раз при выборе пункта 1 программа должна добавлять к имеющемуся содержимому файла новый логин, не теряя старые данные.
//Если юзер вводит логин, который уже есть в файле, логин не должен добавляться в файл
// (для этого можно считать содержимое файла в виде списка и вызвать метод contains)
//Если юзер выбирает пункт 1, а файла еще не существует, он должен быть создан.
//
//Пункт 2:
//Если юзер выбирает пункт 2, а файла еще не существует, он должен быть создан
//Если юзер выбирает пункт 2, а файл уже существует, он должен получить исключение, которое нужно обратать,
// чтобы программа продолжила работу.
//Чтобы понять, в чем отличие nio от nio2 нужно почитать про nio: https://habr.com/ru/post/235585

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = 0;

        String file = "src/main/java/Nio_Stream/SaveLogin/login.txt";
        while (input != 3) {
            System.out.println("""
                    1. Записать в файл логин
                    2. Создать файл
                    3. Выход
                    """);
            input = scn.nextInt();

            if (input == 1) {
                System.out.println("Enter login");
                String login = scn.next();
                if(!Files.exists(Path.of(file))) {
                    Files.createFile(Path.of(file));
                }
                List<String> loginInPath = Files.readAllLines(Path.of(file));
                boolean flag = true;
                for (String s : loginInPath) {
                        try {
                            if (login.contains(s)) {
                                throw new RuntimeException("this file already exist");

                            }
                        } catch (RuntimeException e) {
                            e.printStackTrace();
                        }
                        flag = false;
                }  if (!flag) Files.writeString(Path.of(file), login, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            }
            if (input == 2) {
                System.out.print("Write login" + "\n");
                String login = scn.next();
                try {
                    Files.writeString(Path.of(file), login, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
