package Matrices;

/*
    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму.
*/

public class Task09 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10,},
                {11, 12, 13, 14, 15},
        };
        int sum;
        int maxSum = 0;
        int j = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            sum = 0;
            for (int[] element : matrix) {
                sum += element[j];
            }
            if (sum > maxSum){
                maxSum = sum;
            }
            j++;
        }
        System.out.println(maxSum);
    }
}
