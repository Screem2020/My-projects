package Date.HappyNewYear;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        String format = ldt.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        System.out.println(format);
        Duration between = Duration.from(Duration.between(LocalDate.from(ldt).atStartOfDay(), LocalDate.of(2023, 1, 1).atStartOfDay()));
        System.out.println(between.toDays() + " " + "до нг");


        Scanner scn = new Scanner(System.in);
        String age = scn.nextLine();
        LocalDate ld = LocalDate.parse(age, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Duration between1 = Duration.between(ld.atStartOfDay(), LocalDate.now().atStartOfDay());
        System.out.println("Всего в днях: " + between1.toDays() + " (дефолт)");
        int year = ld.getYear();
        int monthOfYear = 0;
        int dayOfOneMonth = 31;
//        LocalDate now = LocalDate.now();
//        int year1 = now.getYear();
//        String nowDate = String.valueOf(year1);
//        int i1 = Integer.parseInt(nowDate);
        while (year != 2023){
            int dayOfMonth = 1;
            if (year % 4 == 0) {
                monthOfYear += 1;
            } while (dayOfMonth != 13){
                if (dayOfMonth % 2 == 0) {
                    monthOfYear += dayOfOneMonth - 1;
                } else monthOfYear += dayOfOneMonth;
                dayOfMonth++;
            }
            year++;
        }
        System.out.println("Всего в днях: " + monthOfYear + " (c подсчетом дней в месяцах и висакосным годом)");
        System.out.println("Всего в месяцах: " + between1.toDays() / 30 );
        Period between2 = Period.between(ld, LocalDate.now());
        System.out.println("Тебе: дней - " + between2.getDays() + "; месяцев - " + between2.getMonths() + "; лет - " + between2.getYears());
    }
}
