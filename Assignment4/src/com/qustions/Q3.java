package com.qustions;

class Main {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        int key=8;
        int left=0;
        boolean found=false;
        int right=arr.length-1;
       
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(key==arr[mid]){
            found=true;
            break;
        }
        
            else if(key>arr[mid])
            {
                right=mid-1;
               
            }
            
            else
            {
                left=mid+1;
                  
            }
        
        }
        if(!found)
        System.out.println("not found");
        else
        System.out.println("found");
   
    }
}
