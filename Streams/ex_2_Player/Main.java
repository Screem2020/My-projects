package Streams.ex_2_Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Создать суперкласс Player:
    //
    //public class Player{
    //int level;
    //int damage;
    //String type; //воин или маг
    //
    ////конструктор
    //
    //public int damage(){
    //return damage*level;
    //}
    //
    //public void increaseLevel(){
    //level++;
    //}
    //
    ////доп методы по необходимости
    //}
    //
    //
    //В мейне создать коллекцию с объектами класса Player и консольное меню:
    //1. Вывести всех игроков
    //2. Вывести игроков, чей урон (метод damage) больше n
    //3. Повысить уровень всех игроков на 1
    //4. Повысить уровень только игроков-воинов на 1
    //5. Выход
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player(5, 100, "magic"));
        playerList.add(new Player(3, 88, "hunter"));
        playerList.add(new Player(1, 13, "heather"));
        playerList.add(new Player(2, 20, "magic"));
        int input = 0;
        while (input != 5) {
            System.out.println("""
                    1. Вывести всех игроков
                    2. Вывести игроков, чей урон (метод damage) больше n
                    3. Повысить уровень всех игроков на 1
                    4. Повысить уровень только игроков-воинов на 1
                    5. Выход
                    """);
            input = scn.nextInt();
            if (input == 1) {
                playerList.forEach(System.out::println);
            }
            if (input == 2) {
                System.out.println("Enter value for filter player or damage");
                int val = scn.nextInt();
                playerList.stream().filter(a -> a.damage() > val).forEach(System.out::println);
            }
            if (input == 3) playerList.forEach(Player::increaseLevel);
            if (input == 4) {
                playerList.stream()
                        .filter(a -> a.getType().equalsIgnoreCase("hunter"))
                        .forEach(Player::increaseLevel);
            }
        }

    }


}
