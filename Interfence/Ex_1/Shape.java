package Interfence.Ex_1;

public interface Shape {


    default void addElm (Shape shape, int size, Shape[] shapes) {
        shapes[size] = shape;
    }

    double getSquare();

    double getPerimeter();
}
