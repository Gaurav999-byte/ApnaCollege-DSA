import java.util.Scanner;

public class ContinueQuestion {

       public static void main(String[]args)
       {
           Scanner in = new Scanner(System.in);

           while(true){
               System.out.println("Entre Number:");
               int number=in.nextInt();
               if(number%10==0) {
                   System.out.println("Lets skip to the good part");
                   continue;
               }
               else {
                   System.out.println("LE LIYA NUMBER");
               }

           }
       }
}

