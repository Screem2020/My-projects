package Plimorfizm.Sootrer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * В мейне создать двух игроков, добавить им оружие
     * Создать консольное меню:
     * 1. Сделать выстрел (при выборе программа выводит все доступные виды оружия у игрока и спрашивает, из какого сделать выстрел)
     * 2. Выход
     * <p>
     * Пример работы программы:
     * <p>
     * Допустим, у игрока 1 оружия: Автомат и Рогатка, у игрока 2: Пистолет и РПГ.
     * Пусть первым ходит игрок 1, тогда:
     * <p>
     * 1. Сделать выстрел
     * 2. Выход
     * 1
     * Ход игрока 1
     * Выберите оружие
     * Автомат
     * Рогатка
     * <p>
     * Автомат
     * Игроку 2 нанесен урон 100 из автомата. Осталось здоровья: 900.
     * <p>
     * 1. Сделать выстрел
     * 2. Выход
     * 1
     * Ход игрока 2
     * Выберите оружие
     * Пистолет
     * Рогатка
     * <p>
     * РПГ
     * Игроку 1 нанесен урон 300 из РПГ. Осталось здоровья 700.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = 0;
        List<Weapon> listWeapon = new ArrayList<>();
        listWeapon.add(new Gun("Gun", 20));
        listWeapon.add(new Machine("Machine", 80));
        listWeapon.add(new RPG("RPG", 100));
        listWeapon.add(new Slingshot("SlingShot", 5));
        listWeapon.add(new WaterGun("WaterGun",1));
        ArrayList<Weapon> listWeapon1 = new ArrayList<>();
        ArrayList<Weapon> listWeapon2 = new ArrayList<>();
        Player player1 = new Player(100, listWeapon1);
        Player player2 = new Player(100, listWeapon2);
        while (input != 2) {
            System.out.println(
                    "1.Сделать выстрел \n" +
                            "2.Выход");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Ход 1 игрока");
                    System.out.println("Выбирите оружие");
                    for (int i = 0; i < listWeapon.size(); i++) {
                        if (listWeapon.get(i).getClass() == Gun.class) {
                            System.out.println(listWeapon.get(i).getName());
                        }
                    }
                    for (int i = 0; i < listWeapon.size(); i++) {
                        if (listWeapon.get(i).getClass() == Machine.class) {
                            System.out.println(listWeapon.get(i).getName());
                        }
                    }
                    String name = scn.next();
                    Weapon weapon = new Weapon(name);
                    boolean flag = false;
                    for (int i = 0; i < listWeapon.size(); i++) {
                        if (listWeapon.get(i).getName().equalsIgnoreCase(weapon.getName())) {
                            if ((player2.getHealth() - listWeapon.get(i).getPower())  <= 0) {
                                System.out.println("Игра окончена, игрок 2 убит");
                                return;
                            } else {
                                listWeapon1.add(listWeapon.get(i));
                                player1.makeShot(player2);
                                flag = true;
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Такого оружия не существует");
                    }
                    System.out.println();
                    System.out.println("Ход 2 игрока");
                    System.out.println("Выбирите оружие");
                    for (int i = 0; i < listWeapon.size(); i++) {
                        if (listWeapon.get(i).getClass() == RPG.class) {
                            System.out.println(listWeapon.get(i).getName());
                        }
                    }
                    for (int i = 0; i < listWeapon.size(); i++) {
                        if (listWeapon.get(i).getClass() == WaterGun.class) {
                            System.out.println(listWeapon.get(i).getName());
                        }
                    }
                    for (int i = 0; i < listWeapon.size(); i++) {
                        if (listWeapon.get(i).getClass() == Slingshot.class) {
                            System.out.println(listWeapon.get(i).getName());
                        }
                    }
                    String namePlayer2 = scn.next();
                    Weapon weaponPlayer2 = new Weapon(namePlayer2);
                    boolean flag1 = false;
                    for (int i = 0; i < listWeapon.size(); i++) {
                        if (listWeapon.get(i).getName().equalsIgnoreCase(weaponPlayer2.getName())) {
                            if ((player2.getHealth() - listWeapon.get(i).getPower())  <= 0) {
                                System.out.println("Игра окончена, игрок 1 убит");
                                return;
                            } else {
                                listWeapon2.add(listWeapon.get(i));
                                player2.makeShot(player1);
                                flag1 = true;
                            }
                        }
                    }
                    if (!flag1) {
                        System.out.println("Такого оружия не существует");
                    }
                    break;
                }
            }
        }
    }
}
