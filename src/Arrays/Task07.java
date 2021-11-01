package Arrays;

/*
    Даны действительные числа a1, a2, ..., an.
    Найти max(a+a2n, a2 + a2n-1, ..., an +
 */
public class Task07 {

    public static void main(String[] args) {
        int[] array = {1, 12, 3, 14, 5, 16, 7, 18, 9, 11};
        int max = array[0];

        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > max) {
                max = array[i] + array[array.length - i - 1];
            }
        }

        System.out.println(max);
    }
}
