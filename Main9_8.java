import java.util.Scanner;
public class Main9_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a%10+a%100/10+a%1000/100==a%10000/1000+a%100000/10000+a%1000000/100000){
            System.out.println("Билет счастливый");
        }
        else {
            System.out.println("Билет не счастливый");
    }
    }
}
