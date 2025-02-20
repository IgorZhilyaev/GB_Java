package Lesson4_hw.MFC;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Tasks> tasks = new ArrayList<>();

        Tasks passport = new Passport();

        Tasks inn = new INN();

        tasks.add(passport);
        tasks.add(inn);


        System.out.println(passport.number());
        System.out.println(inn.number());
        System.out.println(passport);
        System.out.println(inn);
        //System.out.println(tasks);
    }
}
