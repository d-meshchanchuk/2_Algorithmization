package Matrices;

import java.util.Scanner;

/*
    Сформировать квадратную матрицу порядка N по правилу:
    A[I,J] = sin((I^2 - J^2) / N)
*/
public class Task07 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N");
        n = scanner.nextInt();

        double[][] matrix = new double[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((i * i - (j * j)) / n);

                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

