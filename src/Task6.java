import java.util.Arrays;

/**
 * Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка *10;99+. Вывести массив на экран
 */
public class Task6 {
    public static void main(String[] args) {
        int rows = 8;
        int columns = 5;
        int[][] array = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                int num = (int) (10 + Math.random() * 89);
                array[i][j] = num;
            }
        }
        for (int[] anArray : array) {
            System.out.println(Arrays.toString(anArray));
        }
    }
}
