package Thread.ex_2_Rome_numerals;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum Numerlas {
    I(1), V(5), X(10),
    L(50), C(100), D(500), M(1000);

    private int nameNumerlas;

    public static int romeNumerlasParse(String number) {
        Numerlas[] values = values();
        for (int i = 0; i < values().length; i++) {
            if (values[i].name().equalsIgnoreCase(number)) {
                return values[i].nameNumerlas;
            }
        }
        return -1;
    }

}
