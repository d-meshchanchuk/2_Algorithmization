package OneDimensionalArrays;

/*
    В массив А[N] занесены натуральные числа.
    Найти сумму тех элементов, которые кратны данному К.
*/

public class Task01 {

    public static void main(String[] args) {

        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 2;
        int sum = 0;

        for (int element : a2) {
            if (element % k == 0) {
                sum += element;
            }
        }

        System.out.println("Сумма элементов, кратных " + k + " равна " + sum);


    }
}
