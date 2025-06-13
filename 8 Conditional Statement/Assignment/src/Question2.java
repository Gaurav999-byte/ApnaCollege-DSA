import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Entre Temp");
        double temp =in.nextDouble();

        if (temp>100)
        {
            System.out.println("Brother you have Fever");
        }
        else {
            System.out.println("Sher Tu Thik hai!!");
        }
    }
}
