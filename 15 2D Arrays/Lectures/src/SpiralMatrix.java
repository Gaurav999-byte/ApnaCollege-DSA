import java.util.*;

public class SpiralMatrix {

    public static void main(String[]args){
        int matrix[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Output:");
        printSpiral(matrix);
    }

    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int endColumn=matrix[0].length-1;
        int startColumn=0;

        while (startRow<=endRow && startColumn<=endColumn){

            //TOP
            for (int j = startColumn; j <=endColumn; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }

            //RIGHT
            for (int i = startRow+1; i <=endRow ; i++) {
                System.out.print(matrix[i][endColumn]+" ");
            }

            //Bottom
            for (int j = endColumn-1; j >=startColumn ; j--) {
                if (startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //LEFT
            for (int i = endRow-1; i >=startRow+1 ; i--) {
                if (startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;

        }
        System.out.println();
    }

}
