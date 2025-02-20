package Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
        list.add(12);
        // list.add("string line");
        for (Object o : list) {
            System.out.println(o);
        }

        List<String> listStr = new ArrayList<>();
        String [] strArray = new String[] {"Иванов","Иван","Иванович"};
        listStr = Arrays.asList(strArray);
//        listStr.add("fgfg");
//        listStr.add("jknkjkj");
        System.out.println(listStr);


//        People people1 = new People("Sanya", "88005553535");
//        People people2 = new People("Sanya", "88005553535");


        }
    }
