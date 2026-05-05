package com.qustions;

class Q1{
    public static void main(String[] args) {
      int arr[]={1,2,4,5,4,2,8,9,2};
      int key=2;
      int data=-1;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]==key)
          data=i;
          
      }
      System.out.println(data);
    }
}