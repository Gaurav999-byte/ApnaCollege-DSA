import java.util.*;

public class SelectionSort {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);

        System.out.print("Entre the size of array:");
        int n=in.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Entre number at position "+i+":");
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        SelectionSort(arr);
        Print(arr);
    }

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPosition=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minPosition]>arr[j]){
                    minPosition=j;//
                }
            }
            //swaping

            int temp=arr[minPosition];
            arr[minPosition]=arr[i];
            arr[i]=temp;

        }
    }

    public static void Print(int arr[]){
        System.out.println("Sorted array:");
        System.out.print(Arrays.toString(arr));
    }
}