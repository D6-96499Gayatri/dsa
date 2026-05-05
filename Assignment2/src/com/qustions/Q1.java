package com.qustions;

public class Q1 {
	
	    public int nthFibonacci(int n) {
	        if(n==0 || n==1)
	        return n;
	        else
	        return nthFibonacci(n-1)+nthFibonacci(n-2);


	        
	    }
	}

