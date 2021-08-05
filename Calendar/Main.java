package Calendar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Создать календарь на один месяц, в который можно будет записывать свои планы. Каждый день может иметь много планов.
         * Создать класс Day с полями
         * число
         * день недели (enum)
         * список планов
         *
         * Создать класс Calendar с полями:
         * спискок дней
         * текущее число
         *
         * В мейне реализовать консольное меню:
         * 1. Добавить план (пользователь вводит число и план на этот день)
         * 2. Показать все планы на конкретное число
         * 3. Показать все планы на весь месяц
         * 4. Показать все планы на ближайший день (выводит планы на день после текущего числа)
         * 5. Выход
         */
        System.out.println("enter current Date");
        Scanner scn = new Scanner(System.in);
        int currentDate = scn.nextInt();
        Calendar calendar = new Calendar(currentDate);
        int input = 0;
        while (input != 5) {
            System.out.println(
                    " 1. Добавить план \n" +
                    " 2. Показать все планы на конкретное число\n" +
                    " 3. Показать все планы на весь месяц\n" +
                    " 4. Показать все планы на ближайший день \n" +
                    " 5. Выход");
            System.out.print("=>");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    System.out.print("add day =>");
                    int day = scn.nextInt();
                    System.out.print("plan =>");
                    String plan = scn.next();
                    calendar.addPlans(day, plan);
                    break;
                }
                case 2: {
                    System.out.print("get day =>");
                    int day = scn.nextInt();
                    calendar.getPlans(day);
                    break;
                }
                case 3: {
                    calendar.getPlansMoths();
                    //System.out.println(calendar.toString());
                    break;
                }
                case 4: {
                    calendar.getPlansCurrantDay();
                    //calendar.getPlans(currentDate + 1);
                    break;
                }
            }
        }
    }
}
