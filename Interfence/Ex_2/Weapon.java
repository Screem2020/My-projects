package Interfence.Ex_2;

public class Weapon implements Weapons {

    private String name;
    private int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        Weapon weapon = (Weapon) o;
        return name.equalsIgnoreCase(weapon.getName());
    }



    @Override
    public int shot() {
        return 0;
    }
}


