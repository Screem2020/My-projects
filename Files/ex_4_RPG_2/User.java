package Files.ex_4_RPG_2;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class User implements Serializable {
    private int id;
    private final String login;
    private final String password;
    private List<Player> playerList = new ArrayList<>();
    public Player selectPlayer;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(int id, String login, String password) {
        this(login, password);
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

    public void chooseCharacter() {
        List<Player> hunterList = new ArrayList<>();
        List<Player> magicsList = new ArrayList<>();
        List<Player> healthersList = new ArrayList<>();

        Hunter huskar = new Hunter("Huskar", 1);
        Hunter pudge = new Hunter("Pudge", 1);
        hunterList.add(huskar);
        hunterList.add(pudge);
        Magic crystalMaiden = new Magic("Crystal Maiden", 1);
        Magic viper = new Magic("Viper", 1);
        magicsList.add(crystalMaiden);
        magicsList.add(viper);
        Heather Dazzle = new Heather("Dazzle", 1);
        Heather Chen = new Heather("Chen", 1);
        healthersList.add(Dazzle);
        healthersList.add(Chen);

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input != 4) {
            System.out.println("""
                    1.Hunter
                    2.Magic
                    3.Heather
                    4.Back
                    """);
            input = scanner.nextInt();

            if (input == 1) {
                scanner = new Scanner(System.in);
                for (Player player : hunterList) {
                    System.out.println(player.getName());
                }
                System.out.println("Entered class Hunter");
                String nameClass = scanner.nextLine();
                Hunter hunter = new Hunter(nameClass);
                for (Player player : hunterList) {
                    if (player.getName().equalsIgnoreCase(hunter.getName())) {
                        playerList.add(player);
                        System.out.println("Hunter added to you character list");
                    } else System.out.println("not added");
                }
            } else if (input == 2) {
                scanner = new Scanner(System.in);
                for (Player player : magicsList) {
                    System.out.println(player.getName());
                }
                System.out.println("Entered class Magic");
                String nameClass = scanner.nextLine();
                Magic magic = new Magic(nameClass);
                for (Player player : magicsList) {
                    if (player.getName().equalsIgnoreCase(magic.getName())) {
                        playerList.add(player);
                    }
                }
            } else if (input == 3) {
                scanner = new Scanner(System.in);
                for (Player player : healthersList) {
                    System.out.println(player.getName());
                }
                System.out.println("Entered class Heather");
                String nameClass = scanner.nextLine();
                Heather heather = new Heather(nameClass);
                for (Player player : healthersList) {
                    if (player.getName().equalsIgnoreCase(heather.getName())){
                        playerList.add(player);
                    }
                }
            }
        }
    }

    public static void outputStream(List<User> userList) {
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("src\\Files\\ex_4_RPG_2\\UserBase.txt"));
            oos.writeObject(userList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<User> inputStream() {
        List<User> userList = new ArrayList<>();
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("src\\Files\\ex_4_RPG_2\\UserBase.txt"));
            userList = (List<User>)ois.readObject();
            ois.close();
            System.out.println(userList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }

   /* public static List<User> LoadListUser() {
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
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public String toString() {
        return "id " + id + " : " + "login " + login + " : " + "password " + password + " : " + "playerList " + playerList;
    }
}

