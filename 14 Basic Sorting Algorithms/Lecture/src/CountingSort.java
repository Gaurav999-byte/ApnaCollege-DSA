import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        System.out.println(Arrays.toString(arr));
        CountingSort(arr);
        Print(arr);

    }

    public static void CountingSort(int arr[]){
        int Largest= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            Largest=Math.max(Largest,arr[i]);
        }

        int count[]=new int[Largest+1];

        for (int i = 0; i <arr.length ; i++) {
            count[arr[i]]++;
        }

        //sort
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void Print(int[] arr) {
        System.out.println("Sorted array:");
        System.out.print(Arrays.toString(arr));
    }
}
