import java.util.*;

public class Substring {
    public static void main(String[]args){
        String word="EmiwayBantai";
        String ans = substring(word,6,12);
        System.out.println("Output:"+ans);

        //OR

        System.out.println("Output:"+word.substring(6,12)); //direct method
    }

    public static String substring(String str,int si,int en){

        String suBstring ="";

        for (int i = si; i <en ; i++) {
            suBstring+=str.charAt(i);
        }
        return suBstring;
    }
}