import java.util.Scanner;

public class Main12_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int x = scanner.nextInt();

        int count = 0; // переменная для подсчета количества делителей

        System.out.print("Делители числа " + x + ": ");
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println(); // перевод строки для красоты вывода

        System.out.println("Количество делителей числа " + x + ": " + count);
    }
}