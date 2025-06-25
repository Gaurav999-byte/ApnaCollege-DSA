import java.util.*;

public class StringCompress {
    public static void main (String[]args){
        String word="aaabbcccdrrr";
        System.out.println();
        System.out.print("Output:"+compress(word));
    }

    public static String compress(String word){
       String newWord="";

        for (int i = 0; i <word.length() ; i++) {
            Integer count =1;

            while (i<word.length()-1 && word.charAt(i)==word.charAt(i+1)){
                count++;
                i++;
            }
            newWord=newWord+word.charAt(i);

            if (count>1){
                newWord=newWord+count.toString();
            }
        }
        return newWord;
    }
}
