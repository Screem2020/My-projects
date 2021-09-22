package Polimorfizm.tic_tak_tao;

public class PlayerComputer extends Player {

    public PlayerComputer(String name, Main.Symbol[][] playField, Main.Symbol symbol) {
        super(name, playField, symbol);
    }

    public boolean makeShot() {
        int col = (int) (Math.random() * playField.length);
        int line = (int) (Math.random() * playField.length);
        if (checkSlot(col, line)) {
            playField[col][line] = symbol;
            return true;
        } else return false;
    }

    @Override
    public boolean checkSlot(int col, int line) {
        return super.checkSlot(col, line);
    }

    @Override
    public String toString() {
        return "PlayerComputer" + " name=" + name;
    }
}
