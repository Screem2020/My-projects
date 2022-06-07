package Streams.ex_8_Passport;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Создать класс Passport с полями серия, номер, страна.
    // Создать класс Human с полемями имя, паспорт. В мейне создать список Human и получить из него новый список людей,
    // которые родились в одной стране.
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human("misha", new Passport(1242, 1234, "Russia")));
        list.add(new Human("dima", new Passport(1242, 1234, "USA")));
        list.add(new Human("ivan", new Passport(1242, 1234, "Russia")));
        list.add(new Human("misha", new Passport(1242, 1234, "Ukraine")));
        List<Human> russia = list.stream()
                .filter(a -> a.passport.country.equalsIgnoreCase("Russia"))
                .toList();
        russia.forEach(System.out::println);
    }
    @AllArgsConstructor
    @ToString
    static
    class Passport {
        private int serial;
        private int number;
        private String country;
    }
    @AllArgsConstructor
    @ToString
    static
    class Human {
        private String name;
        private Passport passport;
    }
}
