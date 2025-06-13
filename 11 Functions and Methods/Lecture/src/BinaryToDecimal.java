import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre Binary Number: ");
        int n = in.nextInt();
        BinToDec(n);
    }

    public static void BinToDec(int BinNum)
    {
        int num=BinNum;
        int pow=0;
        int DecNum=0;

        while (BinNum>0)
        {
            int Lastdigit= BinNum%10;
            DecNum=DecNum+(Lastdigit*(int) Math.pow(2,pow));
            pow++;
            BinNum=BinNum/10;
        }
        System.out.println("Decimal form of "+num+" is "+DecNum);
    }
}