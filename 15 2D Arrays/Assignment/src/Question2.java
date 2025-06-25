//sum of 2nd row

public class Question2 {

    public static void main(String[] args) {
        int matrix[][]={
                {1,4,9},
                {11,4,3},
                {2,2,3}
        };
        System.out.println("Sum:"+row2sum(matrix));
    }

    public static int row2sum(int matrix[][]){
        int sum=0;
       /* for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if (i==1){
                    sum=sum+matrix[i][j];
                }
            }
        }*/

        //OR

        for (int j = 0; j < matrix[0].length; j++) {
            sum=sum+matrix[1][j];
        }
        return sum;
    }
}