package Lamda_expressions.ex_11_Bank;

import lombok.*;

@AllArgsConstructor
@Getter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class Client {
    @NonNull
    private String name;
    @NonNull
    private String surname;
    @EqualsAndHashCode.Exclude
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }



}
