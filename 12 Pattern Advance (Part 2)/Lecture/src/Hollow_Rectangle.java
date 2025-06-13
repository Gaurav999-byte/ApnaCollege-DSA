import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        hollow_rectangle(4,5);
    }

    public static void hollow_rectangle(int row,int col) {

        //OUTER LOOP
        for(int i=1;i<=row;i++){

            //Inner Loop
            for(int j=1;j<=col;j++){

                if(i==1||i==row||j==1||j==col)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            //new line
            System.out.println("");
        }
    }
}