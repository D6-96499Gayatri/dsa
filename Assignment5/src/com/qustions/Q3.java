package com.qustions;

class Q3 {
    public int searchInsertK(int arr[], int k) {
        int left=0;
        int right=arr.length-1;
        // if(arr[left]>arr[right])
        // {
        //     return -1;
        // }
        while(left<=right)
        {
            int mid=(left+right)/2;

            if(arr[mid]==k)
            {
                return mid;
            }
            else if(k<arr[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
}
    
