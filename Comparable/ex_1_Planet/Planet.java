package Comparable.ex_1_Planet;

public class Planet implements Comparable<Planet> {
    private String name;
    private double radius;

    public Planet(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public int compareTo(Planet o) {
        double rad = radius - o.radius;
        if (rad > 0) return 1;
        if (rad < 0) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }

}
