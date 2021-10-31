package Strings.ex2;

import java.util.ArrayList;
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
            input = scn.nextInt();
                /*while (!scn.hasNextInt()) {
                    try {
                        throw new Exception("not string");
                    } catch (InputMismatchException e) {
                        System.out.println("not string");
                        e.printStackTrace();
                        break;
                    }
                }*/
            if (input == 1) {
                scn = new Scanner(System.in);
                System.out.println("enter social profile:");
                System.out.print("1.Name: ");
                String name = scn.nextLine();
                String[] constructor1 = new String[name.length()];
                SocialProfile trim = SocialProfile.trim(name, constructor1);
                boolean flag = false;
                if (socialProfiles.add(trim)) {
                    flag = true;
                    System.out.println(flag);
                } else System.out.println("Not add social profile " + flag);

            }
            if (input == 2) {
                scn = new Scanner(System.in);
                System.out.println("enter social profile");
                String line = scn.nextLine();
                String[] constructor2 = new String[line.length()];
                SocialProfile trim = SocialProfile.trim(line, constructor2);
                for (int i = 0; i < socialProfiles.size(); i++) {
                    if (socialProfiles.get(i).equals(trim)) {
                        SocialProfile remove = socialProfiles.remove(i);
                        System.out.println(remove);
                    }
                }
            }
            if (input == 3) {
                StringBuilder sb = new StringBuilder();
                for (SocialProfile socialProfile : socialProfiles) {
                    System.out.println("Name: " + sb.append(socialProfile.getName()));
                    System.out.println("Last Name: " + sb.append(socialProfile.getTwoName()));
                    System.out.println("Age: " + sb.append(socialProfile.getAge()));
                    System.out.println("Postal: " + sb.append(socialProfile.getPostal()));
                    System.out.println("Country: " + sb.append(socialProfile.getCountry()));
                }
            }
        }
    }
}

