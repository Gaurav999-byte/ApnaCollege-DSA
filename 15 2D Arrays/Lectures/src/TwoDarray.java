import java.util.*;

public class TwoDarray {

    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.print("No. of Rows =");
        int n=in.nextInt();
        System.out.print("No. of Columns=");
        int m=in.nextInt();

        //declare
        int matrix[][]=new int[n][m];

        //INPUT
        for(int i=0; i<matrix.length; i++){
            for (int j=0 ; j<matrix[0].length; j++){
                System.out.print("Entre element at ("+i+","+j+")"+" position:");
                matrix[i][j]=in.nextInt();
            }
        }

        //OUTPUT
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }

        System.out.print("Entre Key to Search:");
        int Key=in.nextInt();

        Search(matrix,Key);

    }

    public static boolean Search(int matrix[][],int Key){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j]==Key){
                    System.out.println("Key found at position ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key Not found");
        return false;
    }
}
