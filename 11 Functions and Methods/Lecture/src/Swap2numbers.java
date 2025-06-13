import java.util.Scanner;

public class Swap2numbers {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Num a: ");
        int a = in.nextInt();
        System.out.print("Num b: ");
        int b = in.nextInt();
        swap(a,b);
    }

    public static void swap(int a,int b)
    {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}