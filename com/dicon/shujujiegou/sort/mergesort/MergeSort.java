package com.dicon.shujujiegou.sort.mergesort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * name：归并排序
 * author：dicon
 * date：2021-7-7
 * 归并排序是分治法的一个应用，时间复杂度为o(nlogn)空间复杂度为o(n)
 */

public class MergeSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] lines = input.nextLine().split(" ");
        int[] numbs = Arrays.asList(lines).stream().mapToInt(Integer::parseInt).toArray();
        Solution solution = new Solution();
        solution.sort(numbs);
        System.out.println(Arrays.toString(numbs));
    }
}

class Solution{
    public void sort(int[] arr){

        //在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间。
        int[] temp = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }

    public void sort(int[] arr, int left,int right,int[] temp){
        if (left<right){
            int mid = (left+right)/2;

            //左边归并排序，使得左子序列有序
            sort(arr,left,mid,temp);

            //右边归并排序，使得右子序列有序
            sort(arr,mid+1,right,temp);

            //将两个有序子数组合并操作
            merge(arr,left,mid,right,temp);
        }
    }
    public void merge(int[] arr, int left, int mid,int right,int[] temp){

        //左序列指针
        int i = left;

        //右序列指针
        int j = mid+1;

        //临时数组指针
        int t= 0;

        while(i <= mid && j <= right){
            if (arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            }else{
                temp[t++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[t++] = arr[i++];
        }
        while(j <= right){
            temp[t++] = arr[j++];
        }
        t = 0;
        while(left<=right){
            arr[left++] = temp[t++];
        }
    }
}