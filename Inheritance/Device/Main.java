package Inheritance.Device;

public class Main {
    /**
     * Создать класс Device с полями назвнаие и цена. Создать два подкласса: Phone с полем количество памяти, Microwave с полем мощность.
     * В родительском классе создать конструктор для инициализации базовых полей, вызвать этот конструктор в подклассах.
     * Также в родительском классе переопределить toString и дополнить toString в подклассах значениями их полей.
     * В мейне проверить работу конструкторов и метода toString.
     */

    public static void main(String[] args) {
        Device phone = new Device("Samsung", 100);
        System.out.println(phone);
        Phone iphone = new Phone("Apple", 100, 2000);
        System.out.println(iphone);
        Microwave bosh = new Microwave("Bosh", 200, 3000);
        System.out.println(bosh);
    }
}
