package Files.ex_4_RPG;

public class Magic extends Player {

    public Magic(String name, int level, Character health, double damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public void basicAttack(Character ch) {
        super.basicAttack(ch);
    }

    @Override
    public void specialAttack(Character ch) {
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }
}
