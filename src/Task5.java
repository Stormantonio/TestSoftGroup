/**
 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
 * Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int term = 1;
        int fib = 0;
        int count = 0;
        for (int i = 0; i < 20; i++) {
            fib += term;
            int temp = term;
            term = fib;
            fib = temp;
            array[count] = fib;
            count++;
        }
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
