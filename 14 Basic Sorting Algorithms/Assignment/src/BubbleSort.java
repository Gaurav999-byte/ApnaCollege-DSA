import java.util.*;

public class BubbleSort {
    public static void main(String[]args){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        System.out.print("Default Array:"+Arrays.toString(arr));
        System.out.println();
        Bubble(arr);
        Print(arr);
    }

    public static void Bubble(int arr[]){
        for (int count=0;count<arr.length-1;count++){
            for (int j=0;j<arr.length-1-count;j++){
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void Print(int arr[]){
        System.out.print("Sorted Array:");
        System.out.print(Arrays.toString(arr));
    }
}
