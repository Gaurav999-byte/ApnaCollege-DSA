import java.util.Scanner;

public class StairCaseM2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int matrix [][]={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };

        System.out.print("Entre Key:");
        int key=in.nextInt();

        stairCase(matrix,key);
    }

    public static boolean stairCase(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;
        while (col<matrix[0].length && row>=0){

            if (matrix[row][col]==key){
                System.out.println("Key Found at ("+row+","+col+")");
                return true;
            } else if (key<matrix[row][col]) {
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("Key not Found Badshah!!");
        return false;
    }
}
