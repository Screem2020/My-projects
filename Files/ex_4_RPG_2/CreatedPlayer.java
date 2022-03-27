package Files.ex_4_RPG_2;

import java.util.List;
import java.util.Scanner;

public class CreatedPlayer {

    public void searchPlayer(User user) {
        List<Player> playerList = user.getPlayerList();
        System.out.println("Entered player can game");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        Player player = new Player(name);
        for (Player player1 : playerList) {
            if (player1.getName().equalsIgnoreCase(player.getName())) {
                user.selectPlayer = player1;
            }
        }
    }

    public void startGame(User user1, User user2) {
        try {
            Player attack = user1.selectPlayer;
            Player defend = user2.selectPlayer;

            while (attack.getHealth() <= 0) {
                stepPlayer(user1, user2);
                System.out.println(defend.getHealth() + " left heat points " + defend.getName());
                attack.updateLevel();
                attack.con++;

                Player tmp = attack;
                attack = defend;
                defend = tmp;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void stepPlayer(User user1, User user2) {
        Player selectPlayer1 = user1.getSelectPlayer();
        Player selectPlayer2 = user2.getSelectPlayer();
        int val;
        val = (int) (Math.random() * 2);
        if (val == 1) {
            selectPlayer1.basicAttack(selectPlayer2);
        } else selectPlayer1.specialAttack(selectPlayer2);
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
        } else System.err.println("No heroes created yet");
    }

    /*public static List<Player> loadPlayerList() {
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
                pw.print(player.getLevel() + ":");
                pw.println(player.getName());
                pw.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }*/
}