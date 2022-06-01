package Junit_Maven.Restoran;

import lombok.*;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Client {
    private int number;
    @NonNull
    private String name;
    private double balance;

    public Client(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        if (number == -1) return name.equals(client.getName());
        else if (number == getNumber()) return true;
        else return ( number == client.getNumber() && name.equals(client.getName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
