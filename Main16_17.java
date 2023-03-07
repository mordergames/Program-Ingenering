public class Main16_17 {
    public static void main(String[] args) {
        int limit = 999;
        for (int i = 10; i < 100; i++) {
            if (isPrime(i) && i * i <= limit) {
                System.out.println(i);
            }
        }
    }

    // Метод, который проверяет, является ли число простым
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}