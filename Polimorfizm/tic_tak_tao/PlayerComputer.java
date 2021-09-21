package Polimorfizm.tic_tak_tao;

import java.util.Arrays;

public class PlayerComputer  extends Player{

    public PlayerComputer(String name, Main.Symbol[][] playField, Main.Symbol symbol) {
        super(name, playField, symbol);
    }

    public boolean makeShot() {
        int col = (int) (Math.random() * playField.length);
        int line = (int) (Math.random() * playField.length);
        if (playField[col][line] != symbol) {
            playField[col][line] = symbol;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlayerComputer" + "name=" + name  + " symbol=" + symbol;
    }
}
