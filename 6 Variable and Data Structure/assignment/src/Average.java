import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("A: ");
        int a= in.nextInt();
        System.out.print("B: ");
        int b=in.nextInt();
        System.out.print("C: ");
        int c=in.nextInt();
        int n=3;

        float average= (a+b+c)/n;

        System.out.println("Average: "+average);

    }

}
