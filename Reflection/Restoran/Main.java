package Reflection.Restoran;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Client> clientList = new ArrayList<>(); //список клиентов
        Class<Service> clazzService = (Class<Service>) Class.forName("Reflection.Restoran.Service");
        Constructor<Service> constructor2 = clazzService.getConstructor();
        Service serviceClient = constructor2.newInstance(); // mapList class Service
        Map<Client, Order> menu = serviceClient.getMenu();
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Crab", 300));
        dishes.add(new Dish("Fish", 500));
        dishes.add(new Dish("Potato", 150));
        Scanner scn = new Scanner(System.in);
        int input = 0;
        int indexClient = 0;
        while (input != 5) {
            System.out.println("""
                    1. Создать заказ (пользователь вводит свое имя)
                    2. Добавить заказ клиенту (пользователь вводит свое имя и желаемое блюдо)
                    3. Расчитать клиента (выводится чек и заказ удаляется из системы)
                    4. Вывести всех нерасчитанных клиентов (выводятся имя и номер клиентов, которые еще не рассчитались)
                    """);
            input = scn.nextInt();
            if (input == 1) {
                System.out.print("Your name: ");
                String name = scn.next();
                Class<?> clientClazz = Class.forName("Reflection.Restoran.Client");
                Constructor<?> constructor = clientClazz.getConstructor(String.class);
                Client client = (Client) constructor.newInstance(name);
                indexClient += 1;
                Method newClient = clientClazz.getDeclaredMethod("newClient", String.class, int.class);
                //client.newClient(name);
                newClient.invoke(client, name, indexClient);
                System.out.println("Ok, you " + client.getName() + " registration");
                System.out.println("Your number is " + indexClient);
                clientList.add(client);
            }
            if (input == 2) {
                System.out.println("Your name: ");
                String name = scn.next();
                Client client = new Client(name);
                System.out.println("You entered desired dish");
                String nameDish = scn.next();
                Class<?> dishClazz = Class.forName("Reflection.Restoran.Dish");
                Constructor<?> constructor = dishClazz.getConstructor(String.class);
                Dish newDish = (Dish) constructor.newInstance(nameDish); //создаю блюдо
                System.out.println("-------------------------------------------------------");
                Class<Order> orderClazz = (Class<Order>) Class.forName("Reflection.Restoran.Order");
                Constructor<Order> constructor1 = orderClazz.getConstructor();
                Order order = constructor1.newInstance();
                int index = 0;
                for (int i = 0; i < clientList.size(); i++) {
                    if (clientList.get(i).getName().equalsIgnoreCase(client.getName())) {
                        index = i;
                    }
                }
                boolean b = menu.containsKey(clientList.get(index));
                if (b) { // если клиент заказывает не первое блюдо то добавляем в существующий список 2 блюдо
                    Order order1 = menu.get(clientList.get(index));
                    order1.orderClient(newDish);

                }
                else {
                    order.orderClient(newDish); // добавляем в мапу клиента и его список блюд
                    menu.put(clientList.get(index), order);
                }
                System.out.println(serviceClient);
            }
            if (input == 3) {
                System.out.println("id client");
                int id = scn.nextInt();
                Client client1 = new Client(id);
                int index = 0;
                for (int i = 0; i < clientList.size(); i++) {
                    if (clientList.get(i).equals(client1)) {
                        index = i;
                        break;
                    }
                }
                Order order = menu.get(clientList.get(index));//ищем в map необходимого клиента
                menu.remove(clientList.get(index));
                List<Dish> dished = order.getDished(); //получаем лист блюд
                int allPrice = 0;
                for (Dish value : dishes) { //ищем в меню блюдо из заказа
                    for (Dish dish : dished) {
                        if (value.getNameDish().equalsIgnoreCase(dish.getNameDish())) {
                            allPrice += value.getPriceDish();
                            break;
                        }
                    }
                }
                System.out.println("Order price " + allPrice);
            }
            if (input == 4) {
                System.out.println("List clients");
                for (Map.Entry<Client, Order> entry : menu.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
            }
        }
    }
}