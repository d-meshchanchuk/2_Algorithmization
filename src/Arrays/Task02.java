package Arrays;

import java.util.Arrays;

/*
    Дана последовательность действительных чисел а1, а2, ..., аn.
    Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
*/

public class Task02 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int z = 4;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }

        System.out.println("Конечный массив: " + Arrays.toString(array));
        System.out.println("Количество замен: " + count);
    }
}
