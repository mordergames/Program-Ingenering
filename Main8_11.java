import java.util.Scanner;
public class Main8_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество  стульев");
        int a = in.nextInt();
        System.out.println("Введите количество учеников");
        int b = in.nextInt();
        if (a>b){
            System.out.println("количество стульев больше на "+ (a-b));
        }
        else {
            System.out.println("Количество учеников больше на "+ (b-a));
        }
    }
}
