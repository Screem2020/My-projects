package Files.ex_4_RPG_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatedPlayer {

    public static List<Player> loadPlayerList() {
        List <Player> playerList = new ArrayList<>();
        String way = "src\\Files\\ex_4_RPG_2\\PlayerBase.txt";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line  =  scn.nextLine();
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

    public static void savePlayerList(List<Player> playerList) {
        String way = "src\\Files\\ex_4_RPG_2\\PlayerBase.txt";
        File file = new File(way);
        try (PrintWriter pw = new PrintWriter(file)) {
            for (Player player : playerList) {
                pw.print(player.getLevel() + ",");
                pw.println(player.getName());
                pw.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
