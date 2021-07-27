package Inheritance.Shooter;

public class Rpg extends Weapon {
    public Rpg(String name, int power) {
        super(name, power);
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из РПГ. Урон 100");
    }
}
