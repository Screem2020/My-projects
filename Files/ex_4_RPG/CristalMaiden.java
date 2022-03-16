package Files.ex_4_RPG;

public class CristalMaiden extends Magic {
    public CristalMaiden(String name) {
        super(name);
    }

    public CristalMaiden(String name, int level) {
        super(name, level);
    }

    public CristalMaiden(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public int getPhysicalProtection() {
        return 5;
    }

    @Override
    public int getMagicProtection() {
        return 50;
    }
}
