package Interfence.Ex_2;

public class Rpg extends Weapon {

    public Rpg(String name, int power) {
        super(name, power);
    }

    @Override
    public int shot() {
        return 100;
    }
}
