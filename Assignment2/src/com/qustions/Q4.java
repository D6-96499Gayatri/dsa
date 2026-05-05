//package com.qustions;
//
//import java.util.Stack;
//
//class Node
//	    {
//	        int data;
//	        Node next;
//	        Node(int d) {data = d; next = null; }
//	    }
//	    
//	class Solution {
//	    public static Node reverseBetween(int a, int b, Node head) {
//	        Node trav=head;
//	         Stack<Integer>st=new Stack<>();
//	          int pos=1;
//	        while(trav!=null)
//	        {
//	          if(pos>=a && pos<=b)
//	          {
//	              int value=trav.data;
//	               st.push(value);
//	           
//	          }
//	          
//	          trav=trav.next;
//	          pos++;
//	          
//	        }
//	        trav=head;
//	        pos=1;
//	        while(trav!=null)
//	        {
//	            if(pos>=a && pos<=b)
//	            trav.data=st.pop();
//	              trav=trav.next;
//	                 pos++;
//	        }
//	      
//	     
//	         return head;
//	    }
//	   
//	}
//
