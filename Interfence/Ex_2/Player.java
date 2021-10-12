package Interfence.Ex_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements Weapons {

    private final Scanner scn = new Scanner(System.in);
    private String name = "";
    private int health;
    private final ArrayList<Weapon> list = new ArrayList<>();

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public int getHealth() {
        return health;
    }

    public List<Weapon> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    @Override
    public int shot() {
        return 0;
    }

    public void selectWeapon(List<Weapon> weaponList){

        int num = 0;
        int reverse = 5;
        int index;
        while (num != 3) {
            index = (int) (Math.random() * --reverse);
            list.add(weaponList.get(index));
            weaponList.remove(index);
            num++;
        }
        System.out.println("Игрок "+getName()+" выбрал оружия:");
        System.out.println(list);
    }


    public void makeShot(Player player) {
        System.out.println("Вам доступно оружие:");
        System.out.println(list);
        int index = 0;
        Weapon shotWeapon;
        String name_weapon_player = scn.next();
        index = list.indexOf(new Weapon(name_weapon_player));
        if (index == -1) System.out.println("Оружия в списке нет");
        else {
            shotWeapon = list.get(index);

            Weapon slingshot = list.get(index);
            if (slingshot.getClass() == Slingshot.class) {
                String text = "";
                System.out.println("Введите материал которым будете стрелять:");
                System.out.println("glass");
                System.out.println("stone");
                text = scn.next();
                ((Slingshot) slingshot).setMaterial(text);
                boolean b = ((Slingshot) slingshot).getMaterial().equalsIgnoreCase(text);
                if (b) {
                    shotWeapon = slingshot;
                }
            }
            player.health = player.getHealth() - shotWeapon.shot();
            System.out.println(getName() + " нанесен урон " + shotWeapon.shot() +
                    "  из " + shotWeapon.getName() + " игроку . Осталось здоровья: " + player.health);
        }
    }

    @Override
    public String toString() {
        return name + "\n";
    }
}