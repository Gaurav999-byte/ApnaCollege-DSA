public class Hollow_Rhombus {
    public static void main(String[] args) {
        hollow_rhombus(5);
    }

    public static void hollow_rhombus(int n){
    //Outer
        for (int i = 1; i <=n ; i++) {
            //inner

            //spaces
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("  ");
            }

            //star
            for (int j = 1; j <=n ; j++) {
                if(i==1 || i==n ||j==1 || j==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            //new line
            System.out.println();
        }
    }

}
