package Files.ex_4_RPG;

public class Dazzle extends Healer {

    public Dazzle() {
        super();
    }


    public Dazzle(String name) {
        super(name);
    }

    public Dazzle(String name, int level) {
        super(name, level);
    }

    public Dazzle(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }


    @Override
    public int getPhysicalProtection() {
        return 5;
    }

    @Override
    public int getMagicProtection() {
        return 30;
    }
}
