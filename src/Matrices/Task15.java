package Matrices;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 20,},
                {11, 1, 13, 14, 15},
        };
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Наибольший элемент: " + max);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                matrix[i][j] = max;
            }

            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
