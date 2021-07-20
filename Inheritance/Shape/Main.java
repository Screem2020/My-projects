package Inheritance.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     *  Создать суперкласс Shape с методами получения площади фигуры и полем в виде названия фигуры. Создать конструктор.
     *  Создать два подкласса: Rectangle и Circle. Создать поля у подклассов, создать конструкторы, реализовать подсчет площади и переопределить toString.
     *  Сделать так, чтобы не было дублированного кода.
     *  В мейне создать список типа Shape, вывести в цикле информацию о каждой фигуре через toString (название, стороны, площадь) и найти максимальную площадь.
     */
    public static void main(String[] args) {
        Shape shape = new Shape("Rectangle");
        Rectangle rectangle = new Rectangle("rectangle", 3);
        Circle circle = new Circle("circle", 5);
        circle.area(5);
        String s1 = circle.toString();
        System.out.println(s1);
        rectangle.area(3);
        System.out.println(shape);
        String s = rectangle.toString();
        System.out.println(s);
        System.out.println();
        List<Shape> arr = new ArrayList<>();
        arr.add(rectangle);
        arr.add(circle);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
        if (rectangle.area > circle.area) {
            System.out.println("rectangle " + rectangle.area);
        }
        else
            System.out.println("circle " + circle.area);
    }
}
