package Arrays;

/*
    Даны действительные числа а1, а2, ..., аn.
    Вывести на печать только те числа, для которых ai > i.
*/

public class Task05 {

    public static void main(String[] args) {
        int[] array = {1, 12, 3, 14, 5, 16, 7, 18, 9, 11};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i + 1) {
                System.out.println(array[i]);
            }
        }
    }

}
