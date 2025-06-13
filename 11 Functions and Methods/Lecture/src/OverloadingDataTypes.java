public class OverloadingDataTypes {
    public static void main(String[]args)
    {
        System.out.println("sum 1: "+sum(9,5));
        System.out.println("sum 2: "+sum(7.5f,5.9f));
    }

    public static int sum(int a,int b)
    {
        return a+b;
    }

    public static float sum(float a, float b)
    {
        return a+b;
    }
}
