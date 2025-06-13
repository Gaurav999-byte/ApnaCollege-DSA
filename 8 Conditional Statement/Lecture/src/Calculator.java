import java.util.Scanner;

public class Calculator {
    public static void main (String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Entre operand 1:");
        int n1= in.nextInt();
        System.out.println("Entre operand 2:");
        int n2 = in.nextInt();
        System.out.println("Entre Operator:");
        char op = in.next().charAt(0);

        switch (op)
        {
            case '+':
                System.out.println(n1+n2);
                break;

            case '-':
                System.out.println(n1-n2);
                break;

            case '*':
                System.out.println(n1*n2);
                break;

            case '/':
                System.out.println(n1/n2);
                break;
        }
    }
}
