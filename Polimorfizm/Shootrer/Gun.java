package Polimorfizm.Shootrer;

public class Gun extends Weapon {

    public Gun(String name, int power) {
        super(name, power);
    }

    public Gun(String name) {
        super(name);
    }

    @Override
    public int shot() {
        return 20;
    }


}
