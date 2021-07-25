package Inheritance.Animal;

public class Cat extends Animals{
    public Cat(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void animalSay() {
        System.out.println("May");
    }


}
