package Interfence.Ex_2;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Player implements Weapons {

    private Scanner scn = new Scanner(System.in);
    private String name;
    private int health;
    private List<Weapon> list;

    public Player(String name, int health, List<Weapon> list) {
        this.name = name;
        this.health = health;
        this.list = list;
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

    @Override
    public boolean equals(Object o) {
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public void stepPlayer1(Player player, Weapon[] weapons) {
        List<Weapon> list = player.getList();
        list.toArray(weapons);
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i].getClass() == Gun.class) {
                System.out.println(weapons[i].getName());
            }
            if (weapons[i].getClass() == Machine.class) {
                System.out.println(weapons[i].getName());
            }
        }
    }

    public void stepPlayer2(Player player, Weapon[] weapons) {
        List<Weapon> list = player.getList();
        list.toArray(weapons);
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i].getClass() == Rpg.class) {
                System.out.println(weapons[i].getName());
            }
            if (weapons[i].getClass() == Water_Gun.class) {
                System.out.println(weapons[i].getName());
            }
            if (weapons[i].getClass() == Slingshot.class) {
                System.out.println(weapons[i].getName());
            }
        }
    }

    public void makeShot(Player player) {
        int index;
        Game game = new Game();
        Player player1 = game.getPlayer1();
        String name_weapon_player = scn.next();
        for (int i = 0; i < list.size(); i++) {
            if (name_weapon_player.equalsIgnoreCase(list.get(i).getName())) {
                if (list.get(i).getClass() == Slingshot.class) {
                    index = i;
                    String text = "";
                    Slingshot slingshot = new Slingshot("", "");
                    System.out.println("Введите материал которым будете стрелять:");
                    System.out.println("glass");
                    System.out.println("stone");
                    text = scn.next();
                    slingshot.setMaterial(text);
                    boolean b = slingshot.getMaterial().equalsIgnoreCase(text);
                    if (b) {
                        player.health = player.getHealth() - slingshot.shot();
                        System.out.println(player1.getName() + " нанесен урон " + slingshot.shot() +
                                "  из " + list.get(index).getName() + " игроку . Осталось здоровья: " + player.health);
                        return;
                    }
                }
                player.health = player.getHealth() - list.get(i).shot();
                index = i;
                System.out.println(player1.getName() + " нанесен урон " + list.get(index).shot() +
                        "  из " + list.get(index).getName() + " игроку . Осталось здоровья: " + player.health);
            }
        }
    }
}
