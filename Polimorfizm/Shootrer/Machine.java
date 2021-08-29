package Polimorfizm.Shootrer;

public class Machine extends Weapon {

    public Machine(String name, int power) {
        super(name, power);
    }

    public Machine(String name) {
        super(name);
    }

    @Override
    public int shot() {
        return 80;
    }
}
