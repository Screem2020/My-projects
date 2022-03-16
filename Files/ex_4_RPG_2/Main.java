package Files.ex_4_RPG_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <Player> playerList = loadPlayerList();

    }

    public static List<Player> loadPlayerList() {
        List <Player> playerList = new ArrayList<>();
        String way = "src\\Files\\ex_4_RPG_2\\PlayerBase";
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
        String way = "src\\Files\\ex_4_RPG_2\\PlayerBase";
        File file = new File(way);
        try {
            PrintWriter pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
