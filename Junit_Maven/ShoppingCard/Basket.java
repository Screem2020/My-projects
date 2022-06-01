package Junit_Maven.ShoppingCard;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Basket {
    private List<Tovar> shoppingCard = new ArrayList<>();

    public void addTovar(Tovar tovar) {
        shoppingCard.add(tovar);
    }

    public boolean deleteTovar(Tovar tovar) {
        return shoppingCard.remove(tovar);
    }

    public int sumTovar() {
        int sum = 0;
        for (Tovar tovar : shoppingCard) {
            sum += tovar.getPrice();
        }
        return sum;
    }

    public double promcod(String prom) {
        double promo = PromoCods.getPromo(prom);
        int price = sumTovar();
        return (double) price * (promo / 100.0);
    }

    public int purchase() {
        int sum = sumTovar();
        shoppingCard.clear();
        return sum;
    }
}
