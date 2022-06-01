package Junit_Maven.Restoran;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        Class<?> clazzService = Class.forName("Junit_Maven.Restoran.Service");
        Service object = (Service) clazzService.getConstructor().newInstance();

        Map<Client, List<Dish>> orders = object.getOrders();

        Class<?> clazzClient = Class.forName("Junit_Maven.Restoran.Client");

        Class<?> clazzDish = Class.forName("Junit_Maven.Restoran.Dish");

        List<Dish> dishList = new ArrayList<>();
        dishList.add(new Dish("Crab", 200.0));
        dishList.add(new Dish("Fish", 150.0));
        dishList.add(new Dish("Potato", 50.0));

        int num = 0;
        int input = 0;
        while (input != 5) {
            System.out.println("""
                    1.  Добавить блюдо в заказ клиенту (если клиент еще не делал заказ, он вводит только свое имя,
                        баланс и желаемое блюдо. В этом случае нужно создать объект Client с новым уникальным номером.
                        Если клиент уже сделал заказ и хочет добавить в него новое блюдо, он вводит только свой номер и желаемое блюдо)
                    2.  Посчитать итоговую сумму по заказу клиента (клиент вводит только свой номер)
                    3.  Расчитать клиента (клиент вводит свой номер, выводится чек и заказ удаляется из системы)
                    4.  Вывести всех нерасчитанных клиентов (выводятся имя и номер клиентов, которые еще не рассчитались)
                    """);
            input = scn.nextInt();
            if (input == 1) {
                System.out.println("Entered name");
                String name = scn.next();
                System.out.println("Enter dish");
                String dish = scn.next();
                Constructor<?> constructor1 = clazzClient.getConstructor(String.class);
                Client clientTmp = (Client) constructor1.newInstance(name); //создание клиента без баланса
                Constructor<?> constructor2 = clazzDish.getConstructor(String.class, double.class);
                Dish newDish = (Dish) constructor2.newInstance(dish, 0.0); //создание обьекта Dish
                for (Dish value : dishList) {
                    if (value.getName().equalsIgnoreCase(newDish.getName())) {
                        newDish.setPrice(value.getPrice());
                    }
                }
                boolean flag = false;
                for (Map.Entry<Client, List<Dish>> entry : orders.entrySet()) {
                    if (entry.getKey().getName().equalsIgnoreCase(clientTmp.getName())) { //проверка наличия данного клиента в мапе
                        List<Dish> value = entry.getValue();
                        value.add(newDish);
                        clientTmp.setBalance(entry.getKey().getBalance());
                        clientTmp.setNumber(entry.getKey().getNumber());
                        flag = true;
                        break;
                    }
                }
                System.out.println(orders);
                if (!flag) {
                    System.out.println("Enter balance");
                    double balance = scn.nextInt();
                    num += 1; // нумерация нового клиента
                    Constructor<?> constructor = clazzClient.getConstructor(int.class, String.class, double.class);
                    Client client = (Junit_Maven.Restoran.Client) constructor.newInstance(num, name, balance); //клиент с параметром баланс
                    Method addDish = clazzService.getMethod("addDish", Client.class, Dish.class);
                    addDish.invoke(object, client, newDish);
                    System.out.println(orders);
                }
            }
            if (input == 2) {
                System.out.println("Enter number client");
                int number = scn.nextInt();// поиск номера без массива
                Constructor<?> constructor = clazzClient.getConstructor(int.class);
                Client client = (Client) constructor.newInstance(number);
                boolean b = orders.containsKey(client);
                if (b) {
                    Method getTotalPrice = clazzService.getMethod("getTotalPrice", Client.class);
                    System.out.println(getTotalPrice.invoke(object, client));
                } else System.out.println("error");
//                for (Map.Entry<Client, List<Dish>> entry : orders.entrySet()) {
//                    if (entry.getKey().getNumber() == number) {
//                        Client key = entry.getKey();
//                        Method getTotalPrice = clazzService.getMethod("getTotalPrice", Client.class);
//                        System.out.println("Price on order = " + getTotalPrice.invoke(object, key));
//                        break;
//                    }
//                }
            }
            if (input == 3) {
                System.out.println("enter client number");
                int number = scn.nextInt();
                Constructor<?> constructor = (clazzClient.getConstructor(int.class));
                Client client = (Client) constructor.newInstance(number);
                for (Map.Entry<Client, List<Dish>> entry : orders.entrySet()) {
                    if (entry.getKey().getNumber() == client.getNumber()) {
                        Method makeBill = clazzService.getMethod("makeBill", Client.class);
                        Client key = entry.getKey();
                        makeBill.invoke(object, key);
                        break;
                    }
                }
                //Path file = Files.createFile(Path.of("src/main/java/Junit_Maven/Restoran.Main"));
            }
            if (input == 4) {
                for (Map.Entry<Client, List<Dish>> entry : orders.entrySet()) {
                    System.out.println("List client:");
                    System.out.println("name client : " + entry.getKey().getName() + "; " + "number client " + entry.getKey().getNumber());
                }
            }
        }
    }
}
