package Inheritance.Shooter;

public class Slingshot extends Weapon{

    public Slingshot(String name, int power) {
        super(name, power);
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из рогатки. Урон 10");
    }
}
