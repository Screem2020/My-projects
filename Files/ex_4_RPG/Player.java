package Files.ex_4_RPG;

public class Player implements Skills{
    private String name;
    private int level;
    private Character health;
    private double damage;
    private int physicalProtection;
    private int magicProtection;

    public Player(String name, int level, Character health, double damage, int physicalProtection, int magicProtection) {
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

    public double getHealth() {
        return 50*level*1.5;
    }

    public double getDamage() {
        return damage;
    }

    public double getPhysicalProtection() {
        return physicalProtection;
    }

    public int getMagicProtection() {
        return magicProtection;
    }

    @Override
    public void basicAttack(Character ch) {
        System.out.println((int)ch - (10*level*1.2));
    }

    @Override
    public void specialAttack(Character ch) {

    }

    @Override
    public void updateLevel() {
    }
}
