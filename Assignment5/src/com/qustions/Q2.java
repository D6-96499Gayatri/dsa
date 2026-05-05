package com.qustions;

import java.util.ArrayList;

class Q2 {
    ArrayList<Integer> find(int arr[], int x) {
        int firstOccurance=-1;
        int lastOccurance=-1;
    ArrayList<Integer> list=new ArrayList<>();
    
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
               if(firstOccurance==-1)
               {
                   firstOccurance=i;
               }
              lastOccurance=i;
             
            }
        }
             
              list.add(firstOccurance); 
               list.add(lastOccurance);
               return list;
     
    }
}
