package com.company.BasicSortings;

public class QuickSort {

    public static void sort(int[] arr){

        int n = arr.length;
        quicksort(arr,0,n-1);

        for (int i:arr){
            System.out.println(i +" ");
        }

    }

    public static void quicksort(int[] arr,int low,int high){


        if(low<high){
            int pivotIndx = partition(arr,low, high);
            quicksort(arr,low,pivotIndx-1);
            quicksort(arr,pivotIndx+1,high);
        }

    }

    public static int partition(int[] arr,int low,int high){

        int pivot = arr[high];
        int i = low-1;
        int temp;

        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        i++;
        temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;

    }

}
