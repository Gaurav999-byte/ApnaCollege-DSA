public class Palindrome_Number {
    public static void main(String[] args) {
        palindrome(5);
    }

    public static void palindrome(int n){
        //Outer
        for (int i = 1; i <=n ; i++) {
            //Inner

            //spacees

            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("  ");
            }

            //Descending number
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }

            //Ascending number
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
