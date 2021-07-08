package com.dicon.shujujiegou.sort.QuickSort;

import java.util.Arrays;
import java.util.Scanner;


/**
 * name：快速排序
 * author：dicon
 * date：2021-7-7
 * 快速排序在平均状况下要o(nlogn)次比较，通常比其他o(nlogn)算法更快。
 */

public class quicksort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] arr = Arrays.asList(s).stream().mapToInt(Integer::parseInt).toArray();
        Solution solution = new Solution();
        solution.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution{
    public void sort(int[] arr,int left,int right){

        if (left<right){

            int partitionIndex = partiton(arr,left,right);
            sort(arr,left,partitionIndex -1 );
            sort(arr,partitionIndex+1,right);
        }

    }

    public int partiton(int[] arr,int left,int right){

        //设置基准数为left
        int pivot = left;
        int index = pivot + 1;
        for (int i = index;i <= right;i++){
            if (arr[i]<arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[index-1];
        arr[index-1] = temp;
        return index - 1;
    }
}