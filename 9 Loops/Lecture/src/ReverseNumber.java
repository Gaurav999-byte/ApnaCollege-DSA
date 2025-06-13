import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Entre Number");
        int number= in.nextInt();

        int rev=0;
        while (number>0)
        {
            int lastdigit= number%10;
            rev=(rev*10)+lastdigit;
            number=number/10;
        }
        System.out.println("Reverse Number:"+rev);
    }
}
