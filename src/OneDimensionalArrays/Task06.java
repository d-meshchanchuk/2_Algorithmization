package OneDimensionalArrays;

/*
    Задана последовательность N вещественных чисел. Вычислить сумму чисел,
    порядковые номера которых являются простыми числами.
*/
public class Task06 {

    public static void main(String[] args) {
        int n = 20;
        double[] array = new double[n];
        int sum = 0;

        //Рандомное заполнение значениями от -50 до +50
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) Math.random() * 101 - 50;
        }

        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)){
                sum += i;
            }
        }

        System.out.println("Сумма равна: " + sum);
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
