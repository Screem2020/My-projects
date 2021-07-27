package Inheritance.Shooter;

import java.util.Objects;

public class Weapon {

    private String name;
    private int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Weapon(String name) {
        this.name = name;
    }

    public void shot() {
        System.out.println("shot");
    }

    @Override
    public boolean equals(Object o) {
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
