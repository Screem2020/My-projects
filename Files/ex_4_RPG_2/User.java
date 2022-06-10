package Files.ex_4_RPG_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;


public class User implements Serializable, Comparable<User> {
    private int id;
    private final String login;
    private final String password;
    private List<Player> playerList = new ArrayList<>();
    protected Player selectPlayer;

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
        List<Hunter> hunterList = new ArrayList<>();
        List<Magic> magicsList = new ArrayList<>();
        List<Heather> healthersList = new ArrayList<>();


        Huskar huskar = new Huskar("Huskar", 1, 30, 10);
        Pudge pudge = new Pudge("Pudge", 1, 50, 3);
        hunterList.add(huskar);
        hunterList.add(pudge);
        CrystalMaiden crystalMaiden = new CrystalMaiden("Crystal Maiden", 1, 5, 50);
        Viper viper = new Viper("Viper", 1, 15, 30);
        magicsList.add(crystalMaiden);
        magicsList.add(viper);
        Dazzle dazzle = new Dazzle("Dazzle", 1, 5, 30);
        Chen chen = new Chen("Chen", 1, 10, 20);
        healthersList.add(dazzle);
        healthersList.add(chen);

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
                    for (Hunter hunter1 : hunterList) {
                        if (hunter1.getName().equalsIgnoreCase(hunter.getName())){
                            playerList.add(hunter1);
                            System.out.println("Add character");
                        }
                    }

                } else if (input == 2) {
                    scanner = new Scanner(System.in);
                    for (Player player : magicsList) {
                        System.out.println(player.getName());
                    }
                    System.out.println("Entered class Magic");
                    String nameClass = scanner.nextLine();
                    Magic magic = new Magic(nameClass);
                    for (Magic magic1 : magicsList) {
                        if (magic1.getName().equalsIgnoreCase(magic.getName())){
                            playerList.add(magic1);
                            System.out.println("Add character");
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
                    for (Hunter heather1 : hunterList) {
                        if (heather.getName().equalsIgnoreCase(heather1.getName())){
                            playerList.add(heather1);
                            System.out.println("Add character");
                        }
                    }
                }
            } catch (RuntimeException e) {
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
        return "id " + id + " : " + "login " + login + " : " + "password " + password + " : " + "playerList " + "\n" + playerList;
    }

    @Override
    public int compareTo(User o) {
        boolean equals = this.login.equals(o.login);
        if (equals) return 1; // при сравнении стрингов через икулс 2 исхода
        else return -1;
    }
}

