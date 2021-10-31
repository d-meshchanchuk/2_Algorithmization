package OneDimensionalArrays;

import java.util.Arrays;

/*
    Дана последовательность целый чисел a1, a2, ..., an. Образовать новую последовательность,
    выбросив из исходной те члены, которые равны min(a1, a2, ..., an).
*/

public class Task08 {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int min = array[0];
        int[] newArray;
        int newArrayIndex = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int element : array) {
            if (element == min) {
                count++;
            }
        }

        newArray = new int[array.length - count];
        for (int element : array) {
            if (element != min) {
                newArray[newArrayIndex] = element;
                newArrayIndex++;
            }
        }
        System.out.println("Исходная последовательность: " + Arrays.toString(array));
        System.out.println("Новая последовательность: " + Arrays.toString(newArray));

    }
}
