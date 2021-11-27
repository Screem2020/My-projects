package testSearch;

public class Francisck {

    private int hram;
    private int bers; // 25, 35
    private int derch;
    // tmp 15, 25, 35
    private int index;

    public void serchYers(int bers, int hram, int derch, int index) {
        while (hram < derch) {
            hram += 10;
            if ((hram <= derch) && (hram > bers)) {
                index++;
            }
        }
        System.out.println(index);
    }

    public String toString() {
        return "index=" + index;
    }
}

