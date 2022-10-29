package Arrays;

import java.util.Scanner;

public class LargestSumSubArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumContiguousSubArray(arr));



    }

    private static int maximumContiguousSubArray(int[] arr) {
        int currSum=arr[0];
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(currSum>=0){
                currSum+=arr[i];
            }else{
                currSum=arr[i];
            }

            if(currSum>maxSum){
                maxSum=currSum;

            }

        }
        return maxSum;
    }
}
