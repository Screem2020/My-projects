package Interfence.Ex_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private final Scanner scn = new Scanner(System.in);
    private final List<Weapon> weaponList = new ArrayList<>();
    private Player player1 = new Player("player1", 100);
    private Player player2 = new Player("player2", 100);
    private int input = 0;



    private void initWeaponList(){
        weaponList.clear();
        weaponList.add(new Slingshot("Slingshot", ""));
        weaponList.add(new Gun("Gun", 10));
        weaponList.add(new Machine("Machine", 30));
        weaponList.add(new Rpg("Rpg", 100));
        weaponList.add(new Water_Gun("Water Gun", 0));
    }

    public void start() {
        initWeaponList();
        player1.selectWeapon(weaponList);
        initWeaponList();
        player2.selectWeapon(weaponList);
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
                player1.makeShot(player2);
                if (player2.getHealth() <= 0) {
                    checkWinner();
                    return;
                }
                Player tmp = player1;
                player1 = player2;
                player2 = tmp;
            }
            else if (input == 2) {
                System.out.println("Здоровье 1 игрока " + player1.getHealth());
                System.out.println("Здоровье 2 игрока " + player2.getHealth());
            }
            else if (input == 3) {
                return;
            }
        }
    }

    public void checkWinner() {
        System.out.println("Игра окончена, победил " + player1.getName());
    }
}
