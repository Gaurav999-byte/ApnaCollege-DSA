public class CLEARithBIT {
    public static void main(String[]args){
        System.out.println("After Clear: "+clear(10,1));
    }

    public static int clear(int number,int i){
        int bitMask=~(1<<i);

        return number & bitMask;
    }
}
