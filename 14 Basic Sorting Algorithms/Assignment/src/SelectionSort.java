import java.util.*;

public class SelectionSort {
    public static void main(String[]args){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        System.out.println("Default Array:"+Arrays.toString(arr));
        Selection(arr);
        Print(arr);
    }

    public static void Selection(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int maxPos=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[maxPos]<arr[j]){
                    maxPos=j;
                }
            }

            int temp=arr[maxPos];
            arr[maxPos]=arr[i];
            arr[i]=temp;

        }
    }

    public static void Print(int arr[]){
        System.out.println("Sorted Array:"+Arrays.toString(arr));
    }
}
