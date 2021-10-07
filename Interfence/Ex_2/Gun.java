package Interfence.Ex_2;

public class Gun extends Weapon {

    public Gun(String name, int power) {
        super(name, power);
    }

    @Override
    public int shot() {
        return  (int) ((Math.random() * 10) + 10);
    }
}
