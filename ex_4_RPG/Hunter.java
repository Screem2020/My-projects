package Files.RPG_version2.ex_4_RPG;

public class Hunter extends Player {

    public Hunter(String name) {
        super(name);
    }

    public Hunter(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
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
    public double getMagicProtection() {
        return super.getMagicProtection();
    }

    @Override
    public double getPhysicalProtection() {
        return super.getPhysicalProtection();
    }

    @Override
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

    @Override
    public void specialAttack(Player player) {
        System.out.println(player.getHealth() - (this.getDamage() + 20));
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }


}
