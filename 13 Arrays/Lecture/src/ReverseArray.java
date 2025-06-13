import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9,10};
        reverse(number);
        System.out.println(Arrays.toString(number));
    }

    public static void reverse(int numbers[]){
        int first=0;
        int last=numbers.length-1;

        while (first<last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
}
