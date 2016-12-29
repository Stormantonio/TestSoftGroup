/**
 * При помощи цикла while вывести на экран нечетные числа от 1 до 99
 */
public class Task3_1 {
    public static void main(String[] args) {
        int num = 1;
        while (num < 100) {
            if (num % 2 != 0)
                System.out.println(num);
            num++;
        }
    }
}
