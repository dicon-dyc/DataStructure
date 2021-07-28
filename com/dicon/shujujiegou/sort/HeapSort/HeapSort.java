package com.dicon.shujujiegou.sort.HeapSort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {

        int []arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));

        Solution heapsort = new Solution();
        heapsort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution{

    public void swap(int []arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort(int []arr){

        //1.构建大顶堆
        for (int i=arr.length/2;i>=0;i--){

            adjustHeap(arr,i,arr.length);
        }

        //2.调整堆结构+交换堆顶与末尾元素
        for (int j = arr.length-1;j>0;j--){

            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }

    public void adjustHeap(int []arr,int i,int length){

        int temp = arr[i];
        for (int k = i*2+1;k<length;k=k*2+1){

            //从i结点的左子节点开始，也就是2i+1处开始
            if (k+1<length && arr[k]<arr[k+1]){

                //如果左子结点小于右子结点，k指向右子节点
                k++;
            }
            if (arr[k] > temp){

                arr[i] = arr[k];
                i=k;
            }else {
                break;
            }
            arr[i] = temp;
        }
    }
}
