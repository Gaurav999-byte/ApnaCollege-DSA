import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("entre side of a square: ");
        int side = in.nextInt();
        float area= side*side;

        System.out.println("Area: "+area+" sq/m");
    }
}