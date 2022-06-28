package Json.ex_2_PlayerJson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String way = "C:\\Users\\OMEN\\IdeaProjects\\Repeet\\src\\main\\java\\Json\\ex_2_\\PlayerJson.txt";
        String stringPlayerJson = Files.readString(Path.of(way));
        List<Player> playerList = mapper.readValue(stringPlayerJson, new TypeReference<>() {});
        System.out.println(playerList);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Player {
    private String rassa;
    private int damage;
}


