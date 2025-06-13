import java.util.Scanner;

public class SumOfNnum {
    public static void main(String[]args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Entre Value Of n: ");
        int n=in.nextInt();

        int sum =0;
        int i=1;
        while (i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.print("SUM : "+sum);
    }
}
