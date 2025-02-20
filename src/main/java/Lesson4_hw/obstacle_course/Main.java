package Lesson4_hw.obstacle_course;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        People people1 = new People("Igor", "male", 9, 7, 8);
        People people2 = new People("Petr", "male", 8, 6, 8);

        List<People> peopleList = new ArrayList<>();

        peopleList.add(people1);
        peopleList.add(people2);

        for (Object o : peopleList) {
            System.out.println(o);

        }
    }
}
