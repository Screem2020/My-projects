package Files.RPG_version2.ex_4_RPG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Game {

    public Game() {
        List<Hunter> listHunterPlayer = new ArrayList<>();
        listHunterPlayer.add(new Huskar("Huskar"));
        listHunterPlayer.add(new Pudge("Pudge", 0, 0, 0, 0, 0));
        List<Magic> listMagicPlayer = new ArrayList<>();
        listMagicPlayer.add(new Magic("Crystal Maiden", 0, 0, 0, 0, 0));
        listMagicPlayer.add(new Magic("Viper", 0, 0, 0, 0, 0));
        List<Heather> listHeatherPlayer = new ArrayList<>();
        listHeatherPlayer.add(new Heather("Dazzle", 0, 0, 0, 0, 0));
        listHeatherPlayer.add(new Heather("Chen", 0, 0, 0, 0, 0));
        Scanner scn = new Scanner(System.in);

        int value = 0;
        while (value != 4) {
            System.out.println("Выберите героя:");
            System.out.println("""
                    1.Воин
                    2.Маг
                    3.Лекарь
                    4.Back
                     """);
            value = scn.nextInt();

            if (value == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entered Hunter:");
                for (int i = 0; i < listHunterPlayer.size(); i++) {
                    if (listHunterPlayer.get(i).getClass() == Huskar.class) {
                        System.out.println("-> " + listHunterPlayer.get(i).getName());
                    }
                }
                for (int i = 0; i < listHunterPlayer.size(); i++) {
                    if (listHunterPlayer.get(i).getClass() == Pudge.class) {
                        System.out.println("-> " + listHunterPlayer.get(i).getName());
                    }
                }
                String name = sc.nextLine().toLowerCase(Locale.ROOT);
                Hunter hunter = new Hunter(name);
                for (int i = 0; i < listHunterPlayer.size(); i++) {
                    if (listHunterPlayer.get(i).getName().equalsIgnoreCase(hunter.getName())) {
                        Huskar huskar = new Huskar("Huskar");
                        System.out.println(huskar.getDamage());
                    } else {
                        Pudge pudge = new Pudge("Pudge", 0, 0, 0, 0, 0);
                        System.out.println(pudge);
                    }
                }
            }
        }
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
                double physical = Integer.parseInt(split[4]);
                double magic = Integer.parseInt(split[5]);
                Player player = new Player(name, level, health, damage, physical, magic);
                listPlayer.add(player);
            }
            scn.close();
        } catch (FileNotFoundException e) {
        }
        return listPlayer;
    }

    public void saveListPlayer(List <Player> playerList) {
        String way = "src\\Files\\ex_4_RPG\\BasePlayer.txt";
        try {
            PrintWriter pw = new PrintWriter(way);
            for (Player player : playerList) {
                pw.println(player.getName() + ", " + player.getLevel() +  ", " + player.getHealth() + ", " + player.getDamage() +
                        ", " + player.getPhysicalProtection() + ", " + player.getMagicProtection());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
