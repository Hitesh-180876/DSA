package com.competitiveprogramming.DSA.searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 6, 8};
        int k = 5;

        int search = linearSearch(arr, k);
        System.out.println(search);
    }
}
