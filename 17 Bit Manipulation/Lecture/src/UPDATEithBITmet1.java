public class UPDATEithBITmet1 {
    public static void main(String[] args) {

        System.out.print("After Update: "+update(10,2,1));

    }

    public static int update(int number,int i,int newBit) {
        if(newBit==0){
            return clear(number,i);
        }
        else {
            return set(number,i);
        }

    }

    public static int clear(int number,int i){
        int bitMask=~(1<<i);
        return number&bitMask;
    }

    public static int set(int number, int i){
        int bitMask=1<<i;
        return number|bitMask;
    }
}
