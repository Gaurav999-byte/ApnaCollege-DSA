// There is an integer array nums sorted in ascending order (with distinct
//values). Prior to being passed to your function, nums is possibly rotated at an
//unknown pivot index k (1 <= k < nums.length) such that the resulting array
//is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0
//indexed). For example, [0,1,2,4,5,6,7] might
//be
//rotated at
//index 3 and become [4,5,6,7,0,1,2].
//pivot
// Given the array nums after the possible rotation and an integer target, return
//the index of target if it is in nums, or -1 if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int nums []={4,5,6,7,0,1,2};
        System.out.println(Arrays.toString(nums));
        System.out.println("Entre target number:");
        int target = in.nextInt();

        int ans= findTarget(nums,target);

        if (ans==-1){
            System.out.println("Target is not present in array:"+ans);
        }
        else {
            System.out.println("Target is present at position:"+ans);
        }
    }

    public static int findTarget(int nums[],int target){
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid=(start+end)/2;

            //Case 1: if target found at mid
            if(nums[mid]==target){
                return mid;
            }

            // Search in left half
            if (nums[start]<=nums[mid]){
                // Check if target lies in the left half
                if(nums[start]<=target && target<nums[mid]){
                    end=mid-1;// Search in left half
                }else {
                    start=mid+1;// Search in Right half
                }
            }
            // Search in Right half
            else {
                if (nums[mid]<target && target<=nums[end]){
                   start=mid+1; //Search in Right half
                }
                else {
                    end=mid-1;// Search in left half
                }
            }

        }
        return -1;
    }
}
