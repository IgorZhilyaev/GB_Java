package Lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Дан список из 10 - 20 слов с повторами,
 * вывести этот же спиок без повторов и указать сколько раз оно встречалось до изменения.
 */

public class Task1 {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("каша", "маша", "шиша", "гриша", "маша", "каша", "маша", "шиша");
        for (Map.Entry<String, Integer> buf : transformer(collection).entrySet()){
            System.out.println(buf.getKey() + " " + buf.getValue());
        }

    }

    public static int count(List<String> start, String element){

        int counter = 0;
        for (String str : start) {
            if (element.equals(str)){
                counter++;
            }
            
        }
        return counter;
    }

    public static Map<String, Integer> transformer (List<String> start){
        Map<String, Integer> col = new HashMap<>();

        for (String string : start) {
            col.put(string, count(start, string));
        }
        return col;
    }
}
