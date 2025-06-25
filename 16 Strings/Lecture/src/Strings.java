import java.util.Scanner;
 public class Strings {
        public static void main(String []args){
            Scanner in=new Scanner(System.in);

            //Array se String banaya Characters ko jod jod ke
            char ch[] ={'G','a','u','r','a','v'};
            System.out.print("1: ");
            for (int i = 0; i <ch.length ; i++) {
                System.out.print(ch[i]);
            }
            System.out.println();

            //STRING banane ka 1 Tarika
            String str1 ="Gaurav";
            System.out.println("2: "+str1);

            //String banane ka 2 Tarika
            String str2=new String("Gaurav");
            System.out.println("3: "+str2);

            /* OR */
            String str3=new String();
            str3="Gaurav Abhendra Nagrale";
            System.out.println("4: "+str3);

        }

}
