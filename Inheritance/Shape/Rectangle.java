package Inheritance.Shape;

public class Rectangle extends Shape{
    int side;

    public Rectangle(String name, int side) {
        super(name);
        this.side = side;
    }
    public void area(int side) {
        System.out.println(super.area = this.side*2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + side +
                ", name='" + name + '\'' +
                ", area=" + this.area +
                '}';
    }
}
