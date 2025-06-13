public class Solid_Rhombus {
    public static void main(String[] args) {
        solid_rhombus(5);
    }

    public static void solid_rhombus(int n){

        //Outer
        for (int i = 1; i <=n ; i++) {

            //Inner

            //Spaces

            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("  ");
            }

            //Stars
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }
            //new line
            System.out.println();
        }

    }
}
