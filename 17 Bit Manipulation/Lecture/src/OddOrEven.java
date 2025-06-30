import java.util.Scanner;

public class OddOrEven {

    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Entre Number:");
        int num=in.nextInt();
        System.out.println();
        check(num);

    }

    public static  void check(int n){
        int bitMask=1;

        if ((n&bitMask)==0){
            System.out.println(n+" is Even");
        }
        else {
            System.out.println(n+" is odd");
        }
    }

}