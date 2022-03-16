package Files.ex_4_RPG_2;

public class Player implements Skills {
    private String name;
    private int level;
    private int health;
    private int damage;
    private int physicalProtection;
    private int magicProtection;

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Player(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        this(name, level);
        this.health = health;
        this.damage = damage;
        this.physicalProtection = physicalProtection;
        this.magicProtection = magicProtection;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void basicAttack(Player player) {

    }

    @Override
    public void specialAttack(Player player) {

    }

    @Override
    public void updateLevel() {

    }
}

