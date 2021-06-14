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
        Product[] arr = new Product[10];
        int input = 0;
        int currentIndex = 0;
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
                    Product product = new Product();
                    System.out.println("Введите имя");
                    String name = scn.next().toLowerCase(Locale.ROOT);
                    product.setName(name);
                    System.out.println("Введите цену");
                    int price = scn.nextInt();
                    product.setPrice(price);
                    arr[currentIndex] = product;
                    currentIndex++;
                    for (int i = 0; i < arr.length; i++) {
                        if (currentIndex >= arr.length) {
                            arr = Arrays.copyOf(arr, arr.length * 3 / 2);
                        }
                    }
                    System.out.println("Товар добавлен!" + " Товаров всего: " + currentIndex);
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
                            System.out.println("Цена товара: " + arr[i].getPrice());
                            flag = true;
                        }
                        if (!flag) {
                            System.out.println("Товара в списке нет");
                        }
                        break;
                    }
                }
                case 4: {
                    System.out.println("Введите индекс");
                    int index = scn.nextInt();
                    boolean flag = false;
                    for (int i = index; i < arr.length; i++) {
                        if (arr[i] != null) {
                            arr[i] = arr[i + 1];
                            arr[i + 1] = null;
                            flag = true;
                        }
                    }
                    if (flag) {
                        currentIndex--;
                        System.out.println("Товар удален " + "Товаров всего: " + currentIndex);
                    }
                    else if (arr[index] == null){
                        System.out.println("Не существует");
                    } else  System.out.println("Не существует");
                }
                break;
                case 5: {
                    System.out.println("Ведите название");
                    String name = scn.next().toLowerCase(Locale.ROOT);
                    Product product = new Product(name);
                    boolean flag = false;
                    for (int i = 0; i < currentIndex; i++) {
                        if (arr[i].equals(product) & arr[i] != null){
                            arr[i] = arr[i + i];
                            arr[i + 1] = null;
                            flag = true;
                            currentIndex--;
                        }
                        else if (arr[i] == null && arr[i] != null) {
                            arr[i] = null;
                            flag = true;
                            currentIndex--;
                        }
                    }
                    if (flag) System.out.println("Товар удален " + "Товаров всего: " + currentIndex);
                    else System.out.println("Товар не существует");
                    break;
                }
            }
        }
    }
}
