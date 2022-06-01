package Junit_Maven.ShoppingCard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class Tovar {
    private String name;
    private int price;
}
