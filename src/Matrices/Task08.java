package Matrices;

import java.util.Arrays;
import java.util.Scanner;

/*
    В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    пользователь с клавиатуры.
*/

public class Task08 {
    public static void main(String[] args) {
        int firstColumn;
        int secondColumn;
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10,},
                {11, 12, 13, 14, 15},
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер первого столбца");
        firstColumn = scanner.nextInt();
        System.out.println("Введите номер второго столбца");
        secondColumn = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            int a = matrix[i][secondColumn - 1];
            matrix[i][secondColumn - 1] = matrix[i][firstColumn - 1];
            matrix[i][firstColumn - 1] = a;

            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
