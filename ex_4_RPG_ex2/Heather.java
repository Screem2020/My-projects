package ex_4_RPG_ex2;

public class Heather extends Player {

    public Heather(String name) {
        super(name);
    }

    public Heather(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

    @Override
    public void specialAttack(Player player) {

    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }
}