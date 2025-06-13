public class Invert_Half_Num_Pyramid {
    public static void main(String[]args)
    {
        invert_half_num_pyramid(5);
    }

    public static void invert_half_num_pyramid(int n)
    {

        //Outer loop
        for(int i=1;i<=n;i++)
        {
            //Inner Loop
            for(int j=1;j<=((n+1)-i);j++)
            {
                System.out.print(j+" ");
            }
            //new line
            System.out.println();
        }

        //OR//

        /*outer loop
        for (int i=n;i>=1;i--)
        {
            //Inner loop
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            //new line
            System.out.println();
        } */
    }
}
