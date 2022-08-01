package com.company.BasicSortings;

public class InsertionSort {
    public static void insertionsort(int[] arr){

        int n=arr.length;

        for(int i=1;i<n;i++){

            int current = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>current){

                arr[j+1] = arr[j];
                j--;

            }

            arr[j+1] = current;
        }

        System.out.println("array after insertion sort");

        for(int ele:arr){
            System.out.println(ele);
        }

    }
}
