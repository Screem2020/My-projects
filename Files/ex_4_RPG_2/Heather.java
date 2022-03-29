package Files.ex_4_RPG_2;

public class Heather extends Player{

    public Heather(String name, int level) {
        super(name, level);
    }

    public Heather(String name) {
        super(name);
    }

    @Override
    public void basicAttack(Player player) {
        player.getDamage();
    }

    @Override
    public void specialAttack(Player player) {
        if (player.con % 2 == 0) {
            System.out.println(player.getHealth() + 17);
        }
    }
}

class Dazzle extends Heather {

    public Dazzle(String name, int level) {
        super(name, level);
    }

    @Override
    public int getPhysicalProtection(int num) {
        return 5;
    }

    @Override
    public int getMagicProtection(int num) {
        return 30;
    }
}

class Chen extends Heather {

    public Chen(String name, int level) {
        super(name, level);
    }

    @Override
    public int getPhysicalProtection(int num) {
        return 10;
    }

    @Override
    public int getMagicProtection(int num) {
        return 20;
    }
}