package Files.ex_4_RPG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Created {

    public Created() {
        List<Hunter> listHunterPlayer = new ArrayList<>();
        Huskar huskar = new Huskar("Huskar", 1);
        listHunterPlayer.add(huskar);
        Pudge pudge = new Pudge("Pudge", 1);
        listHunterPlayer.add(pudge);
        List<Magic> listMagicPlayer = new ArrayList<>();
        CristalMaiden crystal_maiden = new CristalMaiden("Crystal Maiden", 1);
        listMagicPlayer.add(crystal_maiden);
        Magic viper = new Magic("Viper", 1);
        listMagicPlayer.add(viper);
        List<Healer> listHealerPlayer = new ArrayList<>();
        Dazzle dazzle = new Dazzle("Dazzle", 1);
        listHealerPlayer.add(dazzle);
        Chen chen = new Chen("Chen", 1);
        listHealerPlayer.add(chen);
        Scanner scn = new Scanner(System.in);

        int value = 0;
        while (value != 4) {
            User user = new User();
            List<Player> listHeroPlayer = user.getListHeroPlayer();
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
                for (Hunter element : listHunterPlayer) {
                    System.out.println("-> " + element.getName());
                }
                String name = sc.nextLine().toLowerCase(Locale.ROOT);
                Hunter hunter = new Hunter(name);
                for (int i = 0; i < listHunterPlayer.size(); i++) {
                    if (hunter.getName().equalsIgnoreCase(huskar.getName())) {
                        System.out.println("Your created character Huskar");
                        listHeroPlayer.add(huskar);
                        System.out.println(huskar);
                    } else if (hunter.getName().equalsIgnoreCase(pudge.getName())) {
                        System.out.println("Your created character Pudge");
                        listHeroPlayer.add(pudge);
                        System.out.println(pudge);
                    }
                }
            }
            if (value == 2) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entered Magic");
                for (Magic el : listMagicPlayer) {
                    System.out.println("-> " + el.getName());
                }
                String name = sc.nextLine().toLowerCase(Locale.ROOT);
                Magic magic = new Magic(name);
                int flag = 0;
                for (int i = 0; i < listMagicPlayer.size(); i++) {
                    if (magic.getName().equalsIgnoreCase(crystal_maiden.getName())) {
                        flag = 1;
                    }
                    if (magic.getName().equalsIgnoreCase(viper.getName())) {
                        flag = 2;
                    }
                }
                if (flag == 1) {
                    System.out.println("Your created character Crystal Maiden");
                    listHeroPlayer.add(crystal_maiden);
                    System.out.println(crystal_maiden);
                }
                if (flag == 2) {
                    System.out.println("Your created character Viper");
                    listHeroPlayer.add(viper);
                    System.out.println(viper);
                } else System.err.println("Error entered name character");
            }
            if (value == 3) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entered Healer:");
                for (Healer element : listHealerPlayer) {
                    System.out.println("-> " + element.getName());
                }
                String name = sc.nextLine().toLowerCase(Locale.ROOT);
                Healer healer = new Healer(name);
                int flag = 0;
                for (int i = 0; i < listHealerPlayer.size(); i++) {
                    if (healer.getName().equalsIgnoreCase(dazzle.getName())) {
                        flag = 1;
                    }
                    if (healer.getName().equalsIgnoreCase(chen.getName())) {
                        flag = 2;
                    }
                }
                if (flag == 1) {
                    System.out.println("Your created character Dazzle");
                    listHeroPlayer.add(dazzle);
                    System.out.println(dazzle);
                }
                if (flag == 2) {
                    System.out.println("Your created character Chen");
                    listHeroPlayer.add(chen);
                    System.out.println(chen);
                } else System.err.println("Error entered name character");
                break;
            }
            if (value == 4) {
                saveListPlayer(listHeroPlayer);
            }
        }
    }

    public static List<Player> loadListPlayer() {
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

    public static void saveListPlayer(List<Player> playerList) {
        String way = "src\\Files\\ex_4_RPG\\BasePlayer.txt";
        try {
            PrintWriter pw = new PrintWriter(way);
            for (Player player : playerList) {
                pw.println(player.getName() + ", " + player.getLevel() + ", " + player.getHealth() + ", " + player.getDamage() +
                        ", " + player.getPhysicalProtection() + ", " + player.getMagicProtection());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
