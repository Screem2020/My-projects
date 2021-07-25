package Inheritance.Animal;

public class Animals {
    /**
     * 1. Создать суперкласс Animal с полями:
     * private String animalType - тип животного
     * private String name - имя животного
     * Создать конструктор
     *
     * создать метод
     * public void animalSay() - выводит на экран, что говорит животное по имени name
     *
     * Создать подклассы:
     * Dog, Cat, Cow
     *
     * В подклассах нужно переопределить метод animalSay, чтобы у собак методы выводили на экран "Гав!", у кошек "Мяу!", а у коров - "Муу!"
     *
     * В мейне создать массив типа Animal, записать в массив по несколько объектов от каждого класса и вывести на экран название типа животного и что оно говорит
     */
    private String animalType;
    private String name;


    public Animals(String animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public void animalSay() {
        System.out.println("say");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animalType='" + animalType + '\'' +
                '}';
    }


}
