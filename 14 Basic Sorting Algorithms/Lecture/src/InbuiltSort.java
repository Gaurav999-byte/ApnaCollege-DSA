import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4,7,6};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,0,3);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
