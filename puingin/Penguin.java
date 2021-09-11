package puingin;

public class Penguin {
    private int direction;

    public void stepOnBoard(int direction) {
        if (direction == 0) {
            System.out.println("Step right");
        }
        else if (direction == 1) {
            System.out.println("step down");
        }

        else if (direction == 2) {
            System.out.println("step left");
        }
        else if (direction == 3) {
            System.out.println("step up");
        }else{
            throw new RuntimeException("Invalid penguin direction value = "+ direction +". Direction value must be from 0 to 3");
        }
    }
}
