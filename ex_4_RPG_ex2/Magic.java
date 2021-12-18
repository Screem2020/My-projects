package ex_4_RPG_ex2;

public class Magic extends Player {

    public Magic(String name) {
        super(name);
    }

    public Magic(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
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
