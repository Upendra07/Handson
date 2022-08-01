package com.company.BasicSortings;

public class SelectionSort {
    public  static void selectionsort(int[] arr){
        int n = arr.length;
        int temp=0;

        for (int i=0; i<n-1;i++){
            int smallest = i;

            for(int j=i+1; j<n;j++){

                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array after selection sort is: ");
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
