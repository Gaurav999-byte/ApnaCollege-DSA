import java.util.Scanner;

public class MultiAandB {

    //Using Return type
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("A:");
        int a= in.nextInt();
        System.out.println("B:");
        int b=in.nextInt();
        System.out.println(multi(a,b));

    }
    public static int multi(int a,int b)
    {
        int multi=a*b;
        return multi;
    }

    /* using Parameters */

//    public static void main(String[]args){
//        Scanner in = new Scanner(System.in);
//        System.out.println("A:");
//        int a= in.nextInt();
//        System.out.println("B:");
//        int b=in.nextInt();
//        multi(a,b);
//
//    }
//    public static void multi(int a,int b)
//    {
//        int multi=a*b;
//        System.out.println(+multi);
//    }


    /*Using Normal Method */

//    public static void main(String[]args){
//        multi();
//
//    }
//    public static int multi()
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("A:");
//        int a= in.nextInt();
//        System.out.println("B:");
//        int b=in.nextInt();
//        int multi=a*b;
//        System.out.println(multi);
//    }


}
