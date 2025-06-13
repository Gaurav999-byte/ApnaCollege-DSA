import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre number: ");
        int number = in.nextInt();

        if(number>0)
        {
            System.out.println(number+" "+"is Postive");
        }
        else {
            System.out.println(number+" "+"is Negative");
        }
    }
}