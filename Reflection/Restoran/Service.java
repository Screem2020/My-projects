package Reflection.Restoran;

import java.util.HashMap;
import java.util.Map;

public class Service {
    private Map<Client, Order> menu = new HashMap<>();

    public void addOrder(Client nameClient, Order dished) {
        menu.put(nameClient, dished);
        System.out.println("Заказ сформирован");
    }

    public Map<Client, Order> getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return "Service{" +
                "menu=" + menu +
                '}';
    }
}
