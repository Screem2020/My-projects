package Date.Kafe;

import lombok.SneakyThrows;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        HashSet<Reservation> reserves = new HashSet<>();
        reserves.add(new Reservation("12.02.2001 12:00:00", 12));
        reserves.add(new Reservation("15.03.2001 12:00:00", 10));
        reserves.add(new Reservation("12.02.2001 12:00:00", 9));
        Scanner scn = new Scanner(System.in);
        int input = 0;
        while (input != 4) {
            System.out.println("""
                    1. Добавить бронь (юзер вводит с консоли строку в формате dd.MM.yyyy HH:mm:ss и номер столика. 
                    Если в hashset нет такой брони, то столик бронируется.)
                    2. Снять бронь (юзер вводит с консоли строку в формате dd.MM.yyyy HH:mm:ss и номер столика. 
                    Если в hashset есть такая бронь, она удаялется)
                    3. Вывести все забронированные столики и даты их бронирования
                    4. Выход
                    """);
            input = scn.nextInt();
            if (input == 1) {
                scn = new Scanner(System.in);
                System.out.println("enter your date in format dd.MM.yyyy HH:mm:ss");
                String date = scn.nextLine();
                scn = new Scanner(System.in);
                System.out.println("enter number table");
                int num = scn.nextInt();
                LocalDateTime ldt = LocalDateTime
                        .parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
                Reservation reservation = new Reservation(date, num);
                boolean search = search(reserves, ldt, num);
                if (search) {
                    System.out.println("Sorry, table is reserved");
                } else {
                    reserves.add(reservation);
                    System.out.println("Your Table reserved is " + reservation.getDate());
                }
            }
            if (input == 2) {
                System.out.println("enter your date in format dd.MM.yyyy HH:mm:ss");
                String date = scn.next();
                scn = new Scanner(System.in);
                System.out.println("enter number table");
                int num = scn.nextInt();
                LocalDateTime ldt = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
                for (Reservation reserve : reserves) {
                    LocalDateTime localtime = LocalDateTime.parse(reserve.getDate(), DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
                    if((localtime.compareTo(ldt) > 0) && (reserve.getNumber() == num)) {
                        reserves.remove(reserve);
                        System.out.println("reservation canceled");
                        break;
                    }
                }
            }
            if (input == 3) {
                for (Reservation reserve : reserves) {
                    System.out.println("Номер столика: " + reserve.getNumber() + " " + "Дата забронированного столика: " + reserve.getDate());
                }
            }
        }
    }

    public static boolean search(HashSet<Reservation> set, LocalDateTime temp, int number) {
        boolean reservedTable = false;
        for (Reservation reservation : set) {
            LocalDateTime local = LocalDateTime.parse(reservation.getDate(), DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
            System.out.println(local);
            if ((local.compareTo(temp) == 0) && (reservation.getNumber() == number)) {
                reservedTable = true;
            }
        }
        return reservedTable;
    }
}
