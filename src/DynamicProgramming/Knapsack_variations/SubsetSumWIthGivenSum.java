package DynamicProgramming.Knapsack_variations;

import java.util.Scanner;

public class SubsetSumWIthGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=sc.nextInt();
        System.out.println(isSubsetSumOrNot(arr,sum));
    }

    private static boolean isSubsetSumOrNot(int[] arr,int sum) {


        boolean  [][] dp = new boolean [arr.length+1][sum+1];

        return solve(arr,arr.length,dp,sum);
    }

    private static boolean solve(int[] arr, int n, boolean[][] dp,int sum) {
        if(sum==0) return true;
        if(n==0) return false;

        if(arr[n-1]>sum) return solve(arr,n-1,dp,sum);
        if(dp[n][sum]) return true;


        boolean ans1=solve(arr,n-1,dp,sum);
        boolean ans2=solve(arr,n-1,dp,sum-arr[n-1]);


        return ans1||ans2;


    }

}
