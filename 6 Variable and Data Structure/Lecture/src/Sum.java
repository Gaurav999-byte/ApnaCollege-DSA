import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre num 1: ");
        int a = in.nextInt();
        System.out.print("Entre num 2: ");
        int b = in.nextInt();
        int c = a+b;

        System.out.println("Sum of a & b : "+c);
    }
}