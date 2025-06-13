import java.util.Scanner;

public class AddAandB {

    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre A:");
        int a=in.nextInt();
        System.out.print("Entre B: ");
        int b=in.nextInt();
        int Addition =sum(a,b);
        System.out.print("Sum:"+Addition);

    }

    public static int sum(int Gaurav,int Tejas)
    {
        int Add = Gaurav+Tejas;
        return Add;
    }
}
