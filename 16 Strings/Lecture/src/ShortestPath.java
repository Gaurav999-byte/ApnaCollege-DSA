import java.util.*;

public class ShortestPath{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre the String:");
        String word= in.nextLine();

        System.out.println();

        System.out.print("Shortest Distance:"+getPath(word));
    }

    public static float getPath(String str){
        int x=0;
        int y=0;

        for(int i=0;i<str.length();i++){
            char direction = str.charAt(i);

            if(direction=='N'){
                y++;
            } else if (direction=='S') {
                y--;
            } else if (direction=='E') {
                x++;
            }else {
                x--;
            }
        }

        int x2=x*x;
        int y2=y*y;

        return (float) Math.sqrt(x2+y2);
    }
}