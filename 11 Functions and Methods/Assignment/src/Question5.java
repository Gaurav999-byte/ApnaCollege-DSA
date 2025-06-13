import java.util.Scanner;

public class Question5 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre the number: ");
        int number= in.nextInt();
        System.out.print("Sum of digit of number "+number+" are: "+SumOfDigit(number));
    }

    public static int SumOfDigit(int number)
    {
        int sum=0;

        while (number>0)
        {
            int rem=number%10;
            sum=sum+rem;
            number=number/10;
        }
        return sum;
    }
}
