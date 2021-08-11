package Planets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * 3. Создать систему доставки посылок между планетами солнечной системы.
     * Создать enum Planets с перечислеными планетами из солнечной системы: Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран и Нептун.
     * Создать класс Parcel (посылка) с полем - содержимое посылки (типа String)
     * Создать класс Planet с полями
     * название планеты (enum Planets)
     * список доставленных посылок
     * <p>
     * В мейне создать список планет (Planet) и список посылок (Parcel), заполните список посылок минимум пятью посылками любого содержимого.
     * Далее запустите цикл. Цикл должен работать до тех пор, пока список посылок не опустеет.
     * Внутри цикла должна работать система доставки в виде вывода следующего содержимого:
     * Капитан! У нас есть еще недоставленная посылка: [название посылки]. На какую планету ее доставить?
     * (юзер вводит название планеты)
     * Земля
     * Посылка [название посылки] отправлена на планету земля!
     * (продолжаем, если остались еще посылки)
     * Капитан! У нас есть еще недоставленная посылка: [название посылки]. На какую планету ее доставить?
     * и так далее....
     * <p>
     * когда цикл закончится, нужно вывести текст "Все посылки доставлены" и вывести на консольноль список посылок с каждой планеты.
     * <p>
     * Когда юзер вводит название планеты, программа должна добавить посылку в список доставленных посылок у планеты.
     */

    public static void main(String[] args) {
        List<Parcel> parcels = new ArrayList<>();
        List<Planet> planet = new ArrayList<>();
        parcels.add(new Parcel("bred"));
        parcels.add(new Parcel("eggs"));
        parcels.add(new Parcel("potatoes"));
        parcels.add(new Parcel("cheese"));
        parcels.add(new Parcel("milk"));
        Planets[] allPlanets = Planets.values();
        for (int i = 0; i < allPlanets.length; i++) {
            planet.add(new Planet(allPlanets[i]));
        }
        Scanner scn = new Scanner(System.in);
        int index = 0;
        while (true) {
            System.out.println("Капитан! У нас есть еще недоставленная посылка:" + parcels.get(index) + ". На какую планету ее доставить?");
            Planets planet1 = null;
            while (planet1 == null) {
                System.out.println("Введите название планеты");
                String name = scn.next();
                Planets deliveredPlanet = Planets.getPlanets(name);
                planet1 = deliveredPlanet;
                System.out.println("Посылка доставлена на планету " + deliveredPlanet);
            }
            Planet planets = new Planet(planet1);
            System.out.println(parcels.size());
            for (int i = 0; i < planet.size(); i++) {
                if (planet.get(i).equals(planets)) {
                    List<Parcel> deliveredParcel = planet.get(i).getDeliveredParcel();
                    deliveredParcel.add(parcels.get(index));
                    System.out.println(deliveredParcel);
                }
            }
            parcels.remove(index);
            System.out.println(parcels.size());
            if (parcels.size() == 0) {
                System.out.println("Все посылки доставлены");

                for (int i = 0; i < planet.size(); i++) {
                    Planet planet2 = planet.get(i);
                    if (planet2.getDeliveredParcel().size() == 0) {
                        System.out.println(planet.get(i) + " Список планет пуст");
                    } else System.out.println(planet2);
                }
//                for (int i = 0; i < planet.size(); i++) {
//                    Planet planet2 = planet.get(i);
//                    if (planet.get(i).getDeliveredParcel().size() == 0) {
//                        System.out.println(planet.get(i) + "Список планет пуст");
//                    }else planet2.print();
//                }
                return;
            }
        }
    }
}