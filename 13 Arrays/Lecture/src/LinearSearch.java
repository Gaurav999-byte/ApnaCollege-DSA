import java.util.Scanner;

public class LinearSearch {

    public static int LinearSearch(int numbers[],int key){
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int numbers[]={13,55,34,23,54,39,64,35,84,24};
        System.out.print("Entre the number to search in array:");
        int key=in.nextInt();
        int index= LinearSearch(numbers,key);
        if(index==-1)
        {
            System.out.println("Number not found");
        }
        else
        {
            System.out.println(numbers[index]+" is found at index "+index);
        }
    }


//        public static void LinearSearch(int numbers[],int key){
//        for (int i = 0; i <numbers.length ; i++) {
//            if(numbers[i]==key)
//            {
//                System.out.print(numbers[i]+" is found at index "+i);
//            }
//        }
//
//    }
//
//    public static void main(String[]args){
//        int numbers[]={13,55,34,23,54,39,64,35,84,24};
//        int key=64;
//        LinearSearch(numbers,key);
//    }
//}
 }
