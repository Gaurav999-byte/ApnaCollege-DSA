import java.util.*;

public class InsertionSort {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Size of array:");
        int n=in.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("entre number at "+i+":");
            arr[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        InsertionSort(arr);
        Print(arr);

    }

    public static void InsertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            //find correct position

            while (prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void Print(int arr[]){
        System.out.println("Sorted Array:");
            System.out.println(Arrays.toString(arr));
    }
}
