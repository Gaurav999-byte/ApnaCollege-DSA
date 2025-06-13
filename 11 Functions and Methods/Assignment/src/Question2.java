import java.util.Scanner;

public class Question2 {
    public  static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre the Number: ");
        int n= in.nextInt();

        if(isEven(n))
        {
            System.out.println(n+" is Even Number Baby!!");
        }
        else {
            System.out.println(n+" is Odd Number Shawty!!");
        }
    }

    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        return false;
    }
}
