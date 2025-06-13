// BC = N!/R!(N-R)!

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        double n=in.nextInt();
        System.out.print("R: ");
        double r=in.nextInt();
        double Ans=BinCof(n,r);
        System.out.println("Binomial Coefficient: "+Ans);

    }

    public static double factorial(double num)
    {
        double fact =1;

        for(double i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static double BinCof(double N,double R)
    {
        double Fact_n = factorial(N);
        double Fact_r = factorial(R);
        double Fact_nMr = factorial(N-R);

        double Binoco = (Fact_n/(Fact_r*Fact_nMr));

        return Binoco;
    }
}