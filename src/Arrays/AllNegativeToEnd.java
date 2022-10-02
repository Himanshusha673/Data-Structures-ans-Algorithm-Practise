package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AllNegativeToEnd {
    public static void main(String[] args) {
        int [] arr ={1, -1, 3, 2, -7, -5, 11, 6 };
        segregate(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void segregate(int[] arr) {
        ArrayList<Integer> neg= new ArrayList<>();
        ArrayList<Integer> pos= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg.add(arr[i]);

            }else{
                pos.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){

            arr[i]=i<pos.size()? pos.get(i) :neg.get(i-pos.size());
        }



    }
    private static void swap(int i, int j,int []arr) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }


}
