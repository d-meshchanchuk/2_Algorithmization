package Matrices;

/*
    Найти положительные элементы главной диагонали квадратной матрицы.
*/

public class Task10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {6, -7, 8},
                {11, 12, 13},
        };

        System.out.println("Положительные элементы: ");

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
}
