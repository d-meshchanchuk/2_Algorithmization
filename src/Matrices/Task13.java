package Matrices;

import java.util.Arrays;

/*
    Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
*/

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 20,},
                {11, 1, 13, 14, 15},
        };
        int temp;

        System.out.println("Сортировка по возрастанию:");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[j][i] > matrix[k][i]) {
                        temp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = temp;
                    }
                }
            }
        }
        for (int[] element: matrix) {
            System.out.println(Arrays.toString(element));
        }

        System.out.println();
        System.out.println("Сортировка по убыванию:");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[j][i] < matrix[k][i]) {
                        temp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = temp;
                    }
                }
            }
        }
        for (int[] element: matrix) {
            System.out.println(Arrays.toString(element));
        }
    }
}
