public class UPDATEithBITmet2 {

    public static void main(String[]args){
        System.out.println("After Update:"+update(10,2,1));
    }

    public static int update(int number,int i,int newBit){
        number=clear(number,i);
        int bitMask=newBit<<i;
        return number|bitMask;
    }

    public static int clear(int number,int i){
        int bitMask=~(1<<i);

        return number&bitMask;
    }
}
