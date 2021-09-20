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
        System.out.println("enter line vertical");
        int line = scn.nextInt();
        if (col < playField.length & line < playField.length) {
            playField[col][line] = symbol;
            return true;
        } else return false;
    }
}