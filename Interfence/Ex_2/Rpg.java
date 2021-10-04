package Interfence.Ex_2;

public class Rpg extends Weapon {

    public Rpg(String name, int power) {
        super(name, power);
    }

    public Rpg(String name) {
        super(name);
    }

    @Override
    public int shot() {
        return 100;
    }
}
