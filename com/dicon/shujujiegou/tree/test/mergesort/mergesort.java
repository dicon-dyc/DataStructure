package com.dicon.shujujiegou.tree.test.mergesort;

import java.util.Arrays;
import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = Arrays.asList(input).stream().mapToInt(Integer::parseInt).toArray();
        Solution solution = new Solution();
        solution.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution{

    public void sort(int[] arr,int left,int right){

        int[] temp = new int[right+1];
        sort(arr,left,right,temp);
    }

    public void sort(int[] arr,int left,int right,int[] temp){

        if (left<right){

            int mid = (left+right)/2;
            sort(arr,left,mid,temp);
            sort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public void merge(int[] arr,int left,int mid, int right,int[] temp){

        int i = left;
        int j = mid+1;
        int t = 0;
        while (i <= mid&&j<=right){
            if (arr[i]>arr[j]){
                temp[t++] = arr[j++];
            }else {
                temp[t++] = arr[i++];
            }
        }
        while (i <= mid){
            temp[t++] = arr[i++];
        }
        while (j <= right){
            temp[t++] = arr[j++];
        }
        t = 0;
        while (left<=right){
            arr[left++] = temp[t++];
        }
    }
}