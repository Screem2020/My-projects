package Files.ex_4_RPG_2;

public class Hunter extends Player{

    public Hunter(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    public Hunter(String name, int level) {
        super(name, level);
    }

    public Hunter(String name) {
        super(name);
    }

    @Override
    public void specialAttack(Player player) {
        if (player.con % 2 == 0) {
            System.out.println(20);
        }
    }
}
class Huskar extends Hunter {
    public Huskar(String name, int level) {
        super(name, level);
    }

    public Huskar(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public int getPhysicalProtection(int num) {
        return super.getPhysicalProtection(30);
    }

    @Override
    public int getMagicProtection(int num) {
        return super.getMagicProtection(10);
    }
}
class Pudge extends Hunter {
    public Pudge(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }


    @Override
    public int getPhysicalProtection(int num) {
        return super.getPhysicalProtection(50);
    }

    @Override
    public int getMagicProtection(int num) {
        return super.getMagicProtection(3);
    }
}
