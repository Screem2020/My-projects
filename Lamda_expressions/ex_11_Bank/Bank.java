package Lamda_expressions.ex_11_Bank;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Bank {
    List<Client> clientList = new ArrayList<>();

    public void addClient(Client client) {
        clientList.add(client);
    }
    public void deleteClient(Client client) {
        clientList.remove(client);
    }

    public void setBalance(Client client, int price) {
        client.setBalance(price);
    }
    public void serveClient(Service service, Client client) {
        service.serve(client, this);
//        clientList.stream()
//                .filter(a -> a.getName().equalsIgnoreCase(client.getName()))
//                .filter(a -> a.getSurname().equalsIgnoreCase(client.getSurname()))
//                .forEach(a -> service.serve(a, Bank.this));
    }
}
