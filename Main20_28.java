import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main20_28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Массив: " + Arrays.toString(arr));
    }
}
