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
    private int physicalProtection;
    private int magicProtection;
    protected int con;

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        this(name, level);
        this.health = health;
        this.damage = damage;
        this.physicalProtection = physicalProtection;
        this.magicProtection = magicProtection;
    }

    public int getPhysicalProtection(int num) {
        return num / 100;
    }

    public int getMagicProtection(int num) {
        return num / 100;
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

    @Override
    public void basicAttack(Player player) {

    }

    @Override
    public void specialAttack(Player player) {

    }

    /**
     * метод updateLevel необходим для повышения левела посе каждого хода
     */
    @Override
    public void updateLevel() {
        level +=1;
        System.out.println("Congratulation, your up level");
    }

    /**
     * метод equals производит сравнение по имени созданного Player
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

