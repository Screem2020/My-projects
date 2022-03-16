package Files.ex_4_RPG;

public class Magic extends Player {

    public Magic() {
        super();
    }

    public Magic(String name) {
        super(name);
    }

    public Magic(String name, int level) {
        super(name, level);
    }

    public Magic(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void specialAttack(Player player) {
        System.out.println("Special attack " + (player.getHealth() - (super.getDamage() * 2)));
    }
}

