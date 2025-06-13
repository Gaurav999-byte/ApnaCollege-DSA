import java.util.Scanner;

public class PrimeNum {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre Number: ");
        int num = in.nextInt();

        System.out.println("Result: "+isPrime(num));

    }

    public static boolean isPrime(int num)
    {
        if(num==2)
        {
            return true;
        }

        for (int i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

}