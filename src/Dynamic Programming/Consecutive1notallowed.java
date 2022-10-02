import java.util.Arrays;
import java.util.Scanner;

//Input:
//        N = 3
//        Output: 5
//        Explanation: 5 strings are (000,
//        001, 010, 100, 101).
//        Example 2:
//
//        Input:
//        N = 2
//        Output: 3
//        Explanation: 3 strings are
//        (00,01,10).
public class Consecutive1notallowed {
    static int mod=1000000007;
    public static void main(String []args ){
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        System.out.println(findCounts(n));
    }

    private static long findCounts(int n) {
        // row for no of digits
        // column for 1 and 2 as prev
       long[] [] dp = new long[n+1][2];

        return memo(n,0,dp);
    }

    private static long memo(int n, int prev, long[][] dp) {
        if(n==0) return 1;
        if(dp[n][prev]!=0) return dp[ n][prev];

        long appendign0= memo(n-1,0,dp);
        // we call for 1 only when prev is 0 otherwise after appending
        // it takes two ones thas why we call only when prev is 0
        long appendign1=(prev==0) ?memo(n-1,1,dp):0;
        // we are deviding mod by just because it would extend the limit of long or integer
        return  dp[n][prev]=(appendign1+appendign0)%mod;

    }
}
