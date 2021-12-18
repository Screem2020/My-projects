package Comparable.ex_2_Estate;

public class RealEstate implements Comparable<RealEstate> {
    private int price;
    private int sqrt;
    private int sumRoom;

    public RealEstate(int price, int sqrt, int sumRoom) {
        this.price = price;
        this.sqrt = sqrt;
        this.sumRoom = sumRoom;
    }

    @Override
    public int compareTo(RealEstate o) {
        int dif = price - o.price;
        if (dif == 0) {
            int sum = o.sqrt - sqrt;
            if (sum == 0) {
                return o.sumRoom - sumRoom;
            }
            else return sum;
        }
        return dif;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "price=" + price +
                ", sqrt=" + sqrt +
                ", sumRoom=" + sumRoom +
                '}';
    }
}
