package Files.ex_4_RPG_2;

public class Magic extends Player{

    public Magic(String name) {
        super(name);
    }

    public Magic(String name, int level, int physicalProtection, int magicProtection) {
        super(name, level, physicalProtection, magicProtection);
    }

    @Override
    public void specialAttack(Player player) {
        if (player.con % 2 == 0) {
            System.out.println((player.getDamage() * 2));
        }
    }
}

class CrystalMaiden extends Magic {

    public CrystalMaiden(String name, int level, int physicalProtection, int magicProtection) {
        super(name, level, physicalProtection, magicProtection);
    }

    public CrystalMaiden(String name) {
        super(name);
    }

}

class Viper extends Magic {

    public Viper(String name) {
        super(name);
    }

    public Viper(String name, int level, int physicalProtection, int magicProtection) {
        super(name, level, physicalProtection, magicProtection);
    }
}

