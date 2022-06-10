package Stream_2.ex_2_Bank;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparingInt;

public class Main {
    //Создать класс Bank с полем в виде списка банковских вкладов, представленных классом Deposit.
    // Класс Deposit имеет поля срок вложения и процентная ставка.
    //В мейне создать массив банков, вывести с помощью разных stream процентные ставки всех вкладов,
    // а также найти самый выгодный вклад.
    @SneakyThrows
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        List<Deposit> listDeposit = bank.getListDeposit();
        listDeposit.add(new Deposit(100, 29));
        listDeposit.add(new Deposit(80, 20));
        List<Deposit> listDeposit1 = bank1.getListDeposit();
        listDeposit1.add(new Deposit(50, 19));
        listDeposit1.add(new Deposit(40, 15));
        List<Deposit> listDeposit2 = bank2.getListDeposit();
        listDeposit2.add(new Deposit(20, 10));
        listDeposit2.add(new Deposit(10, 5));
        Bank[][] arr = {
                {bank},
                {bank1},
                {bank2}
        };

        List<Integer> strings = Arrays.stream(arr)
                .flatMap(a -> Arrays.stream(a)
                        .flatMap(t -> t.listDeposit.stream()))
                .map(Deposit::getInterestRate).toList();
        System.out.println(strings);

        Optional<Deposit> max1 = Arrays.stream(arr)
                .flatMap(Arrays::stream)
                .flatMap(listDeposits -> listDeposits.listDeposit.stream())
                .max(comparingInt(Deposit::getInterestRate));
        max1.ifPresent(System.out::println);
    }
}
