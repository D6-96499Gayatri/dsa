package com.qustions;

class Main {
    public static void main(String[] args) {
    int arr[]={33,22,66,55,44,11};
    for(int i=1;i<arr.length;i++)
    {
        for(int j=i;j>0;j--)
        {
            if(arr[j-1]<arr[j])
            {
              int temp=arr[j-1];
              arr[j-1]=arr[j];
              arr[j]=temp;
              
            }
            else break;
        }
    }
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    

   
    
    }
}