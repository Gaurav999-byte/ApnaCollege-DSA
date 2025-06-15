//You are given an array prices where prices[i] is the price of a given stock
//on the ith day.
//Return the maximum profit you can achieve from this transaction. If you cannot
//achieve any profit, return 0.
//Example 1:
//Input:
//prices = [7, 1, 5, 3, 6, 4]
//Output:  5
//Explanation:
//Example 2:
//Input:
//Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 =
//5. Note that buying on day 2 and selling on day 1 is not allowed
//because you must buy before you sell.


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
