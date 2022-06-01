package Nio_Stream.Presidents;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = 0;
        String way = "src/main/java/Nio_Stream/Presidents/HistoryPresident.txt";
        ArrayList<President> listPreesident = new ArrayList<>();
        List<String> newPresident = new ArrayList<>();
        listPreesident.add(new President("Джордж Вашингтон", "30.04.1789", "04.03.1797", "Беспартийный"));
        listPreesident.add(new President("Джон Адамс", "04.03.1797", "04.03.1801", "Федералист"));
        listPreesident.add(new President("Томас Джефферсон", "04.03.1801", "04.03.1809", "Демократ-республиканец"));
        listPreesident.add(new President("Джеймс Мэдисон", "04.03.1809", "04.03.1817", "Демократ-республиканец"));
        listPreesident.add(new President("Джеймс Монро", "04.03.1817", "04.03.1825", "Демократ-республиканец"));
        String nameColums = "Президент | Начало Срока | Конец срока | Партийная принадлежность";
        newPresident.add(nameColums);
        for (President president : listPreesident) {
            String pres = String.valueOf(president);
            newPresident.add(pres);
        }
        if (!Files.exists(Path.of(way))) {
            Files.write(Path.of(way), newPresident, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        }
        List<String> strings = Files.readAllLines(Path.of(way));
        while (input != 5) {
            System.out.println("""
                    1. Вывести имена президентов и сроки их правления в порядке возрастания столбца "начало срока"
                    2. Вывести имена президентов и сроки их правления в обратном порядке
                    3. Найти президента, который правил в определенную дату
                    4. Добавить нового президента
                    5. Выход
                    """);
            input = scn.nextInt();
            if (input == 1) {
                List<President> presidents = splitLines(strings);
                for (President president : presidents) {
                    System.out.println(president.getName() + " " + president.getStart() + " - " + president.getEnd());
                }
            }
            if (input == 2) {
                List<President> presidents = splitLines(strings);
                for (int i = presidents.size() - 1; i >= 0; i--) {
                    System.out.println(presidents.get(i).getName() + " " + presidents.get(i).getStart() +
                            " - " + presidents.get(i).getEnd());
                }
            }
            if (input == 3) {
                try {
                    System.out.println("enter date format: dd.MM.yyyy");
                    String date = scn.next();
                    LocalDate format = format(date);  ///какое поставить условие на проверку формата
                    List<President> presidents = splitLines(strings);
                    for (President president : presidents) {
                        LocalDate format1 = format(president.getStart());
                        LocalDate format2 = format(president.getEnd());
                        if (format1.compareTo(format) <= 0 && format2.compareTo(format) >= 0) {
                            System.out.println(president.getName());
                            break;
                        }
                    }
                    throw new DateInvaildFormat();
                }catch (DateInvaildFormat e) {
                    e.printStackTrace();
                }
            }
            if (input == 4){
                System.out.println("Name President");
                String name = scn.next();
                System.out.println("Start");
                String start = scn.next();
                System.out.println("End");
                String end = scn.next();
                System.out.println("Politic");
                String politic = scn.next();
                President president = new President(name, start, end, politic);
                String newPres = String.valueOf(president);
                Files.writeString(Path.of(way), newPres, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
            }
        }
    }
    public static List<President> splitLines(List<String> lines) {
        List<President> listPres = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String[] split = lines.get(i).split(",");
            String name = split[0];
            String start = split[1];
            String end = split[2];
            String politic = split[3];
            listPres.add(new President(name, start, end, politic));
        }
        return listPres;
    }

    public static LocalDate format(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
