package Matrices;

import java.util.Arrays;

/*
    Отсортировать строки матрицы по возрастанию и убыванию значений элементов
*/

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = {
                {11, 2, 0, 4, 5},
                {6, 71, 8, 9, 10,},
                {11, 12, -13, 14, 15},
        };

        System.out.println("Сортировка по возрастанию:");

        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();
        System.out.println("Сортировка по убыванию:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= -1;
            }

            Arrays.sort(matrix[i]);

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= -1;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
