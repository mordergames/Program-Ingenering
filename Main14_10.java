import java.util.Random;

public class Main14_10 {
    public static void main(String[] args) {
        int[] numbers = new int[25];
        int maxSum = 0;
        int maxIndex = 0;

        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(900) + 100; // генерация трехзначных чисел
            int sum = digitSum(numbers[i]); // вычисление суммы цифр
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }

        System.out.println("Сгенерированные числа: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nЧисло с максимальной суммой цифр: " + numbers[maxIndex] + " (порядковый номер " + (maxIndex+1) + ")");
    }

    // метод для вычисления суммы цифр числа
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}