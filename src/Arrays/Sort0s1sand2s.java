package Arrays;

import java.util.Arrays;

public class Sort0s1sand2s {

    public static void main(String[] args) {
        int [] arr={0, 2 ,1, 2 ,0,2,0,0,1};
        sortthis(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void sortthis(int[] arr) {

        int i=0;
        int j=0;
        int k=arr.length-1;

        while(j<=k){
            if(arr[j]==0){
                swap(i,j,arr);
                i++;
                j++;
                continue;
            }
            if(arr[j]==1){
                j++;
                continue;
            }
            if(arr[j]==2){
                swap(j,k,arr);
                k--;
                continue;

            }
        }
    }
    private static void swap(int i, int j,int []arr) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
