package Files.ex_4_RPG_2;

public class Hunter extends Player{

    public Hunter(String name, int level, int physicalProtection, int magicProtection) {
        super(name, level, physicalProtection, magicProtection);
    }

    public Hunter(String name) {
        super(name);
    }

    @Override
    public void specialAttack(Player player) {
        if (player.con % 2 == 0) {
            player.setDamage(player.getDamage() + 20);
        }
    }
}
class Huskar extends Hunter {
    public Huskar(String name, int level, int physicalProtection, int magicProtection) {
        super(name, level, physicalProtection, magicProtection);
    }
}
class Pudge extends Hunter {

    public Pudge(String name, int level, int physicalProtection, int magicProtection) {
        super(name, level, physicalProtection, magicProtection);
    }
}
