package Files.ex_2_Registration;

import java.sql.SQLOutput;
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
        Scanner scan = new Scanner(System.in);
        List<Person> people = PersonOfRgistr.loadOfRegistrList();
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
                Person person = new Person(login, password);
                PersonOfRgistr.loadOfRegistrList();
                try {
                    for (Person value : people) {
                        if (person.getLogin().equals(value.getLogin())) {
                            throw new Exception();
                        }
                    }
                    people.add(person);
                    System.out.println("User added");
                } catch (Exception e) {
                    System.err.println("This user exist, please enter other data");
                }
            }

            if (input == 2) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your login");
                String login = scanner.nextLine();
                System.out.println("Enter your password");
                String password = scanner.nextLine();
                Person person = new Person(login, password);
                try {
                    for (Person value : people) {
                        if (person.equals(value)) {
                            int inputColc = 0;
                            while (inputColc != 3) {
                                System.out.println("""
                                        1. Сложить
                                        2. Поделить
                                        3. Выход
                                        """);
                                inputColc = scan.nextInt();

                                if (inputColc == 1) {
                                    System.out.println("Enter num by summer");
                                    int a = scan.nextInt();
                                    int b = scan.nextInt();
                                    Colc colc = new Colc(a, b);
                                    System.out.println(colc.sum());
                                }
                                if (inputColc == 2) {
                                    System.out.println("Enter num by division");
                                    int a = scan.nextInt();
                                    int b = scan.nextInt();
                                    Colc colc = new Colc(a, b);
                                    System.out.println(colc.division());
                                }
                            }
                        }
                    }
                    throw new Exception("Data incorrect");
                }catch (Exception e) {
                }
            }

            if (input == 3) {
                PersonOfRgistr.saveOfRegister(people);
            }
        }
    }
}