package Interfence.Ex_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private final Scanner scn = new Scanner(System.in);
    private final List<Weapon> weaponList = new ArrayList<>();
    private Player player1 = new Player("player1", 100, weaponList);
    private Player player2 = new Player("player2", 100, weaponList);
    //private List<Weapon> list1 = player1.getList();
    //private List<Weapon> list2 = player2.getList();
    private int input = 0;

    public Player getPlayer1() {
        return player1;
    }

    public Game() {
        weaponList.add(new Slingshot("Slingshot", ""));
        weaponList.add(new Gun("Gun", 10));
        weaponList.add(new Machine("Machine", 30));
        weaponList.add(new Rpg("Rpg", 100));
        weaponList.add(new Water_Gun("Water Gun", 0));
    }

    public void start() {
        while (input != 3) {
            System.out.println();
            System.out.println("""
                    1. Сделать выстрел
                    2. Вывод здоровья игроков
                    3. Выход""");
            input = scn.nextInt();
            if (input == 1) {
                System.out.println("step " + player1.getName());
                System.out.println("Выберите оружие: ");
                Weapon[] weaponList1 = new Weapon[weaponList.size()];
                Weapon[] weaponList2 = new Weapon[weaponList.size()];
                player1.step(player1, weaponList1);
                player2.step1(player2, weaponList2);
//                addWeapon();
//                for (int i = 0; i < list1.size(); i++) {
//                    System.out.println(list1.get(i).getName());
//                }
                player1.makeShot(player2);
                if (player2.getHealth() <= 0) {
                    checkWinner();
                    return;
                }
            }
            Player tmp = player1;
            player1 = player2;
            player2 = tmp;

            if (input == 2) {
                System.out.println("Здоровье 1 игрока " + player1.getHealth());
                System.out.println("Здоровье 2 игрока " + player2.getHealth());
            }
            if (input == 3) {
                return;
            }
        }
    }

    public void addWeapon(Weapon[] arr, Weapon[] arr1) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getClass() == Gun.class) {
                System.out.println(arr[i].getName());
            }
            if (arr[i].getClass() == Machine.class) {
                System.out.println(arr[i].getName());
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr[i].getClass() == Rpg.class) {
                System.out.println(arr[i].getName());
            }
            if (arr[i].getClass() == Slingshot.class) {
                System.out.println(arr[i].getName());
            }
            if (arr[i].getClass() == Water_Gun.class) {
                System.out.println(arr[i].getName());
            }
        }
    }

    public void checkWinner() {
        System.out.println("Игра окончена, победил " + player1.getName());
    }
}
