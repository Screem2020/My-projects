package Inheritance.Shooter;

import java.io.StringReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     * Создать игру шутер.
     * Создать виды оружия:
     * - Пистолет
     * - Автомат
     * - РПГ
     * - Рогатка
     * - Водный пистолет
     *
     * У каждого оружия должны быть параметры: название, мощность.
     * Вынести общие поля в суперкласс.
     * У каждого оружия должен быть метод shot, который выводит на консоль текст "Выстрел из Автомата. Урон 100" или
     * "Выстрел из Рогатки. Урон 10" (в соответствии с оружием, у котого этот метод был вызван).
     *
     * В мейне поместить каждый вид оружия в массив и создать консольное меню:
     * 1. Сделать выстрел (при выборе программа запрашивает название оружия, из которого сделать выстрел. Не забываем,
     * про возможность использования статических констант)
     * 2. Выход
     *
     *
     * Пример работы программы:
     * 1. Сделать выстрел
     * 2. Выход
     * 1
     * Из какого оружия сделать выстрел?
     * Автомат
     * Выстрал из автомата. Урон 100
     *
     * 1. Сделать выстрел
     * 2. Выход
     * 1
     * Рогатка
     * Выстрел из Рогатки. Урон 10
     */
    private static Weapon Gun;
    private static Weapon Machine;
    private static Weapon Rpg;
    private static Weapon Slingshot;
    private static Weapon WaterGun;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Weapon[] weapons = {new Gun("gun",50), new Machine("machine", 80),
                new Rpg("rpg", 100), new Slingshot("slingshot", 5), new WaterGun("waterGun", 1)};
        int input = 0;
        int index = 0;

        while (input != 2) {
            System.out.println("1. Сделать выстрел\n" +
                    "2. Выход\n");
            input = scanner.nextInt();

            switch (input) {
                case 1: {
                    boolean flag = false;
                    System.out.println("Из какого оружия сделать выстрел?");
                    String name = scanner.next().toLowerCase(Locale.ROOT);
                    Weapon weapon = new Weapon(name);
                    for (int i = 0; i < weapons.length; i++) {
                        if (weapons[i].getName().equals(weapon.getName())) {
                            index = i;
                            flag = true;

                        }
                    }
                    if (flag) {
                        weapons[index].shot();
                    } else {
                        System.out.println("Данного оружия не существует");
                    }
                    break;
                }
            }
        }
    }
}