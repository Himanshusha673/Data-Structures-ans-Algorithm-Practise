package Arrays;

import java.util.Scanner;

public class MaximizeOnesByflippingzero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int k= sc.nextInt();
        System.out.println(maximizeOnes(arr,k));

    }

    private static int maximizeOnes(int[] arr, int k) {
        int ans=0;
        int countZeroes=0;
        int j=-1;
        for(int i=0;i<arr.length;i++){
            // counting how many zeroes are there
            if(arr[i]==0){
                countZeroes++;
            }
            // if count greater than k means no of zeroes in our length
            // ans is gretaer then that of whichh is given to us so we are
            // just make pointer whihc decreses the count untill count becomes equal
            // to k so that in ourn length zeroes are euwal to k
            while(countZeroes>k){
                j++;
                if(arr[j]==0){
                    countZeroes--;
                }
            }
            // length of ones after flippinng z eroes
             int currLen=i-j;
            if(currLen>ans){
        ans=currLen;
    }
}
        return ans;
    }
}
