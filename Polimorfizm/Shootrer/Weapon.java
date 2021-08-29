package Polimorfizm.Shootrer;

import java.util.Objects;

public class Weapon {

    private String name;
    private int power;

    public Weapon(String name) {
        this.name = name;
    }

    public Weapon(int power) {
        this.power = power;
    }

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int shot() {
       return 0;
    }

    @Override
    public boolean equals(Object o) {
        Weapon weapon = (Weapon) o;
        return Objects.equals(name, weapon.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
