public class ClearLastiBITS {
    public static void main(String[]args){
        System.out.println("After Clear:"+clear(15,2));
    }

    public static int clear(int number,int i){
        int bitMask=(~0<<i);
        return number & bitMask;
    }
}
