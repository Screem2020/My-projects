package Files.ex_4_RPG;

public class Hunter  extends Player {

    public Hunter(String name, int level, int health, int damage, int physicalProtection, int magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    public int damageTopor() {
        return 20;
    }

    @Override
    public void basicAttack(Character ch) {
        super.basicAttack(ch);
    }

    @Override
    public void specialAttack(Character ch) {
        damageTopor();
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }
}
