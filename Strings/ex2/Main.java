package Strings.ex2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    //Создать список типа SocialProfile. В классе SocialProfile создать поля:
    //имя, фамилия, возраст, почта, страна проживания
    //Создать перегруженные конструкторы
    //- принимает имя и фамилию
    //- принимает имя, фамилию, возраст
    //- принимает все поля
    //
    //и создать консольное меню:
    //1. Добавить профиль в список (пользователь вводит через символ точка с запятой данные для соц. профиля, на их основе создается объект SocialProfile)
    //2. Удалить профиль из списка
    //3. Вывести все профили (использовать toString, строку формировать через StringBuilder)
    //4. Выход

    //Если при выборе первого пункта пользователь вводит 2 значения данных, то используется первый конструктор для создания объекта
    //Если при выборе первого пункта пользователь вводит 3 значения данных, то используется второй конструктор для создания объекта
    //Если при выборе первого пункта пользователь вводит 5 значений данных, то используется третий конструктор для создания объекта
    //Также пользователь может вводить лишние пробелы между символом точка с запятой, необходимо очистить данные от лишних пробелов.

    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var socialProfiles = new ArrayList<SocialProfile>();
        int input = 0;
        while (input != 4) {
            System.out.println("""
                    1. Добавить профиль в список
                    2. Удалить профиль из списка
                    3. Вывести все профили
                    4. Выход
                    """);
            while (!scn.hasNextInt()) {
                try {
                    throw new java.lang.Exception("Entered integer");
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    scn.nextInt();
                }
            }
            input = scn.nextInt();
            if (input == 1) {
                scn = new Scanner(System.in);
                System.out.print("enter social profile: ");
                String line = scn.nextLine().toLowerCase(Locale.ENGLISH);
                SocialProfile trim = SocialProfile.trim(line);
                boolean flag = false;
                if (socialProfiles.add(trim)) {
                    flag = true;
                    System.out.println(flag);
                } else System.out.println("Not add social profile " + flag);

            }
            if (input == 2) {
                scn = new Scanner(System.in);
                System.out.println("enter social profile");
                String line = scn.nextLine().toLowerCase(Locale.ENGLISH);
                SocialProfile trim = SocialProfile.trim(line);
                for (int i = 0; i < socialProfiles.size(); i++) {
                    if (socialProfiles.get(i).equals(trim)) {  // заменить get(i) на что то другое, повторное отображение
                        socialProfiles.remove(i);
                        System.out.println("deleted");
                    }
                    else System.out.println("Not found");
                }
            }
            if (input == 3) {
                System.out.println(socialProfiles);
            }
        }
    }
}

