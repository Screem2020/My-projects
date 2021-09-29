package Polimorfizm.tic_tak_tao;

public class PlayerComputer extends Player {

    public PlayerComputer(String name, Main.Symbol[][] playField, Main.Symbol symbol) {
        super(name, playField, symbol);
    }

    public PlayerComputer(int col, int line) {
        super(col, line);
    }

    public boolean makeShot() {
        this.col = (int) (Math.random() * playField.length);
        this.line = (int) (Math.random() * playField.length);

        //int col = (int) (Math.random() * playField.length);
        //int line = (int) (Math.random() * playField.length);
        if (checkSlot()) {
            playField[col][line] = symbol;
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "PlayerComputer" + " name=" + name;
    }
}
