package Regex.Ex_4_CountText;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordStat {
    public List<String> counterText(String text) {
        String line = text.toLowerCase();
        List<String> list = new ArrayList<>();
        int tmp = 0;
        String gr = "";
        for (String s : line.split("[ |,|, ]")) {
            Pattern pattern = Pattern.compile("[A-ZА-Яа-яa-z]+(-|'?)[A-ZА-Яа-яa-z]+");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
//                list.add(matcher.group());
//
//                list = list.stream().filter(a -> a.contains(matcher.group())).collect(Collectors.toList());
//                System.out.println(list);
                if ((s.contains(matcher.group()))) {
                    tmp = 2;                        //TODO: проблема с подсчетом букв в строке

                    //tmp = matcher.groupCount();
                } else list.add(matcher.group() + " " + 1);
                //list.add(matcher.group() + " "  + tmp);
            }
        }
        return list;
    }
}
