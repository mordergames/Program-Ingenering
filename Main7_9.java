import java.util.Scanner;

public class Main7_9 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a*a+b*b==c*c&&a>0&&b>0&&c>0)
        {
            System.out.println("треугольник существует");
        }
        else {
            System.out.println("Треугольника несуществует");
        }
    }
}

