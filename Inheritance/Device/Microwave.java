package Inheritance.Device;

public class Microwave extends Device {
    int power;

    public Microwave (String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", power=" + power +
                '}';
    }
}
