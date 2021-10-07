package Interfence.Ex_2;

public class Machine extends Weapon{
    public Machine(String name, int power) {
        super(name, power);
    }

    @Override
    public int shot() {
        return 3 * (int) ((Math.random() * 10) + 10);
    }
}
