package Thread.ex_4_Check;

import java.util.Random;

public class Main {
    //Есть денежный счет, на который могут поступать денеждные средства одновременно из различных источников,
    // а также списываться. Нужно сделать так, чтобы все операции были корректно выполенены, чтобы они не потерялись или не перезаписали друг друга.
    //Создать класс BankAccount с полем balance - текущий счет.
    //Создать два порожденных потока , каждый из которых будет зачислять денежные средства на баланс с интервалом в 1 секунду.
    //Каждый раз сумму зачисления нужно генерировать в виде рандомного числа и выводить на консоль сумму зачисления и новый баланс.
    //Создать два порожденных потока, каждый из которых будет списывать денежные средства с баланса с интервалом в 1 секунду.
    //Каждый раз сумму списания нужно генерировать в виде рандомного числа и выводить на консоль сумму списания и новый баланс.
    //Найдите узкие места (где возможна рассинхронизация) потоков и вставьте туда метод sleep, чтобы увеличить шансы возникновения рассинхрона.
    //В главном потоке запустите все порожденные потоки, убедитесь, что происходит рассинхронизация данных и сделайте
    // синхронизацию потоков. После чего запустите тот же код и убедитесь, что теперь ошибки не происходит.
    //Используйте wait и notifyAll для экономии ресурсов. К примеру, если баланс равен нулю, его не нужно списывать.

    public static void main(String[] args) {
        Object monitor = new Object();
        BankAccount target = new BankAccount(monitor);
        BankAccount target1 = new BankAccount(monitor);
        new Thread(target).start();
        new Thread(target1).start();
    }
    public static class BankAccount implements Runnable {
        private int balance;
        Object monitor;

        public BankAccount(Object monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            synchronized (monitor) {

                Random random = new Random();
                balance = random.nextInt(50000);
                int minusRnd = random.nextInt(10000);
                System.out.println("Balance " + balance);
                System.out.println("Write-off number " + minusRnd);
                Main.sleep(1000);
                if (balance != 0 && balance > minusRnd) {
                    balance -= minusRnd;
                    System.out.println("Balance after debit " + balance);
                } else {
                    try {
                        wait(); // поток уходит в сон и программа не останавливается, прорбуждения не происходит
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Main.sleep(1000);
                balance += minusRnd;
                System.out.println("Balance after sum " + balance);
                notifyAll();
                //TODO: поправить программу что бы осуществлялось пробуждение и уход в сон
            }
        }
    }
    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
