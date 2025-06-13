import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Entre size of an Array: ");
        int n= in.nextInt();
        int marks[]= new int[n];

        //Take Input in array

        for (int i = 0; i <marks.length ; i++) {
            System.out.println("Entre the marks of position "+i+":");
            marks[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(marks));

        //Print array

        for (int i = 0; i <marks.length ; i++) {
            System.out.print(marks[i]+" ");
        }

    }
}
