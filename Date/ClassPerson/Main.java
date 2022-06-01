package Date.ClassPerson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

public class Main {
    //Создать класс Person с полями имя и дата рождения.
    // В мейне содать список объектов класса Person и отсортировать его по дате рождения в порядке возрастания.
    public static void main(String[] args) {
        List<Person> personList = new java.util.ArrayList<>(List.of(
                new Person("Misha", "21.02.1993"),
                new Person("Dima", "19.07.1983"),
                new Person("Vika", "23.05.1950")));
        Collections.sort(personList);
        System.out.println(personList);
    }
}
@ToString
@Getter
@AllArgsConstructor
class Person implements Comparable<Person> {
    private String name;
    private String dataOfBirth;


    @Override
    public int compareTo(Person o) {
        LocalDate ldt = LocalDate.parse(this.dataOfBirth, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate ldtO = LocalDate.parse(o.dataOfBirth, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        if (ldt.compareTo(ldtO) >  0) {
            return -1;
        } if (ldt.compareTo(ldtO) < 0) {
            return 1;
        } else return 0;
    }
}
