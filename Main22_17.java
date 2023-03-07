public class Main22_17 {

    public static void analyze(int[][] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxCount = 0;
        int minCount = 0;

        for (int[] row : array) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                    maxCount = 1;
                } else if (num == max) {
                    maxCount++;
                }

                if (num < min) {
                    min = num;
                    minCount = 1;
                } else if (num == min) {
                    minCount++;
                }
            }
        }

        System.out.println("Максимальное значение: " + max);
        System.out.println("Количество максимумов: " + maxCount);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Количество минимумов: " + minCount);
    }
}
