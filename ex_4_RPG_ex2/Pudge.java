package ex_4_RPG_ex2;

public class Pudge extends Hunter {

    public Pudge(String name) {
        super(name);
    }

    public Pudge(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }
    public int physicalProtection(Player player) {
        return (player.getDamage() * 50) / 100;
    }
    public int magicProtection(Player player) {
        return (player.getDamage() * 3) / 100;
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
    public double getMagicProtection() {
        return super.getMagicProtection();
    }

    @Override
    public double getPhysicalProtection() {
        return super.getPhysicalProtection();
    }
}
