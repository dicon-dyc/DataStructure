package com.dicon.shujujiegou.search.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * name：二分查找
 * author:dicon
 * date:2021-7-8
 */

public class binarysearch {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] lines = scanner.nextLine().split(" ");
        int[] arr = Arrays.asList(lines).stream().mapToInt(Integer::parseInt).toArray();
        int target = scanner.nextInt();
        Solution solution = new Solution();
        int numb = solution.search(arr,target);
        System.out.println(numb);

    }
}

class Solution{

    public int search(int[] arr,int target){
        int pivot = 0;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            pivot = left + (right-left)/2;
            if (arr[pivot]==target)return target;
            if (arr[pivot]<target)left=pivot+1;
            else right = pivot-1;
        }
        return -1;
    }
}