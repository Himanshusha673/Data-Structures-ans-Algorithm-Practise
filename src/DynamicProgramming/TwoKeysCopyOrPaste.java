import java.util.Arrays;
import java.util.Scanner;

//2D dp Input: n = 3
//Output: 3
//Explanation: Initially, we have one character 'A'.
//In step 1, we use Copy All operation.
//In step 2, we use Paste operation to get 'AA'.
//In step 3, we use Paste operation to get 'AAA'.
//Example 2:
//
//Input: n = 1
//Output: 0
public class TwoKeysCopyOrPaste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findMinStepsToPrintA(n));
    }

    private static int findMinStepsToPrintA(int n) {
// we need to print min steps to print  n times A on the screen
        if (n == 1) return 0;
        long[][] dp = new long[2 * n + 1][2 * n + 1];
        for (int i = 0; i <= 2 * n; i++) {
            // i is screen
            for (int j = 0; j <= 2 * n; j++) {
                // j is buffer
                dp[i][j] = -1;
            }
        }
        // calling after calling once copy paste then after buffer contains 1 and scr has 2
        return (int) (2l + memo(2, 1, n, dp));
    }

    public static long memo(int scr, int buff, long dest, long[][] dp) {

        if (scr > dest) return Integer.MAX_VALUE;
        if (scr == dest) return 0;
        if (dp[scr][buff] != -1) return dp[scr][buff];

        // if we make cop paste means two steps
        //taking long because we are taking here 2+ integer.max in base case
        long copyPaste = 2l + memo(2 * scr, scr, dest, dp);
        long paste = 1l + memo(scr + buff, buff, dest, dp);
        return dp[scr][buff] = Math.min(copyPaste, paste);

    }
}

