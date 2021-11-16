package Files.ex_2_Registration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Создать систему авторизаций, которая хранит логины и пароли зарегистрированных пользователей в файле.
    // При старте программы, она должна считывать данные из этого файла. При завершении работы - обновлять данные в файле.
    // В программе создать консольное меню:
    //1. Регистрация (пользователь вводит логин или пароль. Программа проверяет, что такой логин еще не занят)
    //2. Вход в систему (при успешном входе в систему у пользователя открывается меню калькулятора)
    //3. Выход
    //
    //Меню для калькулятора:
    //1. Сложить
    //2. Поделить
    //3. Выход (при выборе пользователь возвращается в главное меню)
    public static void main(String[] args) {
        String way = "src\\Files\\ex_2_Registration\\LoginAndPassword.txt";

        Scanner scan = new Scanner(System.in);
        List<Person> listPerson = new ArrayList<>();
        int input = 0;
        while (input != 3) {
            System.out.println("""
                    1. Регистрация
                    2. Вход в систему
                    3. Выход
                    """);
            input = scan.nextInt();
            if (input == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter login");
                String login = scanner.nextLine();
                System.out.println("Enter password");
                String password = scanner.nextLine();
                File file = new File(way);
                try {
                    Scanner scn = new Scanner(file);
                    Person person = new Person(login, password);
                    for (Person value : listPerson) {
                        if (person.getLogin().equals(value.getLogin())) {
                            System.out.println("This user exist, please enter other data");
                        }
                    }
                    listPerson.add(person);
                    scn.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                //Person person = new Person(login, password);

                //listPerson.add(person);
            }


//                try{
//                    File file = new File(way);
//                    Scanner scnFile = new Scanner(file);
//                    while (scnFile.hasNextLine()) {
//                        String line = scnFile.nextLine();
//                    }
//                    scnFile.close();
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
            if (input == 2) {
                int inputColc = 0;
                while (inputColc != 3) {
                    System.out.println("""
                            1. Сложить
                            2. Поделить
                            3. Выход
                            """);
                    inputColc = scan.nextInt();

                    if (inputColc == 1) {

                    }
                }
            }

            if (input == 3) {
                try {
                    PrintWriter printWriter = new PrintWriter(way);
                    for (Person pers : listPerson) {
                        printWriter.println("login = " + pers.getLogin() + "; " + "password " + pers.getPassword());
                    }
                    printWriter.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
//
                return;

            }
        }
    }
}
