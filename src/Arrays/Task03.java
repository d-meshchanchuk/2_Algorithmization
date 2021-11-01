package Arrays;

import java.util.Arrays;

/*
    Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
*/

public class Task03 {

    public static void main(String[] args) {
        int n = 20;
        double[] array = new double[n];

        int countPlus = 0;
        int countMinus = 0;
        int countNull = 0;

        //Рандомное заполнение значениями от -50 до +50
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) Math.random() * 101 - 50;
        }

        for (double element : array) {
            if (element > 0) {
                countPlus++;
            } else if (element < 0) {
                countMinus++;
            } else {
                countNull++;
            }
        }

        System.out.println("В массиве: " + Arrays.toString(array));
        System.out.println("Положительных элементов: " + countPlus);
        System.out.println("Отрицательных элементов: " + countMinus);
        System.out.println("Нулевых элементов: " + countNull);

    }
}
