package Thread.ex_5_JsonParser;

import Json.ex_1_PlayerPet.Player;
import Json.ex_1_PlayerPet.PlayerPet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    // Создать свой json парсер, который принимает объект любого типа и конвертирует его в json строку
    public static void main(String[] args) throws JsonProcessingException {
        Main.jsonParser(new Player("arr", 100, new PlayerPet("ar", 120)));
    }

    public static <T> void jsonParser(T t) throws JsonProcessingException {
        ObjectMapper obm = new ObjectMapper();
        String s = obm.writerWithDefaultPrettyPrinter().writeValueAsString(t);
        System.out.println(s);
    }
}
