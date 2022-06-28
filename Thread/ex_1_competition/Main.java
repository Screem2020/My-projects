package Thread.ex_1_competition;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Main {
    //Запустить соревнование между двумя бегунами.
    //За каждую секунду бегуны пробегают одинаковую дистанцию, равную 1 метру.
    //На пути каждого бегуна через каждые 5 секунд с вероятностью 50% встречаются точки,
    // которые ускоряют бегуна в два раза и он за каждую секунду бежит 2 метра на протяжении 2-х секунд.
    //Бегуны заканчивают свой забег, когда пройдут дистанцию в 20 метров
    //
    //Создайте в мейне два потока и запустите соревнование бегунов.
    //Выводите на консоль информацию о забеге обоих бегунов за каждую секунду (кто, какую дистанцию прошел,
    // получил ли ускорение и закончил ли бег)
    public static void main(String[] args) {
        newThread runner1 = new newThread("Runner1");
        newThread runner2 = new newThread("Runner2");
        new Thread(runner1).start();
        new Thread(runner2).start();
    }

    @AllArgsConstructor
    @Data
    static
    class newThread implements Runnable {
        private String nameThread;

        @Override
        public void run() {
            int seconds = 0;
            int v = (int) (Math.random() * 2) + 1;
            for (int i = 1; i < 20; i++) {
                if (seconds != 2) i += 1;
                if (v == 1 && i % 5 == 0) {
                    i += 1;
                    System.out.println("------" + nameThread + " Ускорение " + i + " метров" + "--------");
                    seconds++;
                }
                System.out.println(nameThread + " пройдено " + i + " метров");
            }
        }
    }
}
