package Lesson2_hw;

import java.util.ArrayList;
import java.util.List;

/*
Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class Task3 {

    static char[] chars;

    static List<Integer> position = new ArrayList<>();

    public static void main(String[] args) {
        String str = "2? + 3? = 5?";

        str =str.replace(" ","");
        chars = str.toCharArray();


        for(
                int i = 0;
                i<chars.length;i++)

        {
            if (chars[i] == '?') {
                position.add(i);
            }
        }
    }



    // замена вопросов на комбинации
    public static void check(int[] comb) {
        for (int i = 0; i < comb.length; i++) {
            chars[position.get(i)] = Character.forDigit(comb[i], 10);
        }


    }
}
