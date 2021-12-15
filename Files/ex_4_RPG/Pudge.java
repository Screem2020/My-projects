package Files.ex_4_RPG;

public class Pudge extends Hunter{

    public Pudge() {
        super();
    }

    public Pudge(String name) {
        super(name);
    }

    public Pudge(String name, int level) {
        super(name, level);
    }

    public Pudge(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public int physicalProtection() {
        return super.physicalProtection();
    }

    @Override
    public int magicProtection() {
        return super.magicProtection();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }

    @Override
    public void specialAttack(Player player) {
        super.specialAttack(player);
    }

    @Override
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

    @Override
    public int getMagicProtection() {
        return 3;
    }

    @Override
    public int getPhysicalProtection() {
        return 50;
    }
}
