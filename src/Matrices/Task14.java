package Matrices;

import java.util.Arrays;

/*
    Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.
*/

public class Task14 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int random;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j <= i; j++) {
                random = (int) (Math.random() * m);
                matrix[random][i] = 1;
            }
        }

        for (int[] element : matrix) {
            System.out.println(Arrays.toString(element));
        }
    }
}
