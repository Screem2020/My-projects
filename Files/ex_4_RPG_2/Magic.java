package Files.ex_4_RPG_2;

public class Magic extends Player{

    public Magic(String name) {
        super(name);
    }

    public Magic(String name, int level) {
        super(name, level);
    }

    @Override
    public void basicAttack(Player player) {
        player.getDamage();
    }

    @Override
    public void specialAttack(Player player) {
        if (player.con % 2 == 0) {
            System.out.println(getDamage() * 2);
        }
    }
}

class CrystalMaiden extends Magic {

    public CrystalMaiden(String name, int level) {
        super(name, level);
    }

    @Override
    public int getPhysicalProtection(int num) {
        return super.getPhysicalProtection(5);
    }

    @Override
    public int getMagicProtection(int num) {
        return super.getMagicProtection(50);
    }
}

class Viper extends Magic {


    public Viper(String name, int level) {
        super(name, level);
    }

    @Override
    public int getPhysicalProtection(int num) {
        return super.getPhysicalProtection(15);
    }

    @Override
    public int getMagicProtection(int num) {
        return super.getMagicProtection(30);
    }
}

