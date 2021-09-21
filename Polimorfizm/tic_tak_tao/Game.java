package Polimorfizm.tic_tak_tao;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private final Main.Symbol[][] playField = new Main.Symbol[3][3];
    private Player player1;
    private Player player2;

    public Game() {
        for (int i = 0; i < playField.length; i++) {
            for (int j = 0; j < playField.length; j++) {
                playField[i][j] = Main.Symbol.EMPTY;
            }
        }
    }

    public void startGame() {
        Scanner scn = new Scanner(System.in);
        System.out.println("""
                1. Игра Человек против Компьютера
                2. Игра Человек против Человек
                3. Игра Компьютер против Компьютер""");
        int input = scn.nextInt();
        if (input == 1) {
            player1 = new PlayerHuman("player 1", playField, Main.Symbol.X);
            player2 = new PlayerComputer("player 2", playField, Main.Symbol.O);
        } else if (input == 2) {
            player1 = new PlayerHuman("player 1", playField, Main.Symbol.X);
            player2 = new PlayerHuman("player 2", playField, Main.Symbol.O);
        } else if (input == 3) {
            player1 = new PlayerComputer("player 1", playField, Main.Symbol.X);
            player2 = new PlayerComputer("player 2", playField, Main.Symbol.O);
        }
        Player cur = player1;
        Player opp = player2;
        while (!ByCheckWinner(playField, opp.symbol)) {
            print();
            System.out.println("Ходит " + cur.name);
            if (cur.makeShot()) {
                Player tmp = cur;
                cur = opp;
                opp = tmp;
            } else if (!cur.makeShot()) {
                System.out.println("Не верно введены координаты");
            } else {
                System.out.println("Ничья");
            }
            if (ByCheckWinner(playField, opp.symbol)) {
                print();
                System.out.println(opp + " Игрок победил");
            }
        }
    }

    /*public boolean isNicha() {
        if () {
            return true;
        }
        return false;
    }*/


//            while (!cur.makeShot()) {
//                System.out.println("Не верно введины координаты");
//                cur.makeShot();
//            }

    public boolean ByCheckWinner(Main.Symbol[][] playField, Main.Symbol symbol) {
        for (int i = 0; i < playField.length; i++) {
            if (playField[i][0] == symbol & playField[i][1] == symbol & playField[i][2] == symbol) {
                return true;
            }
        }
        for (int j = 0; j < playField.length; j++) {
            if (playField[0][j] == symbol & playField[1][j] == symbol & playField[2][j] == symbol) {
                return true;
            }
        }

        for (int i = 0; i < playField.length; i++) {
            for (int j = playField.length - 1; 0 >= j; --j) {
                if ((playField[i][0] == symbol & playField[i][1] == symbol & playField[i][2] == symbol) &&
                        (playField[0][j] == symbol & playField[1][j] == symbol & playField[0][j] == symbol)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < playField.length; i++) {
            for (int j = 0; j < playField.length; j++) {
                System.out.print(playField[i][j].toString());
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "playField=" + Arrays.toString(playField) +
                ", player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }
}





