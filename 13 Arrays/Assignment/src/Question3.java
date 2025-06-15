import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        System.out.print("Entre size of an array:");
        int n=in.nextInt();

        int prices[]=new int[n];

        for (int i = 0; i <prices.length; i++) {
            System.out.println("Entre the number at position "+i+":");
            prices[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(prices));
        System.out.println("Maximum Profit:"+buyAndSell(prices));

    }

    public static int buyAndSell(int prices[]){
        int maxProfit=0;
        int buyPrices=Integer.MAX_VALUE;

        for (int i = 0; i <prices.length ; i++) {
            if(buyPrices<prices[i]){
                int profit=prices[i]-buyPrices;
                maxProfit=Math.max(maxProfit,profit);
            }else {
                buyPrices=prices[i];
            }
        }
        return maxProfit;
    }
}
