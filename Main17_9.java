public class Main17_9 {
    public static void printEvenNumbersInRange(int A, int B) {
        if (A > B) {
            // Если A > B, меняем местами значения, чтобы A было меньше или равно B
            int temp = A;
            A = B;
            B = temp;
        }

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                // Если i четное, выводим его на экран
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Пример использования
        printEvenNumbersInRange(1, 10); // должно вывести 2 4 6 8 10
    }
}
