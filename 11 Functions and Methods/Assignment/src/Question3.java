import java.util.Scanner;

public class Question3 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre the Number to check: ");
        int n = in.nextInt();

        if(Palindrome(n))
        {
            System.out.println(n+" is Palindrome Number.");
        }
        else {
            System.out.println(n+" is not Palindrome Number.");
        }
    }

    public static boolean Palindrome(int num)
    {
        int Number=num;
        int rev =0;
        while (num>0)
        {
            int rem= num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if (rev==Number)
        {
            return true;
        }
            return false;
    }
}
