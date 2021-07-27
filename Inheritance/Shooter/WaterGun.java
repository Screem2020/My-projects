package Inheritance.Shooter;

public class WaterGun extends Weapon{

    public WaterGun(String name, int power) {
        super(name, power);
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из водяного пистолета. Урон 1");
    }
}
