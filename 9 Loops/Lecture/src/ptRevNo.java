import java.util.Scanner;

public class ptRevNo{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("entre number:");
        int Number=in.nextInt();

        while(Number>0)
        {
            int LastDigit=Number%10;
            System.out.print(LastDigit);
            Number=Number/10;
        }
    }
}