package Files.ex_4_RPG_2;

public class Heather extends Player {

    public Heather(String name, int level, int physicalProtection, int magicProtection) {
        super(name, level, physicalProtection, magicProtection);
    }

    public Heather(String name) {
        super(name);
    }

    @Override
    public void specialAttack(Player player) {
        if (player.con % 2 == 0) {
            System.out.println(player.getHealth() + 17);
        }
    }
}

class Dazzle extends Heather {

    public Dazzle(String name, int level, int physicalProtection, int magicProtection) {
        super(name, level, physicalProtection, magicProtection);
    }
}


    class Chen extends Heather {

        public Chen(String name, int level, int physicalProtection, int magicProtection) {
            super(name, level, physicalProtection, magicProtection);
        }
    }