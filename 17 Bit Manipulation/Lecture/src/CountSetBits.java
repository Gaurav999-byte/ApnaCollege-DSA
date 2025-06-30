public class CountSetBits {
    public static void main(String[]args){
        System.out.print("Total Set count:"+CountSet(15));
    }

    public static int CountSet(int number){
        int count=0;

        while (number>0){
            if ((number&1)!=0){
                count++;
            }
            number=number>>1;
        }
        return count;
    }
}
