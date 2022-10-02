package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int [] arr ={2,5,3,23,5,6,34,6,4,56,75,};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int s, int e) {
        if(s>=e){
            return;

        }
        int mid=(s+e)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e);



    }

    private static void merge(int[] arr, int s, int e) {
        int mid=(s+e)/2;
        int i=s,j=mid+1;
        int k=0;
        int [] temp=new int[e-s+1];
        // for comparison btween i and jth elemtns
        while(i<=mid&&j<=e){
            if(arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                k++;
                j++;

            }


        }
        //maybe j reached at last but i not reached
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;

        }
        //may i reached at mid but j does'nt
        while(j<=e){
            temp[k]=arr[j];
            j++;
            k++;

        }
       // after this our temp array will be sorted
        //now put it into original array
        for(int ind=0;ind<temp.length;ind++){
            arr[ind+s]=temp[ind];
            //ind+s karne ka means for half right call
            // and half left call temp array length same but
            // if we start ind from s then it points to index of s in original array
        }

        //also copy it with help of this prebuild one
       // System.arraycopy(temp, 0, arr, 0 + s, temp.length);




    }


}
