package Lesson2_hw;

import java.util.Arrays;

/*
Написать метод, который будет эмулировать работу динамического массива
(Без исопользования коллекций), протестировать можно при выводе последовательности треугольного числа до n
Пример:
1
1 3
1 3 6
 */
public class Task2 {


    public static void main(String[] args) {

        int n = 1;
        int m = 4;
        int arr[] = new int[n];

        for (int i = 0; i < n + m; i++) {

            arr[i] = giveTriangularNumber(i + 1);
            System.out.println(Arrays.toString(arr));
            arr = incrSize(arr);

            }
        }


    public static int[] incrSize(int array[]) {
        int newLength = array.length+1;
        int[] copiedArray = Arrays.copyOf(array, newLength);
        return copiedArray;

    }

    public static int giveTriangularNumber(int a) {
        return (a * (a + 1)) / 2;
    }

}
