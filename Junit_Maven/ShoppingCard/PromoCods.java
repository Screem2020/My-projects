package Junit_Maven.ShoppingCard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum PromoCods {
    PROMOLINGHT(5), PROMOSUPER(10), PROMOMEGA(20);

    final double sale;

    public static double getPromo(String nameSale) {
        PromoCods[] values = values();
        for (PromoCods value : values) {
            if (value.name().equalsIgnoreCase(nameSale)) {
                return value.sale;
            }
        }
        return -1;
    }
}
