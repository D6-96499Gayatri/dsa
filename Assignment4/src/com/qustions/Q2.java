package com.qustions;

public class Q2 {
	
	 public static int search(int arr[], int x) {
	     int count=0;
	       for(int i=0;i<arr.length;i++)
	       {
	           if(arr[i]==x)
	           
	               count++;
	              
	          
	       }
	       if(count==0) return -1;
	    return count;
	       
	        
	    }
	   

	    public static void main(String[] args) {
	      int arr[]={1,2,4,5,4,2,8,9,2};
	      int x=3;
	    
	      
	     int occurnces=search(arr, x);
	     System.out.println(occurnces);
	     
	    }
	}

