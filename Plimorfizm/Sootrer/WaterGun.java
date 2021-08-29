package Plimorfizm.Sootrer;

public class WaterGun extends Weapon {

    public WaterGun(String name, int power) {
        super(name, power);
    }

    public WaterGun(String name) {
        super(name);
    }

    @Override
    public int shot() {
        return 1;
    }
}
