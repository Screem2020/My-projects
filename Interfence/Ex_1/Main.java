package Interfence.Ex_1;

public class Main {
    public static void main(String[] args) throws Exception {

        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.addShape(new Circle(10));
        shapeCollection.addShape(new Rectangle(4, 5));
        shapeCollection.print();



    }
}

