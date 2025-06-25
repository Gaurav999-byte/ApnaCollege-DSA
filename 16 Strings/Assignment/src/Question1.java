//count lowercase vowels occured in String

import java.util.*;

public class Question1 {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);

        System.out.print("Entre the word:");
        String word = in.nextLine();

        System.out.print("Number of vowel in string:"+countVowels(word));
    }

    public static int countVowels(String str){
        int count =0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'||str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
