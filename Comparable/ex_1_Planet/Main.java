package Comparable.ex_1_Planet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // Создать класс Planet с полями
    //-название
    //-диаметр (дробное число)
    //Реализовать в классе интерфейс Comparable, сортирующий планеты по диаметру.
    //
    //В мейне создать список планет. Ниже приведен список планет в порядке увеличения диаметра, их нужно расположить в ArrayList-е в хаотичном порядке, а затем отсортировать и вывести на консоль.
    //Меркурий, диаметр 10.2
    //Венера, диаметр 11
    //Земля, диаметр 12.5
    //Марс, диаметр 14.1
    //Юпитер, диаметр 20.4
    //Сатурн, диаметр 25.2

    public static void main(String[] args) {
        List<Planet> listPlanet = new ArrayList<>();

        listPlanet.add(new Planet("Jupiter", 20.4));
        listPlanet.add(new Planet("Mercury", 10.2));
        listPlanet.add(new Planet("Venus", 11));
        listPlanet.add(new Planet("Mars", 14.1));
        listPlanet.add(new Planet("Saturn", 25.2));
        listPlanet.add(new Planet("Earth", 12.5));

        Collections.sort(listPlanet);

        for (Planet planet : listPlanet) {
            System.out.println(planet);
        }
    }
}
