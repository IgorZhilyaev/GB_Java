package Lesson1;
//Реализовать функцию возведения числа а в степень b. a, b ∈ Z.
// Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1
//        Пример 4: а = 0, b = 0, ответ: не определено
//        Пример 5
//        входные данные находятся в файле input.txt в виде
//        b 3
//        a 10
//        Результат нужно сохранить в файле output.txt
//        1000

public class Task01 {

    public static void main(String[] args) {

        System.out.println(powNum(3, 2));
        System.out.println(powNum(2, -2));
        System.out.println(powNum(3, 0));
        System.out.println(powNum(0, 0));
    }

    public static double powNum(double a, int b) {


        if (a == 0 && b == 0) {
            System.out.println("не определено");
        }
        if (b == 0) return 1;
        if (b == 1) return a;
//        if (b > 0) {
//            for (int i = 0; i < b; i++) {
//                res = res * a;
//            } return res;
//        } else {
//            for (int i = -1; i >= b; i--) {
//                res = res / a;
//            }
//        }
        if (b < 0) {
            b = -b;
            a = 1 / a;
        }
        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }

        return res;
    }
}
