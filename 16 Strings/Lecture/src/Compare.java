import  java.util.*;

public class Compare {
    public static void main(String[]args){
        String s1="Gaurav";

        String s2="Gaurav";

        String s3 = new String("Gaurav");

        if(s1==s2){
            System.out.println("s1 is equal to s2");
        }else {
            System.out.println("s1 is equal to s2");
        }


        if (s1==s3 || s2==s3){
            System.out.println("s1 or s2 equal to s3");
        }else {
            System.out.println("s1 is not equal to s2");
        }

        if (s1.equals(s3)){
            System.out.println("s1 is equal to s2");
        }
        else {
            System.out.println("s1 is not equal to s2");
        }
    }
}
