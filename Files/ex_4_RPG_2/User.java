package Files.ex_4_RPG_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class User implements Serializable {
    private int id;
    private final String login;
    private final String password;
    private List<Player> playerList = new ArrayList<>();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(int id, String login, String password) {
        this(login,password);
        this.id = id;
    }

    public User(int id, String login, String password, List<Player> playerList) {
        this(id, login, password);
        this.playerList = playerList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public int getId() {
        return id;
    }

    public static List<User> LoadListUser() {
        String way = "src\\Files\\ex_4_RPG_2\\UserBase.txt";
        List<User> userList = new ArrayList<>();
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(";");
                int id = Integer.parseInt(split[0].trim());
                String login = split[1].trim();
                String password = split[2].trim();
                User user = new User(id, login, password);
                userList.add(user);
            }
        } catch (FileNotFoundException e) {
        }
        return userList;
    }

    public static void saveListUser(List<User> userList) {
        String way = "src\\Files\\ex_4_RPG_2\\UserBase.txt";
        File file = new File(way);
        try {
            PrintWriter pw = new PrintWriter(file);
            for (User user : userList) {
                pw.print(user.id + ";");
                pw.print(user.login+ ";");
                pw.print(user.password + "\n");
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
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }
}