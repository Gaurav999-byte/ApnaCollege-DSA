import java.util.Scanner;

public class GST {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Pencil Price: ");
        float pencil= in.nextFloat();

        System.out.print("Pen Price: ");
        float pen = in.nextFloat();

        System.out.print("Eraser Price: ");
        float eraser= in.nextFloat();

        float sum_price = pencil+pen+eraser;
        System.out.println("Sum of price: "+sum_price);

        float Gst = (18f/100)*sum_price;
        System.out.println("GST amount: "+Gst);

        float Total_bill = Gst+sum_price;
        System.out.println("Total Bill with Tax:"+Total_bill);
    }
}
