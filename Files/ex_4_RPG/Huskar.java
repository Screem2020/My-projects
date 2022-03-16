package Files.ex_4_RPG;

public class Huskar extends Hunter{

    public Huskar() {
        super();
    }

    public Huskar(String name) {
        super(name);
    }

    public Huskar(String name, int level) {
        super(name, level);
    }

    public Huskar(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public int getPhysicalProtection() {
        return 30;
    }

    @Override
    public int getMagicProtection() {
        return 10;
    }

}
