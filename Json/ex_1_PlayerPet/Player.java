package Json.ex_1_PlayerPet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Player {
    private String rassa;
    private int damage;
    private PlayerPet pet;
}
