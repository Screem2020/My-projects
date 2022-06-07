package Streams.ex_2_Player;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Player {
    private int level;
    private int damage;
    private String type;

    public int damage() {
        return damage * level;
    }

    public void increaseLevel() {
        level++;
    }
}
