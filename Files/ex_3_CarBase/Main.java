package Files.ex_3_CarBase;

import java.util.List;
import java.util.Scanner;

public class Main {
    //Создайте базу данных автомобильного магазина на основе файла.
    //Создайте класс Car со свойствами:
    //марка
    //модель
    //количество
    //
    //Создайте меню просмотра автомобилей на складе в виде таблицы со столбцами: Марка, Модель, Количество.
    //Добавьте возможность увеличивать, уменьшать количество автомобилей на складе и добавлять новые автомобили у пользователя через консольное меню.
    //
    //Например, есть следующие автомобили:
    //название марка кол-во
    //audi          q7          3
    //bmw           x5          2
    //
    //Пользователь увеличивает кол-во bmw x5 на 1 и файл должен стать:
    //audi          q7          3
    //bmw           x5          3
    //
    //Или например польозватель добавляет новые автомобиль bwm x6 в количестве 5-и штук и файл становится:
    //audi          q7          3
    //bmw           x5          2
    //bmw           x6          5
    public static void main(String[] args) {
        List<Car> listCar = Car.loadCarFromList();
        //String way = "IdeaProjects\\Repeet\\src\\Files\\ex_3_CarBase\\ListCar.txt";
        int input = 0;
        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println("""
                    1.Print list car
                    2.Fix number car
                    3.Add new car
                    4.Exit
                    """);
            input = scn.nextInt();

            if (input == 1) {
                for (Car car : listCar) {
                    System.out.print(car);
                }
            }
            if (input == 2) {


            }
            if (input == 3) {
                scn = new Scanner(System.in);
                System.out.println("Add brend new car");
                String brend = scn.nextLine();
                System.out.println("Add model new car");
                String model = scn.nextLine();
                System.out.println("Add number new car");
                String number = scn.nextLine();
                Car car = new Car(brend, model, number);
                listCar.add(car);
                Car.loadCarFromList();
            }
            if (input == 4) {
                Car.saveCarFromList(listCar);
            }
        }
    }
}
