package Suefa;

import java.util.Scanner;

public class Main {
    /**
     * 2. Реализовать игру камень-ножницы-бумага.
     * Создать консольное меню:
     * 1. Ход первого игрока
     * 2. Ход второго игрока
     * 3. Выход
     * При выборе п.1 программа генерирует один из трех исходов (камень, ножницы или бумагу) для первого игрока  и выводит его на консоль.
     * При выборе п.2 программа генерирует один из трех исходов для второго игрока, выводит его на консоль и сразу определяет победителя.
     * Генерировать исход события можно с помощью случайных чисел или путем ввода пользователем с консоли.
     */
    public static void main(String[] args) {
        int input = 0;
        int player1 = 0;
        int player2 = 0;
        int player1Index = 0;
        int player2Index = 0;

//        if (this.num == 3) {
//            System.out.println("Бумага");
//        }
//        else if (this.num == 2) {
//            System.out.println("Ножницы");
//        }
//        else System.out.println("Камень");
//    }

        Scanner scn = new Scanner(System.in);
        while (input != 3) {
            System.out.println(
                    "1. Ход первого игрока\n" +
                            "2. Ход второго игрока\n" +
                            "3. Выход");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    Suefa suefa1 = new Suefa(player1);
                    suefa1.step();
                    player1Index = suefa1.getNum();
                    break;
                }
                case 2: {
                    Suefa suefa2 = new Suefa(player2);
                    suefa2.step();
                    player2Index = suefa2.getNum();

                    if ((player1Index == 3 & player2Index == 1) || (player1Index == 2 & player2Index == 3) ||
                            (player1Index == 1 & player2Index == 2)) {
                        System.out.println("Player 1 win");
                    } else if ((player2Index == 3 & player1Index == 1) || (player2Index == 1 & player1Index == 2) ||
                            (player2Index == 2 & player1Index == 3)) {
                        System.out.println("Player 2 win");
                    } else System.out.println("nafing");
                    break;
                }
            }
        }
    }
}
