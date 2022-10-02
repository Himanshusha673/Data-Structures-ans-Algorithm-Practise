package Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr ={13,20,5,3,2,10,8};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void heapSort(int[] arr) {
        //build heap
        buildheap(arr,arr.length);
        //swap top with last element of heap and heapify
        int n=arr.length;

        for (int i=n-1;i>=0;i--){
            //remove topelement(swap ith with first element and heap reduced to  i-1)

            swap(arr,i,0);

            //heapify it from o to
            heapify(arr,0,i);


        }


    }

    private static void buildheap(int[] arr,int n) {
        //loop goes feom n/2th nonleaf node to top node
        for(int i=n/2-1;i>=0;i--){

            heapify(arr,i,n);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        //convert all down elements from i into heap
        //downWard Heapify
        int largestIndex=i;
        int leftChildIndex=2*i+1;
       int  rightChildIndex=2*i+2;
       if(leftChildIndex<n&&arr[leftChildIndex]>arr[largestIndex]){
            largestIndex=leftChildIndex;
        }
        if(rightChildIndex<n&&arr[rightChildIndex]>arr[largestIndex]){
            largestIndex=rightChildIndex;
        }
        if(largestIndex!=i){
            swap(arr,i,largestIndex);
            heapify(arr,largestIndex,n);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}