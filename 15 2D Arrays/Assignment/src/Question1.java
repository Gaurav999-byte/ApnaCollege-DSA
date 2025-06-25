//Print total 7's is 2D array

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
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
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int ans=total(matrix);
        System.out.print("Total no. of 7's:"+ans);
    }

    public static int total(int matrix[][]){
     int count=0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0 ; j<matrix[0].length; j++){
               if (matrix[i][j]==7){
                   count++;
               }
            }
        }
        return count;
    }
}
