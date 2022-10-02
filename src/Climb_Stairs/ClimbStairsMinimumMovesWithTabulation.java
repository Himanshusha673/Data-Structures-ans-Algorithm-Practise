package Climb_Stairs;

import java.util.Arrays;

public class ClimbStairsMinimumMovesWithTabulation {
    public static void main(String[] args) {
        int [] arr= {2,3,1,1,4};
        int res=minJumping(arr);
        System.out.println(res);





    }
    public static int minJumping(int[] nums) {
        long [] dp=new long [nums.length];
        Arrays.fill(dp,-1);

        return (int) minimumJump(nums,dp);
    }
    public static long  minimumJump(int[] jumps,long [] dp ){
        dp[jumps.length-1]=0;



        //loop  for dp for define currentPosition
        //starting from n-1 th index of dp table
        for(int pos=jumps.length-2;pos>=0;pos--){

            long min =Integer.MAX_VALUE;
            //loop for jumps table for define jumps
            for(int jump=1;jump<=jumps[pos]&&(pos+jump)<jumps.length;jump++){
                min=Math.min(min,dp[pos+jump]+1l);





            }
            dp[pos]=min;



        }
        return dp[1];


    }

}
