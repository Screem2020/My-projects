package Polimorfizm.tic_tak_tao;

public class Main {
    /**
     * //Создать каркас игры крестии-нолики с тремя режимами:
     *         //
     *         //Человек vs Человек
     *         //Человек vs Компьютер
     *         //Компьютер vs Компьютер
     *         //В игре должны быт реализованы проверки:
     *         //- проверка на занятую ячейку
     *         //- проверка на вводт правильных координат (которые не выходят за пределы игрового поля)
     *         //- проверка на победителя и ничью
     */
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }

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
