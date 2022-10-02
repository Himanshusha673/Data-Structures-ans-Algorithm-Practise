import java.util.Arrays;
import java.util.Scanner;

public class minimumStepsToOne {
    
    
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println( "Minimum Paths would be "+findMinToOne(n,dp));
    }

    private static int  findMinToOne(int N,int [] dp) {
        if (N==1){
            return 0;
        }
        if(dp[N]!=-1){
            return dp[N];
        }
        int divideBy2=N%2==0?findMinToOne(N/2,dp):Integer.MAX_VALUE;
        int divideBy3=N%3==0?findMinToOne(N/3,dp):Integer.MAX_VALUE;
        int minusOne=findMinToOne(N-1,dp);
         dp[N]=Math.min(minusOne,Math.min(divideBy2,divideBy3))+1;
        return dp[N];
    }


}
