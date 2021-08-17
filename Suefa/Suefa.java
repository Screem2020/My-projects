package Suefa;

public class Suefa {
    private int num = 0;

    public Suefa(int num) {
        this.num = num;
    }

    public void step() {
        this.num = (int) (Math.random() * 3) + 1;
        if (this.num == 3) {
            System.out.println("Бумага");
        }
        else if (this.num == 2) {
            System.out.println("Ножницы");
        }
        else if (this.num == 1) System.out.println("Камень");
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Suefa{" +
                "num=" + num +
                '}';
    }
}
