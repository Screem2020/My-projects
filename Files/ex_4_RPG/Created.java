package Files.ex_4_RPG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Created {

    private List<Player> list = new ArrayList<>();

    public void registrationPlayer(User user) {
        List<Hunter> listHunterPlayer = new ArrayList<>();
        List<Magic> listMagicPlayer = new ArrayList<>();
        List<Healer> listHealerPlayer = new ArrayList<>();
        Huskar huskar = new Huskar("Huskar", 1);
        Pudge pudge = new Pudge("Pudge", 1);
        listHunterPlayer.add(huskar);
        listHunterPlayer.add(pudge);
        list.add(huskar);
        list.add(pudge);

        CristalMaiden crystal_maiden = new CristalMaiden("Crystal Maiden", 1);
        Viper viper = new Viper("Viper", 1);
        listMagicPlayer.add(crystal_maiden);
        listMagicPlayer.add(viper);
        list.add(crystal_maiden);
        list.add(viper);

        Dazzle dazzle = new Dazzle("Dazzle", 1);
        Chen chen = new Chen("Chen", 1);
        listHealerPlayer.add(dazzle);
        listHealerPlayer.add(chen);
        list.add(dazzle);
        list.add(chen);
        Scanner scn = new Scanner(System.in);
        int value = 0;
        while (value != 4) {
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
                    System.out.println("-> " + element.getName());//instanceof
                }
                String name = sc.nextLine().toLowerCase(Locale.ROOT);
                Hunter hunter = new Hunter(name);
                int flag = 0;

                for (int i = 0; i < listHunterPlayer.size(); i++) {
                    if (hunter.getName().equalsIgnoreCase(huskar.getName())) {
                        flag = 1;
                    }
                    if (hunter.getName().equalsIgnoreCase(pudge.getName())) {
                        flag = 2;
                    }
                }
                if (flag == 1) {
                    System.out.println("Your created character " + huskar.getName());
                    listHeroPlayer.add(huskar);
                }
                if (flag == 2) {
                    System.out.println("Your created character " + pudge.getName());
                    listHeroPlayer.add(pudge);
                }
                if (flag != 1 && flag != 2) System.err.println("Error entered name character");
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

                }
                if (flag == 2) {
                    System.out.println("Your created character Viper");
                    listHeroPlayer.add(viper);
                }
                if (flag != 1 && flag != 2) System.err.println("Error entered name character");
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
                }
                if (flag != 1 && flag != 2) System.err.println("Error entered name character");
            }
        }
    }

    public void deleteHero(User user) {
        List<Player> listHeroPlayer = user.getListHeroPlayer();
        System.out.println("Entered player delete");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("entered level");
        int level = scanner.nextInt();
        Player playerDel = new Player(name, level);
        Player player = searchPlayer(user, playerDel);
        System.out.println(player);
        if (listHeroPlayer.remove(player)) {
            System.out.println("Hero deleted");
        }
    }


    public void gamePlayer(User user) {
        System.out.println("Entered player can game");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Player pla = new Player(name);
        Player player = searchPlayer(user, pla);
        int con = 0;
        Player player1 = comHero(list);
        while (player.getHealth() <= 0 && player1.getHealth() <= 0) {
            stepPlayer(player);
            System.out.println(player.getHealth() + "осталось жизней" + player.getName());
            player.updateLevel();
            con += 1;

            if (con / 2 == 0) {
            }
        }
    }

    public void stepPlayer(Player player) {
        System.out.println("to hit random shot");
        Player player1 = comHero(list);
        int val;
        val = (int) (Math.random() * 2);
        if (val == 1) {
            player.specialAttack(player1);
        }
        if (val == 2) {
            player.basicAttack(player1);
        }
    }

    public Player comHero(List<Player> list) {
        int index;
        index = (int) (Math.random() * 6) + 1;
        return list.get(index);
    }

    public Player searchPlayer(User user, Player player) {
        List<Player> listHeroPlayer = user.getListHeroPlayer();
        System.out.println(listHeroPlayer);
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < listHeroPlayer.size(); i++) {
            if (listHeroPlayer.get(i).equals(player)) {
                System.out.println("You entered " + player.getName());
                index = i;
                flag = true;
            }
        }
        if (!flag) {
            System.err.println("Not found hero");
        }
        return listHeroPlayer.get(index);
    }

    /**
     * Метод принимает строку с именем персонажа name и level уровень персонажа
     * разбивает на строку и сохраняет в виде обьекта player добавлет и выгружает в список listPlayer
     *
     * @return список персонажей, если данного файла не существует, то он создается
     */
    public static List<Player> loadListPlayer() {
        List<Player> listPlayer = new ArrayList<>();
        String way = "src\\Files\\ex_4_RPG\\BasePlayer.txt";
        File file = new File(way);
        try (Scanner scn = new Scanner(file)) {
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(":");
                String name = split[0].trim();
                int level = Integer.parseInt(split[1]);
                Player player = new Player(name, level);
                listPlayer.add(player);
            }
        } catch (FileNotFoundException e) {
        }
        return listPlayer;
    }

    /**
     * Метод сохраняет данные в файл в заданном формате
     *
     * @param playerList список игроков
     * @return
     */
    public static void saveListPlayer(List<Player> playerList) {
        String way = "src\\Files\\ex_4_RPG\\BasePlayer.txt";
        File file = new File(way);
        try (PrintWriter pw = new PrintWriter(file)) {
            for (Player player : playerList) {
                pw.println(new StringBuilder()
                        .append(player.getName()).append(":")
                        .append(player.getLevel()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}