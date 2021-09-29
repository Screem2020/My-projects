package Polimorfizm.tic_tak_tao;

public class Player {
    String name;
    Main.Symbol[][] playField;
    Main.Symbol symbol;
    int col;
    int line;

    public Player(String name, Main.Symbol[][] playField, Main.Symbol symbol) {
        this.name = name;
        this.playField = playField;
        this.symbol = symbol;
    }

    public Player(int col, int line) {
        this.col = col;
        this.line = line;
    }

    public boolean makeShot() {
        return true;
    }

    public boolean checkSlot() {
        //if (this.playField[this.col][this.line].equals(symbol)) {
        if (this.playField[this.col][this.line] != Main.Symbol.EMPTY) {
            return false;
        }
        return true;
    }
}
