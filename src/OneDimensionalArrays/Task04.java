package OneDimensionalArrays;

import java.util.Arrays;

/*
    Даны действительные числа а1, а2, ..., аn.
    Поменять местами наибольший и наименьший элементы.
*/

public class Task04 {

    public static void main(String[] args) {

        double[] array = {0.99, 0.2, 0.3, 0.4, -0.01, 0.6, 0.7, 0.8, 0.9, 0.23};
        double max = array[0];
        int maxIndex = 0;
        double min = array[0];
        int minIndex = 0;

        System.out.println("Начальный массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        array[maxIndex] = min;
        array[minIndex] = max;

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        System.out.println("Конечный массив: " + Arrays.toString(array));

    }
}
