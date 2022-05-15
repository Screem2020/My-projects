package Reflection.Restoran;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Dish> dished = new ArrayList<>();

    public List<Dish> getDished() {
        return dished;
    }

    public void orderClient(Dish dish) {
        this.dished.add(dish);
        System.out.println("Блюдо добавлено");
    }

    @Override
    public String toString() {
        return "Order{" +
                "dished=" + dished +
                '}';
    }
}

