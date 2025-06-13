import java.util.*;

public class Large3no {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Num 1");
        int num1= in.nextInt();
        System.out.println("Num 2");
        int num2= in.nextInt();
        System.out.println("Num 3");
        int num3= in.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("Number 1 is Largest");
        } else if (num2>num3 && num2>num1) {
            System.out.println("Number 2 is Largest");
        }else {
            System.out.println("Number 3 is Largest");
        }
    }
}
