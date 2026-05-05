package com.qustions;

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


class Solution {
    Node reverseList(Node head) {
           Stack<Integer> st=new Stack<>();
       Node trav=head;
       while(trav!=null)
       {
        
           int value=trav.data;
           st.push(value);
           trav=trav.next;
       }
       trav=head;
       while(trav!=null)
       {
           trav.data=st.pop();
          trav=trav.next;
           
       }
       return head;
        
    }
}