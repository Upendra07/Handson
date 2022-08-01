package com.company.BasicSortings;

public class BubbleSort {

    public static void bubblsort(int arr[]){
        int n = arr.length;
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting array using bubble sort: " );

        for(int ele:arr){
            System.out.println(ele);
        }

    }

}
