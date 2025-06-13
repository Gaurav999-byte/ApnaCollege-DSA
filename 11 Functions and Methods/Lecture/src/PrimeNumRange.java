import java.util.Scanner;

public class PrimeNumRange {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre Starting Range:");
        int a = in.nextInt();
        System.out.print("Entre Ending Range:");
        int b = in.nextInt();
        System.out.println("prime number between "+a+" and "+b+" : ");
        range(a,b);
    }

    public static boolean isPrime(int num)
    {
        if (num<=1)
        {
            return false;
        }
        if(num==2)
        {
            return true;
        }

        for(int i=2;i<=(num-1);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void range(int n,int m)
    {
        for (int i=n;i<=m;i++ )
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
