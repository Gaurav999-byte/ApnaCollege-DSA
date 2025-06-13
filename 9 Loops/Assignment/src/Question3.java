import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre the number:");
        int fact =1;
        int number=in.nextInt();

        for (int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial:"+fact);
    }
}
