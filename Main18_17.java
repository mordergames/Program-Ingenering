import java.util.Random;
import java.util.Scanner;

public class Main18_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создаем массив заданного размера
        int[] arr = new int[size];

        // Заполняем массив случайными трехзначными числами
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(900) + 100;
        }

        // Выводим значения массива
        int middle = arr.length / 2;
        for (int i = 0; i < middle; i++) {
            System.out.println(arr[i] + " " + arr[arr.length - 1 - i]);
        }
        if (arr.length % 2 == 1) {
            System.out.println(arr[middle]);
        }
    }
}