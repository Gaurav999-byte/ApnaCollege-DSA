public class Flyod_Triangle {
    public static void main (String []args)
    {
       flyod_triangle(5);
    }

    public static void flyod_triangle(int n){

        //Outer

        int counter=1;

        for (int i=1;i<=n;i++)
        {
            //Inner Loop

            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }

            //new line
            System.out.println();
        }
    }
}
