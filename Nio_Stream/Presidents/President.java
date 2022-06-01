package Nio_Stream.Presidents;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class President {

    private String name;
    private String start;
    private String end;
    private String politic;

    @Override
    public String toString() {
        return name  + "," + start + "," + end + "," + politic;
    }
}
