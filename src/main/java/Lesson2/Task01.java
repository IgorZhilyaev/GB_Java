package Lesson2;

/**
 * В заданном интервале найти наибольшее число, которое делится на сумму чисел этого числа.
 */
public class Task01 {

    public static void main(String[] args) {

        num(1,5);

    }

    public static int num(int min, int max){

        int result = 0;

        for (int i = min; i < max; i++){

            int bufNum = i;
            int count = 0;

            while (bufNum > 0){

                count += bufNum %10;
                bufNum /=10;
            }
            if (i % count == 0){
                System.out.println(i);
                result = i;
            }
        }
        return result;
    }
}
