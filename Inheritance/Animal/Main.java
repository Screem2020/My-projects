package Inheritance.Animal;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("cat","barsik");
        cat.animalSay();
        Cow cow = new Cow("cow", "borushka");
        cow.animalSay();
        Dog dog = new Dog("dog","sharik");
        dog.animalSay();

        Animals[] animals = {cat, dog, cow};
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");
            System.out.print("Say: ");
            animals[i].animalSay();
        }
        System.out.println();
    }
}
