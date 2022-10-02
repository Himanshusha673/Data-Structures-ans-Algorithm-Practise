package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String [] args){
        int [] arr ={4,1,3,9,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int min =Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    //swapping
                    int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                }
            }
        }
    }
}
