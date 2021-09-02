package Suefa2;


public class Suefa {
    private int num;
    private int allPoints;

    public Suefa() {
    }

    public int getNum() {
        return num;
    }

    public void step() {
        this.num = (int) (Math.random() * 3) + 1;

        if (this.num == 2) {
            System.out.println("Ножницы");
        }
        else if (this.num == 1) {
            System.out.println("Камень");
        }
        else if (this.num == 3) {
            System.out.println("Бумага");
        }
    }

    public boolean gameOver() {
        return this.allPoints != 3;
    }

    @Override
    public boolean equals(Object o) {
        Suefa suefa = (Suefa) o;
        return allPoints == suefa.allPoints && this.num == suefa.num;
    }

    @Override
    public String toString() {
        return "Suefa{" + "num=" + num + ", allPoints=" + allPoints + '}';
    }
}
