// Given n non-negative integers representing an elevation map where the width
//of each bar is 1, compute how much water it can trap after raining

import java.util.Scanner;
import java.util.*;

public class Question4 {
    public static void main (String[]args){
        Scanner in= new Scanner(System.in);
        System.out.print("Entre the size of an array:");
        int n=in.nextInt();

        int height[]=new int[n];

        for (int i = 0; i <height.length ; i++) {
            System.out.println("Entre "+i+"th bar height:");
            height[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(height));

        int ans = TrappedWater(height);
        System.out.println("Total Trapped Water:"+ans);
    }

    public static int TrappedWater(int height[]){

        //Left auxillary array
        int LeftMax[]=new int[height.length];
        LeftMax[0]=height[0];
        for (int i = 1; i <height.length ; i++) {
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
        }

        //Right auxillary array
        int RightMax[]=new int[height.length];
        RightMax[height.length-1]=height[height.length-1];
        for (int i = height.length-2; i>=0 ; i--) {
            RightMax[i]=Math.max(RightMax[i+1],height[i]);
        }

        int trappedWater=0;
        for (int i = 0; i <height.length; i++) {

            int waterLevel = Math.min(LeftMax[i], RightMax[i]);

            trappedWater+=(waterLevel-height[i])*1;
        }
        return trappedWater;
    }
}
