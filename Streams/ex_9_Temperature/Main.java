package Streams.ex_9_Temperature;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Создать класс Tempreture с полем в виде средней температурой за месяц (double).
    // В мейне создать массив или список объектов класса Temperature. Найти с помощью stream сумму температур в
    // массиве в типе double. После нахождения поделить ее на количество месяцев и вывести на консоль.
    public static void main(String[] args) {
        List<Temperature> list = new ArrayList<>();
        list.add(new Temperature(12.5));
        list.add(new Temperature(5.5));
        list.add(new Temperature(16.0));
        list.add(new Temperature(22.5));

        double sum = list.stream().mapToDouble(a -> a.average).sum();
        System.out.println(sum / 4);



    }
    @ToString
    @AllArgsConstructor
    static
    class Temperature {
        private double average;
    }

}
