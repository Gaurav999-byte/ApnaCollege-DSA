//Transpose of matrix

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("No. of Rows =");
        int n=in.nextInt();
        System.out.print("No. of Columns=");
        int m=in.nextInt();


        int matrix[][]=new int[n][m];

        //INPUT
        for(int i=0; i<matrix.length; i++){
            for (int j=0 ; j<matrix[0].length; j++){
                System.out.print("Entre element at ("+i+","+j+")"+" position:");
                matrix[i][j]=in.nextInt();
            }
        }

        System.out.println("Origional Matrix");
        Print(matrix);

        //Transpose

        int transpose[][]=new int[m][n];

        for(int i=0; i<matrix.length; i++){
            for (int j=0 ; j<matrix[0].length; j++){
               transpose[j][i]=matrix[i][j];
            }
        }

        System.out.println("Transpose Matrix");

        Print(transpose);

    }

    public static void Print(int Gaurav[][]){
        for(int i=0; i<Gaurav.length; i++){
            for(int j=0; j<Gaurav[0].length; j++){
                System.out.print(Gaurav[i][j]+" ");
            }
            System.out.println();
        }
    }
}
