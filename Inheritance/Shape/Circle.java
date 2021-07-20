package Inheritance.Shape;

public class Circle extends Shape{
    int radius;

    public Circle(String name,  int radius) {
        super(name);
        this.radius = radius;
    }

    public void area(int radius) {
        System.out.println(super.area = this.radius * 2/3);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
