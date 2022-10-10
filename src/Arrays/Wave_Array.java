package Arrays;

import java.util.Arrays;

public class Wave_Array {
    public static void main(String [] args){
        int arr[] = {2,4,7,8,9,10};
        System.out.println(Arrays.toString(wave(arr)));


    }

    private static int[] wave(int[] arr) {
        int i=0, j=1;
        while(i<arr.length&&j<arr.length){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }
        return arr;
    }
}
