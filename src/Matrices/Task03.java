package Matrices;

import java.util.Scanner;

/*
    Дана квадратная матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10,},
                {11, 12, 13, 14, 15},
        };

        int k;
        int p;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите k ");
        k = scanner.nextInt();
        System.out.println("Введите p");
        p = scanner.nextInt();

        System.out.println(matrix[p - 1][k - 1]);
    }
}
