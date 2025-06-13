import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre the Number: ");
        int n =in.nextInt();
        DecToBin(n);
    }

    public static void DecToBin(int DecNum){
       int num = DecNum;
       int BinNum=0;
       int pow=0;
       while (DecNum>0)
       {
           int Rem = DecNum%2;
           BinNum=BinNum+(Rem*(int)Math.pow(10,pow));
           pow++;
           DecNum/=2;
       }
        System.out.println("Binary form of "+num+" is "+BinNum);
    }
}
