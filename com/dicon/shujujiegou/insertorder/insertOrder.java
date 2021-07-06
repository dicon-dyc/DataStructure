package com.dicon.shujujiegou.insertorder;

import java.util.Scanner;

/**
 * name：插入排序
 * auther：dicon
 * date:2021-7-6
 *插入排序的平均时间复杂度是o(n^2) 空间复杂度为常数阶o(1)
 *最好情况下是o(n),最坏情况是o(n^2)
 *
 */

public class insertOrder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length;i++){
            intArray[i] = Integer.parseInt(array[i]);
        }
        Solution order = new Solution();
        int[] target = order.oRder(intArray);
        for (int i = 0;i < target.length;i++){
            System.out.print(target[i]+" ");
        }
    }
}

class Solution{
    public int[] oRder(int[] numb){
        int len = numb.length;
        for(int i = 1;i < len;i++){
            for (int j = i;j >= 1; j--){
                if (numb[j] < numb[j-1]){
                    int tmp = numb[j];
                    numb[j] = numb[j-1];
                    numb[j-1] = tmp;
                }else {
                    break;
                }
            }
        }
        return numb;
    }
}
