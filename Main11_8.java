import java.util.Random;

public class Main11_8 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            int number = random.nextInt(56) - 20; // генерируем случайное число от -20 до 35
            System.out.print(number);
            if (number < 0) {
                System.out.print("?");
            }
            System.out.print(" ");
        }
    }
}
