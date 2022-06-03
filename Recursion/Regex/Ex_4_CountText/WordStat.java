package Recursion.Regex.Ex_4_CountText;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordStat {
    public HashMap<String, Integer> counterText(String text) {
        String line = text.toLowerCase();
        HashMap<String, Integer> map = new HashMap<>();
        int tmp = 0;
        String gr = "";
        for (String s : line.split("[ |,|, ]")) {
            Pattern pattern = Pattern.compile("[A-ZА-Яа-яa-z]+(-|'?)[A-ZА-Яа-яa-z]+");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                String symbol = matcher.group();
                //option 1
//                if(!map.containsKey(symbol)){
//                    map.put(symbol, 1);
//                }else{
//                    map.put(symbol, map.get(symbol)+1);
//                }

                //option 2
                //если ключ symbol нет в мапе, то будет вставлен ключ и значение 1 под ним
                //если ключ symbol есть в мапе, то берется значение под ключом и увеличивется на 1: (k,v)->v+1)

                map.merge(symbol, 1, (k,v)->v+1);

                //работает только, если ключ отсутствует
//                map.computeIfAbsent(symbol, v->1); //если ключ symbol Отсутствует, то вставляем символ и значение единицы под ним. если ключ уже есть, то ничего не делаем
                //работает только, если ключ присутствует
//                map.computeIfPresent(symbol, (k,v)->v+1); //если ключ symbol есть, то заменяем старое значение под ключом на value+1 (берем старое значение и увеличиваем его на 1)
            }
        }
        return map;
    }
}

