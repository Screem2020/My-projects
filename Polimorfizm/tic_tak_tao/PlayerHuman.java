package Polimorfizm.tic_tak_tao;

import java.util.Scanner;

public class PlayerHuman extends Player {
    private Scanner scn = new Scanner(System.in);

    public PlayerHuman(String name, Main.Symbol[][] playField, Main.Symbol symbol) {
        super(name, playField, symbol);
    }
    public PlayerHuman(int col, int line) {
        super(col, line);
    }

    public boolean makeShot() {
        System.out.println("enter col vertical");
        this.col = scn.nextInt();
        System.out.println("enter line horizontal");
        this.line = scn.nextInt();
        if ((col < playField.length & line < playField.length) && (checkSlot())) {
            playField[col][line] = symbol;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "PlayerHuman" + " name=" + name;

    }
}