package Inheritance.Animal;

public class Dog extends Animals {

    public Dog(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void animalSay() {
        System.out.println("Gav");
    }

}
