package Inheritance.Animal;

public class Cow extends Animals{
    public Cow(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void animalSay() {
        System.out.println("Myyy");
    }
}
