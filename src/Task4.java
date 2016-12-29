/**
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив
 * выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class Task4 {
    public static void main(String[] args) {
        int length = 100;
        int[] array = new int[length / 2];
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                array[count] = i;
                count++;
            }
        }
        System.out.println("Массив нечетных чисел:");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        System.out.println("В обратном порядке:");
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
