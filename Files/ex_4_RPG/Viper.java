package Files.ex_4_RPG;

public class Viper extends Magic {

    public Viper() {
        super();
    }

    public Viper(String name) {
        super(name);
    }

    public Viper(String name, int level) {
        super(name, level);
    }

    public Viper(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }
}
