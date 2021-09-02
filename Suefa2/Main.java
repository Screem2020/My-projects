package Suefa2;

import java.util.Scanner;

public class Main {
    /**
     * 2. Реализовать игру камень-ножницы-бумага.
     * При выборе п.1 программа генерирует один из трех исходов (камень, ножницы или бумагу) для первого игрока  и выводит его на консоль.
     * При выборе п.2 программа генерирует один из трех исходов для второго игрока, выводит его на консоль и сразу определяет победителя.
     * Генерировать исход события можно с помощью случайных чисел или путем ввода пользователем с консоли.
     * Усложнение игры:
     * - Добавить в игру возможность играть до трех очков (победителем является тот, кто первый наберет три очка).
     * В итоге консольное меню должно выглядеть так:
     * 1. Ход первого игрока
     * 2. Ход второго игрока
     * 3. Играть до трех очков
     * 4. Выход
     */
    public static void main(String[] args) {
        int input = 0;
        boolean allPoints = false;
        Suefa player1 = new Suefa();
        Suefa player2 = new Suefa();
        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println(
                    "1. Ход первого игрока\n" +
                            "2. Ход второго игрока\n" +
                            "3. Играть до трех очков\n" +
                            "4. Выход");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    player1.step();
                    break;
                }
                case 2: {
                    player2.step();
                    if ((player1.getNum() == 3 & player1.getNum() == 1) || (player1.getNum() == 2 & player2.getNum() == 3) ||
                            (player1.getNum() == 1 & player2.getNum() == 2)) {
                        System.out.println("Player 1 win" + player1.getNum());
                    } else if ((player2.getNum() == 3 & player1.getNum() == 1) || (player2.getNum() == 1 & player1.getNum() == 2) ||
                            (player2.getNum() == 2 & player1.getNum() == 3)) {
                        System.out.println("Player 2 win" + player2.getNum());
                    }
                    else {
                        System.out.println("nafing");
                        continue;
                    }
                    if (allPoints) {
                        if (player1.gameOver() || player2.gameOver()) {
                            System.out.println("Игра окончена");
                            return;
                        }
                    }else {
                            return;
                        }
                    break;
                }
                case 3: {
                    allPoints = true;
                    break;
                }
            }
        }
    }
}
