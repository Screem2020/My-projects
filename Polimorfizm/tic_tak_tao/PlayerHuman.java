package Polimorfizm.tic_tak_tao;

import java.util.Scanner;

public class PlayerHuman extends Player {
    Scanner scn = new Scanner(System.in);

    public PlayerHuman(String name, Main.Symbol[][] playField, Main.Symbol symbol) {
        super(name, playField, symbol);
    }

    public boolean makeShot() {
        System.out.println("enter col vertical");
        int col = scn.nextInt();
        System.out.println("enter line horizontal");
        int line = scn.nextInt();
        if ((col < playField.length & line < playField.length) && (checkSlot(col, line))) {
            playField[col][line] = symbol;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkSlot(int col, int line) {
        return super.checkSlot(col, line);
    }

    @Override
    public String toString() {
        return "PlayerHuman" + " name=" + name;

    }
}