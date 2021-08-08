package Color;

import java.util.Objects;

public class Rectangle {
    private Color color;
    private int a, b;

    public Rectangle(Color color, int a, int b) {
        this.color = color;
        this.a = a;
        this.b = b;
    }

    public Rectangle(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void getColors(Color colors) {
        Color[] color = Color.values();
        for (int i = 0; i < color.length; i++) {
            if (color[i].equals(colors)) {
                System.out.println(color[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return color == rectangle.color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + color.getPseudonym() +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
