package Files.ex_4_RPG_2;

public class Heather extends Player{

    public Heather(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

    @Override
    public void specialAttack(Player player) {
        System.out.println(player.getHealth() + 17);
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }
}
