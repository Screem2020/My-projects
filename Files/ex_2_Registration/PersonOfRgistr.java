package Files.ex_2_Registration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonOfRgistr {

    public static void saveOfRegister(List <Person> personList) {
        String way = "src\\Files\\ex_2_Registration\\LoginAndPassword.txt";
        try {
            PrintWriter pw = new PrintWriter(way);
            for (Person value : personList) {
                pw.printf(value.getLogin() + ", " + value.getPassword());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static List <Person> loadOfRegistrList() {
        List <Person> personList = new ArrayList<>();
        String way = "src\\Files\\ex_2_Registration\\LoginAndPassword.txt";
        File file = new File(way);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] split = sc.nextLine().split(",");
                String login = split[0].trim();
                String password = split[1].trim();
                personList.add(new Person(login, password));
            }
            sc.close();
        } catch (FileNotFoundException e) {
        }
        return personList;
    }
}
