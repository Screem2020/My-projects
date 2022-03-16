package Files.ex_1_RandomVal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    //Задача 6. Создать вручную или программно файл, содержащий случайные числа:
    //-5
    //1
    //4
    //-10
    //12
    //15
    //
    //Считать файл в программе и найти:
    //- сумму всех чисел
    //- самое большое число
    //- самое маленькое число
    public static void main(String[] args) {
        String randomVal = "src\\Files\\ex_1_RandomVal\\file.txt";
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }
        try {
            PrintWriter printWriter = new PrintWriter(randomVal);
            for (int j : arr) {
                printWriter.println(j);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            File file = new File(randomVal);
            Scanner scn = new Scanner(file);
            int tmp = 0;
            int max = 0;
            int min = 0;
            while (scn.hasNextInt()) {
                int num = scn.nextInt();
                System.out.println(num);
                tmp += num;
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("Max " + max);
            System.out.println("Min " + min);
            System.out.println("Итог " + tmp);
            scn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
