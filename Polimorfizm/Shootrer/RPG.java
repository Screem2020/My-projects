package Polimorfizm.Shootrer;

public class RPG extends Weapon {
    public RPG(String name, int power) {
        super(name, power);
    }
    public RPG(String name) {
        super(name);
    }

    @Override
    public int shot() {
        return 100;
    }
}
