package Files.ex_4_RPG;

public class Healer extends Player {

    public Healer() {
        super();
    }

    public Healer(String name) {
        super(name);
    }

    public Healer(String name, int level) {
        super(name, level);
    }

    public Healer(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void specialAttack(Player player) {
        System.out.println("Special skill " + player.getHealth() + 17);
    }

}
