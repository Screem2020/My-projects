package ArrayList.Rp2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     * В мейне создать ArrayList товаров (типа Product) и консольное меню:
     * 1. Добавить новый товар в список (юзер вводит с консоли значения для товара)
     * 2. Вывести все товары из списка (через toString)
     * 3. Вывести стоимость товара по названию (юзер вводит с консоли название товара, через equals ищется товар
     * в списке и после нахождения выводится его цена)
     * 4. Удалить товар из списка по индексу (юзер вводит индекс)
     * 5. Удалить товар из списка по значению (юзер вводит название товара с консоли)
     * 6. Выход
     */
    public static void main(String[] args) {
        int size = 10;
        Product[] arr = new Product[size];
        int input = 0;
        int currentIndex = 0;
        Product prod = new Product();
        Scanner scn = new Scanner(System.in);
        while (input != 6) {
            System.out.println(
                    "1. Добавить новый товар в список\n" +
                            "2. Вывести все товары из списка\n" +
                            "3. Вывести стоимость товара по названию\n" +
                            "4. Удалить товар из списка по индексу \n" +
                            "5. Удалить товар из списка по значению \n" +
                            "6. Выход");

            input = scn.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Введите имя");
                    String name = scn.next().toLowerCase(Locale.ROOT);
                    prod.setName(name);
                    System.out.println("Введите цену");
                    int price = scn.nextInt();
                    prod.setPrice(price);
                    if (size >= arr.length) {
                        arr = Arrays.copyOf(arr, arr.length * 3 / 2);
                    }
                    arr[currentIndex] = prod;
                    currentIndex++;
                    System.out.println("Товар добавлен!");
                    break;
                }
                case 2: {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i] + " ");
                    }
                    break;
                }
                case 3: {
                    boolean flag = false;
                    System.out.println("Введите название");
                    String name = scn.next().toLowerCase(Locale.ROOT);
                    Product newProduct = new Product(name);
                    for (int i = 0; i < currentIndex; i++) {
                       // if (arr[i].getName().equalsIgnoreCase((name))) {
                        if (arr[i].equals((newProduct))) {
                            System.out.println(arr[i].getPrice());
                            flag = true;
                        }
                        if (!flag) {
                            System.out.println("Товара в списке нет");
                        }
                        break;
                    }
                }
                case 4: {

                }
            }
        }
    }
}
