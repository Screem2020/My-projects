package Thread.ex_3_DatFile;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    //В директории лежат входные текстовые файлы (необходимо их создать, не менее 5),
    // проименованные следующим образом: in_<N>.dat, где N - натуральное число. Каждый файл состоит из двух строк.
    // В первой строке - число, обозначающее действие, а во второй - числа с плавающей точкой, разделенные пробелом.
    //Действия могут быть следующими:
    //1 - сложение
    //2 - умножение
    //3 - сумма квадратов
    //Необходимо написать многопоточное приложение, которое выполнит требуемые действия над числами и
    // сумму результатов запишет в файл out.dat.
    //Каждый файл должен обрабатываться в отдельном потоке.
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyThread());
        thread1.start();
        Thread thread = new Thread(new MyThread());
        thread.start();
        Thread thread2 = new Thread(new MyThread());
        thread2.start();
        thread.join();
        thread1.join();
        thread2.join();
    }
    public static class MyThread implements Runnable {
        @SneakyThrows
        @Override
        public void run() {
            synchronized (this) {
                Scanner scn = new Scanner(System.in);
                System.out.println("Write name file");
                String name = scn.next();
                String newLine = "C:\\Users\\OMEN\\IdeaProjects\\Repeet\\src\\main\\java\\Thread\\ex_3_DatFile\\Files\\" + name + ".dat";
                String lineFromFile = Files.readString(Path.of(newLine));
                double temp = 0;
                String substring = lineFromFile.substring(1);
                String[] s = substring.split(" ");
                double i = Double.parseDouble(s[0].trim());
                double i1 = Double.parseDouble(s[1].trim());
                if (lineFromFile.startsWith("1")) {
                    temp = sum(i, i1);
                } else if (lineFromFile.startsWith("2")) {
                    temp = division(i, i1);
                } else if (lineFromFile.startsWith("3")) {
                    temp = sqrt(i, i1);
                }
                System.out.println("Write name file for save");
                String nameSave = scn.next();
                String string = "C:\\Users\\OMEN\\IdeaProjects\\Repeet\\src\\main\\java\\Thread\\ex_3_DatFile\\Files\\" + nameSave + ".dat";
                Files.writeString(Path.of(string), String.valueOf(temp), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
            }
        }
    }
    public static double sum(double a, double b) {
        return a + b;
    }
    public static double division(double a, double b) {
        return a * b;
    }
    public static double sqrt(double a, double b) {
        return Math.sqrt(a) + Math.sqrt(b);
    }
}
