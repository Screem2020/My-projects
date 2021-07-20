package Inheritance.Shape;

public class Shape {
    String name;
    int area;


    public Shape(String name) {
        this.name = name;
    }

    public void area(int side) {
        System.out.println(side * 4 );
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
