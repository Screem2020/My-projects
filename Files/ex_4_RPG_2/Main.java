package Files.ex_4_RPG_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    //У каждого персонажа есть атрибуты:
    //name - название персонажа
    //level (уровень игрока)
    //health (здоровье) - вычисляется по формуле 50*level*1.5
    //damage - базовый урон базовой атаки, вычисляется по формуле 10*level*1.2
    //physical protection (защита от физических атакам, в процентах). Снижает урон от физической атаки
    //magic protection (защита от магич mеских атакам, в процентах). Снижает урон от магической атаки
    //
    //Все персонажи должны содержать методы
    //void basicAtack(Character character) - базовая атака, урон основан на параметре damage у игрока
    //void specialAtack(Character character) - атака специальной способностью, зависит от класса персонажа
    //void updateLevel() - Увеличивает уровень. Увеличивается каждые три кона.
    //
    //Классы персонажей:
    //Воин
    //Маг
    //Лекарь
    //
    //У каждого класса свои специальные атаки
    //У воина:
    //рубка на топорах: наносит 20 физического урона. Перезарядка 2 кона
    //
    //У мага:
    //сила дракона: добавляет ко всем физическим атакам мага такой же магический урон. Перезарядка 2 кона
    //
    //У лекаря:
    //исцеление: восстанавливает 17 единиц здоровья. Перезарядка 2 кона
    //
    //
    //################
    //Сохранение
    //################
    //Программа должна иметь возможность сохранять в файл текущие характеристики игрока,
    // чтобы игрок мог продолжить игру после завершения.
    //
    //
    //################
    //Хранение данных
    //################
    //Вставить в файл users.txt следующие данные
    //0;user1;user123
    //1;user2;user223
    //Файл хранит данные в формате id;login;password
    //id - уникальный порядковый номер игрока
    //
    //
    //Вставьте в файл characterds.txt следующие данные:
    //0;2;viper
    //1;3;crystal maiden
    //Файл хранит данные в формате id;level;name
    //name - название персонажа
    //
    //
    //################
    //Виды персонажей
    //################
    //Создайте следующие виды персонажей:
    //Воин Huskar
    //physical protection 30%           (число * процент) / 100.
    //magic protection 10%
    //
    //Воин Pudge
    //physical protection 50%
    //magic protection 3%
    //
    //Маг Crystal Maiden
    //physical protection 5%
    //magic protection 50%
    //
    //Маг Viper
    //physical protection 15%
    //magic protection 30%
    //
    //Лекарь Dazzle
    //physical protection 5%
    //magic protection 30%
    //
    //Лекарь Chen
    //physical protection 10%
    //magic protection 20%
    public static void main(String[] args) {
        List<User> userList = User.inputStream();
        ArrayList<Player> playerList1 = new ArrayList<>();
        playerList1.add(new Huskar("Huskar", 1, 30, 10));
        userList.add(new User(1, "l", "l", playerList1));
//        User user1 = userList.get(0);
//        List<Player> playerList2 = user1.getPlayerList();
//        Player player = playerList2.get(0);
//        while (player.getHealth() >= 0) {
//            Player selectPlayer = user1.getSelectPlayer();
//            selectPlayer = player;
//            Player selectPlayer1 = user1.getSelectPlayer();
//            selectPlayer1 = player;
//            selectPlayer.basicAttack(selectPlayer1);
//            int dinamicHealth = selectPlayer.getHealth();
//            System.out.println(player.dinamicHealth);
//            int a = 0;
//        }
        User userOne = null;
        User otherTwo = null;
        int input = 0;
        CreatedPlayer createdPlayer = new CreatedPlayer();
        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println();
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
                List<Player> playerList = new ArrayList<>();
                if (userList.size() != 0)
                    id = userList.get(userList.size() - 1).getId() + 1;
                User user = new User(id, login, password, playerList);
                boolean contains = userList.contains(user);
                if (!contains) {
                    userList.add(user);
                } else
                    System.err.print("This login exist, please entered other login");
            } else if (input == 2) {
                for (int i = 0; i < 2; i++) {
                    try {
                        scn = new Scanner(System.in);
                        User currentUser;
                        System.out.println();
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
                        while (num != 5) {
                            System.out.println();
                            System.out.println("""
                                    1.Created hero
                                    2.Deleted hero
                                    3.Show all hero
                                    4.Select Player
                                    5.Back
                                    """);
                            num = scn.nextInt();
                            if (num == 1) {
                                currentUser.chooseCharacter();
                            } else if (num == 2) {
                                createdPlayer.deletedCharacter(currentUser);
                            } else if (num == 3) {
                                createdPlayer.showCharacter(currentUser);
                                int size = currentUser.getPlayerList().size();
                                System.out.print("size: " + size);
                            } else if (num == 4) {
                                createdPlayer.searchPlayer(currentUser);
                            }
                        }
                        if (i == 0) userOne = currentUser;
                        else otherTwo = currentUser;

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else if (input == 3) {
                try {
                    if (userOne == null) throw new RuntimeException("user 1 is null");
                    if (otherTwo == null) throw new RuntimeException("user 2 is null");
                    createdPlayer.startGame(userOne, otherTwo);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }

            } else if (input == 4) {
                User.outputStream(userList);
            }
        }
    }
}
