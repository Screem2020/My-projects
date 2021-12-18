package ex_4_RPG_ex2;

public class Player implements Skills {
    private String name;
    private int level;
    private int health;
    private int damage;
    private double physicalProtection;
    private double magicProtection;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.physicalProtection = physicalProtection;
        this.magicProtection = magicProtection;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    final public int getHealth() {
        return (int) (50*level*1.5);
    }

    public int getDamage() {
        return (int) (10*level*1.2);
    }

    public double getPhysicalProtection() {
        return physicalProtection;
    }

    public double getMagicProtection() {
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
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", damage=" + damage +
                ", physicalProtection=" + physicalProtection +
                ", magicProtection=" + magicProtection +
                '}';
    }


}
