//chech anagram race or care have same character

import  java.util.*;

public class Question4 {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);

        System.out.print("Entre word 1:");
        String word1=in.nextLine();

        System.out.print("Entre word 2:");
        String word2=in.nextLine();

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

        if(word1.length()==word2.length()){
            char word1Array[]=word1.toCharArray();
            char word2Array[]=word2.toCharArray();

            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            boolean result = Arrays.equals(word1Array,word2Array);

            if (result){
                System.out.println(word1+" & "+word2+" is an anagram");
            }
            else {
                System.out.println(word1+" & "+word2+" is an anagram");
            }
        }else {
            System.out.println(word1+" & "+word2+" is an anagram");
        }
    }

}
