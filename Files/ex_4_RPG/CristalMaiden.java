package Files.ex_4_RPG;

public class CristalMaiden extends Magic {
    public CristalMaiden(String name) {
        super(name);
    }

    public CristalMaiden(String name, int level) {
        super(name, level);
    }

    public CristalMaiden(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
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
    public int getPhysicalProtection() {
        return 5;
    }

    @Override
    public int getMagicProtection() {
        return 50;
    }
}
