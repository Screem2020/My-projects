package Json.ex_3_ReadCard;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Card {
    @NonNull
    private String cardNum;
    private String cardStatus;
    @NonNull
    private String validTill;
    @NonNull
    private String product;

}
