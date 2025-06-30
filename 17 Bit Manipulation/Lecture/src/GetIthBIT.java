import java.util.Scanner;

public class GetIthBIT {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);

        System.out.print("Entre Number:");
        int number=in.nextInt();

        System.out.print("Entre ith:");
        int i=in.nextInt();

        System.out.print(i+" th bit is "+get(number,i));
    }

    public static int get(int number,int i){
        int bitMask=1<<i;

        if ((number & bitMask)==0){
            return 0;
        }
        else {
            return 1;
        }
    }
}
