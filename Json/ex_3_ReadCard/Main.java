package Json.ex_3_ReadCard;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    // Файлы, содержащие json строчку, бывает, имеют расширение file.json.
    // В Reпримере ниже оно будет использовано, но это все тот же текстовый файл.
    //[
    //  {
    //    "cardNum": "1234567890123456",
    //    "cardStatus": "+",
    //    "validTill": "11/20",
    //    "product": "VISA"
    //  },
    //  {
    //    "cardNum": "2234567890128567",
    //    "cardStatus": "H",
    //    "validTill": "12/20",
    //    "product": "VISA GOLD"
    //  },
    //  {
    //    "cardNum": "3234567890121687",
    //    "cardStatus": "X",
    //    "validTill": "12/21",
    //    "product": "MC STANDARD"
    //  },
    //  {
    //    "cardNum": "4234567890123456",
    //    "cardStatus": "X",
    //    "validTill": "12/21",
    //    "product": "MAESTRO"
    //  }
    //]
    //
    //Есть файл jsonFile.json (содержимое файла приведено выше), содержащий список дебетовых карт.
    //Вам нужно считать эту строчку, сконвертировать в нужный объект, выполнить фильтрацию,
    // описанную ниже и сформировать ответную json строчку.
    //Ответная json строка должна содержать следующую ифнормацию:
    //[
    //    {
    //        "prouct" : "VISA"
    //        "maskedNum" : "1234 ****** 3456"
    //        "validDate" : 2020-11-30T21:00:00.0007
    //    },
    //    {
    //        "prouct" : "MAESTRO"
    //        "maskedNum" : "4234 ****** 3456"
    //        "validDate" : 2021-12-31T21:00:00.0007
    //    }
    //]
    //
    //При формировании ответа нужно учесть, что
    //номера карты должны начинаться либо на 1234, либо на 4234
    //статус должен быть + или Х
    //maskedNum должен содержать первые 4 и последние 4 цифры карты, отделенные шестью звездочками
    //validDate должен содеражать дату, соответствующую последнему дню заданного месяца
    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String way = "C:\\Users\\OMEN\\IdeaProjects\\Repeet\\src\\main\\java\\Json\\ex_3_ReadCard\\jsonFile.json";
        String string = Files.readString(Path.of(way));
        List<Card> cards = mapper.readValue(string, new TypeReference<List<Card>>() {});
//        List<String> strings = cards.stream()
//                .map(a -> a.getCardNum().substring(0, 4) + "*".repeat(8) + a.getCardNum().substring(12)).toList();
//        System.out.println(strings);

//        String start = str.substring(0,4);
//        String end = str.substring(str.length()-4);
//        str = start+"*".repeat(str.length()-8)+end;

        List<Card> filterCards = cards.stream()
                .filter(a -> a.getCardNum().startsWith("1234") || a.getCardNum().startsWith("4234"))
                .filter(a -> a.getCardStatus().contains("+") || a.getCardStatus().contains("X"))
                .map(a -> a).toList();

        filterCards.stream()
                .map(a -> a.getCardNum().substring(0, 4) + " " + "*".repeat(8) + " " + a.getCardNum().substring(12));
        for (int i = 0; i < filterCards.size(); i++) {
            String product = filterCards.get(i).getProduct();
            List<String> stringsCardNum = filterCards.stream().map(a -> a.getCardNum().substring(0, 4) + " " + "*".repeat(8) + " " + a.getCardNum().substring(12)).toList();
            List<String> stringsDateMother = filterCards.stream()
                    .map(a -> a.getValidTill().substring(0, 2)).toList();
            System.out.println(stringsDateMother);
            List<String> stringsDateYear = filterCards.stream()
                    .map(a -> a.getValidTill().substring(3)).toList();
            System.out.println(stringsDateYear);
//            TemporalAdjuster temporalAdjuster = TemporalAdjusters.lastDayOfMonth();
//            LocalDateTime lastDayOfMonth = localDateTime.with(temporalAdjuster);
            //LocalDateTime parse = LocalDateTime.parse(Integer.parseInt(stringsDateYear.get(i)), Integer.parseInt(stringsDateMother.get(i)), 31);
//            LocalDate of = LocalDate.of(Integer.parseInt(stringsDateYear.iterator().next()), Integer.parseInt(stringsDateMother.iterator().next()), 31);
//            System.out.println(of);
//            AnswerCard answerCard = new AnswerCard(product, stringsCardNum.get(i), );
        }




        //.map(a -> a.getCardNum().substring(0, 4) + " " + "*".repeat(8) + " " + a.getCardNum().substring(12));
                //.map(a -> a.getValidTill().substring(0, 2) + " " + a.getValidTill().substring(3)).toList();
                //создать обьект и скeонвертировать в ответную строку
    }
}