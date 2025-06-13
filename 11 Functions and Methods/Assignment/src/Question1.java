import java.util.Scanner;

public class Question1 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre 1: ");
        float a= in.nextFloat();
        System.out.print("Entre 2: ");
        float b= in.nextFloat();
        System.out.print("Entre 3: ");
        float c= in.nextFloat();

        System.out.print("Average of a,b and c: "+average(a,b,c));
    }

    public static float average(float a,float b,float c)
    {
        float avg = (a+b+c)/3;
        return avg;
    }
}
