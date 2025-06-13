import java.util.Scanner;

public class Print1toNno {
    public static void main(String []args){
        Scanner in=new Scanner (System.in);
        System.out.print("Entre value of n: ");
        int n =in.nextInt();

        int count=1;

        while (count<=n)
        {
            System.out.print(" "+count);
            count++;
        }
    }
}
