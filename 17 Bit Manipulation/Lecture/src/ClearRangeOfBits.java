public class ClearRangeOfBits {
    public static void main(String[] args) {
        System.out.println("After Clear:"+clear(10,2,4));
    }

    public static int clear(int numbers,int i, int j){
        int a=(~0<<j+1);
        int b=(1<<i)-1;

        int bitMask=a|b;

        return numbers & bitMask;
    }
}
