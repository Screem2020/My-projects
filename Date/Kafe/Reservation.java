package Date.Kafe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Reservation {
    private String date;
    private int number;


//    @Override
//    public int compareTo(Reservation o) {
//        if (this.getDate().compareTo(o.getDate()) == 0) {
//            if (number == o.number) {
//                return 1;
//            }
//        }
//        return -1;
//    }
}