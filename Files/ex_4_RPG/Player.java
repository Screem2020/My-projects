package Files.ex_4_RPG;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Skills, Serializable {

    private String name;
    private int level;
    private int health;
    private int damage;
    private int physicalProtection;
    private int magicProtection;
    public int con;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int level) {
        this(name);
        this.level = level;
    }

    public Player(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        this(name, level);
        this.health = health;
        this.damage = damage;
        this.physicalProtection = physicalProtection;
        this.magicProtection = magicProtection;
    }

    public int physicalProtection() {
        return (int) (damage - (damage * physicalProtection / 100.0));
    }

    public int magicProtection() {
        return (int) (damage - (damage * magicProtection / 100.0));
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return (int) (50*level*1.5);
    }

    public int getDamage() {
        return (int) (10*level*1.2);
    }

    public int getPhysicalProtection() {
        return physicalProtection;
    }

    public int getMagicProtection() {
        return magicProtection;
    }

    @Override
    public void basicAttack(Player player) {
        System.out.println(player.health - this.getDamage());
    }

    @Override
    public void specialAttack(Player player) {
    }

    @Override
    public void updateLevel() {
        level += 1;
        System.out.println("Congratulation, your level up");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return level == player.level && Objects.equals(name, player.name);
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + ":" + " level=" + level + ", health=" + health +
                ", damage=" + damage +
                ", physicalProtection=" + physicalProtection +
                ", magicProtection=" + magicProtection +
                '}';
    }
}
