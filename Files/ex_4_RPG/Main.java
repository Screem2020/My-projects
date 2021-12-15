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
        List<Player>playerList = Created.loadListPlayer();
        System.out.println(userList);
        int input = 0;
        Scanner scn = new Scanner(System.in);
        while (input != 3) {
            System.out.println("""
                    1.Registration
                    2.Entrance in system
                    3.Exit
                    """);
            input = scn.nextInt();

            if (input == 1) {
                scn = new Scanner(System.in);
                System.out.println("Enter login");
                String login = scn.nextLine().toLowerCase(Locale.ROOT);
                System.out.println("Enter password");
                String password = scn.nextLine().toLowerCase(Locale.ROOT);
                int id = 0;
                if (userList.size() > 0) {
                    for (User user : userList) {
                        id = user.getId();
                        id++;
                    }
                } else id = 1;
                User user = new User(id, login, password, playerList);
                User.loadListUser(); // не понимаю назначения метода в этом месте
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
            }

            if (input == 2) {
                try {
                    scn = new Scanner(System.in);
                    System.out.println("Enter login");
                    String login = scn.nextLine();
                    System.out.println("Enter password");
                    String password = scn.nextLine();
                    User user = new User(login, password);
                    boolean flag = false;
                    int index = 0;
                    for (int i = 0; i < userList.size(); i++) {
                        if (userList.get(i).equals(user)) {
                            index = i;
                            flag = true;
                        }
                    }
                    if (flag) {
                        Created created = new Created();
                        User userTrue = userList.get(index);
                        int inp = 0;
                        Scanner sc = new Scanner(System.in);
                        while (inp != 3) {
                            System.out.println("""
                                    1.Registration hero
                                    2.All hero
                                    3.Gaming
                                    4.Delete hero
                                    5.Back
                                    """);
                            inp = sc.nextInt();
                            if (inp == 1) {
                                created.registrationPlayer(userTrue);
                            }
                            if (inp == 2) {
                                List<Player> listHeroPlayer = userTrue.getListHeroPlayer();
                                System.out.println(listHeroPlayer);
                            }
                            if (inp == 3) {
                                created.gamePlayer(userTrue);
                            }
                            if (inp == 4) {
                                created.deleteHero(userTrue);
//                                List<Player> listHeroPlayer = userTrue.getListHeroPlayer();
//                                System.out.println("Entered player delete");
//                                Scanner scanner = new Scanner(System.in);
//                                String name = scanner.nextLine().toLowerCase(Locale.ROOT);
//                                Player playerDel = new Player(name);
//                                Player player = created.searchPlayer(userTrue, playerDel);
//                                listHeroPlayer.removeIf(player::equals);
//                                System.out.println("hero deleted");
//                                if (!listHeroPlayer.removeIf(player::equals)) {
//                                    System.out.println("Not found hero");
//                                }
                            }
                            if (inp == 5) {
                                break;
                            }
                        }
                    }
                    // int val = 0;
//                        while (val != 2) {
//                            System.out.println("Выберите воина:");
//                            System.out.println("""
//                                    1. Huskar
//                                    2. Pudge
//                                    3. Back
//                                    """);
//                            val = scn.nextInt();
//                            if (val == 1) {
//                                Huskar huskar1 = new Huskar();
//                                scn = new Scanner(System.in);
//                                System.out.println("Enter name your hero");
//                                String name = scn.nextLine();
//                                int level = 0;
//                                int damage = huskar1.getDamage();
//                                int health = huskar1.getHealth();
//                                double physicalProtection = huskar1.physicalProtection();
//                                double magicProtection = huskar1.magicProtection();
//                                Huskar huskar12 = new Huskar(name, le3vel, damage, health, magicProtection, physicalProtection);
//                                System.out.println(huskar12);
//                            }
//                        }
                    if (!flag) {
                        throw new Exception("This login not exist, checked entered your data");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (input == 3) {
                User.saveListUser(userList, playerList);
            }
        }
    }
}
