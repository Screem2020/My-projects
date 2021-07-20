package Inheritance.Device;

public class Device {
    String name;
    int price;

    public Device(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
