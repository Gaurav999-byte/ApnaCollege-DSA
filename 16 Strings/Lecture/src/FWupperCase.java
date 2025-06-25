import java.util.Scanner;

public class FWupperCase {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.print("Entre the Sentence:");
        String sentence= in.nextLine();
        System.out.println();
        System.out.print("Output:"+toUppercasw(sentence));

    }

    public static String toUppercasw(String str){
       StringBuilder sb = new StringBuilder();

       char ch=Character.toUpperCase(str.charAt(0));
       sb.append(ch);
        for (int i = 1; i < str.length(); i++) {

            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
