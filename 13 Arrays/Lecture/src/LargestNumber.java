public class LargestNumber {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        int ans=Largest(numbers);
        System.out.println(ans);
    }
    public static int Largest(int numbers[]){
        int large=Integer.MIN_VALUE;
        for (int i = 0; i <numbers.length; i++) {
            if(large<numbers[i]){
                large=numbers[i];
            }
        }
        return large;
    }
}
