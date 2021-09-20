package Polimorfizm.tic_tak_tao;

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
        while (!isWinner(opp, cur)) {
            print();
            System.out.println("Ходит " + cur.name);
            if (cur.makeShot()) {
                Player tmp = cur;
                cur = opp;
                opp = tmp;
            } else if (!cur.makeShot()) {
                System.out.println("Не верно введины координаты");
                cur.makeShot();
            } else if (isNicha()) {
                System.out.println("Ничья");
            }
        }
    }

    public boolean isNicha() {
        if (!(isWinner(player1, player2))) {
            return true;
        }
        return false;
    }

    public boolean isWinner(Player player1, Player player2) {
        if (ByCheckWinner(player1.symbol, playField, 0, 0)) {
            return true;
        } else if (ByCheckWinner(player2.symbol, playField, 0, 0)) {
            return true;
        }
        return false;
    }

    public static boolean ByCheckWinner(Main.Symbol symbol, Main.Symbol[][] playField, int indexX, int indexY) {
        int lastSlot = 0;
        if (indexX < playField.length & indexY < playField.length) {
            if (symbol == playField[indexX][indexY]) {
                ByCheckWinner(symbol, playField, indexX, indexY + 1);
            }
            if (symbol == playField[indexX][indexY]) {
                if (indexX == playField.length - 1) {
                    lastSlot = indexX;
                }
                ByCheckWinner(symbol, playField, indexX + 1, indexY);
            }
            if (symbol == playField[indexX][indexY]) {
                ByCheckWinner(symbol, playField, indexX + 1, indexY + 1);
            }
            if (symbol == playField[lastSlot][indexY]) {
                ByCheckWinner(symbol, playField, lastSlot - 1, indexY + 1);
            }
            return true;
        }
        return false;
    }

//            while (!cur.makeShot()) {
//                System.out.println("Не верно введины координаты");
//                cur.makeShot();
//            }

    public void print() {
        for (int i = 0; i < playField.length; i++) {
            for (int j = 0; j < playField.length; j++) {
                System.out.print(playField[i][j].toString());
            }
            System.out.println();
        }
    }
}





