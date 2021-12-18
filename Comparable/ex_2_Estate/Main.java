package Comparable.ex_2_Estate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
//Создать класс RealEstate (недвижимость) с private полями:
//- цена
//- площадь
//- количество комнат
//Реализовать интерйес Comparable и сортировку, где сначала выполняется сортировка по возрастанию цены, если цена совпадает, то по убыванию площади (так как по одинаковой цене лучше купить недвижимость побольше). Если совпадает и площадь, то по убыванию количества комнат.
//К примеру, имеется набор объектов недвижимости:
//Цена: 100, Площадь: 50, комнат: 3
//Цена: 100, Площадь: 60, комнат: 2
//Цена: 100, Площадь: 50, комнат: 4
//
//Они должны быть отсортированы следующим образом:
//Цена: 100, Площадь: 60, комнат: 2
//Цена: 100, Площадь: 50, комнат: 4
//Цена: 100, Площадь: 50, комнат: 3

    public static void main(String[] args) {
        List<RealEstate> realEstateList = new ArrayList<>();
        realEstateList.add(new RealEstate(100, 50, 3));
        realEstateList.add(new RealEstate(100, 60, 2));
        realEstateList.add(new RealEstate(100, 50, 4));

        Collections.sort(realEstateList);

        for (RealEstate realEstate : realEstateList) {
            System.out.println(realEstate);
        }
    }
}
