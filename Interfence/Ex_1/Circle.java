package Interfence.Ex_1;

public class Circle implements Shape {

    /**
     * p - константа П;
     */
    private int radius;
    private final double p = 3.15;

    protected Circle(int radius) {
        this.radius = radius;
    }

    /**
     * метод нахождения площади
     * @return возвращает площадь
     */
    @Override
    public double getSquare() {
        return (radius * 2) * p;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", p=" + p +
                '}';
    }
}

