package Climb_Stairs;

import java.util.Arrays;

public class ClimbStairsWithMinimumMovesMemoization {
    // here we need to return jumps as output not all possible
    // solutions so that base case would be at dest returns 0


    public static void main(String[] args) {
        int [] arr= {2,3,1,1,4};
      int res=jump(arr);
        System.out.println(res);
      
        
    }
    public static int jump(int[] nums) {
        long [] dp=new long [nums.length+1];
        Arrays.fill(dp,-1);

        return (int) minimumJumps(0 /*source*/,nums,dp);




    }
    public static long  minimumJumps(int pos,int[] jumps,long [] dp ){
        // here we need to return jumps as output not all possible 
        // solutions so that base case would be at dest returns 0
        if (pos==jumps.length-1) return 0;
        if(dp[pos]!=-1) return dp[pos];
        long res;
        res = Integer.MAX_VALUE;
        // we need to update minimum after going all possible stairs
        for ( int i=1;i<=jumps[pos]; i++){
            if((i+pos)<jumps.length){
              
                res =Math.min(res,  minimumJumps(pos+i,jumps, dp)+ 1L);
            }

        }
        dp[pos]=res;
        return res;







    }




}
