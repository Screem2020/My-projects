package Inheritance.Shooter;

import java.util.Objects;

public class Weapon {

    private  String name;
    private  int power;

    public Weapon(String name) {
        this.name = name;
    }

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void shot() {
        System.out.println("Выстрел из " + this.name + ". Урон: " + this.power);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return Objects.equals(name, weapon.name);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
