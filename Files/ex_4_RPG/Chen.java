package Files.ex_4_RPG;

public class Chen extends Healer {

    public Chen() {
        super();
    }

    public Chen(String name) {
        super(name);
    }

    public Chen(String name, int level) {
        super(name, level);
    }

    public Chen(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public int getPhysicalProtection() {
        return 10;
    }

    @Override
    public int getMagicProtection() {
        return 20;
    }
}
