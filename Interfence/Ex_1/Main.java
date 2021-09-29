package Interfence.Ex_1;

public class Main {
    public static void main(String[] args) throws Exception {

        Circle circle = new Circle(100);
        Rectangle rectangle = new Rectangle(4, 5);
        Shape[] shapes = new Shape[5];

        rectangle.addElm(rectangle, 0, shapes);
        circle.addElm(circle, 1, shapes);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle) {
                System.out.println("периметр прямоугольника = " + shapes[i].getPerimeter());
            } else if (shapes[i] instanceof Circle) {
                System.out.println("площадь круга = " + shapes[i].getSquare());
            } else
                return;
        }
    }
}

