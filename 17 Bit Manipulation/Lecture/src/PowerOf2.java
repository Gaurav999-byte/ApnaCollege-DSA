import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Entre Number:");
        int number = in.nextInt();
        boolean ans=power(number);
        System.out.println(number+" is power of 2:"+power(number));
    }

    public static boolean power(int number){
        return (number&(number-1))==0;
    }
}
