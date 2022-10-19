package DynamicProgramming.Knapsack_variations;


import java.util.*;

public class SubsetSumPartitionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSubsetSumOrNot(arr));
    }

    private static int isSubsetSumOrNot(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 1) return 0;
        sum = sum / 2;

        int[][] dp = new int[arr.length + 1][sum + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        // Find if there is subset with sum equal to
        // half of total sum
        return solve(arr, arr.length, dp, sum);

    }

    private static int solve(int[] arr, int n, int[][] dp, int sum) {
        // Base Cases
        if (sum == 0)
            return 1;
        if (n == 0)
            return 0;

        // return solved subproblem
        if (dp[n][sum] != -1) {
            return dp[n][sum];
        }

        // If last element is greater than sum, then
        // ignore it
        if (arr[n - 1] > sum)
            return solve(arr, n - 1, dp, sum);

        /* else, check if sum can be obtained by any of
            the following
            (a) including the last element
            (b) excluding the last element
        */
        // also store the subproblem in dp matrix
        int ans1 = solve(arr, n - 1, dp, sum);
        // below is for including
        int ans2 = solve(arr, n - 1, dp, sum - arr[n - 1]);
        if (ans1 == 1 || ans2 == 1)
            return dp[n][sum] = 1;

        return dp[n][sum] = 0;
        //return dp[n][sum] = isSubsetSum(arr, n - 1, sum, dp) || isSubsetSum(arr, n - 1, sum - arr[n - 1], dp);
    }
}
