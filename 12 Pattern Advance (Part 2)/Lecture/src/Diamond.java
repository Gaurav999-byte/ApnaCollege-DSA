public class Diamond {
    public static void main(String[] args) {
        diamond(4);
    }

    public static void diamond(int n){

        //1ST HALF

        //OUTER LOOP
        for (int i = 1; i <=n ; i++) {
            //INNER LOOP

            //spaces
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("  ");
            }

            //stars
            for (int j = 1; j <=((2*i)-1) ; j++) {
                System.out.print("* ");
            }
            //new line
            System.out.println();
        }

        //2ND HALF

        //OUTER LOOP
        for (int i = n; i>=1 ; i--) {
            //INNER LOOP

            //spaces
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("  ");
            }

            //stars
            for (int j = 1; j <=((2*i)-1) ; j++) {
                System.out.print("* ");
            }
            //new line
            System.out.println();
        }
    }
}
