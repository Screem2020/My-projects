package Files.ex_4_RPG_2;

import java.io.Serializable;
import java.util.Objects;

/**
 * Класс Player необходим для создания игроков
 */

public class Player implements Skills, Serializable {
    private String name;
    private int level;
    private int health;
    private int damage;
    private double physicalProtection;
    private double magicProtection;
    protected int con;

    public Player(String name, int level, double physicalProtection, double magicProtection) {
        this.name = name;
        this.level = level;
        this.health = (int) (50 * level * 1.5);
        this.damage = (int) (10 * level * 1.2);
        this.physicalProtection = physicalProtection / 100.0;
        this.magicProtection = magicProtection / 100.0;
    }

    public Player(String name) {
        this.name = name;
    }

    public double getPhysicalProtection() {
        return physicalProtection;
    }

    public double getMagicProtection() {
        return magicProtection;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void basicAttack(Player player) {
        player.setHealth((int) (player.getHealth() - (this.getDamage() - player.physicalProtection)));
    }

    @Override
    public void specialAttack(Player player) {
    }

    /**
     * метод updateLevel необходим для повышения левела посе каждого хода  и обновления параметров
     */
    @Override
    public void updateLevel() {
        setLevel(level += 1);
        setHealth((int) (50 * level * 1.5));
        setDamage((int) (10 * level * 1.2));
        System.out.println("Congratulation, your up level: " + level);
    }

    /**
     * метод equals производит сравнение по имени созданного Player
     *
     * @param o - в аргументы подается Player в классе Object
     * @return возварщает найденного игрока
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public String toString() {
        return "name: " + name + ", " + " level " + level + ", " + " health " + health + ", " + " damage " + damage + ", " + " physicalProtection " +
                physicalProtection + ", " + " magicProtection " + magicProtection + " \n";
    }
}

