package Interfence.Ex_1;

public class ShapeCollection implements IShapeCollection{


    public void print(){
        for (int i = 0; i < shapeList.size(); i++) {
            if (shapeList.get(i).getClass() == Rectangle.class) {
                System.out.println("периметр прямоугольника = " + shapeList.get(i).getPerimeter());
            } else if (shapeList.get(i).getClass() ==  Circle.class) {
                System.out.println("площадь круга = " + shapeList.get(i).getSquare());
            }
        }
    }
}
