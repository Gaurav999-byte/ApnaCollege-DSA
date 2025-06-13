import java.util.Scanner;

public class Large2no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre n1:");
        int n1= in.nextInt();
        System.out.println("Entre n2:");
        int n2= in.nextInt();

        if(n1>n2)
        {
            System.out.println("Number 1:"+n1);
        }
        else {
            System.out.println("Number 2"+n2);
        }
    }
}