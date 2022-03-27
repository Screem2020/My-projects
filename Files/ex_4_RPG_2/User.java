package Files.ex_4_RPG_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;


public class User implements Serializable {
    private int id;
    private String login;
    private String password;
    private List<Player> playerList = new ArrayList<>();
    protected Player selectPlayer;

    public User(Player selectPlayer) {
        this.selectPlayer = selectPlayer;
    }

    public Player getSelectPlayer() {
        return selectPlayer;
    }

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
            try {
                if (input == 1) {
                    scanner = new Scanner(System.in);
                    for (Player player : hunterList) {
                        System.out.println(player.getName());
                    }
                    System.out.println("Entered class Hunter");
                    String nameClass = scanner.nextLine();
                    Hunter hunter = new Hunter(nameClass);
                    int i = hunterList.indexOf(hunter);
                    if (i == -1) {
                        throw new RuntimeException("not added");
                    } else {
                        playerList.add(hunterList.get(i));
                        System.out.println("Hunter added to you character list");
                    }
                } else if (input == 2) {
                    scanner = new Scanner(System.in);
                    for (Player player : magicsList) {
                        System.out.println(player.getName());
                    }
                    System.out.println("Entered class Magic");
                    String nameClass = scanner.nextLine();
                    Magic magic = new Magic(nameClass);
                    int i = magicsList.indexOf(magic);
                    if (i == -1) {
                        throw new RuntimeException("not added");
                    } else {
                        playerList.add(magicsList.get(i));
                        System.out.println("Magic added to you character list");
                    }

                } else if (input == 3) {
                    scanner = new Scanner(System.in);
                    for (Player player : healthersList) {
                        System.out.println(player.getName());
                    }
                    System.out.println("Entered class Heather");
                    String nameClass = scanner.nextLine();
                    Heather heather = new Heather(nameClass);
                    int i = healthersList.indexOf(heather);
                    if (i == -1) {
                        throw new RuntimeException("not added");
                    } else {
                        playerList.add(healthersList.get(i));
                        System.out.println("Heather added to you character list");
                    }
                }
            }catch (RuntimeException e) {
                e.printStackTrace();
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
            userList = (List<User>) ois.readObject();
            ois.close();
            System.out.println(userList);
        } catch (IOException | ClassNotFoundException e) {
        }
        return userList;
        //TODO: Ключевое слово assert аналог if?
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
        return "id " + id + " : " + "login " + login + " : " + "password " + password + " : " + "playerList "+ "\n" + playerList;
    }
}

