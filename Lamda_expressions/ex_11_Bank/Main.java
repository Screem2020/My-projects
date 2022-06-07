package Lamda_expressions.ex_11_Bank;

import java.util.List;
import java.util.Scanner;

public class Main {
    //Используйте следующий набор классов и интерфейсов:
    //interface Service {
    //    void serve(Client client, Bank bank);
    //}
    //class Bank{
    //    List<Client> clientList = new ArrayList<>();
    //
    //    public void serveClient(Service service, Client client){
    //        //TODO:
    //    }
    //
    //}
    //
    //class Client{
    //    String name;
    //    String surname;
    //    int balance;
    //
    //    public Client(String name, String surname, int balance) {
    //        this.name = name;
    //        this.surname = surname;
    //       this.balance = balance;
    //    }
    //}
    //
    //Здесь Bank содержит метод обслуживания клиента. Метод может выполнять любые задачи по обслуживанию клиента
    // (добавление нового клиента в список клиентов банка, удаление клиента, изменение баланса клиента)
    //Что он будет делать определяется функциональным интерфейсом Service.
    //Вы можете дописывать дополнительные методы или поля.
    //
    //В мейне создайте объект класса Bank, напишите следюущие анонимные классы с помощью лямбда выражения:
    //1. Добавление нового клиента в список клиентов банка
    //2. Удаление клиента из списка клиентов в банке
    //3. Изменения баланса клиента на любое другое рандомное число
    //
    //Используя созданные лямбда выражения, выполните эти операции
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        int input = 0;
        List<Client> clientList = bank1.clientList;
        clientList.add(new Client("mis", "mis", 100));
        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println("""
                    1. Добавление нового клиента в список клиентов банка
                    2. Удаление клиента из списка клиентов в банке
                    3. Изменения баланса клиента на любое другое рандомное число
                    """);
            input = scn.nextInt();
            if (input == 1) {
                System.out.println("Enter name Client");
                String name = scn.next();
                System.out.println("Enter surname Client");
                String surname = scn.next();
                System.out.println("Enter balance Client");
                int balance = scn.nextInt();
                Client client = new Client(name, surname, balance);
                Service service = (client1, bank) -> bank.addClient(client1);
                bank1.serveClient(service, client);
                System.out.println(clientList);
            }
            if (input == 2) {
                System.out.println("Enter name Client");
                String name = scn.next();
                System.out.println("Enter surname Client");
                String surname = scn.next();
                Client client = new Client(name, surname);
                Service service = ((cl, bank) -> bank.deleteClient(cl));
                bank1.serveClient(service, client);
                System.out.println(clientList);
            }
            if (input == 3) {
                System.out.println("Enter name Client");
                String name = scn.next();
                System.out.println("Enter surname Client");
                String surname = scn.next();
                System.out.println("Enter set balance Client");
                int balance = scn.nextInt();
                Client client = new Client(name, surname, balance);
                Service service = (cl, bank) -> bank.setBalance(cl, balance);
                bank1.serveClient(service, client);
                System.out.println(clientList);
            }
        }
    }
}
