package Inheritance.Construcor;

public class Main {
    public static void main(String[] args) {
        Registration registration = new Registration("Misha", "1234");
        Registration registration1 = new Registration("Misha", "1234", "Russia");
        Registration registration2 = new Registration("Misha", "1234", "Russia", "Kaliningrad");
        Registration registration3 = new Registration("Misha", "1234", "Russia", "Kaliningrad", 23);
        registration.print();
        registration1.print();
        registration2.print();
        registration3.print();
    }
}
