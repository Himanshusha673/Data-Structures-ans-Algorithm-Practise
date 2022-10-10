package Arrays;

import java.util.Arrays;

public class CountPossibleTraingles {
    public static void main(String[] args) {
        int arr[] = {6, 4, 9,7,8};
        System.out.println(findTraingles(arr));
    }

    private static int findTraingles(int[] arr) {
        int  count=0;
        Arrays.sort(arr);
        int k=arr.length-1;
        while(k>=2) {
            int i = 0;
            int j = k - 1;



                while (i < j ) {
                    if (arr[i] + arr[j] > arr[k]) {
                        count += j - i ;
                        j--;

                    }else{
                        i++;
                    }
                }

            k--;
        }
        return count;

    }
}
