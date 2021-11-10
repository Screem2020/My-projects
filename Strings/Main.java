package Strings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>(List.of("one", "two", "three"));
        for(String val : list){
            if(val.equals("two")){

                list.remove(val);
            }
        }

        System.out.println(list);
    }
}
