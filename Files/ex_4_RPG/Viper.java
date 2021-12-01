package Files.ex_4_RPG;

public class Viper extends Magic {

    public Viper() {
        super();
    }

    public Viper(String name) {
        super(name);
    }

    public Viper(String name, int level) {
        super(name, level);
    }

    public Viper(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
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
        return super.getPhysicalProtection();
    }

    @Override
    public double getMagicProtection() {
        return super.getMagicProtection();
    }
}
