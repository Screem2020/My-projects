package TwoArray;

import ArrayList.Rp3.Page;

import java.util.Locale;
import java.util.Scanner;

public class Rp2 {
    /**
     * 2. Создать учебное расписание для школьника с понедельника по пятницу включительно.
     * Каждый день у школьника проходит по 3 урока.
     * Список возможных уроков: математика, русский, английский, литература, биология, химия, история.
     * Выбор предметов на каждый день сделать случайным образом.
     * Вывести расписание на консоль в формате:
     * Пн: предмет1, предмет2, предмет3
     * ....
     * Пт: предмет1, предмет2, предмет3
     * <p>
     * Далее пользователь должен иметь возможность один раз изменить любой предмет в любой день недели.
     * К примеру, школьник хочет заменит в пятницу предмет3 на предмет 4.
     * После сделанных изменений нужно вывести расписание на консоль и проверить, что изменения вступили в силу
     */
    public static void main(String[] args) {
        String[][] lessons = new String[5][3];
        String[] les = {"математика", "русский", "английский", "литература", "биология", "химия", "история"};
        String[] week = {"пн", "вт", "ср", "чт", "пт"};
        Scanner scn = new Scanner(System.in);
        int index;
        for (int i = 0; i < lessons.length; i++) {
            for (int j = 0; j < lessons[i].length; j++) {
                index = (int) ((Math.random() * 7));
                lessons[i][j] = les[index];
            }
        }
        for (int i = 0; i < lessons.length; i++) {
            System.out.print(week[i] + ": ");
            for (int j = 0; j < lessons[i].length; j++) {
                if (j == lessons[i].length - 1) {
                    System.out.print(lessons[i][j]);
                } else System.out.print(lessons[i][j] + ", ");
            }
            System.out.println();
        }
        int oldIndex = -1;
        int weekIndex = -1;
        System.out.println("ВВедите название недели");
        String nameWeek = scn.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Введите название предмета");
        String newName = scn.next().toLowerCase(Locale.ROOT);
        System.out.println("Введите название строго предмета");
        String oldName = scn.next().toLowerCase(Locale.ROOT);
        for (int i = 0; i < week.length; i++) {
            if (nameWeek.equalsIgnoreCase(week[i])) {
                weekIndex = i;
            }
        }
        if (weekIndex == -1) {
            System.out.println("Такой недели не существует");
        } else {
            int columnIndex = -1;
            for (int i = 0; i < lessons[weekIndex].length; i++) {
                if (oldName.equalsIgnoreCase(lessons[weekIndex][i])) {
                    columnIndex = i;
                }
            }
            if (columnIndex == -1) {
                System.out.println("Такого предмета не существует");
            }else lessons[weekIndex][columnIndex] = newName;
        }
        for (int i = 0; i < lessons.length; i++) {
            System.out.print(week[i] + ": ");
            for (int j = 0; j < lessons[i].length; j++) {
                if (j == lessons[i].length - 1) {
                    System.out.print(lessons[i][j]);
                } else System.out.print(lessons[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
