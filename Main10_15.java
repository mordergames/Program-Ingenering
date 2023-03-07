import java.util.Random;

public class Main10_15 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(497) + 250; // генерируем случайное число от 250 до 746
        System.out.println("Случайное число: " + number);

        int maxDigit = 0;
        int minDigit = 9;
        boolean hasDuplicates = false;

        // находим наименьшую и наибольшую цифры в числе, проверяем на дубликаты
        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            if (digit < minDigit) {
                minDigit = digit;
            }
            if (numberStr.indexOf(digit, i + 1) != -1) {
                hasDuplicates = true;
            }
        }

        System.out.println("Наибольшая цифра: " + maxDigit);
        System.out.println("Наименьшая цифра: " + minDigit);

        if (hasDuplicates) {
            System.out.println("В числе есть дубликаты цифр.");
        } else {
            System.out.println("В числе нет дубликатов цифр.");
        }
    }
}
