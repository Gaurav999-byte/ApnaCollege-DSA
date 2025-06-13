import java.util.Scanner;

public class BreakQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("Entre Number:");
            int number= in.nextInt();

            if (number%10==0)
            {
                break;
            }
            else {
                System.out.println("Print:"+number);
            }
        }
        System.out.println("Loop is stoped");
    }
}
