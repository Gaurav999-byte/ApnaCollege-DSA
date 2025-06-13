import java.util.*;

public class PairsInArray {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.print("Entre size of a array:");
        int n= in.nextInt();
        int numbers[]=new int[n];

        for (int i=0;i<numbers.length;i++){
            System.out.print("Entre number in position "+i+" ");
            numbers[i]=in.nextInt();
        }

        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        System.out.println(Arrays.toString(numbers));

        PrintPairs(numbers);
    }

    public static void PrintPairs(int numbers[]){
        int tp=0;
        for (int i = 0; i <numbers.length ; i++) {
            int curr=numbers[i];

            for (int j = i+1; j <numbers.length ; j++) {
                System.out.print("("+curr+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Numbers of Pairs:"+tp);
    }
}