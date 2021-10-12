package Interfence.Ex_1;

import java.util.ArrayList;
import java.util.List;

public interface IShapeCollection {
    List<Shape> shapeList = new ArrayList<>();
    default void addShape (Shape shape) {
        shapeList.add(shape);
    }

    default List<Shape> getShapeList(){
        return shapeList;
    }
}
