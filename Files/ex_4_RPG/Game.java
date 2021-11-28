package Files.ex_4_RPG;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    public Game() {

    }

    public List <Player> loadListPlayer() {
        List<Player> listPlayer = new ArrayList<>();
        String way = "src\\Files\\ex_4_RPG\\BasePlayer.txt";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(",");
                String name = split[0];
                int level = Integer.parseInt(split[1]);
                int health = Integer.parseInt(split[2]);
                int damage = Integer.parseInt(split[3]);
                int physical = Integer.parseInt(split[4]);
                int magic = Integer.parseInt(split[5]);
                Player player = new Player(name, level, health, damage, physical, magic);
                listPlayer.add(player);
            }
            scn.close();
        } catch (FileNotFoundException e) {
        }
        return listPlayer;
    }
}
