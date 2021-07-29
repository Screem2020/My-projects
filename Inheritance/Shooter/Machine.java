package Inheritance.Shooter;

public class Machine extends Weapon {

    public Machine(String name, int power) {
        super(name, power);
    }

    @Override
    public void shot() {
        super.shot();
    }
}
