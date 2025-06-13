public class BruteForce {
    public static void main(String[]args){
        int number[]={1,-2,6,-1,3};
        MaxSubArray(number);
    }

    public static void MaxSubArray(int number []){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i <number.length ; i++) {  //START
            int start=i;

            for (int j = i; j < number.length; j++) { //END
                int end =j;
                    currSum=0;
                for (int k = start; k <=end ; k++) { //PRINT
                    //SUBARRAY SUM
                    currSum=currSum+number[k];
                }
                System.out.println("current sum :"+currSum);
                if (maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum Among all:"+maxSum);
    }
}
