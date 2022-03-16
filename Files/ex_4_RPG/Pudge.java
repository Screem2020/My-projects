package Files.ex_4_RPG;

public class Pudge extends Hunter{

    public Pudge() {
        super();
    }

    public Pudge(String name) {
        super(name);
    }

    public Pudge(String name, int level) {
        super(name, level);
    }

    public Pudge(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public int getMagicProtection() {
        return 3;
    }

    @Override
    public int getPhysicalProtection() {
        return 50;
    }
}
