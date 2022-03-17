package Files.ex_4_RPG_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CreatedPlayer {

    public void chooseCharacter(User user) {
        List<Player> playerListUser = user.getPlayerList();
        List<Player> hunterList = new ArrayList<>();
        List<Player> magicsList = new ArrayList<>();
        List<Player> healthersList = new ArrayList<>();

        Hunter huskar = new Hunter("Huskar",1);
        Hunter pudge = new Hunter("Pudge",1);
        hunterList.add(huskar);
        hunterList.add(pudge);
        Magic crystalMaiden = new Magic("Crystal Maiden",1);
        Magic viper = new Magic("Viper",1);
        magicsList.add(crystalMaiden);
        magicsList.add(viper);
        Heather Dazzle = new Heather("Dazzle",1);
        Heather Chen = new Heather("Chen",1);
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
                    if (player.getName().equals(hunter.getName())) {
                        playerListUser.add(player);
                        System.out.println("Hunter added to you character list");
                    }
                }
            }
            else if (input == 2) {
                scanner = new Scanner(System.in);
                for (Player player : magicsList) {
                    System.out.println(player.getName());
                }
                System.out.println("Entered class Magic");
                String nameClass = scanner.nextLine().toLowerCase(Locale.ROOT);
                Magic magic = new Magic(nameClass);
                for (Player player : magicsList) {
                    if (player.equals(magic)) {
                        playerListUser.add(player);
                    }
                }
            }
            else if (input == 3) {
                scanner = new Scanner(System.in);
                for (Player player : healthersList) {
                    System.out.println(player.getName());
                }
                System.out.println("Entered class Heather");
                String nameClass = scanner.nextLine().toLowerCase(Locale.ROOT);
                Heather heather = new Heather(nameClass);
                for (Player player : healthersList) {
                    if (player.equals(heather)) {
                        playerListUser.add(player);
                    }
                }
            } else System.err.println("Characters is not found");
        }
    }

    public void startGame(User user1, User user2){

    }

    public void deletedCharacter(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name character for delete");
        String name = scanner.nextLine();
        Player player = new Player(name);
        List<Player> playerList = user.getPlayerList();
        int i = playerList.indexOf(player);
        if (i != -1) {
            playerList.remove(i);
        }
    }

    public void showCharacter(User user) {
        List<Player> playerList = user.getPlayerList();
        if (playerList.size() != 0) {
            for (Player player : playerList) {
                System.out.println(player);
            }
        }
        else System.err.println("No heroes created yet");
    }

    public static List<Player> loadPlayerList() {
        List<Player> playerList = new ArrayList<>();
        String way = "src\\Files\\ex_4_RPG_2\\PlayerBase.txt";
        File file = new File(way);
        try (Scanner scn = new Scanner(file)){
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(",");
                String name = split[0].trim();
                int level = Integer.parseInt(split[1].trim());
                Player player = new Player(name, level);
                playerList.add(player);
            }
        } catch (FileNotFoundException e) {
        }
        return playerList;
    }

    public static void savePlayerList(List<Player> playerListUser) {
        String way = "src\\Files\\ex_4_RPG_2\\PlayerBase.txt";
        File file = new File(way);
        try (PrintWriter pw = new PrintWriter(file)) {
            for (Player player : playerListUser) {
                pw.print(player.getName() + ",");
                pw.println(player.getLevel());
                pw.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}