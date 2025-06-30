import java.util.Scanner;

public class SETithBIT {
    public static void main(String[]args){

        System.out.print("After Set: "+set(10,2));

    }

    public static int set(int number,int i){
        int bitMask=1<<i;

        return number | bitMask;
    }

}
