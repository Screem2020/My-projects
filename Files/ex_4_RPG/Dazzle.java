package Files.ex_4_RPG;

public class Dazzle extends Healer {

    public Dazzle() {
        super();
    }


    public Dazzle(String name) {
        super(name);
    }

    public Dazzle(String name, int level) {
        super(name, level);
    }

    public Dazzle(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

    @Override
    public void specialAttack(Player player) {
        super.specialAttack(player);
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
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
    public String getName() {
        return super.getName();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
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
    public double getPhysicalProtection() {
        return 5;
    }

    @Override
    public double getMagicProtection() {
        return 30;
    }
}
