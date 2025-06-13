import java.util.Scanner;

public class OverloadingParameters {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Two numbers sum: "+sum(9,6));
        System.out.println("Three numbers sum: "+sum(9,6,8));
    }

    public static int sum(int a,int b)
    {
        return a+b;
    }

    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}