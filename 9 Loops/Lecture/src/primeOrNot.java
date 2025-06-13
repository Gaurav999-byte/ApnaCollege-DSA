import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Please MC Honour Entre the Number");
       int Number = in.nextInt();

       boolean isPrime= true;

       if(Number==2)
       {
           System.out.println(Number+" is Prime Number");
       }
       else {
           int i=2;
           while (i<Math.sqrt(Number))
           {
               if(Number%i==0) {
                   isPrime = false;
               }
               i++;
           }
       }
       if (isPrime==true)
       {
           System.out.println(Number+" is Prime Number");
       }
       else {
           System.out.println(Number+" is not Prime Number");
       }
    }
}
