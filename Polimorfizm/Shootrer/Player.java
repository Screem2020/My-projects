package Polimorfizm.Shootrer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
    private int Health;
    private List<Weapon> listWeapon = new ArrayList<>();

    public Player(int health) {
        Health = health;
    }

    public Player(int health, List<Weapon> listWeapon) {
        Health = health;
        this.listWeapon = listWeapon;
    }

    public int getHealth() {
        return Health;
    }

    public List<Weapon> getListWeapon() {
        return listWeapon;
    }

    public void makeShot(Player p) {
        int hell = 0;
        int index = 0;
        for (int i = 0; i < listWeapon.size(); i++) {
            hell = p.Health - listWeapon.get(i).shot();
            index = i;
        }
        System.out.println("Игроку нанесен урон " + listWeapon.get(index).shot() + " из "+ listWeapon.get(index) + ". Осталось здоровья: " + hell + ".");
    }

    @Override
    public boolean equals(Object o) {
        Player player = (Player) o;
        return Objects.equals(listWeapon, player.listWeapon);
    }

    @Override
    public String toString() {
        return "Player";
    }
}
