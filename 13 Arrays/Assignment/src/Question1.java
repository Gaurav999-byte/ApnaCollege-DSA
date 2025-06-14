//Question 1: Given an integer array nums, return true if any value appears at least twice in
//the array, and return false if every element is distinct.

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Entre size of an array:");
        int n=in.nextInt();
        int num[]=new int[n];

        for (int i = 0; i <num.length ; i++) {
            System.out.print("Entre number at position "+i+":");
            num[i]=in.nextInt();
        }

        System.out.println("Array:"+Arrays.toString(num));

        boolean ans =duplicateCheck(num);
        System.out.println("Array have any Duplicate number:"+ans);
    }

    public static boolean duplicateCheck(int num[]){
        for (int i = 0; i <num.length ; i++) /*for (int i = 0; i <num.length-1 ; i++) for optimize*/ {
            for (int j = i+1; j <num.length ; j++) {
                if (num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
