package Files.ex_4_RPG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.*;
import static Files.ex_4_RPG.Created.loadListPlayer;

public class User implements Serializable {
    private int id;
    private final String login;
    private final String password;
    private List<Player> listHeroPlayer = loadListPlayer();


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(int id, String login, String password, List<Player> listHeroPlayer) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.listHeroPlayer = listHeroPlayer;
    }

    public List<Player> getListHeroPlayer() {
        return listHeroPlayer;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public static List<User> loadListUser() {
        List<User> userList = new ArrayList<>();
        String way = "src\\Files\\ex_4_RPG\\Characterds.txt\\";
        File file = new File(way);
        try (Scanner scn = new Scanner(file)){
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String login = split[1].trim();
                String password = split[2].trim();
                List<Player> listHero = loadListPlayer();
                User user = new User(id, login, password, listHero);
                userList.add(user);
            }
        } catch (FileNotFoundException e) {
        }
        return userList;
    }

    public static void saveListUser(List<User> userList, List<Player>  listHeroPlayer) {
        String way = "src\\Files\\ex_4_RPG\\Characterds.txt\\";
        File file = new File(way);
        try(PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < userList.size(); i++) {
                pw.println(new StringBuilder()
                        .append(userList.get(i).id).append(", ")
                        .append(userList.get(i).login).append(", ")
                        .append(userList.get(i).password).append(", ")
                        .append(listHeroPlayer.get(i).getName()).append(":")
                        .append(listHeroPlayer.get(i).getLevel())
                        .append(";"));
            }
        }
        catch (FileNotFoundException e) {
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

    @Override
    public String toString() {
        return "User{" +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", listHeroPlayer=" + listHeroPlayer +
                '}';
    }
}
