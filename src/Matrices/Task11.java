package Matrices;

/*
    Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз.
*/

public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        int count;
        String str = "";

        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.print(matrix[i][j] + " ");

                if (matrix[i][j] == 5) {
                    count++;
                }
            }

            if (count >= 3) {
                int a = i + 1;
                str = str + " " + a;
            }

            System.out.println();
        }

        System.out.println("Номера строк, в которых число 5 встречается три и более раз: " + str);
    }
}
