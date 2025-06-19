import java.util.Arrays;

public class CountingSort {
    public static void main(String[]args){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        System.out.println("Default Array:"+ Arrays.toString(arr));
        Counting(arr);
        Print(arr);

    }

    public static void Counting(int arr[]){
        int Largest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            Largest=Math.max(Largest,arr[i]);
        }

        int ginno[]=new int[Largest+1];

        for (int i=0;i<arr.length;i++){
            ginno[arr[i]]++;
        }

        int j=arr.length-1;
        for (int i=0;i<ginno.length;i++){
            while (ginno[i]>0){
                arr[j]=i;
                j--;
                ginno[i]--;
            }
        }
    }

    public static void Print(int arr[]){
        System.out.println("Sorted Array:"+Arrays.toString(arr));
    }
}
