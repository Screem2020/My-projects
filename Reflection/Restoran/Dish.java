package Reflection.Restoran;

public class Dish {
    private String nameDish;
    private int priceDish;

    public Dish(String nameDish, int priceDish) {
        this.nameDish = nameDish;
        this.priceDish = priceDish;
    }

    public Dish(String nameDish) {
        this.nameDish = nameDish;
    }

    public String getNameDish() {
        return nameDish;
    }

    public void setNameDish(String nameDish) {
        this.nameDish = nameDish;
    }

    public int getPriceDish() {
        return priceDish;
    }

    public void setPriceDish(int priceDish) {
        this.priceDish = priceDish;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "nameDish='" + nameDish + '\'' +
                ", priceDish=" + priceDish +
                '}';
    }


}
