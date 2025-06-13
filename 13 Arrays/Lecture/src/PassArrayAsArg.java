import java.util.Arrays;

public class PassArrayAsArg {
    public static void main (String[]args)
    {
        int marks[]={98,89,87,95,87};
        update(marks);
        System.out.println(Arrays.toString(marks));

    }

    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=(marks[i]+1);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}