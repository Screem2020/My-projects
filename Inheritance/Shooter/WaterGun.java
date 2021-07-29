package Inheritance.Shooter;

public class WaterGun extends Weapon{

    public WaterGun(String name, int power) {
        super(name, power);
    }

    @Override
    public void shot() {
        super.shot();
    }
}
