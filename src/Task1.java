/**
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99
 */
public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
