package Polimorfizm.tic_tak_tao;

public class Player {
     String name;
     Main.Symbol[][] playField;
     Main.Symbol symbol;

    public Player(String name, Main.Symbol[][] playField, Main.Symbol symbol) {
        this.name = name;
        this.playField = playField;
        this.symbol = symbol;
    }

    public boolean makeShot() {
        return true;
    }
}
