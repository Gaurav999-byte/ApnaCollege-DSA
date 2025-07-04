import java.util.Arrays;

public class PrefixSum {
    public static void main (String[]args){
        int numbers[]={1,-2,6,-1,3};
        System.out.println("Array:"+Arrays.toString(numbers));
        SubarraySum(numbers);
    }

    public static void SubarraySum(int numbers []){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];

        for (int i = 1; i <numbers.length ; i++) {
            prefix[i]=prefix[i-1]+numbers[i];
        }

        System.out.println("Prefix Array:"+Arrays.toString(prefix));

        System.out.println();
        for (int i = 1; i < numbers.length; i++) {
            int start=i;
            for (int j = i; j <numbers.length ; j++) {
                int end=j;

                currSum=prefix[end]-prefix[start-1];
                if (maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum:"+maxSum);
    }
}
