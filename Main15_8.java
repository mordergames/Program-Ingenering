import java.util.Scanner;

public class Main15_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (sum < 150) {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            sum += num;
            count++;
        }

        System.out.println("Количество введенных значений: " + count);
        System.out.println("Сумма введенных значений: " + sum);
    }
}