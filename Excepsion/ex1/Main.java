package Excepsion.ex1;

import java.util.Scanner;

public class Main {
            /*В задаче описаны базовые требования. Можно дописывать свой код.
        Реализовать систему бронирования билетов в кинотеатре.
        Программа должна выводить места в зрительном зале на консоль в виде двумерного массива, занятые места можно помечать звездочкой.
        Например:
           1  2  3  4  5
        1 |_||_||_||_||_|
        2 |_||_||_||_||_|
        3 |_||_||*||_||_|
        4 |*||_||*||_||_|
        5 |_||_||_||_||_|
        6 |_||_||_||_||_|
        Юзер должен вводить с консоли ряд, место, программа должна бронировать это место.

        Метод, выполняющий бронь, должен выбрасывать checked исключение TickedAlreadyReservedException, если под данным рядом и
        местом находится уже забронированный билет. Обработка исключения должна выполняться внутри метода (без throws).
        Если значение ряда row меньше 0, метод должен выбросить unchecked исключение InvalidRowValueException.
        Если значение места place меньше 0, метод должен выбросить unchecked исключение InvalidPlaceValueException.

        Метод, снимающий бронь, должен выбрасывать checked NoExistReserveException, если пользователь пытается снять бронь,
        которой не существует. Данное исключение должно обрабатываться за пределами метода (использовать throws).

        В мейне создать объект класса CinemaService и реализовать меню:
        1. Вывести места
        2. Забронировать место
        3. Снять бронь (пользователь вводит номер брони)
        4. Выход */
    public static void main(String[] args) {

        CinemaService cinemaService = new CinemaService();
        cinemaService.print();

        Scanner scn = new Scanner(System.in);
        int input = 0;
        while (input != 4) {
            System.out.println("""
                    1. Вывести места
                    2. Забронировать место
                    3. Снять бронь
                    4. Выход
                    """);
            input = scn.nextInt();

            if (input == 1) {
                cinemaService.print();
            }
            if (input == 2) {
                System.out.println("Введите номер места");
                int place = scn.nextInt();
                System.out.println("Введите номер ряда");
                int row = scn.nextInt();
                cinemaService.reserved(place, row);

            }
            if (input == 3) {
                System.out.println("Введите номер места");
                int place = scn.nextInt();
                System.out.println("Введите номер ряда");
                int row = scn.nextInt();
                cinemaService.takeOffReserved(place, row);
            }
        }
    }

    public enum Symbols {
        EMPTY("|_|"), BUSY("|*|");

        private final String sign;

        Symbols(String sign) {
            this.sign = sign;
        }

        @Override
        public String toString() {
            return sign;

        }
    }
}
