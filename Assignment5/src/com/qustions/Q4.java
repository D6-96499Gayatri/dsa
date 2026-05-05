package com.qustions;

class Q4 {
    public static void mergeSort(int arr[], int left, int right) {
        if (left == right) return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        int size = right - left + 1;
        int temp[] = new int[size];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // FIX: Use 'l' consistently to copy back
        for (int l = 0; l < size; l++) {
            arr[left + l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int arr[] = {33, 22, 66, 55, 44, 11};

        System.out.print("Before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("\nAfter sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
