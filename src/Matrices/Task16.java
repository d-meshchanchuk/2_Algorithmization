package Matrices;

/*
    Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
    ..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
    собой. Построить такой квадрат.
*/

public class Task16 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int step_row;
        int step_col;

        while (number <= n * n) {
            matrix[row][column] = number;
            number++;
            step_row = row;
            step_col = column;
            row -= 1;
            column += 1;

            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (matrix[row][column] != 0) {
                row = step_row + 1;
                column = step_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
