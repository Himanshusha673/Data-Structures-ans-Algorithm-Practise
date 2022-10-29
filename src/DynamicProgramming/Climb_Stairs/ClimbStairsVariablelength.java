package Climb_Stairs;
import java.util.Arrays;
import java.util.Scanner;



public class ClimbStairsVariablelength {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr =new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] dp=new int [n+1];
        Arrays.fill(dp,-1);
        int res=memo(0,dp,arr);
        System.out.print(res);
    }
    public static int memo(int index,int [] dp,int [] jumps){
        if(index==jumps.length-1) return 1;
        if(dp[index]!=-1) return dp[index];
        int ans =0;
        for (int i=1;i<=jumps[index];i++){
            if(index+i<=jumps.length-1){

                ans+=memo(index+i,dp,jumps);
            }
        }
        dp[index]=ans;
        return ans;
    }

}
// Scanner sc = new Scanner(System.in);
// int n=sc.nextInt();
// int [] arr =new int [n];



// for(int i=0;i arr[i]=sc.nextInt();
// }
// int [] dp=new int [n+1];
// Arrays.fill(dp,-1);
// int res=memo(dp,arr);
// System.out.print(res);




// }
// public static int memo(int [] dp,int [] jumps){
// int index=jumps.length;
// dp[index]=1;


// for (int i=index-1; i>=0;i--){
// int ans =0;

// for(int j=1;j<=jumps[i];j++){
// if(i+j<=jumps.length){
// ans+=dp[j+i];
// }


// }
// dp[i]=ans;



// }
// return dp[0];

// }
