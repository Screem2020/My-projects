package Interfence.Ex_2;

public class Water_Gun  extends Weapon{
    public Water_Gun(String name, int power) {
        super(name, power);
    }

    public Water_Gun(String name) {
        super(name);
    }

    @Override
    public int shot() {
        return 0;
    }
}
