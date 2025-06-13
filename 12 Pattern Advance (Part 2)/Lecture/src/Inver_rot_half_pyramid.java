public class Inver_rot_half_pyramid {
    public static void main(String[]args){
        inver_rot_half_pyramid(4);
    }

    public static void inver_rot_half_pyramid(int n){

        //Outer
        for (int i=1;i<=n;i++){

            // Inner

            //Spaces
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }
}
