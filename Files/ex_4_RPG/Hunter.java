package Files.ex_4_RPG;

public class Hunter extends Player {

    public Hunter(String name, int level, Character health, double damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void basicAttack(Character ch) {
        super.basicAttack(ch);
    }

    @Override
    public void specialAttack(Character ch) {
        System.out.println((int)ch - 20);
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }


}
