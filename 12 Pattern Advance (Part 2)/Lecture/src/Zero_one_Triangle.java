public class Zero_one_Triangle {
    public static void main(String[] args) {
    zero_one(5);
    }

    public static void zero_one(int n)
    {
        //Outer
        for(int i=1;i<=n;i++){
            //Inner
            for (int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            //new line
            System.out.println();
        }
    }
}
