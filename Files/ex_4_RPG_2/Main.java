package Files.ex_4_RPG_2;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<User> userList = User.inputStream();
        User userOne = null;
        User otherTwo = null;
        int input = 0;
        CreatedPlayer createdPlayer = new CreatedPlayer();
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
                String login = scn.nextLine().toLowerCase(Locale.ROOT);
                System.out.println("Entered password");
                String password = scn.nextLine().toLowerCase(Locale.ROOT);
                if (userList.size() != 0)
                    id = userList.get(userList.size() - 1).getId() + 1;
                User user = new User(id, login, password);
                boolean contains = userList.contains(user);
                if (contains) {
                    System.err.println("This login exist, please entered other login");
                }
                userList.add(user);
            } else if (input == 2) {
                for (int i = 0; i < 2; i++) {
                    scn = new Scanner(System.in);
                    User currentUser = null;
                    System.out.print("Entered login => ");
                    String login = scn.nextLine().toLowerCase(Locale.ROOT);
                    System.out.print("Entered password => ");
                    String password = scn.nextLine().toLowerCase(Locale.ROOT);
                    User userNew = new User(login, password);
                    int index = userList.indexOf(userNew);
                    if (index == -1) {
                        throw new RuntimeException("This login not exist, checked entered your data");
                    } else currentUser = userList.get(index);

                    scn = new Scanner(System.in);
                    int num = 0;
                    while (num != 4) {
                        System.out.println("""
                                1.Created hero
                                2.Deleted hero
                                3.Show all hero
                                4.Save
                                """);
                        num = scn.nextInt();
                        if (num == 1) {
                            userNew.chooseCharacter();
                        } else if (num == 2) {
                            createdPlayer.deletedCharacter(currentUser);
                        } else if (num == 3) {
                            createdPlayer.showCharacter(currentUser);
                            int size = currentUser.getPlayerList().size();
                            System.out.println(size);
                        }
                    }
                }
            } else if (input == 3) {
                if (userOne == null) throw new RuntimeException("user 1 is null");
                if (otherTwo == null) throw new RuntimeException("user 2 is null");
                createdPlayer.startGame(userOne, otherTwo);

            } else if (input == 4) {
                User.outputStream(userList);
            }
        }
    }
}
