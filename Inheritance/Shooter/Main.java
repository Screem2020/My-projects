package Inheritance.Shooter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Weapon Gun;
    private static Weapon Machine;
    private static Weapon Rpg;
    private static Weapon Slingshot;
    private static Weapon WaterGun;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Weapon[] weapons = {Gun, Machine, Rpg, Slingshot, WaterGun};
        int input = 0;
        while (input != 2) {
            System.out.println("1. Сделать выстрел\n" +
                    "2. Выход\n");
            input = scanner.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Из какого оружия сделать выстрел?");
                    String name = scanner.next().toLowerCase(Locale.ROOT);
                    Weapon weapon = new Weapon(name);
                    for (int i = 0; i < weapons.length; i++) {
                        if (weapons[i].equals(weapon)) {
                            weapons[i].shot();
                        }
                    }
                    break;
                }
            }
        }
    }
}