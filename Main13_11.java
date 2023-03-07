import java.util.Scanner;

public class Main13_11 {
    public static void main(String[] args) {
        int[][] measurements = new int[50][2];
        Scanner scanner = new Scanner(System.in);

        // Считываем 50 измерений с клавиатуры
        for (int i = 0; i < 50; i++) {
            System.out.print("Введите день недели (1-7) и уровень загрязнения (1-10) через пробел для измерения " + (i+1) + ": ");
            measurements[i][0] = scanner.nextInt();
            measurements[i][1] = scanner.nextInt();
        }

        // Проверяем каждое измерение
        for (int i = 0; i < 50; i++) {
            int dayOfWeek = measurements[i][0];
            int pollutionLevel = measurements[i][1];

            if (pollutionLevel >= 7) {
                System.out.println("Опасно! (измерение " + (i+1) + ")");
            }

            if (dayOfWeek == 2 && pollutionLevel < 5) {
                System.out.println("Спокойный вторник (измерение " + (i+1) + ")");
            }
        }
    }
}