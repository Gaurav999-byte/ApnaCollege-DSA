public class Number_Pyramid {
    public static void main(String[] args) {
        number_pyramid(5);
    }

    public static void number_pyramid(int n){
        //Outer
        for (int i = 1; i <=n ; i++) {
            //Inner

            //spaces
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
