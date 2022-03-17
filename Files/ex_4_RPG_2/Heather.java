package Files.ex_4_RPG_2;

public class Heather extends Player{

    public Heather(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    public Heather(String name, int level) {
        super(name, level);
    }

    public Heather(String name) {
        super(name);
    }

    @Override
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

    @Override
    public void specialAttack(Player player) {
        System.out.println(player.getHealth() + 17);
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }
}

class Dazzle extends Heather {
    public Dazzle(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
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
    public Chen(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
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