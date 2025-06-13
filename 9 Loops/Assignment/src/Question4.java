import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Entre which number table you want:");
        int num=in.nextInt();

        for(int i=1;i<=10;i++)
        {
            int multiplication=i*num;
            System.out.println(num+" x "+i+" = "+multiplication);
        }
    }
}
