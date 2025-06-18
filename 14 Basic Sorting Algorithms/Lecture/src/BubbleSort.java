import java.util.*;

public class BubbleSort {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);

        System.out.print("Entre the size of an Array:");
        int n= in.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++) {
            System.out.println("Entre number at position " + i + ":");
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        BubbleSort(arr);
        PrintArr(arr);

        }

        public static void BubbleSort(int arr[]){
        for(int turns=0;turns<arr.length-1;turns++){
            for (int j=0;j<arr.length-1-turns;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        }

        public static void PrintArr(int arr[]){
            System.out.println("Sorted Array:");
            for (int i=0;i<arr.length;i++)
            {
                System.out.print(+arr[i]+" ");
            }
        }
}