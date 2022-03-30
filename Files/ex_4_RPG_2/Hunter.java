package Files.ex_4_RPG_2;

public class Hunter extends Player{

    public Hunter(String name, int level) {
        super(name, level);
    }

    public Hunter(String name) {
        super(name);
    }

    @Override
    public void basicAttack(Player player) {
        player.getDamage();
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

    public Huskar(String name) {
        super(name);
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

    public Pudge(String name) {
        super(name);
    }

    public Pudge(String name, int level) {
        super(name, level);
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
