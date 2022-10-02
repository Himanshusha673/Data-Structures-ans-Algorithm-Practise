package Climb_Stairs;

import java.util.Arrays;

public class ClimbStairsWithiMinCost {
    // we need to find min cost to reach at top
    public static void main(String[] args) {
        int [] cost= {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int res=jump(cost);
        System.out.println(res);


    }
    public static int jump(int[] cost) {
       int [] dp=new int [cost.length+1];
        Arrays.fill(dp,-1);
        memo(0,cost,dp);
       // min cost from 0th stair and cost from 1st stair

       return  Math.min(dp[0],dp[1]);





    }
    public static int  memo(int pos,int[] cost,int [] dp ){
        //we need to reach at top means arr.length
        if(pos>=cost.length) return 0;// dest cost should be 0
        if(dp[pos]!=-1) return dp[pos];
        //for 1 jump
       int ans1= memo(pos+1,cost,dp);
        int ans2=memo(pos+2,cost,dp);


        return  dp[pos]=Math.min(ans1,ans2)+cost[pos];
    }

}
