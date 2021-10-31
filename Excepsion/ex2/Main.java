package Excepsion.ex2;

import java.util.Scanner;

public class Main {
    //3. Пользователь вводит с консоли строку вида: Иван, Java разработчик, Росси, Oracle
    //Программа выводит на консоль информацию о пользователе:
    //Имя: Иван
    //Должность: Java разработчик
    //Страна: Россия
    //Компания: Oracle

    public static void main(String[] args) {
        method();
    }


        public static void method() {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите свои данные:");
            String line = scn.nextLine();
            String[] split = line.split(",");
            for (int i = 0; i < split.length; i++) {
               split[i] = split[i].trim();
            }
            String name = split[0];
            String position = split[1];
            String country = split[2];
            String company = split[3];
            System.out.println("Имя: " + name);
            System.out.println("Должность: " + position);
            System.out.println("Страна: " + country);
            System.out.println("Компания: " + company);

        }
    }

//    public static void method(String text) {
//        char[] chars = text.toCharArray();
//        int i = 0;
//        while (i < chars.length){
//            System.out.print(chars[i++]);
//            if (chars[i] == ',') {
//                System.out.print("\n");
//            }
//        }
//    }
