import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius: ");
        float radius= in.nextFloat();
        double area = 3.14*radius*radius;

        System.out.print("Area: "+area);
    }
}
