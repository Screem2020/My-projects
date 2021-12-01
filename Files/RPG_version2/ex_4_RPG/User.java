package Files.RPG_version2.ex_4_RPG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class User {
    private int id;
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List <User> loadListUser() {
        List <User> userList = new ArrayList<>();
        String way = "src\\Files\\ex_4_RPG\\Characterds.txt\\";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String login = split[1].trim();
                String password = split[2].trim();
                User user = new User(id, login, password);
                userList.add(user);
            }
            scn.close();
        } catch (FileNotFoundException e) {
        }
        return userList;
    }

    public String getLogin() {
        return login;
    }

    public static void saveListUser(List <User> userList) {
        String way = "src\\Files\\ex_4_RPG\\Characterds.txt\\";
        try {
            PrintWriter pw = new PrintWriter(way);
            for (User user : userList) {
                pw.println(user.id + ", " + user.login + ", " + user.password);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login);
    }
}
