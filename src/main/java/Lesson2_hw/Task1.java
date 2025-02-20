package Lesson2_hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * У вас есть отсортированный массив
 * (Можете сами сгенерировать и использовать любой удобный вам алгоритм сортировки (кроме пузырька)),
 * нужно используя минимальное колличество попыток найти загаданное число (Алгоритм бинарного поиска )
 */

class Task1 {

    public static void main(String[] args) {



        int counter, num, item, first, last;

        //Создаем объект Scanner для считывания чисел, введенных пользователем
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();

        // Создаем массив введенного пользователем размера
        Random r = new Random();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Введите элемент для бинарного поиска: ");
        item = input.nextInt();
        first = 0;
        last = num - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);
    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }

    }
}
