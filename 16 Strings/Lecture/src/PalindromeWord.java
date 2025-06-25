import java.util.*;

public class PalindromeWord {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        System.out.print("Entre Word to check Palindrome or not:");
        String word=in.nextLine();

        System.out.println("Result:"+isPalindrome(word));


    }

    public static boolean isPalindrome(String str){
        int n=str.length();

        for (int i = 0; i <n; i++) {

            if (str.charAt(i)!= str.charAt(n-1-i)){
                return false; //not palindrrome
            }
        }
        return true; // it is Palindrome
    }
}
