import java.util.Scanner;

public class Question2{
    public static void main (String []args)
    {
        Scanner in= new Scanner(System.in);
        int choice;
        int SumEven=0;
        int SumOdd=0;
        int Number;

        do{
            System.out.print("Entre the Number:");
            Number=in.nextInt();

            if(Number%2==0)
            {
                SumEven+=Number;
            }
            else {
                SumOdd+=Number;
            }
            System.out.print("Entre 1 to continue and 0 to Stop:");
            choice=in.nextInt();
        }while (choice==1);
        System.out.println("Sum of Even Numbers:"+SumEven);
        System.out.println("Sum of Odd Numbers:"+SumOdd);
    }
}