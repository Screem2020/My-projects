package Streams.ex_6_Tovar;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Создать класс Tovar с полями название, цена, категория. Создать коллекцию товаров,
    // вывести ее на консоль через stream. Посчитать количество товаров категории "Электротехника" ценой не выше 1000.
    // Вывести это количество на консоль.
    public static void main(String[] args) {
        List<Tovar> tovarList = new ArrayList<>();
        tovarList.add(new Tovar("tv", 200, "electrical"));
        tovarList.add(new Tovar("table", 1000, "kitcher"));
        tovarList.add(new Tovar("phone", 1500, "electrical"));
        tovarList.add(new Tovar("watch", 300, "electrical"));
        long electrical = tovarList.stream()
                .filter(a -> a.category.equalsIgnoreCase("electrical"))
                .filter(a -> a.price < 1000)
                .count();
        System.out.println(electrical);


    }
    @AllArgsConstructor
    @ToString
    static
    class Tovar {
        private String name;
        private int price;
        private String category;
    }
}
