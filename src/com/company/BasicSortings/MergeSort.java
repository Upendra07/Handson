package com.company.BasicSortings;

public class MergeSort {

    public static void sort(int[] arr){

        int n = arr.length;
        devide(arr,0,n-1);

        System.out.println("array after the sort is");

        for (int i:arr){
            System.out.println(i+" ");
        }

    }

    public static void devide(int[] arr, int si, int ei){

        if(si>=ei){
            return;
        }

        int mid = (si+ei)/2;

        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conquor(arr,si,mid,ei);

    }

    private static void conquor(int[] arr, int si, int mid, int ei) {

        int[] mergedArray = new int[ei-si+1];

        int index1 = si;
        int index2 = mid+1;
        int x=0;


        while (index1<=mid && index2<=ei){

            if(arr[index1]<=arr[index2]){
                mergedArray[x++] = arr[index1++];
            }else{
                mergedArray[x++] = arr[index2++];
            }
        }

        while (index1<=mid){
            mergedArray[x++] = arr[index1++];
        }

        while (index2<=ei){
            mergedArray[x++] = arr[index2++];
        }

        for (int i=0,j=si;i<mergedArray.length;i++,j++){
            arr[j] = mergedArray[i];
        }


    }



}
