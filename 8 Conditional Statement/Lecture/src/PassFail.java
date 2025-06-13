import java.util.Scanner;

public class PassFail {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Entre Marks:");
        float marks=in.nextInt();
        String result = (marks>33)? "Pass" : "Fail";
        System.out.println("Result: "+result);
    }
}
