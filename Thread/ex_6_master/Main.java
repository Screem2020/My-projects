package Thread.ex_6_master;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayDeque;

public class Main {
    //Есть мастерская по ремонту телевизоров, в ней работает два мастера (2 потока)
    //Реализовать: на вход поступает n сломанных телевизоров. Мастера берут в работу по одному телевизору за раз, если они свободны.
    //Мастера должны работать круглосуточно. Если работы нет, они просто ждут.
    //И так по кругу до тех пор ,пока все n телевизоров не будут отремонтированы

    public static void main(String[] args) {
        ArrayDeque<Integer> list = new ArrayDeque<>();

        Thread thread1 = new Thread(new Consumer(list));
        Thread thread2 = new Thread(new Consumer(list));
        Thread thread3 = new Thread(new Provider(list));

        thread3.start();
        thread1.start();
        thread2.start();

    }

    public static void sleep(int integer) {
        try {
            Thread.sleep(integer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

@Data
@AllArgsConstructor
class Consumer implements Runnable {
    private final ArrayDeque<Integer> list;

    @Override
    public void run() {
        while (true) {
//            boolean flag = false;
            synchronized (list) {
                while (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + " is Waiting");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Main.sleep(1000);
                Integer poll = list.poll();
                System.out.println(Thread.currentThread().getName() + " TV worker " + poll + " size: " + list.size());
                notifyAll();
            }
        }
    }
//            } if (flag) {
//                System.out.println(Thread.currentThread().getName() + " is Waiting");
//                Main.sleep(1000);
//            }
}

@Data
@AllArgsConstructor
class Provider implements Runnable {

    private final ArrayDeque<Integer> list;

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                while (list.size() == 1) {
                    System.out.println(Thread.currentThread().getName() + " is Waiting");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Main.sleep(100);
                list.add(1);
                System.out.println(Thread.currentThread().getName() + " TV producer." + " Size: " + list.size());
                notifyAll();
            }
        }
    }
}
