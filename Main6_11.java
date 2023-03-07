import java.util.Scanner;

public class Main6_11 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if ((a>0&&b>0)||(a<0&&b<0))
        {
            System.out.println("Один и тот же знак");
        }
        else if ((a<0&&b>0)||(a>0&&b<0)) {
            System.out.println("Разные знаки");
        }
        else {
            System.out.println("Некорректно");
        }


    }
}
