package Files.ex_4_RPG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public List <User> loadListUser() {
        List <User> userList = new ArrayList<>();
        String way = "\"src\\Files\\ex_4_RPG\\Characterds.txt\\";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(",");
                String login = split[0];
                String password = split[1];
                User user = new User(login, password);
                userList.add(user);
            }
            scn.close();
        } catch (FileNotFoundException e) {
        }
        return userList;
    }

    public void saveListUser(List <User> userList) {
        String way = "\"src\\Files\\ex_4_RPG\\Characterds.txt\\";
        try {
            PrintWriter pw = new PrintWriter(way);
            for (User user : userList) {
                pw.println(user.login + ", " + user.password);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
