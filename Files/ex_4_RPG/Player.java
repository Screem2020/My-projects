package Files.ex_4_RPG;

public class Player {
    private String name;
    private int level;
    private int health;
    private int damage;
    private int physicalProtection;
    private int magicProtection;

    public Player(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.physicalProtection = physicalProtection;
        this.magicProtection = magicProtection;
    }

    public void basicAttack(Character ch) {
        System.out.println(damage);
    }

    public void specialAttack(Character ch) {

    }

    public void updateLevel() {

    }

}