import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int numbers[]={2,4,5,6,8,10,12,14};
        System.out.print("key:");
        int key = in.nextInt();

        int ans=BinarySearch(numbers,key);
        if(ans==-1){
            System.out.println("Number is not found");
        }
        else {
            System.out.println(numbers[ans]+" is found at index "+ans);
        }
    }

    public static int BinarySearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;

        while (start<= end){
            int mid=(start+end)/2;

            if (numbers[mid]==key)
            {
                return mid;
            }
            if (numbers[mid]<key) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
