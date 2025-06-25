import java.util.*;

public class PalindromeSentence {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        System.out.print("Entre Word to check Palindrome or not:");
        String word=in.nextLine();

        System.out.println("Result:"+isPalindrome(word));


    }

    public static boolean isPalindrome(String str){
        String CleanStr=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); //[^a-zA-Z0-9] inko chodke sab empty hoge including spaces
        int n=CleanStr.length();
        for (int i = 0; i <n; i++) {

            if (CleanStr.charAt(i)!= CleanStr.charAt(n-1-i)){
                return false; //not palindrrome
            }
        }
        return true; // it is Palindrome
    }
}