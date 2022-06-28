package Json.ex_1_PlayerPet;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    //Есть персонаж из какой-нибудь игры, представленный классом Player.
    //У него есть расса, урон, а тажке петомец, представленный классом PlayerPet.
    //Создайте вручную файл и вставьте в него следующую json строчку:
    //
    //
    //Вам нужно считать json из файла и сконвертировать его в объект класса Player.
    //Создайте необходимые классы.
    @SneakyThrows
    public static void main(String[] args) {
        String way = "C:\\Users\\OMEN\\IdeaProjects\\Repeet\\src\\main\\java\\Json\\text";
        String s = Files.readString(Path.of(way));
        ObjectMapper mapper = new ObjectMapper();
        Player player = mapper.readValue(s, Player.class);
        System.out.println(player);
    }
}
