package Files.ex_4_RPG;

public class Magic extends Player {

    public Magic() {
        super();
    }

    public Magic(String name) {
        super(name);
    }

    public Magic(String name, int level) {
        super(name, level);
    }

    public Magic(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
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
        System.out.println("Special attack " + (player.getHealth() - (super.getDamage() * 2)));
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
        return super.getPhysicalProtection();
    }

    @Override
    public int getMagicProtection() {
        return super.getMagicProtection();
    }
}
