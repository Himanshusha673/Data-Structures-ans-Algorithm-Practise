package Arrays;
import java.util.*;
import java.lang.*;

public class Count_Inversion {

        int countSwaps(int arr[], int n) {
            return (int) mergeSort(arr,0, arr.length - 1);
        }

        static long mergeSort(int [] arr, int l, int r) {

            if (l >= r) return 0;

            int m = (l + r) / 2;

            // Total swpas count = left subarray count
            // + right subarray count + merge count
            // Left subarray count
            long leftswaps= mergeSort(arr, l, m);
            // Right subarray count
            long rightSwaps= mergeSort(arr, m + 1, r);
            // Merge count
            long merge= merge(arr, l, r);


            return leftswaps+rightSwaps+merge;
        }
        static long merge(int[] arr, int si, int ei) {
            int mid=(si+ei)/2;
            int inv=0;
            int merged[]=new int[ei-si+1];
            // idx1=i start from left subpart
            int idx1=si;
            // j start from right subpart
            int idx2=mid+1;
            int x=0;
            while(idx1<= mid && idx2<=ei ){
                if(arr[idx1]<=arr[idx2]){
                    merged[x++]=arr[idx1++];
                }else{
                    merged[x++]=arr[idx2++];
                    //****************************
// we know that both arrays left and right are sorted once we find any number on right(arr[j]
//which is smaller than left(at any arr[i]) array element then that right element(arr[j]) is smaller than all
// left element after i ownwards because both array are sorted
// means right arr elem  is smaller that left arr elem  we need
//for moving that element with all greater element before we need to make m-i+1 swaps
//that why we perform swapCount herre
//****************************
                    inv+=(mid+1-idx1);}}
            // no need to swap because there is no any right and left part to swap
            while(idx1<=mid){
                merged[x++]=arr[idx1++];
            }
            while(idx2<=ei){
                merged[x++]=arr[idx2++];
            }
            for(int i =0, j=si;i<merged.length;i++){
                arr[j++]=merged[i];
            }
            return inv;

        }


}

