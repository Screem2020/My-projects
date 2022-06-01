package Junit_Maven.Restoran;

import lombok.Getter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@ToString
public class Service {
    private Map<Client, List<Dish>> orders = new HashMap<>(); //необходим лист блюд для вывода цены нескольких блюд и чека

    public void addDish(Client client, Dish dish) {
        try {
            if (client == null) {
                throw new ClientNullException();
            }
            if (dish == null) {
                throw new DishelsNullException();
            }
        } catch (ClientNullException | DishelsNullException e) {
            e.printStackTrace();
        }
        if (orders.containsKey(client)) {
            List<Dish> dishes = orders.get(client);
            dishes.add(dish);
            assert dish != null;
            System.out.println("Dish added in list client " + dish.getName());
        } else {
            List<Dish> dishes = new ArrayList<>();
            dishes.add(dish);
            orders.put(client, dishes);
            assert client != null;
            System.out.println("Client " + client.getName() + " added in client list");
            System.out.println("Number client:" + client.getNumber());
        }
    }

    public double getTotalPrice(Client client) {
        double price = 0;
        if (orders.containsKey(client)) {
            List<Dish> dishes = orders.get(client);
            for (Dish dish : dishes) {
                price += dish.getPrice();
            }
            return price;
        } else return 0;
    }

    public String makeBill(Client client) {
        if (orders.containsKey(client) && client.getBalance() >= getTotalPrice(client)) {
            List<Dish> dishes = orders.get(client);
            //StringBuilder sb = new StringBuilder();
            String all = null;
            for (Dish dish : dishes) {
                all = "Dish " + dish.getName() + " : " + "Price: " + dish.getPrice() +
                        "\n" + getTotalPrice(client) + "\n" + client.getName();
//                sb.append("Dish ").append(dish.getName()). append(": ").append("Price: ").append(dish.getPrice()).append("\n")
//                        .append(getTotalPrice(client)).append("\n").append(client.getName());
            }
            orders.remove(client);
            return all;
        } else
            try {
                throw new NotEnoughClientBalanceException();
            } catch (NotEnoughClientBalanceException e) {
                e.printStackTrace();
            }
        return "";
    }
}
