package Files.ex_4_RPG_2;

public class Hunter extends Player{

    public Hunter(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void specialAttack(Player player) {
        System.out.println(20);
    }
}
