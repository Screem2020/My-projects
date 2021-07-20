package Inheritance.Device;

public class Phone extends Device {
    int memory;

    public Phone(String name, int price, int memory) {
        super(name, price);
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", memory=" + memory +
                '}';
    }
}
