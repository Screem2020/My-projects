package Strings.ex2_SocialProfile;

import java.util.ArrayList;
import java.util.Arrays;
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


    /**
     * Программа осуществяет добавление социального профиля в базу по имени, фамилии, возрасту, почтовому адресу.
     * Процесс добавления производится по:
     * - 2 данным: имя, фамилия;
     * - 3 данным: имя, фамилия, возраст;
     * - 5 данным: имя, фамилия, возраст, почтовый адрес и стране проживания;
     * Поиск удаляемого профеля осуществляется по такому же принципу.
     * Есть возможность вывода списка всех социальных профелей в базе.
     * @param args
     */
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var socialProfiles = new ArrayList<SocialProfile>();
        socialProfiles.add(new SocialProfile("name1", "s1"));
        socialProfiles.add(new SocialProfile("name2", "s2"));
        socialProfiles.add(new SocialProfile("name3", "s3"));
        int input = 0;
        while (input != 4) {
            System.out.println("""
                    1. Добавить профиль в список
                    2. Удалить профиль из списка
                    3. Вывести все профили
                    4. Выход
                    """);
            if (input > 4){
                try {
                    throw new java.lang.Exception("Entered integer < 4");
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    scn = new Scanner(System.in);
                }
            }
            while (!scn.hasNextInt()) {    // необходим while?
                try {
                    throw new java.lang.Exception("Entered integer");
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    scn = new Scanner(System.in);
                }
            }
            input = scn.nextInt();

            if (input == 1) {
                scn = new Scanner(System.in);
                System.out.print("enter social profile: ");
                String line = scn.nextLine().toLowerCase(Locale.ENGLISH);
                try {
                    SocialProfile trim = SocialProfile.trim(line);
                    if (socialProfiles.add(trim)) {
                        System.out.println("added");
                    } else System.out.println("Not added");
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
            if (input == 2) {
                scn = new Scanner(System.in);
                System.out.println("enter social profile");
                String line = scn.nextLine().toLowerCase(Locale.ENGLISH);
                SocialProfile trim = SocialProfile.trim(line);

                if(socialProfiles.remove(trim)){
                    System.out.println("deleted");
                }else{
                    System.out.println("Not found");
                }
//                for (int i = 0; i < socialProfiles.size(); i++) {
//                    if (socialProfiles.get(i).equals(trim)) {  // заменить get(i) на что то другое, повторное отображение
//                        socialProfiles.remove(i);
//                        System.out.println("deleted");
//                    }
//                    else System.out.println("Not found");
//                }
            }
            if (input == 3) {
                System.out.println(socialProfiles);
            }
        }
    }
}

