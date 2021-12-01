package Files.RPG_version2.ex_4_RPG;

public class Huskar extends Hunter {

    public Huskar(String name) {
        super(name);
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    public double physicalProtection() {
        return super.getDamage() - ((super.getDamage() * super.getPhysicalProtection()) / 100);
    }

    public double magicProtection() {
        return this.getDamage() - ((super.getDamage() * super.getMagicProtection()) / 100);
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
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

    @Override
    public double getPhysicalProtection() {
        return 30;
    }

    @Override
    public double getMagicProtection() {
        return 10;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
