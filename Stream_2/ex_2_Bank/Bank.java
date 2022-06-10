package Stream_2.ex_2_Bank;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@ToString
public class Bank {
    List<Deposit> listDeposit = new ArrayList<>();
}
