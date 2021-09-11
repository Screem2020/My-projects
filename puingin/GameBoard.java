package puingin;

public class GameBoard {
    private int witch;
    private int height;

    public GameBoard(int height, int witch) {
        this.height = height;
        this.witch = witch;
    }

    public int getWitch() {
        return witch;
    }

    public int getHeight() {
        return height;
    }



   /* public void Board() {
        int[] heig = new int[this.height];
        int[] witc = new int[this.witch];

        for (int i = 0; i < heig.length; i++) {
            heig[i] = ((int) (Math.random() * 9)) - 1;
            System.out.print(heig[i] + " ");
        }
        for (int i = 0; i < witc.length; i++) {
            witc[i] = ((int) (Math.random() * 9)) - 1;
            System.out.println(witc[i]);
        }
    }*/

    public void Board() {

        char[] chars = new char[this.height];
        int[][] boardList = new int[this.height][this.witch];
        for (int i = 0; i < boardList.length; i++) {
            for (int j = 0; j < boardList[i].length; j++) {
                boardList[i][j] = ((int) (Math.random() * 9)) - 1;
//                if (boardList[i][j] == -1) {
//                    char a = '~';
//                    System.out.println(a = (char)boardList[i][j]);
//                    System.out.println(a);
                if (boardList[i][j] == -1) {
//                   System.out.print("~");
                    chars[i] = (char) boardList[i][j];
                    chars[i] = ' ';
                    //Arrays.fill(chars,  ' ');
                }

                if (boardList[i][j] == 0) {
                    System.out.print(chars[i] + " | ");
                } else
                /*Arrays.fill(chars, '~');
                System.out.print(chars[i]);*/
                System.out.print(boardList[i][j] + " | " );
            }
            System.out.println();
        }
    }

    public void boardFull(int value) {
        if (value == -1) {
            System.out.println("WATER");
        } else if (value == 0) {
            System.out.println(" ");
        } else {
            System.out.println("block of ice height " + value);
        }
    }
}
