package Polimorfizm.Shootrer;

public class Slingshot extends Weapon {

    public Slingshot(String name, int power) {
        super(name, power);
    }
    public Slingshot(String name) {
        super(name);
    }

    @Override
    public int shot() {
        return 5;
    }
}
