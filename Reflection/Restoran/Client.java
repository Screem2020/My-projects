package Reflection.Restoran;


import java.util.Objects;

public class Client {
    private int number = 0;
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public Client(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void newClient(String name, int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Client{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return number == client.number || Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
