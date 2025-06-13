public class Break {
    public static void main(String[] args) {

        for (int i=1;i<=5;i++)
        {
            if(i == 3)
            {
                break;
            }
            System.out.print(" "+i+"\n");
        }
        System.out.println("Im out of loop");
    }
}
