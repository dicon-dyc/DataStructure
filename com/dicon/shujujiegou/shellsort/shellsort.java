package com.dicon.shujujiegou.shellsort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * name:希尔排序
 * author:dicon
 * date:2021-7-6
 * 希尔排序时间复杂度是o(n^(1.3-2))，空间复杂度为o(1)
 */

public class shellsort {
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
    public void sort(int[] numbs){
        int len = numbs.length;
        for (int gap = len/2;gap >= 1;gap/=2){
            for (int i = gap;i < len;i++){
                int j = i;
                while(j-gap>=0 && numbs[j]<numbs[j-gap]){
                    int tmp = numbs[j];
                    numbs[j] = numbs[j-gap];
                    numbs[j-gap] = tmp;
                    j-=gap;
                }
            }
        }
    }
}