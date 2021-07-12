package com.dicon.shujujiegou.tree.test.quicksort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class quicksort {

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
        if (left<right){

            int index = partition(arr,left,right);
            sort(arr,index+1,right);
            sort(arr,0,index-1);
        }
    }

    public int partition(int[] arr,int left,int right){

        int pivot = left;
        int index = left+1;
        for (int i = index;i<= right;i++){
            if (arr[i]<arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index-1;
    }

    public void swap(int[] arr,int firstIndex,int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}
