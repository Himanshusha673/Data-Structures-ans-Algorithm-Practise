package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr ={2,5,3,23,5,6,34,6,4,56,75,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i=0;i<arr.length;i++){


            for (int j=0;j<arr.length-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }


            }
        }
    }
}
