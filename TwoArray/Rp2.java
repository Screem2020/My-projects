package TwoArray;


import java.util.Locale;
import java.util.Scanner;

public class Rp2 {
    public static void main(String[] args) {
        /**
         * 2. Создать учебное расписание для школьника с понедельника по пятницу включительно.
         * Каждый день у школьника проходит по 3 урока.
         * Список возможных уроков: математика, русский, английский, литература, биология, химия, история.
         * Выбор предметов на каждый день сделать случайным образом.
         * Вывести расписание на консоль в формате:
         * Пн: предмет1, предмет2, предмет3
         * ....
         * Пт: предмет1, предмет2, предмет3
         *
         * Далее пользователь должен иметь возможность один раз изменить любой предмет в любой день недели.
         * К примеру, школьник хочет заменит в пятницу предмет3 на предмет 4.
         * После сделанных изменений нужно вывести расписание на консоль и проверить, что изменения вступили в силу
         */

        String[][] lessons = new String[5][3];
        int index;
        String[] week = {"MO", "WN", "TU", "WEN", "FR"};
        String[] les = {"математика", "русский", "английский", "литература", "биология", "химия", "история"};
        for (int i = 0; i < lessons.length; i++) {
            for (int j = 0; j < lessons[i].length; j++) {
                index = (int) (Math.random() * 7);
                lessons[i][j] = les[index];
            }
            System.out.println();
        }
        for (int i = 0; i < lessons.length; i++) {
            System.out.print(week[i] + ": ");
            for (int j = 0; j < lessons[i].length; j++) {
                if (j == lessons[i].length - 1) {
                    System.out.print(lessons[i][j]);
                } else {
                    System.out.print(lessons[i][j] + ", ");
                }
            }
            System.out.println();
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("enter week");
        String name = scn.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("enter name old lesson");
        String nameOld = scn.next().toLowerCase(Locale.ROOT);
        System.out.println("enter name lesson");
        String nameLes = scn.nextLine();
        int indexOld = 0;
        for (int i = 0; i < lessons.length; i++) {
            for (int j = 0; j < lessons[i].length; j++) {
                if (nameOld.equalsIgnoreCase(lessons[i][j])) {
                    indexOld = i;
                }
            }
        }
        int indexDay = -1;
        for (int i = 0; i < week.length; i++) {
            if (nameLes.equalsIgnoreCase(week[i])) {
                indexDay = i;
            }
        }
        int columnIndex = -1;
        if (indexDay == -1) {
            System.out.println("not found");
        } else {
            for (int i = 0; i < lessons[indexDay].length; i++) {
                if (nameOld.equals(lessons[indexDay][i])) {
                    columnIndex = i;
                }
            }
            if (columnIndex != -1) {
                lessons[indexDay][columnIndex] = nameLes;
            } else {
                System.out.println("not found");
            }
            for (int i = 0; i < lessons.length; i++) {
                for (int j = 0; j < lessons[i].length; j++) {
                        System.out.print(lessons[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}