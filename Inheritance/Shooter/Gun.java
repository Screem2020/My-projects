package Inheritance.Shooter;

public class Gun extends Weapon{

    public Gun(String name, int power) {
        super(name, power);
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из пистолета. Урон 40");
    }
}
