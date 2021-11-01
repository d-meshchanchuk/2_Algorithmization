package Arrays;

import java.util.Arrays;

/*
    Дан целочисленный массив с количеством элементов n.
    Сжать массив, выбросив из него каждый второй элемент
    (освободившиеся элементы заполнить нулями).
    Примичание. Дополнительный массив при этом не использовать.
*/

public class Task10 {

    public static void main(String[] args) {
        int[] array = {1,2};
        int count = 1;

        System.out.println("Исходный массив " + Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {


            if (i % 2 == 0) {
                array[count] = array[i];
                array[i] = 0;
                count++;
            } else {
                array[i] = 0;

            }
        }

        System.out.println("Конечный массив " + Arrays.toString(array));
    }

}
