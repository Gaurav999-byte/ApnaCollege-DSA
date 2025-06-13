public class Butterfly {
    public static void main(String[] args) {
        butterfly(4);
    }

    public static void butterfly(int n) {


        //1ST HALF

        //Outter loop

        for (int i=1;i<=n;i++)
        {
            //Inner Loop
            //Star-1
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //Spaces
            for (int j=1;j<=(2*(n-i));j++){
                System.out.print("  ");
            }
            //Star -2
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2ND HALF - Mirror of Above

            // OUTER
        for (int i=n;i>=1;i--) // only change this
        {
            //Inner Loop
            //Star-1
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //Spaces
            for (int j=1;j<=(2*(n-i));j++){
                System.out.print("  ");
            }
            //Star -2
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
