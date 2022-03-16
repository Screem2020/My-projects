package Files.ex_4_RPG_2;

public class Magic extends Player{

    public Magic(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

    @Override
    public void specialAttack(Player player) {
        System.out.println(getDamage() *2);
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }
}
