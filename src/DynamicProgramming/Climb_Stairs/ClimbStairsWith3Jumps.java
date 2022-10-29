package Climb_Stairs;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbStairsWith3Jumps {
    public static int climbStairsHelper(int n,int []dp) {
        if(n==0) return 1;
        if(dp[n]!=-1) return dp[n];


        int ans1=(n-1<0)?0:climbStairs(n-1);
        int ans2=(n-2<0)?0:climbStairs(n-2);
        int ans3=(n-3<0)?0:climbStairs(n-3);
        dp[n]=ans1+ans2;


        return ans1+ans2+ans3;





    }
    public static int climbStairs(int n){

        int []dp =new int [n+1];
        Arrays.fill(dp,-1);

        return climbStairsHelper(n,dp);

    }


    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(climbStairs(n));


    }

}
