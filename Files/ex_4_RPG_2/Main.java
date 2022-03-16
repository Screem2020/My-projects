package Files.ex_4_RPG_2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<User> createdUser = User.LoadListUser();
        List <Player> playerList = CreatedPlayer.loadPlayerList();
        int input = 0;
        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println("""
                    1.Registration
                    2.Entered in System
                    3.Start Game
                    4.Exit
                    """);
            input = scn.nextInt();

            if (input == 1) {
                scn = new Scanner(System.in);
                int id = 1;
                System.out.println("Entered login");
                String login = scn.nextLine();
                System.out.println("Entered password");
                String password = scn.nextLine();
                if (createdUser.size() <= 0)
                    id += 1;
                User user = new User(id, login, password);
                createdUser.add(user);
            }
            if (input == 2) {
                scn = new Scanner(System.in);
                User currentUser = null;
                System.out.print("Entered login => ");
                String login = scn.nextLine();
                System.out.print("Entered password => ");
                String password = scn.nextLine();
                User userNew = new User(login, password);
                int index = createdUser.indexOf(userNew);
                if (index == -1) {
                    throw new RuntimeException("This login not exist, checked entered your data");
                } else currentUser = createdUser.get(index);

                scn = new Scanner(System.in);
                int num = 0;
                System.out.println("""
                        1.
                        """);
            }
        }
    }
}
