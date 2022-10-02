import java.util.Scanner;

public class PerfectSquaretoN {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int k= sc.nextInt();
        System.out.println(findMinSquare(k));
    }
    private static int  findMinSquare(int N) {
       // int a=(int)Math.sqrt(N);
        if(N==0) return 0;
       // if(N==1||a*a==N) return 1;
        if(N<=2) return N;
        int []dp=new int [N+1];

        //intitializing dp values with their max attainable
        // values that is for N is val =N by adding n times square of n
        for(int k=0;k<=N;k++){
            dp[k]=k;
        }
        // filling dp table values 4 to N
        for(int i=3;i<=N;i++){
            for (int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],1+dp[i-j*j]);
            }
        }
        return dp[N];
    }
}
