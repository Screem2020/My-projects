package Files.ex_4_RPG;

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
        List<User> userList = User.loadListUser();
        List<Player> playerList = Created.loadListPlayer();
        Created created = new Created();
        User user1 = null;
        User user2 = null;
        System.out.println(userList);
        int input = 0;

        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println("""
                    1.Registration
                    2.Entrance in system
                    3.Start Game
                    4.Exit
                    """);
            input = scn.nextInt();

            if (input == 1) {
                scn = new Scanner(System.in);
                System.out.println("Enter login");
                String login = scn.nextLine().toLowerCase(Locale.ROOT);
                System.out.println("Enter password");
                String password = scn.nextLine().toLowerCase(Locale.ROOT);
                int id = 1;
                if (userList.size() != 0) id = userList.get(userList.size() - 1).getId() + 1;
                User user = new User(id, login, password, playerList);
                try {
                    for (User val : userList) {
                        if (user.getLogin().equals(val.getLogin())) {
                            System.err.println("This login exist, please enter other login");
                            throw new Exception();
                        }
                    }
                    userList.add(user);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (input == 2) {


                for (int i = 0; i < 2; i++) {
                    User currentUser = null;
                    try {
                        scn = new Scanner(System.in);
                        System.out.println("Enter login");
                        String login = scn.nextLine();
                        System.out.println("Enter password");
                        String password = scn.nextLine();
                        int index = userList.indexOf(new User(login, password));
                        if (index == -1) {
                            throw new Exception("This login not exist, checked entered your data");
                        }


                        currentUser = userList.get(index);
                        int inp = 0;
                        Scanner sc = new Scanner(System.in);
                        while (inp != 5) {
                            System.out.println("""
                                        1.Registration hero
                                        2.All hero
//                                        3.Gaming
                                        3.Select Hero
                                        4.Delete hero
                                        5.Back
                                        """);
                            inp = sc.nextInt();
                            if (inp == 1) {
                                created.registrationPlayer(currentUser);
                            } else if (inp == 2) {
                                System.out.println(playerList);
                            } else if (inp == 3) {
//                                    created.gamePlayer(currentUser);
                                created.selectHero(currentUser); //currentUser выбирает персонажа для игры
                            } else if (inp == 4) {
                                created.deleteHero(currentUser);
                            }
//                                else if (inp == 5) {
//                                    Created.saveListPlayer(playerList);
//                                    break;
//                                }
                        }

                        if (i == 0) user1 = currentUser;
                        else user2 = currentUser;


                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


            }
            else if(input == 3){
                if(user1==null) throw new RuntimeException("user 1 is null");
                if(user2==null) throw new RuntimeException("user 2 is null");
                created.startGame(user1, user2);
            }
            else if (input == 4) {
                User.saveListUser(userList, playerList);
                Created.saveListPlayer(playerList);
            }
        }
    }
}
