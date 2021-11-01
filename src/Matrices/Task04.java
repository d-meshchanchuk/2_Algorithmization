package Matrices;

import java.util.Scanner;

/*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/

public class Task04 {
    public static void main(String[] args) {
        int[][] matrix;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        n = scanner.nextInt();

        matrix = new int[n][n];

        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j + 1;
                matrix[i+1][j] = n -j;
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
