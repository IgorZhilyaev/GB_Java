package Lesson4_hw.obstacle_course;

import java.util.ArrayList;
import java.util.List;

public class People {

    private String name; // имя
    private String gender; // пол
    private int strength; // сила
    private int agility; // ловкость
    private int stamina; // выносливость


    public People(String name, String gender, int strength, int agility, int stamina) {
        this.name = name;
        this.gender = gender;
        this.strength = strength;
        this.agility = agility;
        this.stamina = stamina;
    }

    @Override
    public String toString(){

        return "Имя" + name + "пол" + gender + "сила" + strength + "ловкость" + agility + "выносливость" + stamina;
    }
}
