package Polimorfizm.tic_tak_tao;

public class Main {
    /**
     * //Создать каркас игры крестии-нолики с тремя режимами:
     *         //
     *         //Человек vs Человек
     *         //Человек vs Компьютер
     *         //Компьютер vs Компьютер
     *         //В игре должны быт реализованы проверки:
     *         //+/- проверка на занятую ячейку
     *         //+ проверка на вводт правильных координат (которые не выходят за пределы игрового поля)
     *         //+ проверка на победителя и ничью
     */
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }

    /*public static boolean ByCheckWinner(Main.Symbol symbol, Main.Symbol[][] playField, int indexX, int indexY) {
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
    }*/


    public enum Symbol {
        O("|0|"), X("|X|"), EMPTY("|_|");

        private String name;

        Symbol(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
