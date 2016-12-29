import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Дано число n. При помощи цикла while посчитать факториал n! Примечание.
 * Факториал числа n - произведение всех натуральных чисел от 1 до n включительно. Например, 5! = 1х2х3х4х5 = 120
 */
public class Task3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите натуральное число:");
            int num = Integer.parseInt(reader.readLine());
            int res = 1;
            int count = 1;
            while (count <= num) {
                res *= count;
                count++;
            }
            System.out.println("Результат: " + res);
        } catch (NumberFormatException e) {
            System.out.println("Вы должны вводить только натуральные числа!");
        }
    }
}
