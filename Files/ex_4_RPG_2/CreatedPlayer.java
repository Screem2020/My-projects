package Files.ex_4_RPG_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CreatedPlayer {

    public Player searchPlayer(User user) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine().toLowerCase(Locale.ROOT);
        Player player = new Player(name);
        List<Player> playerList = user.getPlayerList();
        int i = playerList.indexOf(player);
        return playerList.get(i);
    }

    public void startGame(User user1, User user2){
        Player player = searchPlayer(user1);
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
        } else System.err.println("This Character is not found");
    }

    public void showCharacter(User user) {

        List<Player> playerList = user.getPlayerList();
        if (playerList.size() != 0) {
            for (Player player : playerList) {
                System.out.println(player.getName());
            }
        }
        else System.err.println("No heroes created yet");
    }

    public static List<Player> loadPlayerList() {
        List<Player> playerList = new ArrayList<>();
        String way = "src\\Files\\ex_4_RPG_2\\PlayerBase.txt";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
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
                pw.print(player.getLevel() + ":");
                pw.println(player.getName());
                pw.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}