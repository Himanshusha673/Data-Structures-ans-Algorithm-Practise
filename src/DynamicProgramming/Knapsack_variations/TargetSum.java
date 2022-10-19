package DynamicProgramming.Knapsack_variations;


import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int [] arr= {1, 1, 1, 1, 1};
        int target= 3;
        System.out.println(findWaysTargetSum(arr,target));
    }

    private static int findWaysTargetSum(int[] arr, int target) {
        int []dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        return helper(arr,target,0,dp);
    }

    private static int helper(int[] arr, int target, int n,int[] dp) {


return 0;
    }


}
