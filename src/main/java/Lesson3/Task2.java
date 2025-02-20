package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Написать программу перебора n комбинаций из цифр от 0 - 9 (n длина массива)
 * те 0 0 0
 *    0 0 1
 *    0 0 2
 *    - - -
 *    9 9 9
 *    n - длина одной строки
 */

public class Task2 {

    public static List<List<Integer>> generateList = new ArrayList<>();

    public static void main(String[] args) {

        int n = readNumber();

        generate(new int[n], 0, 10);


    }

    public static void generate(int[] comb, int index, int n){

        if (comb.length == index){
            System.out.println(Arrays.toString(comb));
            return;
        }

        for (int i = 0; i < n; i++) {

            comb[index] = i;
            generate(comb, index+1, n);
            
        }


    }

    public static int readNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        sc.close();
        return number;
    }
}
