package com.qustions;

public class Q1 {

	public static void main(String[] args) {
		class Solution {
		    public static boolean isPalindrome(int[] arr) {
		        //int arr[1,2,3,2,1];
		       int start=0;
		       int end=arr.length-1;
		       
		        int[] original = arr.clone();

		       while(start<end)
		       {
		           int temp=arr[start];
		           arr[start]=arr[end];
		           arr[end]=temp;
		           
		           start++;
		           end--;
		       }
		       
		       for(int i=0;i<arr.length;i++)
		       {
		           if(arr[i]!=original[i])
		           {
		               return false;
		           }
		       }
		       return true;
		       
		    }
		}


	}

}
