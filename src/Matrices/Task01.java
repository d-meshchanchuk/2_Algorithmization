package Matrices;

/*
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
*/

public class Task01 {

    public static void main(String[] args) {
        //Прошу прощения
        int[][] matrix = {{9, 2, 3, 4, 3, 2, 9},
                      {2, 3, 4, 5, 4, 3, 2},
                      {3, 4, 5, 6, 5, 4, 3}};


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length-1][j]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
