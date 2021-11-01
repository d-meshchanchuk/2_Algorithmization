package Arrays;

/*
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    Если таких чисел несколько, то определить наименьшее из них.
*/

public class Task09 {

    public static void main(String[] args) {
        int[] array = {1, 2,  2, 4, 5, 6, 7, 8, 2, 3, 3, 3, 3};
        int[] arrayOfRepeatsNum = new int[array.length];
        int minValue = array[0];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    arrayOfRepeatsNum[i]++;
                }
            }

            if (arrayOfRepeatsNum[i] > counter) {
                counter = arrayOfRepeatsNum[i];
                minValue = array[i];
            }

            if (arrayOfRepeatsNum[i] == counter && array[i] < minValue) {
                counter = arrayOfRepeatsNum[i];
                minValue = array[i];
            }
        }

        System.out.println("Наиболее часто встречающееся число " + minValue);

    }
}
