package Inheritance.Shooter;

public class Gun extends Weapon{

    public Gun(String name, int power) {
        super(name, power);
    }

    @Override
    public void shot() {
        super.shot();
    }

}
