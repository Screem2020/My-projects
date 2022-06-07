package Lamda_expressions.ex_11_Bank;

import lombok.*;

@AllArgsConstructor
@Getter
@RequiredArgsConstructor
@ToString
public class Client {
    @NonNull
    private String name;
    @NonNull
    private String surname;
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
